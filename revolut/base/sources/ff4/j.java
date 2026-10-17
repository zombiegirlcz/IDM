package ff4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f134723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f134724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f134725c;
    public final TextLocalisedClause d;
    public final Clause e;

    public j(TextLocalisedClause title, ResourceImage resourceImage, boolean z, TextLocalisedClause value, Clause subtitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f134723a = title;
        this.f134724b = resourceImage;
        this.f134725c = z;
        this.d = value;
        this.e = subtitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f134723a.equals(jVar.f134723a) && Intrinsics.f(this.f134724b, jVar.f134724b) && this.f134725c == jVar.f134725c && this.d.equals(jVar.d) && this.e.equals(jVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f134723a.hashCode() * 31;
        Image image = this.f134724b;
        return this.e.hashCode() + t61.a.a(j6.a.c((iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.f134725c), 31, this.d);
    }
}
