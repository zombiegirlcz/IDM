package s7g;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class v1 {

    @NotNull
    public static final u1 Companion = new u1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f260805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f260806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t7g.o f260807c;

    public /* synthetic */ v1(int i, String str, String str2, t7g.o oVar) {
        if (7 != (i & 7)) {
            qlm.j1.f(t1.f260800a.getDescriptor(), i, 7);
            throw null;
        }
        this.f260805a = str;
        this.f260806b = str2;
        this.f260807c = oVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj2;
        return Intrinsics.f(this.f260805a, v1Var.f260805a) && Intrinsics.f(this.f260806b, v1Var.f260806b) && Intrinsics.f(this.f260807c, v1Var.f260807c);
    }

    public final int hashCode() {
        return this.f260807c.hashCode() + p.a.c(this.f260805a.hashCode() * 31, 31, this.f260806b);
    }

    public v1(String travellerReference, String email, t7g.o phoneNumber) {
        Intrinsics.checkNotNullParameter(travellerReference, "travellerReference");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        this.f260805a = travellerReference;
        this.f260806b = email;
        this.f260807c = phoneNumber;
    }
}
