package az0;

import com.revolut.RevolutApplication;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import no.i2;

/* JADX INFO: loaded from: classes.dex */
public final class r1 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f11345w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r1(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f11345w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r1((s1) this.f11345w, continuation, 0);
            case 1:
                return new r1((bfe.b) this.f11345w, continuation, 1);
            case 2:
                return new r1((eg.p0) this.f11345w, continuation, 2);
            case 3:
                return new r1((String) this.f11345w, continuation, 3);
            case 4:
                return new r1((em0.b) this.f11345w, continuation, 4);
            case 5:
                return new r1((gq.i) this.f11345w, continuation, 5);
            case 6:
                return new r1((kll.c) this.f11345w, continuation, 6);
            case 7:
                return new r1((RevolutApplication) this.f11345w, continuation, 7);
            case 8:
                return new r1((lte.c) this.f11345w, continuation, 8);
            case 9:
                return new r1((n30.p0) this.f11345w, continuation, 9);
            case 10:
                return new r1((com.revolut.analytics.tracking.v3.f) this.f11345w, continuation, 10);
            case 11:
                return new r1((i2) this.f11345w, continuation, 11);
            case 12:
                return new r1((nwl.l) this.f11345w, continuation, 12);
            case 13:
                return new r1((qoi.b) this.f11345w, continuation, 13);
            case 14:
                return new r1((uo.k) this.f11345w, continuation, 14);
            case 15:
                return new r1((gpk.c) this.f11345w, continuation, 15);
            case 16:
                return new r1((mk0.p) this.f11345w, continuation, 16);
            case 17:
                return new r1((Flow) this.f11345w, continuation, 17);
            case 18:
                return new r1((vl0.c) this.f11345w, continuation, 18);
            case 19:
                return new r1((skm.g0) this.f11345w, continuation, 19);
            default:
                return new r1((z10.e) this.f11345w, continuation, 20);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((r1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((r1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((r1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((r1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((r1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((r1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((r1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((r1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((r1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((r1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((r1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((r1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((r1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((r1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((r1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((r1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((r1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((r1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((r1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((r1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((r1) create((Throwable) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x025b A[Catch: all -> 0x0195, TryCatch #3 {all -> 0x0195, blocks: (B:82:0x013f, B:83:0x0152, B:85:0x0158, B:86:0x0171, B:88:0x0177, B:90:0x0188, B:93:0x0191, B:97:0x019b, B:98:0x01b7, B:100:0x01bd, B:102:0x01ce, B:105:0x01d7, B:107:0x01dc, B:108:0x01e8, B:110:0x01ee, B:113:0x0201, B:119:0x020f, B:122:0x0220, B:126:0x0233, B:132:0x0240, B:146:0x025b, B:148:0x0265, B:149:0x0276, B:151:0x027c, B:152:0x0282, B:154:0x028c, B:156:0x0294, B:164:0x02af, B:166:0x02bb, B:170:0x02c2, B:162:0x02a4, B:171:0x02e5, B:172:0x02f1), top: B:434:0x013f }] */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.lang.Object, java.util.Map] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2126
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.r1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
