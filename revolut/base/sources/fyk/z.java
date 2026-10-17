package fyk;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class z {

    @NotNull
    public static final y Companion = new y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f139059b = {yhm.j.c(yhm.k.PUBLICATION, new fyh.k(7))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f139060a;

    public /* synthetic */ z(int i, List list) {
        if (1 == (i & 1)) {
            this.f139060a = list;
        } else {
            j1.f(x.f139058a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z) && Intrinsics.f(this.f139060a, ((z) obj2).f139060a);
    }

    public final int hashCode() {
        return this.f139060a.hashCode();
    }

    public z(ArrayList nationalities) {
        Intrinsics.checkNotNullParameter(nationalities, "nationalities");
        this.f139060a = nationalities;
    }
}
