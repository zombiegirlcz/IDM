package rwg;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f257909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Float f257910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Float f257911c;
    public final String d;

    public /* synthetic */ c(int i, String str, Float f, Float f4, String str2) {
        if (15 != (i & 15)) {
            j1.f(a.f257904a.getDescriptor(), i, 15);
            throw null;
        }
        this.f257909a = str;
        this.f257910b = f;
        this.f257911c = f4;
        this.d = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f257909a, cVar.f257909a) && Intrinsics.f(this.f257910b, cVar.f257910b) && Intrinsics.f(this.f257911c, cVar.f257911c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f257909a.hashCode() * 31;
        Float f = this.f257910b;
        int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f4 = this.f257911c;
        return this.d.hashCode() + ((iHashCode2 + (f4 != null ? f4.hashCode() : 0)) * 31);
    }
}
