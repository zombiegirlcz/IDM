package vpi;

import com.revolut.retail.common.ui.R$id;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f291221b = new d(R$id.navBarWithAvatar);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f291222a;

    public d(int i) {
        this.f291222a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f291222a == ((d) obj2).f291222a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f291222a);
    }
}
