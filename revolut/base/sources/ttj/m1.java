package ttj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class m1 {

    @NotNull
    public static final l1 Companion = new l1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f274373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f274374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f274375c;

    public /* synthetic */ m1(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qlm.j1.f(k1.f274363a.getDescriptor(), i, 7);
            throw null;
        }
        this.f274373a = str;
        this.f274374b = str2;
        this.f274375c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj2;
        return Intrinsics.f(this.f274373a, m1Var.f274373a) && Intrinsics.f(this.f274374b, m1Var.f274374b) && Intrinsics.f(this.f274375c, m1Var.f274375c);
    }

    public final int hashCode() {
        return this.f274375c.hashCode() + p.a.c(this.f274373a.hashCode() * 31, 31, this.f274374b);
    }
}
