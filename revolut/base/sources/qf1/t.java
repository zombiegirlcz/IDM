package qf1;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes20.dex */
@mlm.g
public final class t implements d {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f245232a;

    public /* synthetic */ t(int i, String str) {
        if (1 == (i & 1)) {
            this.f245232a = str;
        } else {
            j1.f(r.f245231a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f245232a, ((t) obj2).f245232a);
    }

    public final int hashCode() {
        return this.f245232a.hashCode();
    }

    public t(String itemId) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        this.f245232a = itemId;
    }
}
