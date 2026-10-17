package el4;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f127246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f127247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f127248c;
    public final b93.j d;

    public b(String cardId, String title, String subtitle, b93.j image) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f127246a = cardId;
        this.f127247b = title;
        this.f127248c = subtitle;
        this.d = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f127246a, bVar.f127246a) && Intrinsics.f(this.f127247b, bVar.f127247b) && Intrinsics.f(this.f127248c, bVar.f127248c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f127246a.hashCode() * 31, 31, this.f127247b), 31, this.f127248c);
    }
}
