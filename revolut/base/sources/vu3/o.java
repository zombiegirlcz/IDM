package vu3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f292232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f292233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f292234c;

    public o(String title, String subtitle, String video) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(video, "video");
        this.f292232a = title;
        this.f292233b = subtitle;
        this.f292234c = video;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f292232a, oVar.f292232a) && Intrinsics.f(this.f292233b, oVar.f292233b) && Intrinsics.f(this.f292234c, oVar.f292234c);
    }

    public final int hashCode() {
        return this.f292234c.hashCode() + p.a.c(this.f292232a.hashCode() * 31, 31, this.f292233b);
    }
}
