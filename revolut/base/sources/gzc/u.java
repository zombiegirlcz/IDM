package gzc;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class u implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f148038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f148039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f148040c;
    public final boolean d;
    public final m e;

    public u(String title, String type, String description, boolean z, m incomeFrequency) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(incomeFrequency, "incomeFrequency");
        this.f148038a = title;
        this.f148039b = type;
        this.f148040c = description;
        this.d = z;
        this.e = incomeFrequency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f148038a, uVar.f148038a) && Intrinsics.f(this.f148039b, uVar.f148039b) && Intrinsics.f(this.f148040c, uVar.f148040c) && this.d == uVar.d && Intrinsics.f(this.e, uVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.c(p.a.c(p.a.c(this.f148038a.hashCode() * 31, 31, this.f148039b), 31, this.f148040c), 31, this.d);
    }
}
