package ulf;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ i B;
    public int C;
    public AccountWrapper u;
    public dj0.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Collection f280970w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Iterator f280971x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f280972y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, gim.c cVar) {
        super(cVar);
        this.B = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return this.B.a(null, null, this, null);
    }
}
