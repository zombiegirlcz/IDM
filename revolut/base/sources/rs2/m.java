package rs2;

import com.revolut.business.feature.referrals.model.RewardTargetAccount;
import com.revolut.data.model.Data;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes21.dex */
public final class m extends gim.c {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ n G;
    public int H;
    public Data u;
    public Collection v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Iterator f256950w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Collection f256951x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public RewardTargetAccount f256952y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, gim.c cVar) {
        super(cVar);
        this.G = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.F = obj2;
        this.H |= Integer.MIN_VALUE;
        return n.a(this.G, null, false, this);
    }
}
