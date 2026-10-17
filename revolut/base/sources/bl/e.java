package bl;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes17.dex */
@g
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16445b;

    public /* synthetic */ e(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(c.f16443a.getDescriptor(), i, 3);
            throw null;
        }
        this.f16444a = str;
        this.f16445b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f16444a, eVar.f16444a) && Intrinsics.f(this.f16445b, eVar.f16445b);
    }

    public final int hashCode() {
        return this.f16445b.hashCode() + (this.f16444a.hashCode() * 31);
    }

    public final String toString() {
        return j6.a.s("LocaleProps(language=", this.f16444a, ", country=", this.f16445b, ")");
    }

    public e(String language, String country) {
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(country, "country");
        this.f16444a = language;
        this.f16445b = country;
    }
}
