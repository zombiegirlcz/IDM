package um2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f281199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f281200b;

    public i(List wallpapers, int i) {
        Intrinsics.checkNotNullParameter(wallpapers, "wallpapers");
        this.f281199a = wallpapers;
        this.f281200b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f281199a, iVar.f281199a) && this.f281200b == iVar.f281200b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f281200b) + (this.f281199a.hashCode() * 31);
    }
}
