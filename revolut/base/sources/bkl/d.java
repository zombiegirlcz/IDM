package bkl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16420b;

    public /* synthetic */ d(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(b.f16418a.getDescriptor(), i, 3);
            throw null;
        }
        this.f16419a = str;
        this.f16420b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f16419a, dVar.f16419a) && Intrinsics.f(this.f16420b, dVar.f16420b);
    }

    public final int hashCode() {
        return this.f16420b.hashCode() + (this.f16419a.hashCode() * 31);
    }

    public d(String name, String type) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f16419a = name;
        this.f16420b = type;
    }
}
