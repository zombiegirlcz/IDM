package ulf;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class o extends gim.c {
    public int A;
    public AccountWrapper u;
    public dj0.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Iterator f280984w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f280985x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f280986y;
    public final /* synthetic */ q z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, gim.c cVar) {
        super(cVar);
        this.z = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f280986y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.a(null, null, this, null);
    }
}
