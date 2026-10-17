package k37;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f180634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f180635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f180636c;

    public m(TextLocalisedClause buttonLabel, TextLocalisedClause textLocalisedClause, boolean z) {
        Intrinsics.checkNotNullParameter(buttonLabel, "buttonLabel");
        this.f180634a = buttonLabel;
        this.f180635b = z;
        this.f180636c = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f180634a.equals(mVar.f180634a) && this.f180635b == mVar.f180635b && Intrinsics.f(this.f180636c, mVar.f180636c);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f180634a.hashCode() * 31, 31, this.f180635b);
        Clause clause = this.f180636c;
        return iC + (clause == null ? 0 : clause.hashCode());
    }
}
