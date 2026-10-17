package ip0;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class oj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f165673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f165674b;

    public oj(TextLocalisedClause label, dj0.d value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f165673a = value;
        this.f165674b = label;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof oj)) {
            return false;
        }
        oj ojVar = (oj) obj2;
        return Intrinsics.f(this.f165673a, ojVar.f165673a) && this.f165674b.equals(ojVar.f165674b);
    }

    public final int hashCode() {
        return this.f165674b.hashCode() + (this.f165673a.hashCode() * 31);
    }
}
