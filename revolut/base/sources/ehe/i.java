package ehe;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.tab.accounts.api.remove_account.RemoveAccountContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements zhe.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RemoveAccountContract$InputData f126044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f126045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f126046c;

    public i(c cVar, b bVar, RemoveAccountContract$InputData removeAccountContract$InputData) {
        this.f126045b = cVar;
        this.f126044a = removeAccountContract$InputData;
        this.f126046c = e4m.b.b(new d2h.b(cVar, 4, bVar, this));
    }

    @Override // zhe.c
    public final yhe.e a() {
        return (yhe.e) this.f126046c.get();
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
