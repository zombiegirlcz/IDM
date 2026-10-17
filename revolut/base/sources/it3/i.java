package it3;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class i {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f168335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f168336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f168337c;

    public i(h status, boolean z, Map secondaryEntryPointsVisibleOverrides) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(secondaryEntryPointsVisibleOverrides, "secondaryEntryPointsVisibleOverrides");
        this.f168335a = status;
        this.f168336b = z;
        this.f168337c = secondaryEntryPointsVisibleOverrides;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final Map a() {
        return this.f168337c;
    }

    public final boolean b() {
        return this.f168335a == h.ELIGIBLE;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f168335a == iVar.f168335a && this.f168336b == iVar.f168336b && this.f168337c.equals(iVar.f168337c);
    }

    public final int hashCode() {
        return this.f168337c.hashCode() + j6.a.c(this.f168335a.hashCode() * 31, 31, this.f168336b);
    }
}
