package hbb;

import bn2.p;
import e0m.d;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import qfe.c;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f150639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f150640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f150641c;
    public final e0m.b d;

    public b(CoroutineScope scope, rn0.b startupPreferencesInteractor, c enhancedProductDescriptorProvider, p backgroundsInteractor) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(startupPreferencesInteractor, "startupPreferencesInteractor");
        Intrinsics.checkNotNullParameter(enhancedProductDescriptorProvider, "enhancedProductDescriptorProvider");
        Intrinsics.checkNotNullParameter(backgroundsInteractor, "backgroundsInteractor");
        this.f150639a = scope;
        this.f150640b = enhancedProductDescriptorProvider;
        this.f150641c = backgroundsInteractor;
        this.d = new e0m.b(new h1k.a(this, startupPreferencesInteractor, 13));
    }

    @Override // e0m.d
    public final void init() {
        this.d.init();
    }
}
