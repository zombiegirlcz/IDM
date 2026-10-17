package iqi;

import com.revolut.retail.common.ui.R$id;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f167870b = new g(R$id.twinVerticalButton);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f167871a;

    public g(int i) {
        this.f167871a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f167871a == ((g) obj2).f167871a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f167871a);
    }
}
