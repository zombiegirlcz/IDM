package tal;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f269361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f269362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f269363c;
    public final boolean d;
    public final UrlImage e;
    public final Integer f;

    public a(TextClause textClause, TextClause toolbarTitle, TextClause textClause2, boolean z, UrlImage urlImage, Integer num) {
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        this.f269361a = textClause;
        this.f269362b = toolbarTitle;
        this.f269363c = textClause2;
        this.d = z;
        this.e = urlImage;
        this.f = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f269361a, aVar.f269361a) && this.f269362b.equals(aVar.f269362b) && Intrinsics.f(this.f269363c, aVar.f269363c) && this.d == aVar.d && Intrinsics.f(this.e, aVar.e) && this.f.equals(aVar.f);
    }

    public final int hashCode() {
        Clause clause = this.f269361a;
        int iB = v7.b((clause == null ? 0 : clause.hashCode()) * 31, 31, this.f269362b);
        Clause clause2 = this.f269363c;
        int iC = j6.a.c((iB + (clause2 == null ? 0 : clause2.hashCode())) * 31, 961, this.d);
        UrlImage urlImage = this.e;
        return this.f.hashCode() + ((iC + (urlImage != null ? urlImage.hashCode() : 0)) * 31);
    }
}
