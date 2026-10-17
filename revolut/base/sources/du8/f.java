package du8;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import my8.r;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f117946a;

    static {
        r[] elements = {r.STUDENT_TIN_ABSENCE_PROOF, r.DIPLOMAT_TIN_ABSENCE_PROOF, r.DIPLOMAT_FAMILY_TIN_ABSENCE_PROOF, r.TEMPORARY_RESIDENT_TIN_ABSENCE_PROOF};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f117946a = kotlin.collections.d.y0(elements);
    }
}
