package iy8;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xx8.e f169624a;

    public b(xx8.e packageAvailabilityChecker) {
        Intrinsics.checkNotNullParameter(packageAvailabilityChecker, "packageAvailabilityChecker");
        this.f169624a = packageAvailabilityChecker;
    }

    public final boolean a() {
        xx8.e eVar = this.f169624a;
        return eVar.b("ae.uaepass.mainapp") || eVar.b("ae.uaepass.mainapp.stg");
    }
}
