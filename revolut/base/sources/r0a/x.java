package r0a;

import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;

/* JADX INFO: loaded from: classes5.dex */
public final class x extends gim.c {
    public ChatTransferRecipient u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y f250755w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f250756x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, gim.c cVar) {
        super(cVar);
        this.f250755w = yVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f250756x |= Integer.MIN_VALUE;
        return y.I2(this.f250755w, null, this);
    }
}
