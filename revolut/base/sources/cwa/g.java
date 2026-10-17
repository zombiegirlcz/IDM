package cwa;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f109588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f109589b;

    public g(FlowCollector flowCollector, j jVar) {
        this.f109588a = flowCollector;
        this.f109589b = jVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007f, code lost:
    
        if (r2.emit(r4, r0) != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008f, code lost:
    
        if (r2.emit(com.revolut.feature.referrals.code.data.api.ReferrerDetailsState.Disabled.f81679a, r0) == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(boolean r8, kotlin.coroutines.Continuation r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof cwa.f
            if (r0 == 0) goto L13
            r0 = r9
            cwa.f r0 = (cwa.f) r0
            int r1 = r0.f109587y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f109587y = r1
            goto L18
        L13:
            cwa.f r0 = new cwa.f
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f109585w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f109587y
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L42
            if (r2 == r6) goto L3a
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            yhm.o.b(r9)
            goto L92
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            yhm.o.b(r9)
            goto L82
        L3a:
            boolean r8 = r0.u
            kotlinx.coroutines.flow.FlowCollector r2 = r0.v
            yhm.o.b(r9)
            goto L68
        L42:
            yhm.o.b(r9)
            kotlinx.coroutines.flow.FlowCollector r2 = r7.f109588a
            if (r8 == 0) goto L85
            r0.v = r2
            r0.u = r8
            r0.f109587y = r6
            cwa.j r9 = r7.f109589b
            ewa.a r9 = r9.f109596a
            ewa.e r9 = (ewa.e) r9
            r9.getClass()
            ewa.c r4 = new ewa.c
            r4.<init>(r9, r3, r5)
            skm.p0 r9 = skm.p0.f264001a
            elm.f r9 = elm.f.f127540b
            java.lang.Object r9 = skm.e0.J(r9, r4, r0)
            if (r9 != r1) goto L68
            goto L91
        L68:
            com.revolut.feature.referrals.code.data.api.ReferrerDetails r9 = (com.revolut.feature.referrals.code.data.api.ReferrerDetails) r9
            if (r9 == 0) goto L6f
            java.lang.String r9 = r9.f81678b
            goto L70
        L6f:
            r9 = r3
        L70:
            com.revolut.feature.referrals.code.data.api.ReferrerDetailsState$DisabledWithAutoBinding r4 = new com.revolut.feature.referrals.code.data.api.ReferrerDetailsState$DisabledWithAutoBinding
            r4.<init>(r9)
            r0.v = r3
            r0.u = r8
            r0.f109587y = r5
            java.lang.Object r8 = r2.emit(r4, r0)
            if (r8 != r1) goto L82
            goto L91
        L82:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L85:
            r0.u = r8
            r0.f109587y = r4
            com.revolut.feature.referrals.code.data.api.ReferrerDetailsState$Disabled r8 = com.revolut.feature.referrals.code.data.api.ReferrerDetailsState.Disabled.f81679a
            java.lang.Object r8 = r2.emit(r8, r0)
            if (r8 != r1) goto L92
        L91:
            return r1
        L92:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: cwa.g.a(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
        return a(((Boolean) obj2).booleanValue(), continuation);
    }
}
