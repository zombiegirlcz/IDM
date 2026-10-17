package eq5;

import com.revolut.feature.crypto.withdraw.api.models.FiatCryptoMoney;

/* JADX INFO: loaded from: classes3.dex */
public final class w0 extends gim.c {
    public xi0.b u;
    public FiatCryptoMoney v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public xi0.b f128341w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f128342x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ x0 f128343y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(x0 x0Var, gim.c cVar) {
        super(cVar);
        this.f128343y = x0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f128342x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f128343y.s(null, null, null, null, this);
    }
}
