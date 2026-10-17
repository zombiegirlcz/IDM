package asa;

import com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.c {
    public PushToCardTransferData u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f8888w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f8889x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f8888w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f8889x |= Integer.MIN_VALUE;
        return this.f8888w.c3(null, null, this);
    }
}
