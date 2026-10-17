package snf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements u {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f264575a;

    public d(String pocketId) {
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        this.f264575a = pocketId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f264575a, ((d) obj2).f264575a);
    }

    public final int hashCode() {
        return this.f264575a.hashCode();
    }
}
