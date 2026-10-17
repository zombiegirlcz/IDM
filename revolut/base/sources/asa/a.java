package asa;

import com.revolut.feature.push_to_card.api.data.CardOwner;
import com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends gim.c {
    public CardOwner u;
    public PushToCardTransferData v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f8884w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f8885x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f8886y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, gim.c cVar) {
        super(cVar);
        this.f8885x = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f8884w = obj2;
        this.f8886y |= Integer.MIN_VALUE;
        return this.f8885x.Z2(null, null, this);
    }
}
