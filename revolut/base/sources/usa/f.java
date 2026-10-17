package usa;

import com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends gim.c {
    public int A;
    public PushToCardTransferData u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public c f282849w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f282850x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f282851y;
    public final /* synthetic */ g z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, gim.c cVar) {
        super(cVar);
        this.z = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f282851y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.b3(null, null, false, this);
    }
}
