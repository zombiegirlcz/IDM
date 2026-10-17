package au3;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9483c;
    public final ArrayList d;

    public l(String illustrationUrl, String title, String subtitle, ArrayList items) {
        Intrinsics.checkNotNullParameter(illustrationUrl, "illustrationUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f9481a = illustrationUrl;
        this.f9482b = title;
        this.f9483c = subtitle;
        this.d = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f9481a, lVar.f9481a) && Intrinsics.f(this.f9482b, lVar.f9482b) && Intrinsics.f(this.f9483c, lVar.f9483c) && this.d.equals(lVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f9481a.hashCode() * 31, 31, this.f9482b), 31, this.f9483c);
    }
}
