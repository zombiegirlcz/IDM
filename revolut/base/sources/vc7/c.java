package vc7;

import b9d.k;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ExtraSmallCardScrollerWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.home_feed.api.R$string;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import csh.e;
import dsh.j;
import efm.r;
import f28.b0;
import ffk.t;
import ip0.kh;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.flow.Flow;
import op0.q;
import vim.f;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aa6.c f287648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f287649c;
    public final gte.a d;
    public final t e;

    public c(aa6.c donationsInteractor, a31.a donationsAvailabilityInteractor, gte.a featureToggleInteractor, t pricingPlanInteractor) {
        Intrinsics.checkNotNullParameter(donationsInteractor, "donationsInteractor");
        Intrinsics.checkNotNullParameter(donationsAvailabilityInteractor, "donationsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        this.f287648b = donationsInteractor;
        this.f287649c = donationsAvailabilityInteractor;
        this.d = featureToggleInteractor;
        this.e = pricingPlanInteractor;
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        dsh.e.Companion.getClass();
        return dsh.d.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0088, code lost:
    
        if (r8 == r0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // csh.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r7 = r8 instanceof vc7.b
            if (r7 == 0) goto L13
            r7 = r8
            vc7.b r7 = (vc7.b) r7
            int r0 = r7.f287647w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r7.f287647w = r0
            goto L1a
        L13:
            vc7.b r7 = new vc7.b
            gim.c r8 = (gim.c) r8
            r7.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r7.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.f287647w
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L39
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2d
            yhm.o.b(r8)
            goto L8b
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            yhm.o.b(r8)
            goto L65
        L39:
            yhm.o.b(r8)
            gte.a r8 = r6.d
            com.revolut.feature.home_feed.api.widget.HomeFeedWidgetApi$Toggles$DonationsWidget r1 = com.revolut.feature.home_feed.api.widget.HomeFeedWidgetApi$Toggles$DonationsWidget.f74705c
            boolean r8 = r8.a(r1)
            if (r8 == 0) goto L49
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L49:
            ffk.t r8 = r6.e
            w4l.h r1 = w4l.h.f294642c
            efm.r r8 = r8.v(r1)
            v78.d r1 = new v78.d
            r5 = 12
            r1.<init>(r5)
            efm.r r8 = m70.a.g(r8, r4, r1, r3)
            r7.f287647w = r3
            java.lang.Object r8 = nim.a.e(r8, r7)
            if (r8 != r0) goto L65
            goto L8a
        L65:
            com.revolut.feature.pricingplans.models.PricingPlanSubscription r8 = (com.revolut.feature.pricingplans.models.PricingPlanSubscription) r8
            if (r8 == 0) goto L6c
            hha.e r8 = r8.f81130b
            goto L6d
        L6c:
            r8 = r4
        L6d:
            hha.e r1 = hha.e.PERSONAL_UNDER_18
            if (r8 != r1) goto L9a
            a31.a r8 = r6.f287649c
            ae8.c r8 = r8.j()
            v78.d r1 = new v78.d
            r5 = 13
            r1.<init>(r5)
            jhi.b r8 = mo3.a.g(r8, r4, r1, r3)
            r7.f287647w = r2
            java.lang.Object r8 = vkm.q.z(r8, r7)
            if (r8 != r0) goto L8b
        L8a:
            return r0
        L8b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            if (r8 == 0) goto L94
            boolean r7 = r8.booleanValue()
            goto L95
        L94:
            r7 = 0
        L95:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        L9a:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: vc7.c.c(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String listId, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(listId, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        ExtraSmallCardScrollerWidgetDelegate.Model.Companion companion = ExtraSmallCardScrollerWidgetDelegate.Model.INSTANCE;
        TextLocalisedClause title = new TextLocalisedClause(R$string.home_feed_interactive_widget_title_donations, null, null, 14);
        companion.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        IntRange intRange = new IntRange(1, 3, 1);
        ArrayList arrayList = new ArrayList(w.t(intRange, 10));
        f it8 = intRange.iterator();
        while (it8.f289625c) {
            kh khVar = new kh(String.valueOf(it8.nextInt()));
            yp0.b.m(khVar);
            arrayList.add(khVar);
        }
        return new ExtraSmallCardScrollerWidgetDelegate.Model(listId, q.MEDIUM, title, arrayList, true);
    }

    @Override // csh.e
    public final Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return c(str, eVar);
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, ish.f fVar) {
        return i(str, fVar);
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        HomeFeedWidgetContext.Personal widgetContext2 = (HomeFeedWidgetContext.Personal) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        return rd0.e.b(j(id10));
    }

    @Override // csh.e
    public final /* bridge */ j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((HomeFeedWidgetContext.Personal) widgetContext, str, eVar);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof vc7.a
            if (r0 == 0) goto L13
            r0 = r6
            vc7.a r0 = (vc7.a) r0
            int r1 = r0.f287646w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f287646w = r1
            goto L1a
        L13:
            vc7.a r0 = new vc7.a
            gim.c r6 = (gim.c) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f287646w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r6)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            efm.r r5 = r4.j(r5)
            vkm.d r5 = rd0.e.b(r5)
            r0.f287646w = r3
            java.lang.Object r6 = vkm.q.x(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.lang.String r5 = "first(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: vc7.c.i(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final r j(String str) {
        return m70.a.f(aa6.c.a(this.f287648b, true), new k(15, str, this), new b0(this, str, 24), new v78.d(14));
    }
}
