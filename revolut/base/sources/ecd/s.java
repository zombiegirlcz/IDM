package ecd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class s {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f124660b;

    public /* synthetic */ s(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(q.f124649a.getDescriptor(), i, 3);
            throw null;
        }
        this.f124659a = str;
        this.f124660b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f124659a, sVar.f124659a) && Intrinsics.f(this.f124660b, sVar.f124660b);
    }

    public final int hashCode() {
        return this.f124660b.hashCode() + (this.f124659a.hashCode() * 31);
    }

    public s(String title, String deeplink) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f124659a = title;
        this.f124660b = deeplink;
    }
}
