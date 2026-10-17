package bwb;

import com.revolut.feature.rev_points.giftcards.api.model.UserVoucherDetails;

/* JADX INFO: loaded from: classes6.dex */
public final class o extends gim.c {
    public UserVoucherDetails u;
    public hlm.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f19299w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p f19300x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f19301y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, gim.c cVar) {
        super(cVar);
        this.f19300x = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f19299w = obj2;
        this.f19301y |= Integer.MIN_VALUE;
        return p.a(this.f19300x, null, this);
    }
}
