package pa3;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.retail.core.navigation.NaviCommand;
import pi3.h;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends gim.c {
    public final /* synthetic */ c A;
    public int B;
    public xfa.b u;
    public AccountId v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public NaviCommand f234328w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public h f234329x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public AnalyticsProduct f234330y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, gim.c cVar2) {
        super(cVar2);
        this.A = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.b(null, null, null, null, null, this);
    }
}
