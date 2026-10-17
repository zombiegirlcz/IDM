package n68;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f212719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f212720b;

    public j(TextLocalisedClause label, boolean z) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f212719a = label;
        this.f212720b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f212719a.equals(jVar.f212719a) && this.f212720b == jVar.f212720b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f212720b) + (this.f212719a.hashCode() * 31);
    }
}
