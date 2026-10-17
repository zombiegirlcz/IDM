package h6i;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final class v0 extends gim.c {
    public Object A;
    public r7i.u B;
    public int C;
    public int D;
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ b9k.f G;
    public int H;
    public AccountWrapper u;
    public x5i.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public k1j.a f149729w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Collection f149730x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Iterator f149731y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(b9k.f fVar, gim.c cVar) {
        super(cVar);
        this.G = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.F = obj2;
        this.H |= Integer.MIN_VALUE;
        return this.G.n(null, null, null, null, this);
    }
}
