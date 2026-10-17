package wg2;

import android.os.Parcelable;
import bpe.e;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import com.revolut.feature.tax_residency.api.stamp_duty.models.StampDutyAccount;
import com.revolut.feature.tax_residency.impl.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import yki.l;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f297224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f297225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f297226c;

    public /* synthetic */ g(int i, String str, Object obj2) {
        this.f297224a = i;
        this.f297226c = obj2;
        this.f297225b = str;
    }

    private final Object a(Object obj2) {
        TextLocalisedClause textLocalisedClause;
        com.revolut.feature.tax_residency.impl.stamp_duty.flow.a aVar = (com.revolut.feature.tax_residency.impl.stamp_duty.flow.a) this.f297225b;
        l lVar = (l) this.f297226c;
        bpe.e result = (bpe.e) obj2;
        Intrinsics.checkNotNullParameter(result, "result");
        Continuation continuation = null;
        if (result instanceof e.b) {
            woe.c cVar = aVar.o;
            MoneyClause moneyClause = new MoneyClause(cVar.f298934a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
            StampDutyAccount stampDutyAccount = cVar.f298935b;
            if (stampDutyAccount instanceof StampDutyAccount.Personal) {
                textLocalisedClause = new TextLocalisedClause(R$string.stamp_duty_pay_confirmation_personal_text, u.c(moneyClause), null, 12);
            } else if (stampDutyAccount instanceof StampDutyAccount.Joint) {
                textLocalisedClause = new TextLocalisedClause(R$string.stamp_duty_pay_confirmation_joint_text, u.c(moneyClause), null, 12);
            } else {
                if (!Intrinsics.f(stampDutyAccount, StampDutyAccount.Pro.f89993a)) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(R$string.stamp_duty_pay_confirmation_freelancer_text, u.c(moneyClause), null, 12);
            }
            yji.l.a1(aVar, aVar.X1(new y0(null, new j0((Clause) textLocalisedClause, (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094), false, 5)), null, null, new wka.e(aVar, lVar, continuation, 10), 3);
        } else if (result instanceof e.a) {
            aVar.C2(ene.a.f127819a);
            oki.h.D2(lVar);
        } else {
            if (!(result instanceof bpe.f)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit(((bpe.f) result).f17614a, 14), (SharedFaqDestination.PassthroughData) null, false, 14));
            aVar.C2(ene.b.f127820a);
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03e1  */
    /* JADX WARN: Type inference failed for: r0v100 */
    /* JADX WARN: Type inference failed for: r0v107, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v99, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r13v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.revolut.feature.apm.core.models.alias.beneficiary.ResolveAlias] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r6v27, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v44, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v2, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wg2.g.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ g(Object obj2, int i, Object obj3, Object obj4) {
        this.f297224a = i;
        this.f297225b = obj3;
        this.f297226c = obj4;
    }

    public /* synthetic */ g(Object obj2, Object obj3, int i) {
        this.f297224a = i;
        this.f297225b = obj2;
        this.f297226c = obj3;
    }

    public /* synthetic */ g(cl3.c[] cVarArr, wl3.h hVar, cl3.b bVar) {
        this.f297224a = 14;
        this.f297225b = cVarArr;
        this.f297226c = bVar;
    }
}
