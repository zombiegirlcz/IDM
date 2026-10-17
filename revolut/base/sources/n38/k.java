package n38;

import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class k implements p {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f211953a;

    public /* synthetic */ k(int i, boolean z) {
        if (1 == (i & 1)) {
            this.f211953a = z;
        } else {
            j1.f(i.f211952a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f211953a == ((k) obj2).f211953a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f211953a);
    }

    public k(boolean z) {
        this.f211953a = z;
    }
}
