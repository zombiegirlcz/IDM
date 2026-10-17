package pl9;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class j {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f237298a;

    public /* synthetic */ j(int i, String str) {
        if (1 == (i & 1)) {
            this.f237298a = str;
        } else {
            j1.f(h.f237297a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f237298a, ((j) obj2).f237298a);
    }

    public final int hashCode() {
        return this.f237298a.hashCode();
    }

    public j(String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f237298a = reason;
    }
}
