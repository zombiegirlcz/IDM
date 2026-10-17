package nj1;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f216322c = new b(null, true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f216323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f216324b;

    public b(TextLocalisedClause textLocalisedClause, boolean z) {
        this.f216323a = z;
        this.f216324b = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f216323a == bVar.f216323a && Intrinsics.f(this.f216324b, bVar.f216324b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f216323a) * 31;
        Clause clause = this.f216324b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
