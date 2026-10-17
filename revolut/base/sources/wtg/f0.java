package wtg;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class f0 {

    @NotNull
    public static final e0 Companion = new e0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f299951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f299952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f299953c;

    public /* synthetic */ f0(String str, int i, Integer num, String str2) {
        if (7 != (i & 7)) {
            j1.f(d0.f299948a.getDescriptor(), i, 7);
            throw null;
        }
        this.f299951a = str;
        this.f299952b = num;
        this.f299953c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return Intrinsics.f(this.f299951a, f0Var.f299951a) && Intrinsics.f(this.f299952b, f0Var.f299952b) && Intrinsics.f(this.f299953c, f0Var.f299953c);
    }

    public final int hashCode() {
        int iHashCode = this.f299951a.hashCode() * 31;
        Integer num = this.f299952b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f299953c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public f0(String featureName, Integer num, String str) {
        Intrinsics.checkNotNullParameter(featureName, "featureName");
        this.f299951a = featureName;
        this.f299952b = num;
        this.f299953c = str;
    }
}
