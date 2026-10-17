package cgc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23911b;

    public e(String type, String perkId) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(perkId, "perkId");
        this.f23910a = type;
        this.f23911b = perkId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f23910a, eVar.f23910a) && Intrinsics.f(this.f23911b, eVar.f23911b);
    }

    public final int hashCode() {
        return this.f23911b.hashCode() + (this.f23910a.hashCode() * 31);
    }
}
