package lzd;

import com.revolut.feature.statements.api.models.ProductSelection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f200964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProductSelection f200965b;

    static {
        new c(h0.f322473a, ProductSelection.INSTANCE.getEMPTY());
    }

    public c(Set expandedProducts, ProductSelection productSelection) {
        Intrinsics.checkNotNullParameter(expandedProducts, "expandedProducts");
        Intrinsics.checkNotNullParameter(productSelection, "productSelection");
        this.f200964a = expandedProducts;
        this.f200965b = productSelection;
    }

    public static c a(c cVar, LinkedHashSet linkedHashSet, ProductSelection productSelection, int i) {
        Set expandedProducts = linkedHashSet;
        if ((i & 1) != 0) {
            expandedProducts = cVar.f200964a;
        }
        if ((i & 2) != 0) {
            productSelection = cVar.f200965b;
        }
        cVar.getClass();
        Intrinsics.checkNotNullParameter(expandedProducts, "expandedProducts");
        Intrinsics.checkNotNullParameter(productSelection, "productSelection");
        return new c(expandedProducts, productSelection);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f200964a, cVar.f200964a) && Intrinsics.f(this.f200965b, cVar.f200965b);
    }

    public final int hashCode() {
        return this.f200965b.hashCode() + (this.f200964a.hashCode() * 31);
    }
}
