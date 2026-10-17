package hpi;

import com.revolut.retail.common.ui.R$id;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f154557b = new g(R$id.keyboardSuggestions);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f154558a;

    public g(int i) {
        this.f154558a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f154558a == ((g) obj2).f154558a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f154558a);
    }
}
