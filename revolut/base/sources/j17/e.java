package j17;

import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f170130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f170131b;

    public e(TextClause title, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f170130a = title;
        this.f170131b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f170130a.equals(eVar.f170130a) && this.f170131b == eVar.f170131b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f170131b) + (this.f170130a.hashCode() * 31);
    }
}
