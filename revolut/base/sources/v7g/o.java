package v7g;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class o {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f286648b = {yhm.j.c(yhm.k.PUBLICATION, new v4a.a(7))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f286649a;

    public /* synthetic */ o(int i, List list) {
        if (1 == (i & 1)) {
            this.f286649a = list;
        } else {
            j1.f(j.f286645a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f286649a, ((o) obj2).f286649a);
    }

    public final int hashCode() {
        return this.f286649a.hashCode();
    }

    public o(ArrayList selectedExtraProducts) {
        Intrinsics.checkNotNullParameter(selectedExtraProducts, "selectedExtraProducts");
        this.f286649a = selectedExtraProducts;
    }
}
