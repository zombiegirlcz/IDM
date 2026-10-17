package n3c;

import k3c.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e3c.a f211978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f211979b;

    public a(e3c.a shopRepository, b accountRepository) {
        Intrinsics.checkNotNullParameter(shopRepository, "shopRepository");
        Intrinsics.checkNotNullParameter(accountRepository, "accountRepository");
        this.f211978a = shopRepository;
        this.f211979b = accountRepository;
    }
}
