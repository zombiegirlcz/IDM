package qf3;

import i4b.f;
import kotlin.jvm.internal.Intrinsics;
import zjh.j;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f245234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f245235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f245236c;

    public b(f legalEntityContextProvider, j legalEntityDisclaimerMapper, f legalEntityExtensionsFactory) {
        Intrinsics.checkNotNullParameter(legalEntityContextProvider, "legalEntityContextProvider");
        Intrinsics.checkNotNullParameter(legalEntityDisclaimerMapper, "legalEntityDisclaimerMapper");
        Intrinsics.checkNotNullParameter(legalEntityExtensionsFactory, "legalEntityExtensionsFactory");
        this.f245234a = legalEntityContextProvider;
        this.f245235b = legalEntityDisclaimerMapper;
        this.f245236c = legalEntityExtensionsFactory;
    }
}
