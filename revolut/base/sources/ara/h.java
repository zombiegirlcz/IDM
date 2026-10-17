package ara;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f8599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f8600b;

    public h(TextLocalisedClause title, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f8599a = title;
        this.f8600b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f8599a.equals(hVar.f8599a) && this.f8600b == hVar.f8600b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f8600b) + (this.f8599a.hashCode() * 31);
    }
}
