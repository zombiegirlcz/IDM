package y8h;

import cfl.v;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xge.h;
import ybl.i;
import yhm.j;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();
    public static final Set d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f311657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f311658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f311659c;

    static {
        v[] elements = {v.AVAILABLE, v.ONBOARDING, v.ACTIVE, v.REMEDIATION_REQUIRED, v.OFFBOARDING};
        Intrinsics.checkNotNullParameter(elements, "elements");
        d = d.y0(elements);
    }

    public b(Map productsProviders, i accountProductGroupAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(productsProviders, "productsProviders");
        Intrinsics.checkNotNullParameter(accountProductGroupAvailabilityInteractor, "accountProductGroupAvailabilityInteractor");
        this.f311657a = productsProviders;
        this.f311658b = accountProductGroupAvailabilityInteractor;
        this.f311659c = j.b(new h(this, 28));
    }
}
