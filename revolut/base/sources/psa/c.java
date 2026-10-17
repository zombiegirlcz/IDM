package psa;

import com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData;
import xpa.f;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.c {
    public f u;
    public PushToCardTransferData v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f239457w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f239458x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f239459y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, gim.c cVar) {
        super(cVar);
        this.f239458x = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f239457w = obj2;
        this.f239459y |= Integer.MIN_VALUE;
        return this.f239458x.Z2(null, this);
    }
}
