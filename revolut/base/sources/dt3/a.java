package dt3;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f117353c;
    public final String d;
    public final c e;
    public final c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f117354g;

    public a(String title, String description, String videoUrl, String str, c primaryButton, c secondaryButton, List links) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        Intrinsics.checkNotNullParameter(secondaryButton, "secondaryButton");
        Intrinsics.checkNotNullParameter(links, "links");
        this.f117351a = title;
        this.f117352b = description;
        this.f117353c = videoUrl;
        this.d = str;
        this.e = primaryButton;
        this.f = secondaryButton;
        this.f117354g = links;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f117351a, aVar.f117351a) && Intrinsics.f(this.f117352b, aVar.f117352b) && Intrinsics.f(this.f117353c, aVar.f117353c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f117354g, aVar.f117354g);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f117351a.hashCode() * 31, 31, this.f117352b), 31, this.f117353c);
        String str = this.d;
        return this.f117354g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31);
    }
}
