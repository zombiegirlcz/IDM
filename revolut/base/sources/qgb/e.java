package qgb;

import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f245731a;

    public /* synthetic */ e(int i, boolean z) {
        if (1 == (i & 1)) {
            this.f245731a = z;
        } else {
            j1.f(c.f245726a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f245731a == ((e) obj2).f245731a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f245731a);
    }

    public e(boolean z) {
        this.f245731a = z;
    }
}
