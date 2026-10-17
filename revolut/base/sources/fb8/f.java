package fb8;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class f {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f133507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f133508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f133509c;

    public /* synthetic */ f(int i, String str, int i2, e eVar) {
        if (3 != (i & 3)) {
            j1.f(a.f133502a.getDescriptor(), i, 3);
            throw null;
        }
        this.f133507a = str;
        this.f133508b = i2;
        if ((i & 4) == 0) {
            this.f133509c = null;
        } else {
            this.f133509c = eVar;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f133507a, fVar.f133507a) && this.f133508b == fVar.f133508b && Intrinsics.f(this.f133509c, fVar.f133509c);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f133508b, this.f133507a.hashCode() * 31, 31);
        e eVar = this.f133509c;
        return iB + (eVar == null ? 0 : eVar.hashCode());
    }
}
