package b48;

import j38.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes13.dex */
public final class d implements m38.a {
    public final j38.a a(String relationship) {
        Intrinsics.checkNotNullParameter(relationship, "relationship");
        if (Intrinsics.f(relationship, "marriedOrCivil")) {
            return a.b.f170986a;
        }
        if (Intrinsics.f(relationship, "family")) {
            return a.C0967a.f170985a;
        }
        if (Intrinsics.f(relationship, "other")) {
            return a.c.f170987a;
        }
        m70.a.c(t0.f186434a);
        return Intrinsics.f(relationship, "") ? a.d.f170988a : new j38.b(relationship);
    }

    public final String b(j38.a relationship) {
        Intrinsics.checkNotNullParameter(relationship, "relationship");
        if (Intrinsics.f(relationship, a.b.f170986a)) {
            return "marriedOrCivil";
        }
        if (Intrinsics.f(relationship, a.C0967a.f170985a)) {
            return "family";
        }
        if (Intrinsics.f(relationship, a.c.f170987a)) {
            return "other";
        }
        if (Intrinsics.f(relationship, a.d.f170988a)) {
            m70.a.c(t0.f186434a);
            return "";
        }
        if (relationship instanceof j38.b) {
            return ((j38.b) relationship).a();
        }
        throw new NoWhenBranchMatchedException();
    }
}
