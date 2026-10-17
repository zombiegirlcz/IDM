package lo0;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit_core.actionshandler.CustomTrackableComponent;
import com.revolut.tracking.v3.WidgetDescription;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import uo.p;

/* JADX INFO: loaded from: classes19.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ String A;
    public final /* synthetic */ String B;
    public final /* synthetic */ AnalyticsProduct C;
    public final /* synthetic */ WidgetDescription D;
    public final /* synthetic */ String E;
    public int u;
    public final /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f197341w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ CustomTrackableComponent f197342x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ k f197343y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Object obj2, p pVar, CustomTrackableComponent customTrackableComponent, k kVar, String str, String str2, String str3, AnalyticsProduct analyticsProduct, WidgetDescription widgetDescription, String str4, Continuation continuation) {
        super(2, continuation);
        this.v = obj2;
        this.f197341w = pVar;
        this.f197342x = customTrackableComponent;
        this.f197343y = kVar;
        this.z = str;
        this.A = str2;
        this.B = str3;
        this.C = analyticsProduct;
        this.D = widgetDescription;
        this.E = str4;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j(this.v, this.f197341w, this.f197342x, this.f197343y, this.z, this.A, this.B, this.C, this.D, this.E, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.u
            r3 = 1
            lo0.k r4 = r0.f197343y
            r14 = 0
            if (r2 == 0) goto L1c
            if (r2 != r3) goto L14
            yhm.o.b(r17)
            r2 = r17
            goto L34
        L14:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L1c:
            yhm.o.b(r17)
            java.lang.Object r2 = r0.v
            if (r2 == 0) goto L38
            mo.c r5 = r4.d
            java.lang.Class r2 = r2.getClass()
            r0.u = r3
            java.lang.String r3 = r0.E
            java.lang.Object r2 = r5.a(r2, r3, r0)
            if (r2 != r1) goto L34
            return r1
        L34:
            mo.e r2 = (mo.e) r2
            r15 = r2
            goto L39
        L38:
            r15 = r14
        L39:
            uo.p r1 = r0.f197341w
            if (r1 == 0) goto L46
            int r2 = r1.f281499b
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r2)
            r9 = r3
            goto L47
        L46:
            r9 = r14
        L47:
            if (r1 == 0) goto L52
            int r1 = r1.f281500c
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r1)
            r10 = r2
            goto L53
        L52:
            r10 = r14
        L53:
            com.revolut.analytics.tracking.v3.AnalyticsContext$b r1 = com.revolut.analytics.tracking.v3.AnalyticsContext.INSTANCE
            com.revolut.core.ui_kit_core.actionshandler.CustomTrackableComponent r2 = r0.f197342x
            android.os.Parcelable r2 = r2.f59774a
            r1.getClass()
            com.google.protobuf.w0 r1 = com.revolut.analytics.tracking.v3.AnalyticsContext.Companion.a(r2)
            ho.a r5 = new ho.a
            com.revolut.analytics.tracking.v3.AnalyticsContext r12 = new com.revolut.analytics.tracking.v3.AnalyticsContext
            r12.<init>(r1)
            com.revolut.tracking.v3.WidgetDescription r13 = r0.D
            java.lang.String r6 = r0.z
            java.lang.String r7 = r0.A
            java.lang.String r8 = r0.B
            com.revolut.analytics.tracking.v3.AnalyticsProduct r11 = r0.C
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            ho.t r1 = r4.f197349j
            r1.e2(r5)
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: lo0.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
