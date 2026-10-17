package chj;

import com.revolut.sso.impl.domain.models.Challenge;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes11.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public long v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f24283w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f24284x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f24285y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(long j2, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = j2;
        this.f24284x = obj2;
        this.f24285y = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new p((q) this.f24284x, (String) this.f24285y, this.v, continuation, 0);
            case 1:
                p pVar = new p((com.revolut.feature.credit.application.plugins.impl.ui.amount_input.b) this.f24285y, continuation, 1);
                pVar.f24284x = obj2;
                return pVar;
            case 2:
                return new p((ha3.x) this.f24284x, (String) this.f24285y, this.v, continuation, 2);
            case 3:
                return new p((j50.o) this.f24284x, (UUID) this.f24285y, this.v, continuation, 3);
            case 4:
                return new p(this.v, (efm.r) this.f24284x, (ukm.q) this.f24285y, continuation, 4);
            case 5:
                return new p((nx1.h) this.f24284x, (n02.b) this.f24285y, this.f24283w, this.v, continuation);
            case 6:
                return new p(this.v, (com.revolut.sso.impl.ui.auth.n) this.f24284x, (Challenge) this.f24285y, continuation, 6);
            case 7:
                p pVar2 = new p(this.v, continuation, (Flow) this.f24285y);
                pVar2.f24284x = obj2;
                return pVar2;
            case 8:
                p pVar3 = new p((qqj.h) this.f24285y, continuation, 8);
                pVar3.f24284x = obj2;
                return pVar3;
            case 9:
                p pVar4 = new p(this.v, (qwf.z) this.f24285y, continuation);
                pVar4.f24284x = obj2;
                return pVar4;
            case 10:
                return new p(this.v, (u3c.o) this.f24284x, (d3c.c0) this.f24285y, continuation, 10);
            case 11:
                return new p((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b) this.f24284x, (String) this.f24285y, this.v, continuation, 11);
            default:
                return new p(this.v, (ProducerScope) this.f24284x, this.f24285y, continuation, 12);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((p) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04e9 A[Catch: all -> 0x0480, TryCatch #0 {all -> 0x0480, blocks: (B:218:0x047a, B:240:0x04e3, B:242:0x04e9, B:244:0x04ed, B:245:0x0504, B:246:0x0509, B:247:0x050a, B:229:0x04b6, B:233:0x04c2, B:235:0x04ca, B:237:0x04d0), top: B:286:0x0474 }] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0570 A[Catch: Exception -> 0x0542, TryCatch #2 {Exception -> 0x0542, blocks: (B:268:0x0547, B:271:0x056a, B:273:0x0570, B:274:0x0573, B:276:0x0577, B:263:0x053c), top: B:289:0x053c }] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0573 A[Catch: Exception -> 0x0542, TryCatch #2 {Exception -> 0x0542, blocks: (B:268:0x0547, B:271:0x056a, B:273:0x0570, B:274:0x0573, B:276:0x0577, B:263:0x053c), top: B:289:0x053c }] */
    /* JADX WARN: Removed duplicated region for block: B:301:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:308:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:309:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:316:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:283:0x059b -> B:268:0x0547). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: chj.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(long j2, Continuation continuation, Flow flow) {
        super(2, continuation);
        this.u = 7;
        this.f24285y = flow;
        this.v = j2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(long j2, qwf.z zVar, Continuation continuation) {
        super(2, continuation);
        this.u = 9;
        this.v = j2;
        this.f24285y = zVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj2, Object obj3, long j2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f24284x = obj2;
        this.f24285y = obj3;
        this.v = j2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f24285y = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(nx1.h hVar, n02.b bVar, int i, long j2, Continuation continuation) {
        super(2, continuation);
        this.u = 5;
        this.f24284x = hVar;
        this.f24285y = bVar;
        this.f24283w = i;
        this.v = j2;
    }
}
