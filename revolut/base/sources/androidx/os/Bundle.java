package androidx.os;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import zhm.n;

/* JADX INFO: renamed from: androidx.savedstate.SavedStateReaderKt__SavedStateReader_androidKt, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u001a#\u0010\u0006\u001a\u00020\u0003*\u00060\u0000j\u0002`\u00012\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\n\u001a\u00020\u0007*\u00060\u0000j\u0002`\u0001H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "other", "", "contentDeepEquals$SavedStateReaderKt__SavedStateReader_androidKt", "(Landroid/os/Bundle;Landroid/os/Bundle;)Z", "contentDeepEquals", "", "contentDeepHashCode$SavedStateReaderKt__SavedStateReader_androidKt", "(Landroid/os/Bundle;)I", "contentDeepHashCode", "savedstate_release"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/savedstate/SavedStateReaderKt")
abstract /* synthetic */ class Bundle {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean contentDeepEquals$SavedStateReaderKt__SavedStateReader_androidKt(android.os.Bundle bundle, android.os.Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj2 = bundle.get(str);
            Object obj3 = bundle2.get(str);
            if (obj2 != obj3 && !Intrinsics.f(obj2, obj3)) {
                if (obj2 != null && obj3 != null) {
                    if ((obj2 instanceof android.os.Bundle) && (obj3 instanceof android.os.Bundle)) {
                        if (!contentDeepEquals$SavedStateReaderKt__SavedStateReader_androidKt((android.os.Bundle) obj2, (android.os.Bundle) obj3)) {
                            return false;
                        }
                    } else if ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) {
                        if (!n.b((Object[]) obj2, (Object[]) obj3)) {
                            return false;
                        }
                    } else if ((obj2 instanceof byte[]) && (obj3 instanceof byte[])) {
                        if (!Arrays.equals((byte[]) obj2, (byte[]) obj3)) {
                            return false;
                        }
                    } else if ((obj2 instanceof short[]) && (obj3 instanceof short[])) {
                        if (!Arrays.equals((short[]) obj2, (short[]) obj3)) {
                            return false;
                        }
                    } else if ((obj2 instanceof int[]) && (obj3 instanceof int[])) {
                        if (!Arrays.equals((int[]) obj2, (int[]) obj3)) {
                            return false;
                        }
                    } else if ((obj2 instanceof long[]) && (obj3 instanceof long[])) {
                        if (!Arrays.equals((long[]) obj2, (long[]) obj3)) {
                            return false;
                        }
                    } else if ((obj2 instanceof float[]) && (obj3 instanceof float[])) {
                        if (!Arrays.equals((float[]) obj2, (float[]) obj3)) {
                            return false;
                        }
                    } else if ((obj2 instanceof double[]) && (obj3 instanceof double[])) {
                        if (!Arrays.equals((double[]) obj2, (double[]) obj3)) {
                            return false;
                        }
                    } else if ((obj2 instanceof char[]) && (obj3 instanceof char[])) {
                        if (!Arrays.equals((char[]) obj2, (char[]) obj3)) {
                            return false;
                        }
                    } else if ((obj2 instanceof boolean[]) && (obj3 instanceof boolean[])) {
                        if (!Arrays.equals((boolean[]) obj2, (boolean[]) obj3)) {
                            return false;
                        }
                    } else if (!obj2.equals(obj3)) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int contentDeepHashCode$SavedStateReaderKt__SavedStateReader_androidKt(android.os.Bundle bundle) {
        Iterator<String> it8 = bundle.keySet().iterator();
        int iContentDeepHashCode$SavedStateReaderKt__SavedStateReader_androidKt = 1;
        while (it8.hasNext()) {
            Object obj2 = bundle.get(it8.next());
            iContentDeepHashCode$SavedStateReaderKt__SavedStateReader_androidKt = (iContentDeepHashCode$SavedStateReaderKt__SavedStateReader_androidKt * 31) + (obj2 instanceof android.os.Bundle ? contentDeepHashCode$SavedStateReaderKt__SavedStateReader_androidKt((android.os.Bundle) obj2) : obj2 instanceof Object[] ? Arrays.deepHashCode((Object[]) obj2) : obj2 instanceof byte[] ? Arrays.hashCode((byte[]) obj2) : obj2 instanceof short[] ? Arrays.hashCode((short[]) obj2) : obj2 instanceof int[] ? Arrays.hashCode((int[]) obj2) : obj2 instanceof long[] ? Arrays.hashCode((long[]) obj2) : obj2 instanceof float[] ? Arrays.hashCode((float[]) obj2) : obj2 instanceof double[] ? Arrays.hashCode((double[]) obj2) : obj2 instanceof char[] ? Arrays.hashCode((char[]) obj2) : obj2 instanceof boolean[] ? Arrays.hashCode((boolean[]) obj2) : obj2 != null ? obj2.hashCode() : 0);
        }
        return iContentDeepHashCode$SavedStateReaderKt__SavedStateReader_androidKt;
    }
}
