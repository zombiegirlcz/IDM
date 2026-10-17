package jqi;

import com.revolut.retail.common.ui.R$id;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f177727b = new d(R$id.twinHorizontalButton);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f177728a;

    public d(int i) {
        this.f177728a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f177728a == ((d) obj2).f177728a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f177728a);
    }
}
