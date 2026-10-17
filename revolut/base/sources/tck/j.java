package tck;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class j {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f269871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f269872b;

    public /* synthetic */ j(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(h.f269870a.getDescriptor(), i, 3);
            throw null;
        }
        this.f269871a = str;
        this.f269872b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f269871a, jVar.f269871a) && Intrinsics.f(this.f269872b, jVar.f269872b);
    }

    public final int hashCode() {
        return this.f269872b.hashCode() + (this.f269871a.hashCode() * 31);
    }
}
