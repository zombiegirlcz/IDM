package nue;

import com.revolut.domain.models.topup.methods.TopupMethod;
import java.util.concurrent.CopyOnWriteArrayList;
import kve.e;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class d {
    public static TopupMethod.StoredMethod.LogoBadge a(e.a aVar) {
        try {
            return new TopupMethod.StoredMethod.LogoBadge(TopupMethod.StoredMethod.LogoBadge.Icon.valueOf(aVar.getIcon()), TopupMethod.StoredMethod.LogoBadge.Style.valueOf(aVar.getStyle()));
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            return null;
        }
    }

    public static e.a c(TopupMethod.StoredMethod.LogoBadge logoBadge) {
        return new e.a(logoBadge.f60473a.name(), logoBadge.f60474b.name());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:243:0x044f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0016 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v11, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v2, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r12v22, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v25, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v28, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v31, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v38, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r12v39, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v7, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v28, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v33, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v10, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v6, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.domain.models.topup.methods.b b(kve.c r21) {
        /*
            Method dump skipped, instruction units count: 1194
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nue.d.b(kve.c):com.revolut.domain.models.topup.methods.b");
    }
}
