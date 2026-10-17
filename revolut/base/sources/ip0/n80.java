package ip0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class n80 extends p80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f165472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80 f165473b;

    public n80(Clause label, l80 emoji) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(emoji, "emoji");
        this.f165472a = label;
        this.f165473b = emoji;
    }

    @Override // ip0.p80
    public final l80 a() {
        return this.f165473b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n80)) {
            return false;
        }
        n80 n80Var = (n80) obj2;
        return Intrinsics.f(this.f165472a, n80Var.f165472a) && Intrinsics.f(this.f165473b, n80Var.f165473b);
    }

    public final int hashCode() {
        return this.f165473b.hashCode() + (this.f165472a.hashCode() * 31);
    }
}
