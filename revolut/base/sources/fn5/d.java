package fn5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements yfe.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ii5.a f136532a;

    public d(ii5.a cryptoPermissionExtensionFactory) {
        Intrinsics.checkNotNullParameter(cryptoPermissionExtensionFactory, "cryptoPermissionExtensionFactory");
        this.f136532a = cryptoPermissionExtensionFactory;
    }

    @Override // yfe.d
    public final yfe.c a() {
        return new c(this.f136532a.a());
    }
}
