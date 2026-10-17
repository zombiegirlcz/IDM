package nw9;

import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import do3.n;
import zm3.j;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.c {
    public j A;
    public y8k.b B;
    public int C;
    public /* synthetic */ Object D;
    public final /* synthetic */ d E;
    public int F;
    public jf0.c u;
    public n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f219802w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f219803x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public TransferMoneyPocket f219804y;
    public TransferFlowType.Default z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.E = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.D = obj2;
        this.F |= Integer.MIN_VALUE;
        return this.E.b(null, this);
    }
}
