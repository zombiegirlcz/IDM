package dsh;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.widgets.api.R$string;
import com.revolut.kompot.common.ModalDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f117326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f117327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ModalDestination.Style f117328c;

    public j(Clause title, k navigatable, ModalDestination.Style modalStyle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(navigatable, "navigatable");
        Intrinsics.checkNotNullParameter(modalStyle, "modalStyle");
        this.f117326a = title;
        this.f117327b = navigatable;
        this.f117328c = modalStyle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f117326a, jVar.f117326a) && Intrinsics.f(this.f117327b, jVar.f117327b) && Intrinsics.f(this.f117328c, jVar.f117328c);
    }

    public final int hashCode() {
        return this.f117328c.hashCode() + ((this.f117327b.hashCode() + (this.f117326a.hashCode() * 31)) * 31);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ j(TextLocalisedClause textLocalisedClause, k kVar, int i) {
        ModalDestination.Style style;
        textLocalisedClause = (i & 1) != 0 ? new TextLocalisedClause(R$string.widgets_popup_customise_title, null, null, 14) : textLocalisedClause;
        if ((i & 4) != 0) {
            style = ModalDestination.Style.POPUP.f98311a;
        } else {
            style = ModalDestination.Style.FULLSCREEN_FADE.f98307a;
        }
        this(textLocalisedClause, kVar, style);
    }
}
