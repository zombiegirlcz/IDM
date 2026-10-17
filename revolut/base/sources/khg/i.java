package khg;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f184125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f184126b;

    public i(TextLocalisedClause toolbarTitle, List pages) {
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(pages, "pages");
        this.f184125a = toolbarTitle;
        this.f184126b = pages;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f184125a.equals(iVar.f184125a) && Intrinsics.f(this.f184126b, iVar.f184126b);
    }

    public final int hashCode() {
        return this.f184126b.hashCode() + (this.f184125a.hashCode() * 31);
    }
}
