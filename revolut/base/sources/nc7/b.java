package nc7;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends i implements Function2 {
    public int u;
    public final /* synthetic */ BaseDraggableWidgetDelegate.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f214156w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ HomeFeedWidgetContext.Personal f214157x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(BaseDraggableWidgetDelegate.a aVar, c cVar, HomeFeedWidgetContext.Personal personal, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
        this.f214156w = cVar;
        this.f214157x = personal;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, this.f214156w, this.f214157x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (r8 == r2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        if (r8 == r2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0069, code lost:
    
        return r2;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            nc7.c r0 = r7.f214156w
            qtd.b r1 = r0.f214158a
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r7.u
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L1e
            if (r3 == r5) goto L19
            if (r3 != r4) goto L11
            goto L19
        L11:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L19:
            yhm.o.b(r8)
            goto L8a
        L1e:
            yhm.o.b(r8)
            com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate$a r8 = r7.v
            boolean r3 = r8 instanceof com.revolut.core.ui_kit.delegates.widgets.i
            if (r3 == 0) goto L33
            sri.m r8 = r1.d
            com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig$TravelMode$Destination r0 = com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig.TravelMode.Destination.f87438a
            com.revolut.retail.core.navigation.FeatureCommand r0 = zh9.u0.f(r0)
            r8.c(r0)
            goto L8a
        L33:
            boolean r3 = r8 instanceof com.revolut.core.ui_kit.delegates.widgets.TravelModeWidgetDelegate.b
            if (r3 == 0) goto L8a
            r3 = r8
            com.revolut.core.ui_kit.delegates.widgets.TravelModeWidgetDelegate$b r3 = (com.revolut.core.ui_kit.delegates.widgets.TravelModeWidgetDelegate.b) r3
            boolean r6 = r3 instanceof com.revolut.core.ui_kit.delegates.widgets.s4
            if (r6 == 0) goto L52
            com.revolut.core.ui_kit.delegates.widgets.s4 r8 = (com.revolut.core.ui_kit.delegates.widgets.s4) r8
            r7.u = r5
            com.revolut.core.ui_kit.delegates.widgets.v4 r8 = r8.f55508c
            java.lang.Object r8 = r8.d
            java.lang.Object r8 = r1.a(r8, r7)
            if (r8 != r2) goto L4d
            goto L4f
        L4d:
            kotlin.Unit r8 = kotlin.Unit.f186387a
        L4f:
            if (r8 != r2) goto L8a
            goto L69
        L52:
            boolean r5 = r3 instanceof com.revolut.core.ui_kit.delegates.widgets.t4
            if (r5 == 0) goto L6a
            com.revolut.core.ui_kit.delegates.widgets.t4 r8 = (com.revolut.core.ui_kit.delegates.widgets.t4) r8
            r7.u = r4
            com.revolut.core.ui_kit.delegates.widgets.x4 r8 = r8.f55516c
            jtd.q r8 = r8.f55554b
            java.lang.Object r8 = r1.a(r8, r7)
            if (r8 != r2) goto L65
            goto L67
        L65:
            kotlin.Unit r8 = kotlin.Unit.f186387a
        L67:
            if (r8 != r2) goto L8a
        L69:
            return r2
        L6a:
            boolean r1 = r3 instanceof com.revolut.core.ui_kit.delegates.widgets.u4
            if (r1 == 0) goto L84
            com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig$TravelModeRemoveWidget$Destination r1 = new com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig$TravelModeRemoveWidget$Destination
            com.revolut.core.ui_kit.delegates.widgets.u4 r8 = (com.revolut.core.ui_kit.delegates.widgets.u4) r8
            java.lang.String r8 = r8.f55522b
            com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext$Personal r2 = r7.f214157x
            r1.<init>(r2, r8)
            uc7.a r8 = r0.f214159b
            fc7.d r0 = new fc7.d
            r0.<init>(r1)
            r8.b(r0)
            goto L8a
        L84:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L8a:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: nc7.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
