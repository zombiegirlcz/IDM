package j17;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f170127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f170128b;

    public c(TextLocalisedClause label, boolean z) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f170127a = label;
        this.f170128b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f170127a.equals(cVar.f170127a) && this.f170128b == cVar.f170128b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f170128b) + (this.f170127a.hashCode() * 31);
    }
}
