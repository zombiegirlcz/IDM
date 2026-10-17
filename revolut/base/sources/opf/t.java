package opf;

import com.revolut.feature.transfer.core.models.CurrencyFilteringPolicy;
import com.revolut.feature.transfer.core.models.SourceAccount;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class t extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ z B;
    public int C;
    public CurrencyFilteringPolicy u;
    public List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public SourceAccount f227635w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public z f227636x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public io3.d f227637y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(z zVar, gim.c cVar) {
        super(cVar);
        this.B = zVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return this.B.e(null, null, null, null, this);
    }
}
