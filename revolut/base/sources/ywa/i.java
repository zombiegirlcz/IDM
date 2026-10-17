package ywa;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f317398b = {j.c(k.PUBLICATION, new yui.d(6))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f317399a;

    public /* synthetic */ i(int i, List list) {
        if (1 == (i & 1)) {
            this.f317399a = list;
        } else {
            j1.f(g.f317397a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f317399a, ((i) obj2).f317399a);
    }

    public final int hashCode() {
        return this.f317399a.hashCode();
    }

    public i(List inviteIds) {
        Intrinsics.checkNotNullParameter(inviteIds, "inviteIds");
        this.f317399a = inviteIds;
    }
}
