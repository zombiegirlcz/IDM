package s57;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.widgets.GoalProgressWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.e1;
import com.revolut.core.ui_kit.delegates.widgets.f1;
import com.revolut.core.ui_kit.delegates.widgets.g1;
import com.revolut.core.ui_kit.delegates.widgets.k1;
import com.revolut.core.ui_kit.delegates.widgets.l1;
import com.revolut.core.ui_kit.delegates.widgets.m1;
import com.revolut.core.ui_kit.delegates.widgets.n1;
import com.revolut.core.ui_kit.delegates.widgets.p1;
import com.revolut.core.ui_kit.delegates.widgets.q1;
import com.revolut.core.ui_kit.delegates.widgets.r1;
import com.revolut.core.ui_kit.delegates.widgets.s1;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.badge.WhiteCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer_widgets.api.model.FreelancerWidgetClickData;
import ct6.w;
import et6.u0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jr6.d;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public boolean A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ m D;
    public final /* synthetic */ String E;
    public u57.e u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public rr6.j f260014w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public rr6.g f260015x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public rr6.m f260016y;
    public BigDecimal z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(m mVar, String str, Continuation continuation) {
        super(2, continuation);
        this.D = mVar;
        this.E = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.D, this.E, continuation);
        eVar.C = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((vf0.k) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v13, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        rr6.j jVar;
        rr6.g gVar;
        rr6.m mVar;
        boolean zBooleanValue;
        u57.e eVar;
        Object objA;
        BigDecimal bigDecimal;
        String widgetId;
        m1 e1Var;
        vf0.k kVar = (vf0.k) this.C;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.B;
        if (i == 0) {
            o.b(obj2);
            jVar = (rr6.j) kVar.f288454a;
            gVar = (rr6.g) kVar.f288455b;
            mVar = (rr6.m) kVar.f288456c;
            od0.i iVar = (od0.i) kVar.d;
            zBooleanValue = ((Boolean) kVar.e).booleanValue();
            m mVar2 = this.D;
            eVar = mVar2.e;
            rr6.o oVar = (rr6.o) iVar.g();
            BigDecimal value = oVar != null ? oVar.getValue() : null;
            u0 u0Var = mVar2.d;
            this.C = null;
            this.u = eVar;
            String str = this.E;
            this.v = str;
            this.f260014w = jVar;
            this.f260015x = gVar;
            this.f260016y = mVar;
            this.z = value;
            this.A = zBooleanValue;
            this.B = 1;
            objA = u0Var.a(this);
            if (objA == aVar) {
                return aVar;
            }
            bigDecimal = value;
            widgetId = str;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zBooleanValue = this.A;
            BigDecimal bigDecimal2 = this.z;
            mVar = this.f260016y;
            gVar = this.f260015x;
            jVar = this.f260014w;
            widgetId = this.v;
            u57.e eVar2 = this.u;
            o.b(obj2);
            bigDecimal = bigDecimal2;
            eVar = eVar2;
            objA = obj2;
        }
        boolean z = zBooleanValue;
        rr6.m currentRate = mVar;
        rr6.g boosterInfo = gVar;
        rr6.j cashbackInfo = jVar;
        boolean zBooleanValue2 = ((Boolean) objA).booleanValue();
        Float fValueOf = Float.valueOf(24.0f);
        w wVar = eVar.f277393a;
        jr6.g gVar2 = eVar.f277394b;
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        Intrinsics.checkNotNullParameter(cashbackInfo, "cashbackInfo");
        Intrinsics.checkNotNullParameter(boosterInfo, "boosterInfo");
        Intrinsics.checkNotNullParameter(currentRate, "currentRate");
        FreelancerWidgetClickData.Cashback.Tile tile = FreelancerWidgetClickData.Cashback.Tile.f74448a;
        if (!zBooleanValue2) {
            Intrinsics.checkNotNullParameter(cashbackInfo, "cashbackInfo");
            Intrinsics.checkNotNullParameter(currentRate, "currentRate");
            PercentageClause currentRateClause = new PercentageClause(currentRate.f256723c, (PercentageClause.Format) null, (Style) null, 6);
            CompositeClause payoutAmountInfoClause = yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new ImageClause(R$drawable.uikit_icn_24_coins, (Integer) null, (Float) null, (Float) null, 30), new MoneyClause(cashbackInfo.f256715b.d, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)));
            TextLocalisedClause payoutDueInfoClause = new TextLocalisedClause(R$string.freelancer_cashback_widget_details_footer_title_due_on, u.c(new TimeClause(oi0.d.c0(cashbackInfo.f256715b.f256731c), new TimeClause.Format.DayAndMonth(0), null, null, 12)), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8);
            Intrinsics.checkNotNullParameter(currentRateClause, "currentRateClause");
            Intrinsics.checkNotNullParameter(payoutAmountInfoClause, "payoutAmountInfoClause");
            Intrinsics.checkNotNullParameter(payoutDueInfoClause, "payoutDueInfoClause");
            return new GoalProgressWidgetDelegate.Model(widgetId, new TextLocalisedClause(R$string.freelancer_widget_cashback_title, null, null, 14), new r1(new q1(currentRateClause, null), null), new g1(payoutAmountInfoClause, payoutDueInfoClause), new s1(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_cashback, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 16.0f, fValueOf, null, 32), null), false, tile, 352);
        }
        jr6.f fVarA = ((qv6.a) gVar2).a(cashbackInfo, boosterInfo, currentRate, bigDecimal, z, d.a.f177938a);
        List list = fVarA.d;
        ?? r3 = fVarA.f177942c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.freelancer_widget_cashback_title, null, null, 14);
        r1 r1Var = new r1(new q1(fVarA.f177940a, null), new p1(fVarA.f177941b, null));
        LayeredImage layeredImageB = LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_cashback, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 16.0f, fValueOf, null, 32);
        rr6.c cVar = boosterInfo.d;
        s1 s1Var = new s1(layeredImageB, (cVar != rr6.c.MAXED || z) ? null : new WhiteCircleBadge(dw0.a.Boost));
        int i2 = u57.d.f277392a[cVar.ordinal()];
        if (i2 == 1) {
            e1Var = new e1(new TextLocalisedClause(R$string.freelancer_widget_cashback_action_earn_more, null, null, 14));
        } else if (i2 != 2) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList.add(new l1(((jr6.e) it8.next()).f177939a));
            }
            e1Var = new k1(arrayList, n1.Accent, r3, null);
        } else if (z) {
            List list3 = list;
            ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
            Iterator it9 = list3.iterator();
            while (it9.hasNext()) {
                arrayList2.add(new l1(((jr6.e) it9.next()).f177939a));
            }
            e1Var = new k1(arrayList2, n1.Accent, r3, TextLocalisedClause.c(new TextLocalisedClause(R$string.freelancer_widget_cashback_action_upgrade, null, null, 14), null, new Click(28, (Integer) null, (Object) FreelancerWidgetClickData.Cashback.Upgrade.f74449a, "CLAUSE_ID_CASHBACK_UPGRADE", false), 27));
        } else {
            e1Var = new f1(r3);
        }
        return new GoalProgressWidgetDelegate.Model(widgetId, textLocalisedClause, r1Var, e1Var, s1Var, false, tile, 352);
    }
}
