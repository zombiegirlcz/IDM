package p4k;

import com.revolut.feature.transfer.models.transfer.RecipientTrustState;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.c {
    public f5j.a u;
    public RecipientTrustState v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f232959w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f232960x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f232961y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, gim.c cVar) {
        super(cVar);
        this.f232960x = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f232959w = obj2;
        this.f232961y |= Integer.MIN_VALUE;
        return this.f232960x.e(null, this);
    }
}
