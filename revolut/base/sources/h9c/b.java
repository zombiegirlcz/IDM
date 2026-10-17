package h9c;

import i4b.f;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import zjh.j;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f150224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f150225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f150226c;
    public final Lazy d;

    public b(f legalEntityContextProvider, j legalEntityDisclaimerMapper, dec.j paymentMethodToAccountMapper, f legalEntityExtensionsFactory) {
        Intrinsics.checkNotNullParameter(legalEntityContextProvider, "legalEntityContextProvider");
        Intrinsics.checkNotNullParameter(legalEntityDisclaimerMapper, "legalEntityDisclaimerMapper");
        Intrinsics.checkNotNullParameter(paymentMethodToAccountMapper, "paymentMethodToAccountMapper");
        Intrinsics.checkNotNullParameter(legalEntityExtensionsFactory, "legalEntityExtensionsFactory");
        this.f150224a = legalEntityContextProvider;
        this.f150225b = legalEntityDisclaimerMapper;
        this.f150226c = legalEntityExtensionsFactory;
        this.d = yhm.j.b(new h1g.a(this, 8));
    }
}
