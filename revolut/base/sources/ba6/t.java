package ba6;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class t {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f13957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f13958b;

    public t(r campaign, boolean z) {
        Intrinsics.checkNotNullParameter(campaign, "campaign");
        this.f13957a = campaign;
        this.f13958b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f13957a, tVar.f13957a) && this.f13958b == tVar.f13958b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f13958b) + (this.f13957a.hashCode() * 31);
    }
}
