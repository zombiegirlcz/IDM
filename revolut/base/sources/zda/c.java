package zda;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f321365b;

    public /* synthetic */ c(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(a.f321356a.getDescriptor(), i, 3);
            throw null;
        }
        this.f321364a = str;
        this.f321365b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f321364a, cVar.f321364a) && Intrinsics.f(this.f321365b, cVar.f321365b);
    }

    public final int hashCode() {
        return this.f321365b.hashCode() + (this.f321364a.hashCode() * 31);
    }

    public c(String title, String deeplink) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f321364a = title;
        this.f321365b = deeplink;
    }
}
