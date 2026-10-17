package my8;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f210368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f210369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f210370c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f210371g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f210372h;

    public b(boolean z, boolean z3, j inputType, String valueType, String name, String displayName, String validationPattern, String str) {
        Intrinsics.checkNotNullParameter(inputType, "inputType");
        Intrinsics.checkNotNullParameter(valueType, "valueType");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(validationPattern, "validationPattern");
        this.f210368a = z;
        this.f210369b = z3;
        this.f210370c = inputType;
        this.d = valueType;
        this.e = name;
        this.f = displayName;
        this.f210371g = validationPattern;
        this.f210372h = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f210368a == bVar.f210368a && this.f210369b == bVar.f210369b && this.f210370c == bVar.f210370c && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f210371g, bVar.f210371g) && Intrinsics.f(this.f210372h, bVar.f210372h);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c((this.f210370c.hashCode() + j6.a.c(Boolean.hashCode(this.f210368a) * 31, 31, this.f210369b)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.f210371g);
        String str = this.f210372h;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
