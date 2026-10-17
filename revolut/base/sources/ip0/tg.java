package ip0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class tg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f166516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f166517b;

    public tg(Clause text, Image icon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f166516a = icon;
        this.f166517b = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof tg)) {
            return false;
        }
        tg tgVar = (tg) obj2;
        return Intrinsics.f(this.f166516a, tgVar.f166516a) && this.f166517b.equals(tgVar.f166517b);
    }

    public final int hashCode() {
        return this.f166517b.hashCode() + (this.f166516a.hashCode() * 31);
    }
}
