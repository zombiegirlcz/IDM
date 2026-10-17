package kkf;

import com.revolut.feature.be_driven_design.models.domain.FincrimeHomeScreenAction;
import com.revolut.feature.be_driven_design.models.domain.FincrimeHomeScreenActionButton;
import com.revolut.feature.be_driven_design.models.domain.SectionContent;
import com.revolut.feature.support.api.navigation.HelpCentreFeatureConfig;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class q extends yji.n implements elf.s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.o f184894l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final y9l.a f184895m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final klf.h0 f184896n;
    public final klf.m1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z9l.f f184897p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ep6.n f184898q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final bp6.b f184899r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final use.d f184900s;

    public q(klf.o chargebackDataSource, y9l.a entityConfigActionExtension, klf.h0 commonDataSource, klf.m1 juniorDataSource, z9l.f listItemsProvider, ep6.n feedbackExtension, bp6.b feedbackWidgetMapper, use.d ticketsInteractor) {
        Intrinsics.checkNotNullParameter(chargebackDataSource, "chargebackDataSource");
        Intrinsics.checkNotNullParameter(entityConfigActionExtension, "entityConfigActionExtension");
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(listItemsProvider, "listItemsProvider");
        Intrinsics.checkNotNullParameter(feedbackExtension, "feedbackExtension");
        Intrinsics.checkNotNullParameter(feedbackWidgetMapper, "feedbackWidgetMapper");
        Intrinsics.checkNotNullParameter(ticketsInteractor, "ticketsInteractor");
        this.f184894l = chargebackDataSource;
        this.f184895m = entityConfigActionExtension;
        this.f184896n = commonDataSource;
        this.o = juniorDataSource;
        this.f184897p = listItemsProvider;
        this.f184898q = feedbackExtension;
        this.f184899r = feedbackWidgetMapper;
        this.f184900s = ticketsInteractor;
    }

    @Override // yji.n
    public final void D2() {
        yji.n.j2(this, this.f184895m.b3(), null, new k22.c(this, null, 25), 3);
    }

    public final cmf.p Z2() {
        return new cmf.p(vkm.q.Q(this.o.a(), new jy6.l((Continuation) null, this, 15)), new chc.c0(23), zhm.u.c(this), "Chargeback");
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        String str2;
        boolean z;
        if (!Intrinsics.f(str, "FAQ_FEEDBACK_ITEM_ID")) {
            if (obj2 instanceof SectionContent.FaqCell) {
                A2(zh9.u0.c(new HelpCentreFeatureConfig.Topic(((SectionContent.FaqCell) obj2).f64171b, "transaction_details_redesign")));
                return Boolean.TRUE;
            }
            FincrimeHomeScreenAction deeplink = obj2 instanceof FincrimeHomeScreenAction ? (FincrimeHomeScreenAction) obj2 : obj2 instanceof FincrimeHomeScreenActionButton ? ((FincrimeHomeScreenActionButton) obj2).f64148b : (!(obj2 instanceof SectionContent.TransactionCell) || (str2 = ((SectionContent.TransactionCell) obj2).f64193j) == null) ? null : new FincrimeHomeScreenAction.Deeplink(str2);
            if (deeplink == null) {
                return Boolean.FALSE;
            }
            this.f184895m.Z2(deeplink);
            return Boolean.TRUE;
        }
        cmf.m mVar = cmf.m.DISLIKE;
        ep6.n nVar = this.f184898q;
        if (obj2 == mVar) {
            nVar.A1();
        } else {
            if (obj2 != cmf.m.LIKE) {
                z = false;
                return Boolean.valueOf(z);
            }
            nVar.L0();
        }
        z = true;
        return Boolean.valueOf(z);
    }
}
