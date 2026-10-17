package uv5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f283318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f283319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f283320c;

    public h(String url2, String iconId, String label) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(iconId, "iconId");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f283318a = url2;
        this.f283319b = iconId;
        this.f283320c = label;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f283318a, hVar.f283318a) && Intrinsics.f(this.f283319b, hVar.f283319b) && Intrinsics.f(this.f283320c, hVar.f283320c);
    }

    public final int hashCode() {
        return this.f283320c.hashCode() + p.a.c(this.f283318a.hashCode() * 31, 31, this.f283319b);
    }
}
