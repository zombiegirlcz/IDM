package f2e;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class d5 {

    @NotNull
    public static final c5 Companion = new c5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f131571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f131572c;

    public /* synthetic */ d5(int i, String str, String str2, String str3) {
        if (1 != (i & 1)) {
            qlm.j1.f(b5.f131546a.getDescriptor(), i, 1);
            throw null;
        }
        this.f131570a = str;
        if ((i & 2) == 0) {
            this.f131571b = null;
        } else {
            this.f131571b = str2;
        }
        if ((i & 4) == 0) {
            this.f131572c = "SOLD_OUT";
        } else {
            this.f131572c = str3;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d5)) {
            return false;
        }
        d5 d5Var = (d5) obj2;
        return Intrinsics.f(this.f131570a, d5Var.f131570a) && Intrinsics.f(this.f131571b, d5Var.f131571b) && Intrinsics.f(this.f131572c, d5Var.f131572c);
    }

    public final int hashCode() {
        int iHashCode = this.f131570a.hashCode() * 31;
        String str = this.f131571b;
        return this.f131572c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public d5(String id10, String str, String state) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f131570a = id10;
        this.f131571b = str;
        this.f131572c = state;
    }
}
