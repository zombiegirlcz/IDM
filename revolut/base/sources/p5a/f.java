package p5a;

import com.revolut.feature.push_to_card.api.data.CardOwnerWithStats;
import com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends gim.c {
    public CardOwnerWithStats u;
    public dj0.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public PushToCardTransferData f233060w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f233061x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ l f233062y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l lVar, gim.c cVar) {
        super(cVar);
        this.f233062y = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f233061x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f233062y.b(null, null, this);
    }
}
