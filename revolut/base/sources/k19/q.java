package k19;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class q {

    @NotNull
    public static final o Companion = new o();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new k16.d(4))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f180163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f180164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f180165c;

    public /* synthetic */ q(int i, String str, String str2, p pVar) {
        if (7 != (i & 7)) {
            j1.f(n.f180162a.getDescriptor(), i, 7);
            throw null;
        }
        this.f180163a = str;
        this.f180164b = str2;
        this.f180165c = pVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f180163a, qVar.f180163a) && Intrinsics.f(this.f180164b, qVar.f180164b) && this.f180165c == qVar.f180165c;
    }

    public final int hashCode() {
        return this.f180165c.hashCode() + p.a.c(this.f180163a.hashCode() * 31, 31, this.f180164b);
    }
}
