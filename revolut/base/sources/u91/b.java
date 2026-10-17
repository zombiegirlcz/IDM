package u91;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f278341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f278342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f278343c;

    public b(String title, String subtitle, String backgroundImageUrl) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(backgroundImageUrl, "backgroundImageUrl");
        this.f278341a = title;
        this.f278342b = subtitle;
        this.f278343c = backgroundImageUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f278341a, bVar.f278341a) && Intrinsics.f(this.f278342b, bVar.f278342b) && Intrinsics.f(this.f278343c, bVar.f278343c);
    }

    public final int hashCode() {
        return this.f278343c.hashCode() + p.a.c(this.f278341a.hashCode() * 31, 31, this.f278342b);
    }
}
