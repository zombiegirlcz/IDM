package et0;

import com.revolut.core.ui_kit.internal.views.chat.ChatBubbleStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f129013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f129014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ChatBubbleStyle f129015c;
    public final boolean d;

    public c0(Clause clause, Image image, ChatBubbleStyle style, boolean z) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f129013a = clause;
        this.f129014b = image;
        this.f129015c = style;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f129013a, c0Var.f129013a) && Intrinsics.f(this.f129014b, c0Var.f129014b) && Intrinsics.f(this.f129015c, c0Var.f129015c) && this.d == c0Var.d;
    }

    public final int hashCode() {
        Clause clause = this.f129013a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Image image = this.f129014b;
        return Boolean.hashCode(this.d) + ((this.f129015c.hashCode() + ((iHashCode + (image != null ? image.hashCode() : 0)) * 31)) * 31);
    }
}
