package nj9;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f216414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f216415b;

    public d(TextLocalisedClause text, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f216414a = text;
        this.f216415b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f216414a.equals(dVar.f216414a) && this.f216415b == dVar.f216415b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f216415b) + (this.f216414a.hashCode() * 31);
    }
}
