package k3c;

import k4l.m0;
import k7c.y0;
import kjk.f0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.channels.ProducerScope;
import ll7.e0;
import nfj.s2;
import pfk.g0;
import skm.h1;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f180672w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i, Continuation continuation) {
        super(i, continuation);
        this.u = 24;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                return new k((p) this.f180672w, (Continuation) obj4, 0).invokeSuspend(Unit.f186387a);
            case 1:
                return new k((y0) this.f180672w, (Continuation) obj4, 1).invokeSuspend(Unit.f186387a);
            case 2:
                return new k((kc5.b) this.f180672w, (Continuation) obj4, 2).invokeSuspend(Unit.f186387a);
            case 3:
                return new k((ProducerScope) this.f180672w, (Continuation) obj4, 3).invokeSuspend(Unit.f186387a);
            case 4:
                return new k((kjk.o) this.f180672w, (Continuation) obj4, 4).invokeSuspend(Unit.f186387a);
            case 5:
                return new k((f0) this.f180672w, (Continuation) obj4, 5).invokeSuspend(Unit.f186387a);
            case 6:
                return new k(this.v, (h1) this.f180672w, (Continuation) obj4).invokeSuspend(Unit.f186387a);
            case 7:
                return new k((kya.b) this.f180672w, (Continuation) obj4, 7).invokeSuspend(Unit.f186387a);
            case 8:
                return new k((l05.c) this.f180672w, (Continuation) obj4, 8).invokeSuspend(Unit.f186387a);
            case 9:
                return new k((l05.g) this.f180672w, (Continuation) obj4, 9).invokeSuspend(Unit.f186387a);
            case 10:
                return new k((l05.i) this.f180672w, (Continuation) obj4, 10).invokeSuspend(Unit.f186387a);
            case 11:
                return new k((laj.d) this.f180672w, (Continuation) obj4, 11).invokeSuspend(Unit.f186387a);
            case 12:
                return new k((e0) this.f180672w, (Continuation) obj4, 12).invokeSuspend(Unit.f186387a);
            case 13:
                return new k((mhc.b) this.f180672w, (Continuation) obj4, 13).invokeSuspend(Unit.f186387a);
            case 14:
                return new k((mw7.c) this.f180672w, (Continuation) obj4, 14).invokeSuspend(Unit.f186387a);
            case 15:
                int iIntValue = ((Number) obj3).intValue();
                k kVar = new k((Ref$BooleanRef) this.f180672w, (Continuation) obj4, 15);
                kVar.v = iIntValue;
                return kVar.invokeSuspend(Unit.f186387a);
            case 16:
                return new k((n8a.f0) this.f180672w, (Continuation) obj4, 16).invokeSuspend(Unit.f186387a);
            case 17:
                return new k((nf5.d) this.f180672w, (Continuation) obj4, 17).invokeSuspend(Unit.f186387a);
            case 18:
                return new k((nfj.g) this.f180672w, (Continuation) obj4, 18).invokeSuspend(Unit.f186387a);
            case 19:
                return new k((nfj.j) this.f180672w, (Continuation) obj4, 19).invokeSuspend(Unit.f186387a);
            case 20:
                return new k((s2) this.f180672w, (Continuation) obj4, 20).invokeSuspend(Unit.f186387a);
            case 21:
                return new k((ouj.d) this.f180672w, (Continuation) obj4, 21).invokeSuspend(Unit.f186387a);
            case 22:
                return new k((p15.b) this.f180672w, (Continuation) obj4, 22).invokeSuspend(Unit.f186387a);
            case 23:
                return new k((p24.r) this.f180672w, (Continuation) obj4, 23).invokeSuspend(Unit.f186387a);
            case 24:
                int iIntValue2 = ((Number) obj3).intValue();
                k kVar2 = new k(3, (Continuation) obj4);
                kVar2.f180672w = (m0) obj2;
                kVar2.v = iIntValue2;
                return kVar2.invokeSuspend(Unit.f186387a);
            case 25:
                return new k((pfk.e0) this.f180672w, (Continuation) obj4, 25).invokeSuspend(Unit.f186387a);
            case 26:
                return new k((g0) this.f180672w, (Continuation) obj4, 26).invokeSuspend(Unit.f186387a);
            case 27:
                return new k((phc.j) this.f180672w, (Continuation) obj4, 27).invokeSuspend(Unit.f186387a);
            case 28:
                return new k((prl.j) this.f180672w, (Continuation) obj4, 28).invokeSuspend(Unit.f186387a);
            default:
                return new k((pti.e) this.f180672w, (Continuation) obj4, 29).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x03f3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:495:? A[LOOP:5: B:186:0x03a5->B:495:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v108, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r2v109, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v110, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v20, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v7, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.ArrayList] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 2308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k3c.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(int i, h1 h1Var, Continuation continuation) {
        super(3, continuation);
        this.u = 6;
        this.v = i;
        this.f180672w = h1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f180672w = obj2;
    }
}
