package j6b;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f171723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f171724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yy0.l f171725c;

    public f(TextClause headerTitle, TextClause textClause, yy0.l imageUiElement) {
        Intrinsics.checkNotNullParameter(headerTitle, "headerTitle");
        Intrinsics.checkNotNullParameter(imageUiElement, "imageUiElement");
        this.f171723a = headerTitle;
        this.f171724b = textClause;
        this.f171725c = imageUiElement;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f171723a.equals(fVar.f171723a) && Intrinsics.f(this.f171724b, fVar.f171724b) && this.f171725c.equals(fVar.f171725c);
    }

    public final int hashCode() {
        int iHashCode = this.f171723a.hashCode() * 31;
        Clause clause = this.f171724b;
        return this.f171725c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
