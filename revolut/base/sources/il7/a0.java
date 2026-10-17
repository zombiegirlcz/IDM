package il7;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class a0 {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f162090b = {yhm.j.c(yhm.k.PUBLICATION, new igb.j(24))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f162091a;

    public /* synthetic */ a0(int i, List list) {
        if (1 == (i & 1)) {
            this.f162091a = list;
        } else {
            j1.f(y.f162131a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a0) && Intrinsics.f(this.f162091a, ((a0) obj2).f162091a);
    }

    public final int hashCode() {
        return this.f162091a.hashCode();
    }

    public a0(ArrayList benefitCategories) {
        Intrinsics.checkNotNullParameter(benefitCategories, "benefitCategories");
        this.f162091a = benefitCategories;
    }
}
