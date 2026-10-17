package pjl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f236833a;

    public o(String accountType) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        this.f236833a = accountType;
    }

    public final String[] a() {
        return new String[]{this.f236833a};
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f236833a, ((o) obj2).f236833a);
    }

    public final int hashCode() {
        return this.f236833a.hashCode();
    }
}
