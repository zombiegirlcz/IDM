package ju4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f178581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f178582b;

    public f(TextLocalisedClause buttonTitle, boolean z) {
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        this.f178581a = buttonTitle;
        this.f178582b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f178581a.equals(fVar.f178581a) && this.f178582b == fVar.f178582b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f178582b) + (this.f178581a.hashCode() * 31);
    }
}
