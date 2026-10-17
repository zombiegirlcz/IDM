package ou3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f229807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f229808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f229809c;
    public final String d;

    public o(String title, String description, String image, String buttonTitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        this.f229807a = title;
        this.f229808b = description;
        this.f229809c = image;
        this.d = buttonTitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f229807a, oVar.f229807a) && Intrinsics.f(this.f229808b, oVar.f229808b) && Intrinsics.f(this.f229809c, oVar.f229809c) && Intrinsics.f(this.d, oVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f229807a.hashCode() * 31, 31, this.f229808b), 31, this.f229809c);
    }
}
