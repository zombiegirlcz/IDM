package xkk;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.data.model.Data;
import com.revolut.feature.pricingplans.models.PricingPlanNextPlanInfo;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$plurals;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import ggk.y;
import ggk.z;
import java.time.Duration;
import java.time.Instant;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class q implements cli.n {

    @NotNull
    public static final p Companion = new p();
    public static final k d = new k(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yik.b f306862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mlk.f f306863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l80.e f306864c;

    public q(yik.b backgroundMapper, mlk.f benefitsToLoseItemsMapper, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(backgroundMapper, "backgroundMapper");
        Intrinsics.checkNotNullParameter(benefitsToLoseItemsMapper, "benefitsToLoseItemsMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f306862a = backgroundMapper;
        this.f306863b = benefitsToLoseItemsMapper;
        this.f306864c = dateProvider;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        hha.d dVar;
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        final int i = 0;
        l lVar = (l) iii.c.f(domainState.f306847a, new xif.c(20), new xce.d(24), new Function3(this) { // from class: xkk.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f306861b;

            {
                this.f306861b = this;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                Clause textClause;
                Clause textClause2;
                Long l2;
                Object next;
                Long l3;
                Instant instantOfEpochMilli;
                int i2 = i;
                q qVar = this.f306861b;
                switch (i2) {
                    case 0:
                        PricingPlanSubscription subscription = (PricingPlanSubscription) obj2;
                        ((Boolean) obj3).getClass();
                        Intrinsics.checkNotNullParameter(subscription, "subscription");
                        PricingPlanNextPlanInfo pricingPlanNextPlanInfo = subscription.f81134j;
                        if (pricingPlanNextPlanInfo == null || (l3 = pricingPlanNextPlanInfo.d) == null || (instantOfEpochMilli = Instant.ofEpochMilli(l3.longValue())) == null) {
                            m70.a.c(t0.f186434a);
                            textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        } else {
                            Duration durationBetween = Duration.between(((l80.f) qVar.f306864c).b(), instantOfEpochMilli);
                            Intrinsics.checkNotNullExpressionValue(durationBetween, "between(...)");
                            long days = durationBetween.toDays();
                            textClause = new TextLocalisedQuantityClause(R$plurals.plan_end_of_trial_reminder_title_remaining_days, Long.valueOf(days), v.k(Long.valueOf(days), dok.g.d(subscription.f81129a, null)), (Style) null, 24);
                        }
                        PricingPlanNextPlanInfo pricingPlanNextPlanInfo2 = subscription.f81134j;
                        if (pricingPlanNextPlanInfo2 == null || (l2 = pricingPlanNextPlanInfo2.d) == null) {
                            m70.a.c(t0.f186434a);
                            textClause2 = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        } else {
                            TimeClause timeClauseC = dok.b.c(new DateTime(l2.longValue()));
                            Iterator it8 = subscription.i.iterator();
                            while (true) {
                                if (it8.hasNext()) {
                                    next = it8.next();
                                    if (Intrinsics.f(((hha.g) next).f152306a, subscription.d)) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            hha.g gVar = (hha.g) next;
                            if (gVar == null) {
                                m70.a.c(t0.f186434a);
                                textClause2 = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                            } else {
                                textClause2 = new TextLocalisedClause(R$string.plan_end_of_trial_reminder_subtitle, v.k(dok.g.f(gVar), timeClauseC), null, 12);
                            }
                        }
                        return new l(textClause, textClause2);
                    default:
                        y benefitsToLose = (y) obj2;
                        ((Boolean) obj3).getClass();
                        Intrinsics.checkNotNullParameter(benefitsToLose, "benefitsToLose");
                        z zVar = benefitsToLose.f143800c;
                        return qVar.f306863b.a(zVar != null ? z.a(zVar, null, 6) : null);
                }
            }
        });
        Data data = domainState.f306847a;
        k kVar = (k) iii.c.f(data, new xif.c(22), new xce.d(26), new x0b.h(this, 9));
        PricingPlanSubscription pricingPlanSubscription = (PricingPlanSubscription) data.getContent();
        String str = (pricingPlanSubscription == null || (dVar = pricingPlanSubscription.f81129a) == null) ? null : dVar.f152289c;
        if (str == null) {
            str = "";
        }
        final int i2 = 1;
        return new m(lVar, kVar, this.f306862a.c(str), (List) iii.c.f(domainState.f306848b, new xif.c(this, 21), new xce.d(25), new Function3(this) { // from class: xkk.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f306861b;

            {
                this.f306861b = this;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                Clause textClause;
                Clause textClause2;
                Long l2;
                Object next;
                Long l3;
                Instant instantOfEpochMilli;
                int i22 = i2;
                q qVar = this.f306861b;
                switch (i22) {
                    case 0:
                        PricingPlanSubscription subscription = (PricingPlanSubscription) obj2;
                        ((Boolean) obj3).getClass();
                        Intrinsics.checkNotNullParameter(subscription, "subscription");
                        PricingPlanNextPlanInfo pricingPlanNextPlanInfo = subscription.f81134j;
                        if (pricingPlanNextPlanInfo == null || (l3 = pricingPlanNextPlanInfo.d) == null || (instantOfEpochMilli = Instant.ofEpochMilli(l3.longValue())) == null) {
                            m70.a.c(t0.f186434a);
                            textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        } else {
                            Duration durationBetween = Duration.between(((l80.f) qVar.f306864c).b(), instantOfEpochMilli);
                            Intrinsics.checkNotNullExpressionValue(durationBetween, "between(...)");
                            long days = durationBetween.toDays();
                            textClause = new TextLocalisedQuantityClause(R$plurals.plan_end_of_trial_reminder_title_remaining_days, Long.valueOf(days), v.k(Long.valueOf(days), dok.g.d(subscription.f81129a, null)), (Style) null, 24);
                        }
                        PricingPlanNextPlanInfo pricingPlanNextPlanInfo2 = subscription.f81134j;
                        if (pricingPlanNextPlanInfo2 == null || (l2 = pricingPlanNextPlanInfo2.d) == null) {
                            m70.a.c(t0.f186434a);
                            textClause2 = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        } else {
                            TimeClause timeClauseC = dok.b.c(new DateTime(l2.longValue()));
                            Iterator it8 = subscription.i.iterator();
                            while (true) {
                                if (it8.hasNext()) {
                                    next = it8.next();
                                    if (Intrinsics.f(((hha.g) next).f152306a, subscription.d)) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            hha.g gVar = (hha.g) next;
                            if (gVar == null) {
                                m70.a.c(t0.f186434a);
                                textClause2 = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                            } else {
                                textClause2 = new TextLocalisedClause(R$string.plan_end_of_trial_reminder_subtitle, v.k(dok.g.f(gVar), timeClauseC), null, 12);
                            }
                        }
                        return new l(textClause, textClause2);
                    default:
                        y benefitsToLose = (y) obj2;
                        ((Boolean) obj3).getClass();
                        Intrinsics.checkNotNullParameter(benefitsToLose, "benefitsToLose");
                        z zVar = benefitsToLose.f143800c;
                        return qVar.f306863b.a(zVar != null ? z.a(zVar, null, 6) : null);
                }
            }
        }));
    }
}
