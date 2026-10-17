package s7h;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import s77.x;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f260838b = {yhm.j.c(yhm.k.PUBLICATION, new x(25))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f260839a;

    public /* synthetic */ o(int i, List list) {
        if (1 == (i & 1)) {
            this.f260839a = list;
        } else {
            j1.f(m.f260837a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f260839a, ((o) obj2).f260839a);
    }

    public final int hashCode() {
        return this.f260839a.hashCode();
    }

    public o(ArrayList instruments) {
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        this.f260839a = instruments;
    }
}
