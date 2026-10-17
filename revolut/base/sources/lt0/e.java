package lt0;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f199735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f199736b;

    public e(TextLocalisedClause label, dj0.d value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f199735a = value;
        this.f199736b = label;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f199735a, eVar.f199735a) && this.f199736b.equals(eVar.f199736b);
    }

    public final int hashCode() {
        return this.f199736b.hashCode() + (this.f199735a.hashCode() * 31);
    }
}
