package no;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes17.dex */
public final class w0 extends gim.i implements Function2 {
    public int A;
    public boolean B;
    public int C;
    public final /* synthetic */ Function0 D;
    public final /* synthetic */ com.revolut.analytics.tracking.v3.f E;
    public final /* synthetic */ AnalyticsProduct F;
    public final /* synthetic */ String G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ Function1 I;
    public com.revolut.analytics.tracking.v3.f u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public com.google.protobuf.w0 f217857w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public AnalyticsProduct f217858x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public com.revolut.analytics.tracking.v3.f f217859y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(Function0 function0, com.revolut.analytics.tracking.v3.f fVar, AnalyticsProduct analyticsProduct, String str, boolean z, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.D = function0;
        this.E = fVar;
        this.F = analyticsProduct;
        this.G = str;
        this.H = z;
        this.I = function1;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new w0(this.D, this.E, this.F, this.G, this.H, this.I, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((w0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a5, code lost:
    
        if (r13 == r0) goto L26;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r12.C
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1a
            com.revolut.analytics.tracking.v3.f r0 = r12.u
            com.google.protobuf.w0 r0 = (com.google.protobuf.w0) r0
            yhm.o.b(r13)     // Catch: java.lang.Exception -> L16
            goto La8
        L16:
            r0 = move-exception
            r13 = r0
            goto Lab
        L1a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L22:
            boolean r1 = r12.B
            int r3 = r12.A
            int r5 = r12.z
            com.revolut.analytics.tracking.v3.f r6 = r12.f217859y
            com.revolut.analytics.tracking.v3.AnalyticsProduct r7 = r12.f217858x
            com.revolut.analytics.tracking.v3.AnalyticsProduct r7 = (com.revolut.analytics.tracking.v3.AnalyticsProduct) r7
            com.google.protobuf.w0 r8 = r12.f217857w
            java.lang.String r9 = r12.v
            com.revolut.analytics.tracking.v3.f r10 = r12.u
            yhm.o.b(r13)     // Catch: java.lang.Exception -> L16
            r11 = r10
            r10 = r1
            r1 = r5
            goto L74
        L3b:
            yhm.o.b(r13)
            kotlin.jvm.functions.Function0 r13 = r12.D
            com.revolut.analytics.tracking.v3.f r6 = r12.E
            com.revolut.analytics.tracking.v3.AnalyticsProduct r7 = r12.F
            java.lang.String r9 = r12.G
            boolean r1 = r12.H
            kotlin.jvm.functions.Function1 r5 = r12.I
            java.lang.Object r13 = r13.invoke()     // Catch: java.lang.Exception -> L16
            com.revolut.analytics.tracking.v3.AnalyticsContext r13 = (com.revolut.analytics.tracking.v3.AnalyticsContext) r13     // Catch: java.lang.Exception -> L16
            com.google.protobuf.w0 r8 = r13.f50296a     // Catch: java.lang.Exception -> L16
            r12.u = r6     // Catch: java.lang.Exception -> L16
            r12.v = r9     // Catch: java.lang.Exception -> L16
            r12.f217857w = r8     // Catch: java.lang.Exception -> L16
            r13 = r7
            com.revolut.analytics.tracking.v3.AnalyticsProduct r13 = (com.revolut.analytics.tracking.v3.AnalyticsProduct) r13     // Catch: java.lang.Exception -> L16
            r12.f217858x = r13     // Catch: java.lang.Exception -> L16
            r12.f217859y = r6     // Catch: java.lang.Exception -> L16
            r13 = 0
            r12.z = r13     // Catch: java.lang.Exception -> L16
            r12.A = r13     // Catch: java.lang.Exception -> L16
            r12.B = r1     // Catch: java.lang.Exception -> L16
            r12.C = r3     // Catch: java.lang.Exception -> L16
            java.lang.Object r3 = r5.invoke(r12)     // Catch: java.lang.Exception -> L16
            if (r3 != r0) goto L6f
            goto La7
        L6f:
            r10 = r1
            r11 = r6
            r1 = r13
            r13 = r3
            r3 = r1
        L74:
            mo.e r13 = (mo.e) r13     // Catch: java.lang.Exception -> L16
            r6.getClass()     // Catch: java.lang.Exception -> L16
            ho.c r5 = new ho.c     // Catch: java.lang.Exception -> L16
            r6 = r9
            r9 = r13
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L16
            r12.u = r4     // Catch: java.lang.Exception -> L16
            r12.v = r4     // Catch: java.lang.Exception -> L16
            r12.f217857w = r4     // Catch: java.lang.Exception -> L16
            r12.f217858x = r4     // Catch: java.lang.Exception -> L16
            r12.f217859y = r4     // Catch: java.lang.Exception -> L16
            r12.z = r1     // Catch: java.lang.Exception -> L16
            r12.A = r3     // Catch: java.lang.Exception -> L16
            r12.C = r2     // Catch: java.lang.Exception -> L16
            r11.getClass()     // Catch: java.lang.Exception -> L16
            no.n0 r13 = new no.n0     // Catch: java.lang.Exception -> L16
            r13.<init>(r11, r5, r4)     // Catch: java.lang.Exception -> L16
            skm.p0 r1 = skm.p0.f264001a     // Catch: java.lang.Exception -> L16
            elm.f r1 = elm.f.f127540b     // Catch: java.lang.Exception -> L16
            java.lang.Object r13 = skm.e0.J(r1, r13, r12)     // Catch: java.lang.Exception -> L16
            if (r13 != r0) goto La3
            goto La5
        La3:
            kotlin.Unit r13 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L16
        La5:
            if (r13 != r0) goto La8
        La7:
            return r0
        La8:
            kotlin.Unit r13 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L16
            goto Lb4
        Lab:
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            rd0.d.a(r1, r4, r4, r13, r0)
        Lb4:
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: no.w0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
