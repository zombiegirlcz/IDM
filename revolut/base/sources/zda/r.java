package zda;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class r {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f321410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f321411c;

    public /* synthetic */ r(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(p.f321405a.getDescriptor(), i, 7);
            throw null;
        }
        this.f321409a = str;
        this.f321410b = str2;
        this.f321411c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f321409a, rVar.f321409a) && Intrinsics.f(this.f321410b, rVar.f321410b) && Intrinsics.f(this.f321411c, rVar.f321411c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f321409a.hashCode() * 31, 31, this.f321410b);
        String str = this.f321411c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public r(String title, String value, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f321409a = title;
        this.f321410b = value;
        this.f321411c = str;
    }
}
