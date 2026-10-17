package t7g;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f268683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f268684b;

    public /* synthetic */ o(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(m.f268682a.getDescriptor(), i, 3);
            throw null;
        }
        this.f268683a = str;
        this.f268684b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f268683a, oVar.f268683a) && Intrinsics.f(this.f268684b, oVar.f268684b);
    }

    public final int hashCode() {
        return this.f268684b.hashCode() + (this.f268683a.hashCode() * 31);
    }

    public o(String countryCode, String number) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(number, "number");
        this.f268683a = countryCode;
        this.f268684b = number;
    }
}
