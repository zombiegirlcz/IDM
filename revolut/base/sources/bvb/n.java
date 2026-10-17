package bvb;

import com.revolut.feature.shops.api.model.ShopsCampaignOffer;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class n extends gim.i implements Function1 {
    public Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int u = 1;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f18995w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f18996x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f18997y;
    public oki.h z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.revolut.feature.shops.impl.ui.details.a aVar, ShopsCampaignOffer shopsCampaignOffer, Continuation continuation) {
        super(1, continuation);
        this.A = aVar;
        this.B = shopsCampaignOffer;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n((rub.j) this.B, (r) this.z, continuation);
            default:
                return new n((com.revolut.feature.shops.impl.ui.details.a) this.A, (ShopsCampaignOffer) this.B, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((n) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f4 A[Catch: all -> 0x015b, TryCatch #0 {all -> 0x015b, blocks: (B:54:0x0154, B:74:0x01ea, B:76:0x01f4, B:85:0x025e, B:77:0x020b, B:79:0x0213, B:81:0x0217, B:83:0x021b, B:84:0x023d, B:61:0x0172, B:70:0x01ca, B:64:0x017f, B:66:0x018d), top: B:92:0x0146 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x020b A[Catch: all -> 0x015b, TryCatch #0 {all -> 0x015b, blocks: (B:54:0x0154, B:74:0x01ea, B:76:0x01f4, B:85:0x025e, B:77:0x020b, B:79:0x0213, B:81:0x0217, B:83:0x021b, B:84:0x023d, B:61:0x0172, B:70:0x01ca, B:64:0x017f, B:66:0x018d), top: B:92:0x0146 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bvb.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(rub.j jVar, r rVar, Continuation continuation) {
        super(1, continuation);
        this.B = jVar;
        this.z = rVar;
    }
}
