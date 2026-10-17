package pz5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements oz5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f240897a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f240898b;

    public d(bk0.e headersProvider) {
        Intrinsics.checkNotNullParameter(headersProvider, "headersProvider");
        this.f240898b = headersProvider;
    }

    @Override // oz5.a
    public final String name() {
        switch (this.f240897a) {
            case 0:
                return "Revolut-Client-Name";
            default:
                ((bk0.e) this.f240898b).f();
                return "User-Agent";
        }
    }

    @Override // oz5.a
    public final String value() {
        switch (this.f240897a) {
            case 0:
                return ((x80.a) this.f240898b).a();
            default:
                return (String) ((bk0.e) this.f240898b).f().f186386b;
        }
    }

    public d(x80.a packageNameProvider) {
        Intrinsics.checkNotNullParameter(packageNameProvider, "packageNameProvider");
        this.f240898b = packageNameProvider;
    }
}
