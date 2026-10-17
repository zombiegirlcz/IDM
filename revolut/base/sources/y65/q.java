package y65;

import aw0.o9;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import ip0.s7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.text.f0;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class q implements cli.n {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m35.q f311176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m35.r f311177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f311178c;

    public q(m35.q loanTransactionCategoryIconMapper, m35.r loanUiContentMapper, r loanInstalmentScheduleMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(loanTransactionCategoryIconMapper, "loanTransactionCategoryIconMapper");
        Intrinsics.checkNotNullParameter(loanUiContentMapper, "loanUiContentMapper");
        Intrinsics.checkNotNullParameter(loanInstalmentScheduleMapper, "loanInstalmentScheduleMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f311176a = loanTransactionCategoryIconMapper;
        this.f311177b = loanUiContentMapper;
        this.f311178c = featureToggleInteractor;
    }

    public static final void a(aim.e eVar, Ref$IntRef ref$IntRef, int i) {
        aim.e eVarB = u.b();
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = ref$IntRef.f186408a;
            ref$IntRef.f186408a = i3 + 1;
            eVarB.add(new s7(a0.d.n("loading-id-", i3), 0, 0, 0, 0, false, null, 126));
        }
        aim.e eVarA = u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        eVar.addAll(eVarA);
    }

    public static CellDetailsDelegate.Model b(LoanDetails loanDetails, x35.e eVar) {
        if (!loanDetails.q1() || !(eVar instanceof x35.b)) {
            return new CellDetailsDelegate.Model("payment_from_list_id", new TextLocalisedClause(R$string.loan_management_transaction_payment_from, null, null, 14), new TextLocalisedClause(R$string.loan_transaction_account_from, u.c(loanDetails.f70144a.f70123x.f306286a), null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
        }
        x35.b bVar = (x35.b) eVar;
        return new CellDetailsDelegate.Model("ID_PAYMENT_FROM_EXTERNAL", new TextLocalisedClause(R$string.loan_management_transaction_payment_from, null, null, 14), new TextClause(com.google.android.gms.internal.mlkit_vision_face.a.o(bVar.d, " ", j6.a.q("····", f0.V0(4, bVar.f.f302658a))), (Style) new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), null, null, false, 0, null, bVar, null, null, 0, new UrlImage(bVar.f302650c, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507902), false, null, 0, 0, 0, 0, 1039848);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (j) iii.c.f(t1.t(domainState.f311155a, domainState.f311156b), new y4b.b(this, 25), new n(0), new wx6.k(this, domainState, 28));
    }
}
