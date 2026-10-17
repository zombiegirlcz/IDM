package iyd;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f169682b = {yhm.j.c(yhm.k.PUBLICATION, new iw4.b(9))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f169683a;

    public /* synthetic */ o(int i, List list) {
        if (1 == (i & 1)) {
            this.f169683a = list;
        } else {
            j1.f(m.f169677a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f169683a, ((o) obj2).f169683a);
    }

    public final int hashCode() {
        return this.f169683a.hashCode();
    }

    public o(ArrayList paragraphs) {
        Intrinsics.checkNotNullParameter(paragraphs, "paragraphs");
        this.f169683a = paragraphs;
    }
}
