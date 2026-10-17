package b12;

import a10.b;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmPaymentAuthorisationPendingAction f11710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f11711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextClause f11712c;
    public final Clause d;
    public final Clause e;

    public a(ApmPaymentAuthorisationPendingAction pendingAction, Image logo, TextClause titleClause, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, int i) {
        textLocalisedClause = (i & 8) != 0 ? null : textLocalisedClause;
        textLocalisedClause2 = (i & 16) != 0 ? null : textLocalisedClause2;
        Intrinsics.checkNotNullParameter(pendingAction, "pendingAction");
        Intrinsics.checkNotNullParameter(logo, "logo");
        Intrinsics.checkNotNullParameter(titleClause, "titleClause");
        this.f11710a = pendingAction;
        this.f11711b = logo;
        this.f11712c = titleClause;
        this.d = textLocalisedClause;
        this.e = textLocalisedClause2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f11710a.equals(aVar.f11710a) && Intrinsics.f(this.f11711b, aVar.f11711b) && this.f11712c.equals(aVar.f11712c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        int iB = v7.b(b.c(this.f11711b, this.f11710a.hashCode() * 31, 31), 31, this.f11712c);
        Clause clause = this.d;
        int iHashCode = (iB + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.e;
        return iHashCode + (clause2 != null ? clause2.hashCode() : 0);
    }
}
