package pka;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f236962b = {yhm.j.c(yhm.k.PUBLICATION, new c(0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f236963a;

    public /* synthetic */ f(int i, List list) {
        if (1 == (i & 1)) {
            this.f236963a = list;
        } else {
            j1.f(d.f236959a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f236963a, ((f) obj2).f236963a);
    }

    public final int hashCode() {
        return this.f236963a.hashCode();
    }

    public f(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f236963a = items;
    }
}
