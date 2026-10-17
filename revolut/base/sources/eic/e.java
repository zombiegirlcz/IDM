package eic;

import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f126468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f126469b;

    public e(TextClause text, ResourceImage resourceImage) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f126468a = resourceImage;
        this.f126469b = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f126468a, eVar.f126468a) && this.f126469b.equals(eVar.f126469b);
    }

    public final int hashCode() {
        Image image = this.f126468a;
        return this.f126469b.hashCode() + ((image == null ? 0 : image.hashCode()) * 31);
    }
}
