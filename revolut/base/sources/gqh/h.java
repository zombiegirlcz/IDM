package gqh;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f145735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f145736b;

    public h(TextLocalisedClause label, boolean z) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f145735a = label;
        this.f145736b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f145735a.equals(hVar.f145735a) && this.f145736b == hVar.f145736b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f145736b) + (this.f145735a.hashCode() * 31);
    }
}
