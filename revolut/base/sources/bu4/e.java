package bu4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f18674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18675b;

    public e(TextLocalisedClause buttonTitle, boolean z) {
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        this.f18674a = buttonTitle;
        this.f18675b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f18674a.equals(eVar.f18674a) && this.f18675b == eVar.f18675b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f18675b) + (this.f18674a.hashCode() * 31);
    }
}
