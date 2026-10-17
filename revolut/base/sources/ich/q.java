package ich;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class q implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f160284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f160285b;

    public q(p navBarConfig, ArrayList items) {
        Intrinsics.checkNotNullParameter(navBarConfig, "navBarConfig");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f160284a = navBarConfig;
        this.f160285b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f160285b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f160284a.equals(qVar.f160284a) && this.f160285b.equals(qVar.f160285b);
    }

    public final int hashCode() {
        return this.f160285b.hashCode() + (this.f160284a.hashCode() * 31);
    }
}
