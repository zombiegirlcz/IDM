package zgj;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class q {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f322171c = new q(null, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f322172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f322173b;

    public q(TextLocalisedClause textLocalisedClause, boolean z) {
        this.f322172a = textLocalisedClause;
        this.f322173b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f322172a, qVar.f322172a) && this.f322173b == qVar.f322173b;
    }

    public final int hashCode() {
        Clause clause = this.f322172a;
        return Boolean.hashCode(this.f322173b) + ((clause == null ? 0 : clause.hashCode()) * 31);
    }
}
