package yve;

import com.revolut.core.model.account.AccountId;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.c {
    public xi0.b u;
    public List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AccountId f317170w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f317171x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e f317172y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.f317172y = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f317171x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f317172y.c(null, null, null, null, this);
    }
}
