package x6b;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f303055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f303056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f303057c;

    public c(TextLocalisedClause primaryActionButtonText, TextLocalisedClause textLocalisedClause, boolean z) {
        Intrinsics.checkNotNullParameter(primaryActionButtonText, "primaryActionButtonText");
        this.f303055a = primaryActionButtonText;
        this.f303056b = z;
        this.f303057c = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f303055a.equals(cVar.f303055a) && this.f303056b == cVar.f303056b && Intrinsics.f(this.f303057c, cVar.f303057c);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f303055a.hashCode() * 31, 31, this.f303056b);
        Clause clause = this.f303057c;
        return iC + (clause == null ? 0 : clause.hashCode());
    }
}
