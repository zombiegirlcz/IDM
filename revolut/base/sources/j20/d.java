package j20;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes19.dex */
@mlm.g
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f170639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f170640b;

    public /* synthetic */ d(float f, int i, String str) {
        if (3 != (i & 3)) {
            j1.f(b.f170638a.getDescriptor(), i, 3);
            throw null;
        }
        this.f170639a = f;
        this.f170640b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Float.compare(this.f170639a, dVar.f170639a) == 0 && Intrinsics.f(this.f170640b, dVar.f170640b);
    }

    public final int hashCode() {
        return this.f170640b.hashCode() + (Float.hashCode(this.f170639a) * 31);
    }
}
