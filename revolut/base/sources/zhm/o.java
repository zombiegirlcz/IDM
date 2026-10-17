package zhm;

import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class o extends kotlin.collections.a implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f322476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f322477b;

    public /* synthetic */ o(Object obj2, int i) {
        this.f322476a = i;
        this.f322477b = obj2;
    }

    @Override // zhm.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj2) {
        switch (this.f322476a) {
            case 0:
                if (!(obj2 instanceof Byte)) {
                    return false;
                }
                byte bByteValue = ((Number) obj2).byteValue();
                byte[] bArr = (byte[]) this.f322477b;
                Intrinsics.checkNotNullParameter(bArr, "<this>");
                Intrinsics.checkNotNullParameter(bArr, "<this>");
                int length = bArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                    } else if (bByteValue != bArr[i]) {
                        i++;
                    }
                }
                return i >= 0;
            case 1:
                if (obj2 instanceof Integer) {
                    return kotlin.collections.d.G((int[]) this.f322477b, ((Number) obj2).intValue());
                }
                return false;
            default:
                if (!(obj2 instanceof Float)) {
                    return false;
                }
                float fFloatValue = ((Number) obj2).floatValue();
                for (float f : (float[]) this.f322477b) {
                    if (Float.floatToIntBits(f) == Float.floatToIntBits(fFloatValue)) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // kotlin.collections.a, java.util.List
    public final Object get(int i) {
        switch (this.f322476a) {
            case 0:
                return Byte.valueOf(((byte[]) this.f322477b)[i]);
            case 1:
                return Integer.valueOf(((int[]) this.f322477b)[i]);
            default:
                return Float.valueOf(((float[]) this.f322477b)[i]);
        }
    }

    @Override // zhm.a
    /* JADX INFO: renamed from: getSize */
    public final int get_size() {
        switch (this.f322476a) {
            case 0:
                return ((byte[]) this.f322477b).length;
            case 1:
                return ((int[]) this.f322477b).length;
            default:
                return ((float[]) this.f322477b).length;
        }
    }

    @Override // kotlin.collections.a, java.util.List
    public final int indexOf(Object obj2) {
        switch (this.f322476a) {
            case 0:
                if (!(obj2 instanceof Byte)) {
                    return -1;
                }
                byte bByteValue = ((Number) obj2).byteValue();
                byte[] bArr = (byte[]) this.f322477b;
                Intrinsics.checkNotNullParameter(bArr, "<this>");
                int length = bArr.length;
                for (int i = 0; i < length; i++) {
                    if (bByteValue == bArr[i]) {
                        return i;
                    }
                }
                return -1;
            case 1:
                if (!(obj2 instanceof Integer)) {
                    return -1;
                }
                return kotlin.collections.d.X((int[]) this.f322477b, ((Number) obj2).intValue());
            default:
                if (!(obj2 instanceof Float)) {
                    return -1;
                }
                float fFloatValue = ((Number) obj2).floatValue();
                float[] fArr = (float[]) this.f322477b;
                int length2 = fArr.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    if (Float.floatToIntBits(fArr[i2]) == Float.floatToIntBits(fFloatValue)) {
                        return i2;
                    }
                }
                return -1;
        }
    }

    @Override // zhm.a, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f322476a) {
            case 0:
                if (((byte[]) this.f322477b).length == 0) {
                }
                break;
            case 1:
                if (((int[]) this.f322477b).length == 0) {
                }
                break;
            default:
                if (((float[]) this.f322477b).length == 0) {
                }
                break;
        }
        return false;
    }

    @Override // kotlin.collections.a, java.util.List
    public final int lastIndexOf(Object obj2) {
        switch (this.f322476a) {
            case 0:
                if (obj2 instanceof Byte) {
                    byte bByteValue = ((Number) obj2).byteValue();
                    byte[] bArr = (byte[]) this.f322477b;
                    Intrinsics.checkNotNullParameter(bArr, "<this>");
                    int length = bArr.length - 1;
                    if (length >= 0) {
                        while (true) {
                            int i = length - 1;
                            if (bByteValue != bArr[length]) {
                                if (i >= 0) {
                                    length = i;
                                }
                            }
                        }
                    }
                    break;
                }
                break;
            case 1:
                if (obj2 instanceof Integer) {
                    int iIntValue = ((Number) obj2).intValue();
                    int[] iArr = (int[]) this.f322477b;
                    Intrinsics.checkNotNullParameter(iArr, "<this>");
                    int length2 = iArr.length - 1;
                    if (length2 >= 0) {
                        while (true) {
                            int i2 = length2 - 1;
                            if (iIntValue != iArr[length2]) {
                                if (i2 >= 0) {
                                    length2 = i2;
                                }
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                if (obj2 instanceof Float) {
                    float fFloatValue = ((Number) obj2).floatValue();
                    float[] fArr = (float[]) this.f322477b;
                    int length3 = fArr.length - 1;
                    if (length3 >= 0) {
                        while (true) {
                            int i3 = length3 - 1;
                            if (Float.floatToIntBits(fArr[length3]) != Float.floatToIntBits(fFloatValue)) {
                                if (i3 >= 0) {
                                    length3 = i3;
                                }
                            }
                        }
                    }
                    break;
                }
                break;
        }
        return -1;
    }
}
