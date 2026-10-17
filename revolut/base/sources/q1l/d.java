package q1l;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f241471a;

    public /* synthetic */ d(int i, String str) {
        if (1 == (i & 1)) {
            this.f241471a = str;
        } else {
            j1.f(b.f241470a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f241471a, ((d) obj2).f241471a);
    }

    public final int hashCode() {
        return this.f241471a.hashCode();
    }

    public d(String assetName) {
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        this.f241471a = assetName;
    }
}
