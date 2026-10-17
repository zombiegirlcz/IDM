package r93;

import com.revolut.core.model.account.AccountId;
import com.revolut.retail.core.navigation.NaviCommand;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends gim.c {
    public NaviCommand u;
    public AccountId v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f252504w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k f252505x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f252506y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, gim.c cVar) {
        super(cVar);
        this.f252505x = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f252504w = obj2;
        this.f252506y |= Integer.MIN_VALUE;
        return this.f252505x.Z2(null, null, null, null, null, null, this);
    }
}
