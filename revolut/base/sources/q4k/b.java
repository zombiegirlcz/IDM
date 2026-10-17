package q4k;

import com.revolut.feature.transfer.core.models.SourceAccount;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import java.util.LinkedHashSet;
import opf.z;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends gim.c {
    public String[] A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ c D;
    public int E;
    public dj0.d u;
    public SourceAccount v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String[] f242176w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public z f242177x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public TransferMoneyPocket f242178y;
    public LinkedHashSet z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.D = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.C = obj2;
        this.E |= Integer.MIN_VALUE;
        return this.D.b(null, null, this);
    }
}
