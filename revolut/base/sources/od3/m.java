package od3;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class m extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f224281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f224282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f224283c;
    public final CdnImage d;
    public final Image e;

    public m(Clause navBarToolbarTitle, Clause navBarHeaderTitle, List navBarActions, CdnImage navBarBackgroundImage, ResourceImage resourceImage) {
        Intrinsics.checkNotNullParameter(navBarToolbarTitle, "navBarToolbarTitle");
        Intrinsics.checkNotNullParameter(navBarHeaderTitle, "navBarHeaderTitle");
        Intrinsics.checkNotNullParameter(navBarActions, "navBarActions");
        Intrinsics.checkNotNullParameter(navBarBackgroundImage, "navBarBackgroundImage");
        this.f224281a = navBarToolbarTitle;
        this.f224282b = navBarHeaderTitle;
        this.f224283c = navBarActions;
        this.d = navBarBackgroundImage;
        this.e = resourceImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f224281a, mVar.f224281a) && Intrinsics.f(this.f224282b, mVar.f224282b) && this.f224283c.equals(mVar.f224283c) && this.d.equals(mVar.d) && Intrinsics.f(this.e, mVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + p.a.d(p.a.a(this.f224281a.hashCode() * 31, 31, this.f224282b), 31, this.f224283c)) * 31;
        Image image = this.e;
        return iHashCode + (image == null ? 0 : image.hashCode());
    }
}
