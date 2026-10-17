package oda;

import com.google.common.collect.ImmutableSet;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.pockets.api.navigation.PocketDetailsFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PocketDetailsFlowContract$InputData f224384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountId f224385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f224386c;
    public final l d = this;
    public final e4m.e e;
    public final e4m.e f;

    public l(o oVar, PocketDetailsFlowContract$InputData pocketDetailsFlowContract$InputData, AccountId accountId) {
        this.f224386c = oVar;
        this.f224384a = pocketDetailsFlowContract$InputData;
        this.f224385b = accountId;
        int i = 20;
        this.e = e4m.b.b(new o41.b(oVar, this, 0, i));
        this.f = e4m.b.b(new o41.b(oVar, this, 1, i));
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
