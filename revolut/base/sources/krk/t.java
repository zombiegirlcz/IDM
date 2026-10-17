package krk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class t {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f188905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f188906b;

    public /* synthetic */ t(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(r.f188904a.getDescriptor(), i, 3);
            throw null;
        }
        this.f188905a = str;
        this.f188906b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f188905a, tVar.f188905a) && Intrinsics.f(this.f188906b, tVar.f188906b);
    }

    public final int hashCode() {
        return this.f188906b.hashCode() + (this.f188905a.hashCode() * 31);
    }

    public t(String value, String currency) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f188905a = value;
        this.f188906b = currency;
    }
}
