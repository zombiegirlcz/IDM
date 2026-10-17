package pg5;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f235799b = {j.c(k.PUBLICATION, new pdg.d(29))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f235800a;

    public /* synthetic */ c(int i, List list) {
        if (1 == (i & 1)) {
            this.f235800a = list;
        } else {
            j1.f(a.f235798a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f235800a, ((c) obj2).f235800a);
    }

    public final int hashCode() {
        return this.f235800a.hashCode();
    }

    public c(ArrayList currencies) {
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        this.f235800a = currencies;
    }
}
