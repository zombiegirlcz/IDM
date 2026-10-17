package hf8;

import ab4.q;
import b16.c;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nkm.y;
import udj.d;
import udj.f;
import udj.k;
import udj.l;
import v60.e;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f151780a;

    public b(List resolvers, e serverErrorsProvider) {
        Intrinsics.checkNotNullParameter(resolvers, "resolvers");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        this.f151780a = resolvers;
    }

    public static TextLocalisedClause a(b bVar, Throwable throwable) {
        bVar.getClass();
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        TextLocalisedClause textLocalisedClause = (TextLocalisedClause) y.r(y.z(d0.Q(bVar.f151780a), new q(throwable, 16)));
        if (textLocalisedClause != null) {
            return textLocalisedClause;
        }
        new v60.b();
        return new TextLocalisedClause("error.generic", (List) null, (Clause) null, false, 14);
    }

    public b(tul.b kycConstraintCondition, f kycConstraintResolver, d authConstraintCondition, l retailAuthConstraintResolver, c androidMinimumVersionDeeplinkConstraintCondition, k androidMinimumVersionDeeplinkConstraintResolver) {
        Intrinsics.checkNotNullParameter(kycConstraintCondition, "kycConstraintCondition");
        Intrinsics.checkNotNullParameter(kycConstraintResolver, "kycConstraintResolver");
        Intrinsics.checkNotNullParameter(authConstraintCondition, "authConstraintCondition");
        Intrinsics.checkNotNullParameter(retailAuthConstraintResolver, "retailAuthConstraintResolver");
        Intrinsics.checkNotNullParameter(androidMinimumVersionDeeplinkConstraintCondition, "androidMinimumVersionDeeplinkConstraintCondition");
        Intrinsics.checkNotNullParameter(androidMinimumVersionDeeplinkConstraintResolver, "androidMinimumVersionDeeplinkConstraintResolver");
        this.f151780a = v.k(new wli.e(kycConstraintCondition, kycConstraintResolver), new wli.e(authConstraintCondition, retailAuthConstraintResolver), new wli.e(androidMinimumVersionDeeplinkConstraintCondition, androidMinimumVersionDeeplinkConstraintResolver));
    }
}
