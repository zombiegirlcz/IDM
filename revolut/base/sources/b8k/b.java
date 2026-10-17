package b8k;

import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends gim.c {
    public final /* synthetic */ d A;
    public int B;
    public TransferMoneyPocket u;
    public dj0.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f13273w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public xi0.b f13274x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public List f13275y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, gim.c cVar) {
        super(cVar);
        this.A = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.b(this);
    }
}
