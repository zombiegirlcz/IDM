package zhm;

import java.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public class n extends m {
    public static boolean b(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr != null && objArr2 != null && objArr.length == objArr2.length) {
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                Object obj2 = objArr[i];
                Object obj3 = objArr2[i];
                if (obj2 != obj3) {
                    if (obj2 != null && obj3 != null) {
                        if ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) {
                            if (!b((Object[]) obj2, (Object[]) obj3)) {
                            }
                        } else if ((obj2 instanceof byte[]) && (obj3 instanceof byte[])) {
                            if (!Arrays.equals((byte[]) obj2, (byte[]) obj3)) {
                            }
                        } else if ((obj2 instanceof short[]) && (obj3 instanceof short[])) {
                            if (!Arrays.equals((short[]) obj2, (short[]) obj3)) {
                            }
                        } else if ((obj2 instanceof int[]) && (obj3 instanceof int[])) {
                            if (!Arrays.equals((int[]) obj2, (int[]) obj3)) {
                            }
                        } else if ((obj2 instanceof long[]) && (obj3 instanceof long[])) {
                            if (!Arrays.equals((long[]) obj2, (long[]) obj3)) {
                            }
                        } else if ((obj2 instanceof float[]) && (obj3 instanceof float[])) {
                            if (!Arrays.equals((float[]) obj2, (float[]) obj3)) {
                            }
                        } else if ((obj2 instanceof double[]) && (obj3 instanceof double[])) {
                            if (!Arrays.equals((double[]) obj2, (double[]) obj3)) {
                            }
                        } else if ((obj2 instanceof char[]) && (obj3 instanceof char[])) {
                            if (!Arrays.equals((char[]) obj2, (char[]) obj3)) {
                            }
                        } else if ((obj2 instanceof boolean[]) && (obj3 instanceof boolean[])) {
                            if (!Arrays.equals((boolean[]) obj2, (boolean[]) obj3)) {
                            }
                        } else if ((obj2 instanceof yhm.t) && (obj3 instanceof yhm.t)) {
                            if (!bim.b.c(((yhm.t) obj2).f314205a, ((yhm.t) obj3).f314205a)) {
                            }
                        } else if ((obj2 instanceof yhm.a0) && (obj3 instanceof yhm.a0)) {
                            if (!bim.b.a(((yhm.a0) obj2).f314182a, ((yhm.a0) obj3).f314182a)) {
                            }
                        } else if ((obj2 instanceof yhm.v) && (obj3 instanceof yhm.v)) {
                            if (!bim.b.b(((yhm.v) obj2).f314207a, ((yhm.v) obj3).f314207a)) {
                            }
                        } else if ((obj2 instanceof yhm.x) && (obj3 instanceof yhm.x)) {
                            if (!bim.b.d(((yhm.x) obj2).f314209a, ((yhm.x) obj3).f314209a)) {
                            }
                        } else if (!obj2.equals(obj3)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
}
