package c9;

import android.content.res.TypedArray;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import y8.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements l7.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f22248b;

    public c(List list) {
        this.f22247a = 3;
        this.f22248b = list;
    }

    @Override // l7.g
    public List b() {
        return (List) this.f22248b;
    }

    public e c() {
        e eVar = (e) this.f22248b;
        int[] iArr = eVar.f22250b;
        int i = eVar.f;
        if (i != 1) {
            int i2 = eVar.e;
            iArr[0] = i2;
            int i3 = eVar.d;
            iArr[1] = i3;
            iArr[2] = i3;
            iArr[3] = i2;
        } else {
            int i5 = eVar.d;
            iArr[0] = i5;
            iArr[1] = i5;
            int i6 = eVar.e;
            iArr[2] = i6;
            iArr[3] = i6;
        }
        float[] fArr = eVar.f22249a;
        if (i != 1) {
            fArr[0] = Math.max(((1.0f - eVar.k) - eVar.f22255l) / 2.0f, BitmapDescriptorFactory.HUE_RED);
            fArr[1] = Math.max(((1.0f - eVar.k) - 0.001f) / 2.0f, BitmapDescriptorFactory.HUE_RED);
            fArr[2] = Math.min(((eVar.k + 1.0f) + 0.001f) / 2.0f, 1.0f);
            fArr[3] = Math.min(((eVar.k + 1.0f) + eVar.f22255l) / 2.0f, 1.0f);
            return eVar;
        }
        fArr[0] = 0.0f;
        fArr[1] = Math.min(eVar.k, 1.0f);
        fArr[2] = Math.min(eVar.k + eVar.f22255l, 1.0f);
        fArr[3] = 1.0f;
        return eVar;
    }

    public c d(TypedArray typedArray) {
        e eVar = (e) this.f22248b;
        if (typedArray.hasValue(3)) {
            eVar.f22257n = typedArray.getBoolean(3, eVar.f22257n);
        }
        if (typedArray.hasValue(0)) {
            i(typedArray.getBoolean(0, eVar.o));
        }
        if (typedArray.hasValue(1)) {
            j(typedArray.getFloat(1, 0.3f));
        }
        if (typedArray.hasValue(11)) {
            l(typedArray.getFloat(11, 1.0f));
        }
        if (typedArray.hasValue(7)) {
            k(typedArray.getInt(7, (int) eVar.f22261s));
        }
        if (typedArray.hasValue(14)) {
            eVar.f22259q = typedArray.getInt(14, eVar.f22259q);
        }
        if (typedArray.hasValue(15)) {
            long j2 = typedArray.getInt(15, (int) eVar.f22262t);
            if (j2 < 0) {
                throw new IllegalArgumentException(p.a.m(j2, "Given a negative repeat delay: "));
            }
            eVar.f22262t = j2;
        }
        if (typedArray.hasValue(16)) {
            eVar.f22260r = typedArray.getInt(16, eVar.f22260r);
        }
        if (typedArray.hasValue(5)) {
            int i = typedArray.getInt(5, eVar.f22251c);
            if (i == 1) {
                eVar.f22251c = 1;
            } else if (i == 2) {
                eVar.f22251c = 2;
            } else if (i != 3) {
                eVar.f22251c = 0;
            } else {
                eVar.f22251c = 3;
            }
        }
        if (typedArray.hasValue(17)) {
            if (typedArray.getInt(17, eVar.f) != 1) {
                eVar.f = 0;
            } else {
                eVar.f = 1;
            }
        }
        if (typedArray.hasValue(6)) {
            float f = typedArray.getFloat(6, eVar.f22255l);
            if (f < BitmapDescriptorFactory.HUE_RED) {
                throw new IllegalArgumentException("Given invalid dropoff value: " + f);
            }
            eVar.f22255l = f;
        }
        if (typedArray.hasValue(9)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(9, eVar.f22252g);
            if (dimensionPixelSize < 0) {
                throw new IllegalArgumentException(a0.d.n("Given invalid width: ", dimensionPixelSize));
            }
            eVar.f22252g = dimensionPixelSize;
        }
        if (typedArray.hasValue(8)) {
            int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, eVar.f22253h);
            if (dimensionPixelSize2 < 0) {
                throw new IllegalArgumentException(a0.d.n("Given invalid height: ", dimensionPixelSize2));
            }
            eVar.f22253h = dimensionPixelSize2;
        }
        if (typedArray.hasValue(13)) {
            float f4 = typedArray.getFloat(13, eVar.k);
            if (f4 < BitmapDescriptorFactory.HUE_RED) {
                throw new IllegalArgumentException("Given invalid intensity value: " + f4);
            }
            eVar.k = f4;
        }
        if (typedArray.hasValue(19)) {
            m(typedArray.getFloat(19, eVar.i));
        }
        if (typedArray.hasValue(10)) {
            float f5 = typedArray.getFloat(10, eVar.f22254j);
            if (f5 < BitmapDescriptorFactory.HUE_RED) {
                throw new IllegalArgumentException("Given invalid height ratio: " + f5);
            }
            eVar.f22254j = f5;
        }
        if (typedArray.hasValue(18)) {
            eVar.f22256m = typedArray.getFloat(18, eVar.f22256m);
        }
        return e();
    }

    public abstract c e();

    public abstract void f();

    public abstract void g();

    public void h(f8.h hVar) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f22248b;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(hVar);
        }
    }

    public c i(boolean z) {
        ((e) this.f22248b).o = z;
        return e();
    }

    @Override // l7.g
    public boolean isStatic() {
        List list = (List) this.f22248b;
        return list.isEmpty() || (list.size() == 1 && ((s7.a) list.get(0)).c());
    }

    public c j(float f) {
        int iMin = (int) (Math.min(1.0f, Math.max(BitmapDescriptorFactory.HUE_RED, f)) * 255.0f);
        e eVar = (e) this.f22248b;
        eVar.e = (iMin << 24) | (eVar.e & 16777215);
        return e();
    }

    public c k(long j2) {
        if (j2 < 0) {
            throw new IllegalArgumentException(p.a.m(j2, "Given a negative duration: "));
        }
        ((e) this.f22248b).f22261s = j2;
        return e();
    }

    public c l(float f) {
        int iMin = (int) (Math.min(1.0f, Math.max(BitmapDescriptorFactory.HUE_RED, f)) * 255.0f);
        e eVar = (e) this.f22248b;
        eVar.d = (iMin << 24) | (eVar.d & 16777215);
        return e();
    }

    public c m(float f) {
        if (f >= BitmapDescriptorFactory.HUE_RED) {
            ((e) this.f22248b).i = f;
            return e();
        }
        throw new IllegalArgumentException("Given invalid width ratio: " + f);
    }

    public void n(Object obj2, boolean z) {
        Set set = (Set) this.f22248b;
        int size = set.size();
        if (z) {
            set.add(obj2);
            if (size == 0) {
                f();
                return;
            }
            return;
        }
        if (set.remove(obj2) && size == 1) {
            g();
        }
    }

    public String toString() {
        switch (this.f22247a) {
            case 3:
                StringBuilder sb6 = new StringBuilder();
                List list = (List) this.f22248b;
                if (!list.isEmpty()) {
                    sb6.append("values=");
                    sb6.append(Arrays.toString(list.toArray()));
                }
                return sb6.toString();
            default:
                return super.toString();
        }
    }

    public c(int i) {
        this.f22247a = i;
        switch (i) {
            case 1:
                char[] cArr = l.f311609a;
                this.f22248b = new ArrayDeque(20);
                break;
            case 2:
                this.f22248b = Collections.newSetFromMap(new IdentityHashMap());
                break;
            default:
                this.f22248b = new e();
                break;
        }
    }
}
