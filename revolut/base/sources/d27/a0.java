package d27;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f110730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f110731b;

    public a0(TextLocalisedClause buttonTitle, boolean z) {
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        this.f110730a = buttonTitle;
        this.f110731b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return this.f110730a.equals(a0Var.f110730a) && this.f110731b == a0Var.f110731b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f110731b) + (this.f110730a.hashCode() * 31);
    }
}
