package zx6;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f326050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f326051b;

    public j(TextLocalisedClause buttonLabel, boolean z) {
        Intrinsics.checkNotNullParameter(buttonLabel, "buttonLabel");
        this.f326050a = buttonLabel;
        this.f326051b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f326050a.equals(jVar.f326050a) && this.f326051b == jVar.f326051b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f326051b) + (this.f326050a.hashCode() * 31);
    }
}
