package knd;

import com.revolut.domain.models.transfers.PeerToPeerTransferDescriptor;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class e1 extends gim.i implements Function2 {
    public Object A;
    public Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int u = 1;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f186064w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f186065x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f186066y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(PeerToPeerTransferDescriptor peerToPeerTransferDescriptor, boolean z, q9k.b bVar, dj0.d dVar, o9k.y yVar, boolean z3, Continuation continuation) {
        super(2, continuation);
        this.A = peerToPeerTransferDescriptor;
        this.f186065x = z;
        this.B = bVar;
        this.C = dVar;
        this.D = yVar;
        this.f186066y = z3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e1 e1Var = new e1((h1) this.C, (ukm.j0) this.D, continuation);
                e1Var.f186064w = obj2;
                return e1Var;
            default:
                e1 e1Var2 = new e1((PeerToPeerTransferDescriptor) this.A, this.f186065x, (q9k.b) this.B, (dj0.d) this.C, (o9k.y) this.D, this.f186066y, continuation);
                e1Var2.f186064w = obj2;
                return e1Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e1) create((ukm.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0222  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x01d3 -> B:79:0x01d5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x01f0 -> B:95:0x0220). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x0213 -> B:94:0x0218). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: knd.e1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(h1 h1Var, ukm.j0 j0Var, Continuation continuation) {
        super(2, continuation);
        this.C = h1Var;
        this.D = j0Var;
    }
}
