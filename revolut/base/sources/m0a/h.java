package m0a;

import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.c {
    public ChatTransferRecipient u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f201116w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f201117x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, gim.c cVar) {
        super(cVar);
        this.f201116w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f201117x |= Integer.MIN_VALUE;
        return k.Z2(this.f201116w, null, this);
    }
}
