package ei3;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.checkout.models.CheckoutOrder;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.g0;
import skm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object A;
    public final /* synthetic */ m B;
    public final /* synthetic */ CheckoutOrder C;
    public final /* synthetic */ AccountId D;
    public final /* synthetic */ xi0.b E;
    public final /* synthetic */ io3.l F;
    public final /* synthetic */ AccountId.Personal G;
    public h0 u;
    public g0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public m f126373w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public fo3.c f126374x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public io3.d f126375y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m mVar, CheckoutOrder checkoutOrder, AccountId accountId, xi0.b bVar, io3.l lVar, AccountId.Personal personal, Continuation continuation) {
        super(2, continuation);
        this.B = mVar;
        this.C = checkoutOrder;
        this.D = accountId;
        this.E = bVar;
        this.F = lVar;
        this.G = personal;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.B, this.C, this.D, this.E, this.F, this.G, continuation);
        iVar.A = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0108  */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ei3.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
