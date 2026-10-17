package q4k;

import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends i implements Function2 {
    public final /* synthetic */ f5j.a A;
    public final /* synthetic */ BankTransferData B;
    public h0 u;
    public hrf.h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f242187w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f242188x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ h f242189y;
    public final /* synthetic */ a2k.b z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, a2k.b bVar, f5j.a aVar, BankTransferData bankTransferData, Continuation continuation) {
        super(2, continuation);
        this.f242189y = hVar;
        this.z = bVar;
        this.A = aVar;
        this.B = bankTransferData;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.f242189y, this.z, this.A, this.B, continuation);
        fVar.f242188x = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0098, code lost:
    
        if (r1 == r2) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q4k.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
