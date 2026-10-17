package f19;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f131182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f131183c;

    public a(String text, String icon, b theme) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(theme, "theme");
        this.f131181a = text;
        this.f131182b = icon;
        this.f131183c = theme;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f131181a, aVar.f131181a) && Intrinsics.f(this.f131182b, aVar.f131182b) && this.f131183c == aVar.f131183c;
    }

    public final int hashCode() {
        return this.f131183c.hashCode() + p.a.c(this.f131181a.hashCode() * 31, 31, this.f131182b);
    }
}
