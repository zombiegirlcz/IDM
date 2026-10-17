package n14;

import iv3.f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import zhm.r0;

/* JADX INFO: loaded from: classes22.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f211239a = r0.k(new Pair("R_UNKNOWN_BANK", iv3.d.R_UNKNOWN_BANK), new Pair("R_WIDGET_ERROR", iv3.d.R_WIDGET_ERROR));

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    public static final j14.a a(iv3.f fVar) {
        String strG;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        if (fVar instanceof iv3.c) {
            strG = u1.g(((iv3.c) fVar).f168709a, f211239a);
        } else if (fVar instanceof iv3.e) {
            strG = ((iv3.e) fVar).f168710a;
        } else {
            if (!fVar.equals(f.a.f168711a)) {
                throw new NoWhenBranchMatchedException();
            }
            strG = "UserAbortedAuthorization";
        }
        return new j14.a(strG);
    }
}
