package ehe;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.tab.accounts.api.remove_account.RemoveAccountContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements zhe.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RemoveAccountContract$InputData f126041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f126042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f126043c;

    public h(c cVar, a aVar, RemoveAccountContract$InputData removeAccountContract$InputData) {
        this.f126042b = cVar;
        this.f126041a = removeAccountContract$InputData;
        this.f126043c = e4m.b.b(new d2h.b(cVar, 3, aVar, this));
    }

    @Override // zhe.c
    public final yhe.e a() {
        return (yhe.e) this.f126043c.get();
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
