package sl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f264066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f264067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f264068c;

    public u(String title, String description, String buttonText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.f264066a = title;
        this.f264067b = description;
        this.f264068c = buttonText;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f264066a, uVar.f264066a) && Intrinsics.f(this.f264067b, uVar.f264067b) && Intrinsics.f(this.f264068c, uVar.f264068c);
    }

    public final int hashCode() {
        return this.f264068c.hashCode() + p.a.c(this.f264066a.hashCode() * 31, 31, this.f264067b);
    }

    public final String toString() {
        return v0.a.i(v0.a.m("RetryTexts(title=", this.f264066a, ", description=", this.f264067b, ", buttonText="), this.f264068c, ")");
    }
}
