package dmj;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class z {

    @NotNull
    public static final y Companion = new y();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z f116188c = new z(null, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f116189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f116190b;

    public z(TextLocalisedClause textLocalisedClause, boolean z) {
        this.f116189a = textLocalisedClause;
        this.f116190b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f116189a, zVar.f116189a) && this.f116190b == zVar.f116190b;
    }

    public final int hashCode() {
        Clause clause = this.f116189a;
        return Boolean.hashCode(this.f116190b) + ((clause == null ? 0 : clause.hashCode()) * 31);
    }
}
