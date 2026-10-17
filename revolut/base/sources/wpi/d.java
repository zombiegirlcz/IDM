package wpi;

import com.revolut.retail.common.ui.R$id;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f299342b = new d(R$id.navBarWithBigTile);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f299343a;

    public d(int i) {
        this.f299343a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f299343a == ((d) obj2).f299343a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f299343a);
    }
}
