package bu7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18727b;

    public /* synthetic */ n(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(l.f18722a.getDescriptor(), i, 3);
            throw null;
        }
        this.f18726a = str;
        this.f18727b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f18726a, nVar.f18726a) && Intrinsics.f(this.f18727b, nVar.f18727b);
    }

    public final int hashCode() {
        return this.f18727b.hashCode() + (this.f18726a.hashCode() * 31);
    }

    public n(String title, String subtitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f18726a = title;
        this.f18727b = subtitle;
    }
}
