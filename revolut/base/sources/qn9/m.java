package qn9;

import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f247886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f247887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f247888c;
    public final boolean d;
    public final TextLocalisedClause e;

    public m(TextClause headerTitle, UrlImage urlImage, List items, boolean z, TextLocalisedClause buttonText) {
        Intrinsics.checkNotNullParameter(headerTitle, "headerTitle");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.f247886a = headerTitle;
        this.f247887b = urlImage;
        this.f247888c = items;
        this.d = z;
        this.e = buttonText;
    }

    @Override // jki.n
    public final List c() {
        return this.f247888c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f247886a.equals(mVar.f247886a) && Intrinsics.f(this.f247887b, mVar.f247887b) && Intrinsics.f(this.f247888c, mVar.f247888c) && this.d == mVar.d && this.e.equals(mVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f247886a.hashCode() * 31;
        Image image = this.f247887b;
        return this.e.hashCode() + j6.a.c(p.a.d((iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.f247888c), 31, this.d);
    }
}
