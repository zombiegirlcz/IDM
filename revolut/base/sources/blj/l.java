package blj;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class l {

    @NotNull
    public static final k Companion = new k();
    public static final l d = new l(null, new TextLocalisedClause(R.string.common_action_confirm, null, null, 14), false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f16714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f16715c;

    public l(Clause clause, TextLocalisedClause buttonTitle, boolean z) {
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        this.f16713a = z;
        this.f16714b = buttonTitle;
        this.f16715c = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f16713a == lVar.f16713a && this.f16714b.equals(lVar.f16714b) && Intrinsics.f(this.f16715c, lVar.f16715c);
    }

    public final int hashCode() {
        int iA = t61.a.a(Boolean.hashCode(this.f16713a) * 31, 31, this.f16714b);
        Clause clause = this.f16715c;
        return iA + (clause == null ? 0 : clause.hashCode());
    }
}
