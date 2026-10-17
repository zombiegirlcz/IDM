package bvb;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class o extends gim.i implements Function1 {
    public Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int u = 1;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f18998w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f18999x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f19000y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(cbk.o oVar, h1j.d dVar, Continuation continuation) {
        super(1, continuation);
        this.B = oVar;
        this.C = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new o((rub.j) this.B, (r) this.z, (rub.i) this.C, continuation);
            case 1:
                return new o((cbk.o) this.B, (h1j.d) this.C, continuation);
            default:
                return new o((vrb.l) this.A, (CoroutineScope) this.B, (vrb.a) this.C, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((o) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0237 A[Catch: all -> 0x01a6, TryCatch #0 {all -> 0x01a6, blocks: (B:73:0x019e, B:96:0x022d, B:98:0x0237, B:107:0x02a1, B:99:0x024e, B:101:0x0256, B:103:0x025a, B:105:0x025e, B:106:0x0280, B:80:0x01bd, B:92:0x020e, B:83:0x01c9, B:85:0x01d7, B:88:0x01e5), top: B:114:0x0190 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x024e A[Catch: all -> 0x01a6, TryCatch #0 {all -> 0x01a6, blocks: (B:73:0x019e, B:96:0x022d, B:98:0x0237, B:107:0x02a1, B:99:0x024e, B:101:0x0256, B:103:0x025a, B:105:0x025e, B:106:0x0280, B:80:0x01bd, B:92:0x020e, B:83:0x01c9, B:85:0x01d7, B:88:0x01e5), top: B:114:0x0190 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0179 -> B:64:0x017a). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bvb.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(rub.j jVar, r rVar, rub.i iVar, Continuation continuation) {
        super(1, continuation);
        this.B = jVar;
        this.z = rVar;
        this.C = iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(vrb.l lVar, CoroutineScope coroutineScope, vrb.a aVar, Continuation continuation) {
        super(1, continuation);
        this.A = lVar;
        this.B = coroutineScope;
        this.C = aVar;
    }
}
