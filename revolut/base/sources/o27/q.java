package o27;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f221523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f221524b;

    public q(TextLocalisedClause buttonLabel, boolean z) {
        Intrinsics.checkNotNullParameter(buttonLabel, "buttonLabel");
        this.f221523a = buttonLabel;
        this.f221524b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f221523a.equals(qVar.f221523a) && this.f221524b == qVar.f221524b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f221524b) + (this.f221523a.hashCode() * 31);
    }
}
