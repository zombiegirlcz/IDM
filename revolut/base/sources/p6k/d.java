package p6k;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import h30.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f233348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CompositeClause f233349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f233350c;
    public final Image d;
    public final ActionWidgetDelegate.Model.b e;
    public final ActionWidgetDelegate.Model.a f;

    public d(Clause title, CompositeClause subtitle, Image image, Image badge, ActionWidgetDelegate.Model.b valueStyle, ActionWidgetDelegate.Model.a buttonsStyle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(badge, "badge");
        Intrinsics.checkNotNullParameter(valueStyle, "valueStyle");
        Intrinsics.checkNotNullParameter(buttonsStyle, "buttonsStyle");
        this.f233348a = title;
        this.f233349b = subtitle;
        this.f233350c = image;
        this.d = badge;
        this.e = valueStyle;
        this.f = buttonsStyle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f233348a.equals(dVar.f233348a) && this.f233349b.equals(dVar.f233349b) && this.f233350c.equals(dVar.f233350c) && Intrinsics.f(this.d, dVar.d) && this.e.equals(dVar.e) && this.f.equals(dVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + a10.b.c(this.d, a10.b.c(this.f233350c, l.c(this.f233349b, this.f233348a.hashCode() * 31, 31), 31), 31)) * 31);
    }
}
