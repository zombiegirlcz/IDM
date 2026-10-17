package dx4;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class n3 extends q3 {

    @NotNull
    private static final m3 Companion = new m3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f120686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f120687c;
    public final String d;
    public final String e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f120688g;

    public n3(String name, c1 c1Var, String title, String str, String str2, boolean z, String str3) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f120685a = name;
        this.f120686b = c1Var;
        this.f120687c = title;
        this.d = str;
        this.e = str2;
        this.f = z;
        this.f120688g = str3;
    }

    @Override // dx4.q3
    public final String a() {
        return this.d;
    }

    @Override // dx4.q3
    public final String b() {
        return f("?format=html");
    }

    @Override // dx4.q3
    public final String c() {
        return f("?format=pdf");
    }

    @Override // dx4.q3
    public final boolean d() {
        return this.f;
    }

    @Override // dx4.q3
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n3)) {
            return false;
        }
        n3 n3Var = (n3) obj2;
        return Intrinsics.f(this.f120685a, n3Var.f120685a) && Intrinsics.f(this.f120686b, n3Var.f120686b) && Intrinsics.f(this.f120687c, n3Var.f120687c) && Intrinsics.f(this.d, n3Var.d) && Intrinsics.f(this.e, n3Var.e) && this.f == n3Var.f && Intrinsics.f(this.f120688g, n3Var.f120688g);
    }

    public final String f(String str) {
        StringBuilder sb6 = new StringBuilder();
        String str2 = this.f120688g;
        if (str2 == null || kotlin.text.d0.W(str2)) {
            m70.a.c(kotlin.jvm.internal.t0.f186434a);
            sb6.append("");
        } else {
            String[] value = {str2, str};
            Intrinsics.checkNotNullParameter(sb6, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            for (int i = 0; i < 2; i++) {
                sb6.append(value[i]);
            }
        }
        return sb6.toString();
    }

    @Override // dx4.q3
    public final String getName() {
        return this.f120685a;
    }

    @Override // dx4.q3
    public final String getTitle() {
        return this.f120687c;
    }

    public final int hashCode() {
        int iHashCode = this.f120685a.hashCode() * 31;
        c1 c1Var = this.f120686b;
        int iC = p.a.c((iHashCode + (c1Var == null ? 0 : c1Var.hashCode())) * 31, 31, this.f120687c);
        String str = this.d;
        int iHashCode2 = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iC2 = j6.a.c((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f);
        String str3 = this.f120688g;
        return iC2 + (str3 != null ? str3.hashCode() : 0);
    }
}
