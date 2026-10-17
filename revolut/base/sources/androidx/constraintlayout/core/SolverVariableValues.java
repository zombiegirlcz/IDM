package androidx.constraintlayout.core;

import a0.d;
import androidx.constraintlayout.core.ArrayRow;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import p.a;

/* JADX INFO: loaded from: classes15.dex */
public class SolverVariableValues implements ArrayRow.ArrayRowVariables {
    private static float sEpsilon = 0.001f;
    protected final Cache mCache;
    private final ArrayRow mRow;
    private final int mNone = -1;
    private int mSize = 16;
    private int mHashSize = 16;
    int[] mKeys = new int[16];
    int[] mNextKeys = new int[16];
    int[] mVariables = new int[16];
    float[] mValues = new float[16];
    int[] mPrevious = new int[16];
    int[] mNext = new int[16];
    int mCount = 0;
    int mHead = -1;

    public SolverVariableValues(ArrayRow arrayRow, Cache cache) {
        this.mRow = arrayRow;
        this.mCache = cache;
        clear();
    }

    private void addToHashMap(SolverVariable solverVariable, int i) {
        int[] iArr;
        int i2 = solverVariable.f7343id % this.mHashSize;
        int[] iArr2 = this.mKeys;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.mNextKeys;
                int i5 = iArr[i3];
                if (i5 == -1) {
                    break;
                } else {
                    i3 = i5;
                }
            }
            iArr[i3] = i;
        }
        this.mNextKeys[i] = -1;
    }

    private void addVariable(int i, SolverVariable solverVariable, float f) {
        this.mVariables[i] = solverVariable.f7343id;
        this.mValues[i] = f;
        this.mPrevious[i] = -1;
        this.mNext[i] = -1;
        solverVariable.addToRow(this.mRow);
        solverVariable.usageInRowCount++;
        this.mCount++;
    }

    private int findEmptySlot() {
        for (int i = 0; i < this.mSize; i++) {
            if (this.mVariables[i] == -1) {
                return i;
            }
        }
        return -1;
    }

    private void increaseSize() {
        int i = this.mSize * 2;
        this.mVariables = Arrays.copyOf(this.mVariables, i);
        this.mValues = Arrays.copyOf(this.mValues, i);
        this.mPrevious = Arrays.copyOf(this.mPrevious, i);
        this.mNext = Arrays.copyOf(this.mNext, i);
        this.mNextKeys = Arrays.copyOf(this.mNextKeys, i);
        for (int i2 = this.mSize; i2 < i; i2++) {
            this.mVariables[i2] = -1;
            this.mNextKeys[i2] = -1;
        }
        this.mSize = i;
    }

    private void insertVariable(int i, SolverVariable solverVariable, float f) {
        int iFindEmptySlot = findEmptySlot();
        addVariable(iFindEmptySlot, solverVariable, f);
        if (i != -1) {
            this.mPrevious[iFindEmptySlot] = i;
            int[] iArr = this.mNext;
            iArr[iFindEmptySlot] = iArr[i];
            iArr[i] = iFindEmptySlot;
        } else {
            this.mPrevious[iFindEmptySlot] = -1;
            if (this.mCount > 0) {
                this.mNext[iFindEmptySlot] = this.mHead;
                this.mHead = iFindEmptySlot;
            } else {
                this.mNext[iFindEmptySlot] = -1;
            }
        }
        int i2 = this.mNext[iFindEmptySlot];
        if (i2 != -1) {
            this.mPrevious[i2] = iFindEmptySlot;
        }
        addToHashMap(solverVariable, iFindEmptySlot);
    }

    private void removeFromHashMap(SolverVariable solverVariable) {
        int[] iArr;
        int i;
        int i2 = solverVariable.f7343id;
        int i3 = i2 % this.mHashSize;
        int[] iArr2 = this.mKeys;
        int i5 = iArr2[i3];
        if (i5 == -1) {
            return;
        }
        if (this.mVariables[i5] == i2) {
            int[] iArr3 = this.mNextKeys;
            iArr2[i3] = iArr3[i5];
            iArr3[i5] = -1;
            return;
        }
        while (true) {
            iArr = this.mNextKeys;
            i = iArr[i5];
            if (i == -1 || this.mVariables[i] == i2) {
                break;
            } else {
                i5 = i;
            }
        }
        if (i == -1 || this.mVariables[i] != i2) {
            return;
        }
        iArr[i5] = iArr[i];
        iArr[i] = -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void add(SolverVariable solverVariable, float f, boolean z) {
        float f4 = sEpsilon;
        if (f <= (-f4) || f >= f4) {
            int iIndexOf = indexOf(solverVariable);
            if (iIndexOf == -1) {
                put(solverVariable, f);
                return;
            }
            float[] fArr = this.mValues;
            float f5 = fArr[iIndexOf] + f;
            fArr[iIndexOf] = f5;
            float f6 = sEpsilon;
            if (f5 <= (-f6) || f5 >= f6) {
                return;
            }
            fArr[iIndexOf] = 0.0f;
            remove(solverVariable, z);
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void clear() {
        int i = this.mCount;
        for (int i2 = 0; i2 < i; i2++) {
            SolverVariable variable = getVariable(i2);
            if (variable != null) {
                variable.removeFromRow(this.mRow);
            }
        }
        for (int i3 = 0; i3 < this.mSize; i3++) {
            this.mVariables[i3] = -1;
            this.mNextKeys[i3] = -1;
        }
        for (int i5 = 0; i5 < this.mHashSize; i5++) {
            this.mKeys[i5] = -1;
        }
        this.mCount = 0;
        this.mHead = -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public boolean contains(SolverVariable solverVariable) {
        return indexOf(solverVariable) != -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void divideByAmount(float f) {
        int i = this.mCount;
        int i2 = this.mHead;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.mValues;
            fArr[i2] = fArr[i2] / f;
            i2 = this.mNext[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float get(SolverVariable solverVariable) {
        int iIndexOf = indexOf(solverVariable);
        return iIndexOf != -1 ? this.mValues[iIndexOf] : BitmapDescriptorFactory.HUE_RED;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int getCurrentSize() {
        return this.mCount;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public SolverVariable getVariable(int i) {
        int i2 = this.mCount;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.mHead;
        for (int i5 = 0; i5 < i2; i5++) {
            if (i5 == i && i3 != -1) {
                return this.mCache.mIndexedVariables[this.mVariables[i3]];
            }
            i3 = this.mNext[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float getVariableValue(int i) {
        int i2 = this.mCount;
        int i3 = this.mHead;
        for (int i5 = 0; i5 < i2; i5++) {
            if (i5 == i) {
                return this.mValues[i3];
            }
            i3 = this.mNext[i3];
            if (i3 == -1) {
                return BitmapDescriptorFactory.HUE_RED;
            }
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    public int indexOf(SolverVariable solverVariable) {
        if (this.mCount != 0 && solverVariable != null) {
            int i = solverVariable.f7343id;
            int i2 = this.mKeys[i % this.mHashSize];
            if (i2 == -1) {
                return -1;
            }
            if (this.mVariables[i2] == i) {
                return i2;
            }
            do {
                i2 = this.mNextKeys[i2];
                if (i2 == -1) {
                    break;
                }
            } while (this.mVariables[i2] != i);
            if (i2 != -1 && this.mVariables[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void invert() {
        int i = this.mCount;
        int i2 = this.mHead;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.mValues;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.mNext[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void put(SolverVariable solverVariable, float f) {
        float f4 = sEpsilon;
        if (f > (-f4) && f < f4) {
            remove(solverVariable, true);
            return;
        }
        if (this.mCount == 0) {
            addVariable(0, solverVariable, f);
            addToHashMap(solverVariable, 0);
            this.mHead = 0;
            return;
        }
        int iIndexOf = indexOf(solverVariable);
        if (iIndexOf != -1) {
            this.mValues[iIndexOf] = f;
            return;
        }
        if (this.mCount + 1 >= this.mSize) {
            increaseSize();
        }
        int i = this.mCount;
        int i2 = this.mHead;
        int i3 = -1;
        for (int i5 = 0; i5 < i; i5++) {
            int i6 = this.mVariables[i2];
            int i21 = solverVariable.f7343id;
            if (i6 == i21) {
                this.mValues[i2] = f;
                return;
            }
            if (i6 < i21) {
                i3 = i2;
            }
            i2 = this.mNext[i2];
            if (i2 == -1) {
                break;
            }
        }
        insertVariable(i3, solverVariable, f);
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float remove(SolverVariable solverVariable, boolean z) {
        int iIndexOf = indexOf(solverVariable);
        if (iIndexOf == -1) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        removeFromHashMap(solverVariable);
        float f = this.mValues[iIndexOf];
        if (this.mHead == iIndexOf) {
            this.mHead = this.mNext[iIndexOf];
        }
        this.mVariables[iIndexOf] = -1;
        int[] iArr = this.mPrevious;
        int i = iArr[iIndexOf];
        if (i != -1) {
            int[] iArr2 = this.mNext;
            iArr2[i] = iArr2[iIndexOf];
        }
        int i2 = this.mNext[iIndexOf];
        if (i2 != -1) {
            iArr[i2] = iArr[iIndexOf];
        }
        this.mCount--;
        solverVariable.usageInRowCount--;
        if (z) {
            solverVariable.removeFromRow(this.mRow);
        }
        return f;
    }

    public String toString() {
        String strR;
        String strR2;
        String strR3 = hashCode() + " { ";
        int i = this.mCount;
        for (int i2 = 0; i2 < i; i2++) {
            SolverVariable variable = getVariable(i2);
            if (variable != null) {
                String str = strR3 + variable + " = " + getVariableValue(i2) + " ";
                int iIndexOf = indexOf(variable);
                String strR4 = d.r(str, "[p: ");
                if (this.mPrevious[iIndexOf] != -1) {
                    StringBuilder sbS = a.s(strR4);
                    sbS.append(this.mCache.mIndexedVariables[this.mVariables[this.mPrevious[iIndexOf]]]);
                    strR = sbS.toString();
                } else {
                    strR = d.r(strR4, "none");
                }
                String strR5 = d.r(strR, ", n: ");
                if (this.mNext[iIndexOf] != -1) {
                    StringBuilder sbS2 = a.s(strR5);
                    sbS2.append(this.mCache.mIndexedVariables[this.mVariables[this.mNext[iIndexOf]]]);
                    strR2 = sbS2.toString();
                } else {
                    strR2 = d.r(strR5, "none");
                }
                strR3 = d.r(strR2, "]");
            }
        }
        return d.r(strR3, " }");
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float use(ArrayRow arrayRow, boolean z) {
        float f = get(arrayRow.mVariable);
        remove(arrayRow.mVariable, z);
        SolverVariableValues solverVariableValues = (SolverVariableValues) arrayRow.variables;
        int currentSize = solverVariableValues.getCurrentSize();
        int i = 0;
        int i2 = 0;
        while (i < currentSize) {
            int i3 = solverVariableValues.mVariables[i2];
            if (i3 != -1) {
                add(this.mCache.mIndexedVariables[i3], solverVariableValues.mValues[i2] * f, z);
                i++;
            }
            i2++;
        }
        return f;
    }
}
