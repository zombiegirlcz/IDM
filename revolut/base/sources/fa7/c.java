package fa7;

import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref$BooleanRef f133240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f133241c;

    public /* synthetic */ c(Ref$BooleanRef ref$BooleanRef, FlowCollector flowCollector, int i) {
        this.f133239a = i;
        this.f133240b = ref$BooleanRef;
        this.f133241c = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(int r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof vkm.f2
            if (r0 == 0) goto L13
            r0 = r6
            vkm.f2 r0 = (vkm.f2) r0
            int r1 = r0.f290022w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f290022w = r1
            goto L18
        L13:
            vkm.f2 r0 = new vkm.f2
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f290022w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L49
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            if (r5 <= 0) goto L4c
            kotlin.jvm.internal.Ref$BooleanRef r5 = r4.f133240b
            boolean r6 = r5.f186407a
            if (r6 != 0) goto L4c
            r5.f186407a = r3
            vkm.b2 r5 = vkm.b2.START
            r0.f290022w = r3
            kotlinx.coroutines.flow.FlowCollector r6 = r4.f133241c
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L4c:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: fa7.c.a(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            int r0 = r4.f133239a
            switch(r0) {
                case 0: goto L55;
                case 1: goto L10;
                default: goto L5;
            }
        L5:
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            java.lang.Object r5 = r4.a(r5, r6)
            return r5
        L10:
            boolean r0 = r6 instanceof vkm.w
            if (r0 == 0) goto L23
            r0 = r6
            vkm.w r0 = (vkm.w) r0
            int r1 = r0.f290133w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L23
            int r1 = r1 - r2
            r0.f290133w = r1
            goto L28
        L23:
            vkm.w r0 = new vkm.w
            r0.<init>(r4, r6)
        L28:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f290133w
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            yhm.o.b(r6)
            goto L52
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3f:
            yhm.o.b(r6)
            kotlin.jvm.internal.Ref$BooleanRef r6 = r4.f133240b
            r2 = 0
            r6.f186407a = r2
            r0.f290133w = r3
            kotlinx.coroutines.flow.FlowCollector r6 = r4.f133241c
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L52
            goto L54
        L52:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L54:
            return r1
        L55:
            com.revolut.data.model.Data r5 = (com.revolut.data.model.Data) r5
            kotlin.jvm.internal.Ref$BooleanRef r0 = r4.f133240b
            boolean r1 = r0.f186407a
            if (r1 != 0) goto L7f
            java.lang.Object r1 = r5.getContent()
            r2 = 0
            if (r1 == 0) goto L66
            r3 = 1
            goto L67
        L66:
            r3 = r2
        L67:
            r0.f186407a = r3
            if (r1 == 0) goto L71
            r5 = 3
            r0 = 0
            com.revolut.data.model.Data r5 = zi0.c.P(r1, r2, r0, r5)
        L71:
            kotlinx.coroutines.flow.FlowCollector r0 = r4.f133241c
            java.lang.Object r5 = r0.emit(r5, r6)
            fim.a r6 = fim.a.COROUTINE_SUSPENDED
            if (r5 != r6) goto L7c
            goto L81
        L7c:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            goto L81
        L7f:
            kotlin.Unit r5 = kotlin.Unit.f186387a
        L81:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: fa7.c.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
