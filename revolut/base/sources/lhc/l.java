package lhc;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class l {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f195250b = {yhm.j.c(yhm.k.PUBLICATION, new lh9.b(3))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f195251a;

    public /* synthetic */ l(int i, List list) {
        if (1 == (i & 1)) {
            this.f195251a = list;
        } else {
            j1.f(a.f195238a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f195251a, ((l) obj2).f195251a);
    }

    public final int hashCode() {
        return this.f195251a.hashCode();
    }

    public l(ArrayList subscriptions) {
        Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
        this.f195251a = subscriptions;
    }
}
