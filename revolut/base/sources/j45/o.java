package j45;

import com.revolut.feature.credit.loan.autopay.api.account_selector.AccountSelectorV2$InputData;
import ieg.z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class o implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountSelectorV2$InputData f171309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o2j.l f171310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c45.b f171311c;

    public o(AccountSelectorV2$InputData inputData, o2j.l itemsMapper, c45.b accountMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        Intrinsics.checkNotNullParameter(accountMapper, "accountMapper");
        this.f171309a = inputData;
        this.f171310b = itemsMapper;
        this.f171311c = accountMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (g) iii.c.f(domainState.f171295a, new j3f.d(this, 3), new j0g.b(this, 19), new z(this, domainState, 18));
    }
}
