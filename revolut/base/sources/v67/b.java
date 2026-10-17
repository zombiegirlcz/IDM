package v67;

import bla.c;
import jla.h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f286330a;

    public b(h productCatalogueInteractor) {
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        this.f286330a = productCatalogueInteractor;
    }

    public final boolean a() {
        return this.f286330a.d("TRANSFER.giro", null) == c.ENABLED;
    }
}
