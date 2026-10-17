package sq5;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f264995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f264996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f264997c;
    public final b d;

    public a(Image image, String title, Clause titleClause, b parcel) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(titleClause, "titleClause");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f264995a = image;
        this.f264996b = title;
        this.f264997c = titleClause;
        this.d = parcel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f264995a.equals(aVar.f264995a) && Intrinsics.f(this.f264996b, aVar.f264996b) && this.f264997c.equals(aVar.f264997c) && this.d.equals(aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.b(p.a.c(this.f264995a.hashCode() * 31, 31, this.f264996b), 31, this.f264997c);
    }
}
