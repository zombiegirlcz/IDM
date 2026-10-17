package x4k;

import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import r4k.j;
import skm.g0;
import skm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends i implements Function2 {
    public j A;
    public boolean B;
    public int C;
    public /* synthetic */ Object D;
    public final /* synthetic */ b9k.f E;
    public final /* synthetic */ BankTransferData F;
    public final /* synthetic */ boolean G;
    public f5j.a u;
    public g0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public g0 f302891w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public g0 f302892x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public kq2.a f302893y;
    public h0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(b9k.f fVar, BankTransferData bankTransferData, boolean z, Continuation continuation) {
        super(2, continuation);
        this.E = fVar;
        this.F = bankTransferData;
        this.G = z;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.E, this.F, this.G, continuation);
        gVar.D = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0125  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x4k.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
