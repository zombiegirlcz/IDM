package i7i;

import c7i.o;
import com.revolut.feature_move_money.api.model.AccountWrapper;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.c {
    public AccountWrapper u;
    public o v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f159314w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f159315x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f159316y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, gim.c cVar) {
        super(cVar);
        this.f159315x = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f159314w = obj2;
        this.f159316y |= Integer.MIN_VALUE;
        return this.f159315x.c(null, null, this);
    }
}
