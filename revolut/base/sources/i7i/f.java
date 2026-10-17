package i7i;

import c7i.p;
import com.revolut.feature_move_money.api.model.AccountWrapper;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends gim.c {
    public AccountWrapper u;
    public AccountWrapper v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public p f159319w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f159320x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ g f159321y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, gim.c cVar) {
        super(cVar);
        this.f159321y = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f159320x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f159321y.e(null, this);
    }
}
