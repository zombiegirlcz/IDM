package ftb;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.rev10_main_screen.api.MainScreenTab;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainScreenTab f138008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f138009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResourceImage f138010c;
    public final TextLocalisedClause d;
    public final TextLocalisedClause e;

    public a(MainScreenTab mainScreenTab, TextLocalisedClause title, ResourceImage icon, TextLocalisedClause visibleSubtitle, TextLocalisedClause hiddenSubtitle) {
        Intrinsics.checkNotNullParameter(mainScreenTab, "mainScreenTab");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(visibleSubtitle, "visibleSubtitle");
        Intrinsics.checkNotNullParameter(hiddenSubtitle, "hiddenSubtitle");
        this.f138008a = mainScreenTab;
        this.f138009b = title;
        this.f138010c = icon;
        this.d = visibleSubtitle;
        this.e = hiddenSubtitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f138008a, aVar.f138008a) && this.f138009b.equals(aVar.f138009b) && this.f138010c.equals(aVar.f138010c) && this.d.equals(aVar.d) && this.e.equals(aVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + t61.a.a(org.bouncycastle.jcajce.provider.digest.a.b(this.f138010c, t61.a.a(this.f138008a.f83420a.hashCode() * 31, 31, this.f138009b), 31), 31, this.d);
    }
}
