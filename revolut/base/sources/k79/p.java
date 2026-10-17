package k79;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import skm.a2;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends gim.i implements Function2 {
    public Object A;
    public Object B;
    public Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ int u = 0;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f181933w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f181934x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f181935y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(a2 a2Var, ProducerScope producerScope, s69.j jVar, r rVar, Continuation continuation) {
        super(2, continuation);
        this.B = a2Var;
        this.C = producerScope;
        this.D = jVar;
        this.E = rVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                p pVar = new p((a2) this.B, (ProducerScope) this.C, (s69.j) this.D, (r) this.E, continuation);
                pVar.A = obj2;
                return pVar;
            default:
                return new p((uc5.g) this.D, (String) this.E, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((p) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((p) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab A[Catch: all -> 0x00be, TryCatch #1 {all -> 0x00be, blocks: (B:28:0x00a3, B:30:0x00ab, B:25:0x008c, B:33:0x00c2), top: B:100:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c2 A[Catch: all -> 0x00be, TRY_LEAVE, TryCatch #1 {all -> 0x00be, blocks: (B:28:0x00a3, B:30:0x00ab, B:25:0x008c, B:33:0x00c2), top: B:100:0x00a3 }] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v3, types: [ukm.i0] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00a0 -> B:100:0x00a3). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k79.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(uc5.g gVar, String str, Continuation continuation) {
        super(2, continuation);
        this.D = gVar;
        this.E = str;
    }
}
