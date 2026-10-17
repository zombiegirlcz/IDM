package tgb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f271150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f271151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f271152c;
    public final e d;

    public m(String title, String description, String backgroundUrl, e cta2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(backgroundUrl, "backgroundUrl");
        Intrinsics.checkNotNullParameter(cta2, "cta");
        this.f271150a = title;
        this.f271151b = description;
        this.f271152c = backgroundUrl;
        this.d = cta2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f271150a, mVar.f271150a) && Intrinsics.f(this.f271151b, mVar.f271151b) && Intrinsics.f(this.f271152c, mVar.f271152c) && Intrinsics.f(this.d, mVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f271150a.hashCode() * 31, 31, this.f271151b), 31, this.f271152c);
    }
}
