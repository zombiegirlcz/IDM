package g25;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f139886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f139887c;

    public /* synthetic */ c(FlowCollector flowCollector, i iVar, int i) {
        this.f139885a = i;
        this.f139886b = flowCollector;
        this.f139887c = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            int r0 = r5.f139885a
            switch(r0) {
                case 0: goto L57;
                default: goto L5;
            }
        L5:
            boolean r0 = r7 instanceof g25.d
            if (r0 == 0) goto L18
            r0 = r7
            g25.d r0 = (g25.d) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.v = r1
            goto L1d
        L18:
            g25.d r0 = new g25.d
            r0.<init>(r5, r7)
        L1d:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r7)
            goto L54
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            yhm.o.b(r7)
            com.revolut.data.model.Data r6 = (com.revolut.data.model.Data) r6
            g17.i r7 = new g17.i
            g25.i r2 = r5.f139887c
            r4 = 2
            r7.<init>(r2, r4)
            g25.g r2 = g25.g.f139891a
            g25.h r4 = g25.h.f139892a
            java.lang.Object r6 = iii.c.f(r6, r2, r4, r7)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r7 = r5.f139886b
            java.lang.Object r6 = r7.emit(r6, r0)
            if (r6 != r1) goto L54
            goto L56
        L54:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L56:
            return r1
        L57:
            boolean r0 = r7 instanceof g25.b
            if (r0 == 0) goto L6a
            r0 = r7
            g25.b r0 = (g25.b) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L6a
            int r1 = r1 - r2
            r0.v = r1
            goto L6f
        L6a:
            g25.b r0 = new g25.b
            r0.<init>(r5, r7)
        L6f:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L86
            if (r2 != r3) goto L7e
            yhm.o.b(r7)
            goto La6
        L7e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L86:
            yhm.o.b(r7)
            com.revolut.data.model.Data r6 = (com.revolut.data.model.Data) r6
            g17.i r7 = new g17.i
            g25.i r2 = r5.f139887c
            r4 = 1
            r7.<init>(r2, r4)
            g25.e r2 = g25.e.f139889a
            g25.f r4 = g25.f.f139890a
            java.lang.Object r6 = iii.c.f(r6, r2, r4, r7)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r7 = r5.f139886b
            java.lang.Object r6 = r7.emit(r6, r0)
            if (r6 != r1) goto La6
            goto La8
        La6:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        La8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g25.c.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
