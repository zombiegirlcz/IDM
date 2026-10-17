package ofa;

import kotlin.Lazy;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f224766b = {yhm.j.c(yhm.k.PUBLICATION, new ob1.e(27))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f224767a;

    public /* synthetic */ e(int i, b bVar) {
        if (1 == (i & 1)) {
            this.f224767a = bVar;
        } else {
            j1.f(c.f224764a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f224767a == ((e) obj2).f224767a;
    }

    public final int hashCode() {
        return this.f224767a.hashCode();
    }
}
