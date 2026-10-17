package n29;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class d implements h {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f211462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f211463b;

    public /* synthetic */ d(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(b.f211457a.getDescriptor(), i, 3);
            throw null;
        }
        this.f211462a = str;
        this.f211463b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f211462a, dVar.f211462a) && Intrinsics.f(this.f211463b, dVar.f211463b);
    }

    public final int hashCode() {
        int iHashCode = this.f211462a.hashCode() * 31;
        String str = this.f211463b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public d(String primary, String str) {
        Intrinsics.checkNotNullParameter(primary, "primary");
        this.f211462a = primary;
        this.f211463b = str;
    }
}
