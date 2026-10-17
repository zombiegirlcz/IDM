package pgk;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lg0.e f235978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f235979b;

    public b(lg0.e navigationDeeplink) {
        Intrinsics.checkNotNullParameter(navigationDeeplink, "navigationDeeplink");
        this.f235978a = navigationDeeplink;
        this.f235979b = yhm.j.b(new os2.a(this, 27));
    }

    public final String a(int i) {
        String str = (String) d0.e0(i, (List) this.f235979b.getValue());
        return str == null ? "" : str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f235978a, ((b) obj2).f235978a);
    }

    public final int hashCode() {
        return this.f235978a.hashCode();
    }
}
