package b8k;

import com.revolut.core.model.account.AccountId;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends gim.c {
    public AccountId u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Set f13270w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f13271x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d f13272y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, gim.c cVar) {
        super(cVar);
        this.f13272y = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f13271x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f13272y.a(null, null, null, null, this);
    }
}
