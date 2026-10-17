package ymh;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.i f315003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f315004b;

    public i(Map productsProviders, ybl.i productGroupAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(productGroupAvailabilityInteractor, "productGroupAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(productsProviders, "productsProviders");
        this.f315003a = productGroupAvailabilityInteractor;
        this.f315004b = productsProviders;
    }
}
