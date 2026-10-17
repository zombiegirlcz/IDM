package th8;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@g
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f271325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f271326b;

    public /* synthetic */ d(int i, String str, boolean z) {
        if (3 != (i & 3)) {
            j1.f(b.f271324a.getDescriptor(), i, 3);
            throw null;
        }
        this.f271325a = str;
        this.f271326b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f271325a, dVar.f271325a) && this.f271326b == dVar.f271326b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f271326b) + (this.f271325a.hashCode() * 31);
    }
}
