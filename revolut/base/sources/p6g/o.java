package p6g;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class o extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f233293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f233294b;

    public o(Clause optionLabel, String optionId) {
        Intrinsics.checkNotNullParameter(optionId, "optionId");
        Intrinsics.checkNotNullParameter(optionLabel, "optionLabel");
        this.f233293a = optionId;
        this.f233294b = optionLabel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f233293a, oVar.f233293a) && Intrinsics.f(this.f233294b, oVar.f233294b);
    }

    public final int hashCode() {
        return this.f233294b.hashCode() + (this.f233293a.hashCode() * 31);
    }
}
