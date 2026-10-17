package gtd;

import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f146582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UrlImage f146583b;

    public e(TextClause title, UrlImage background) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(background, "background");
        this.f146582a = title;
        this.f146583b = background;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f146582a.equals(eVar.f146582a) && this.f146583b.equals(eVar.f146583b);
    }

    public final int hashCode() {
        return this.f146583b.hashCode() + (this.f146582a.hashCode() * 31);
    }
}
