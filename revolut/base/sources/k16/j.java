package k16;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class j {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f180115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f180116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f180117c;

    public /* synthetic */ j(int i, String str, int i2, String str2) {
        if (7 != (i & 7)) {
            j1.f(h.f180114a.getDescriptor(), i, 7);
            throw null;
        }
        this.f180115a = str;
        this.f180116b = i2;
        this.f180117c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f180115a, jVar.f180115a) && this.f180116b == jVar.f180116b && Intrinsics.f(this.f180117c, jVar.f180117c);
    }

    public final int hashCode() {
        return this.f180117c.hashCode() + j6.a.b(this.f180116b, this.f180115a.hashCode() * 31, 31);
    }
}
