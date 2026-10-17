package lsa;

import com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends gim.c {
    public PushToCardTransferData u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f199654w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f199655x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, gim.c cVar) {
        super(cVar);
        this.f199654w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f199655x |= Integer.MIN_VALUE;
        return this.f199654w.d(this);
    }
}
