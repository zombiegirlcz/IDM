package njj;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class a0 {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a0 f216537c = new a0(null, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f216538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f216539b;

    public a0(TextLocalisedClause textLocalisedClause, boolean z) {
        this.f216538a = textLocalisedClause;
        this.f216539b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f216538a, a0Var.f216538a) && this.f216539b == a0Var.f216539b;
    }

    public final int hashCode() {
        Clause clause = this.f216538a;
        return Boolean.hashCode(this.f216539b) + ((clause == null ? 0 : clause.hashCode()) * 31);
    }
}
