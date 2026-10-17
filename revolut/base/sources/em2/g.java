package em2;

import aii.r;
import com.revolut.feature.backgroundpicker.api.model.ChosenBackground;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChosenBackground f127587a;

    public g(ChosenBackground chosenBackground) {
        Intrinsics.checkNotNullParameter(chosenBackground, "chosenBackground");
        this.f127587a = chosenBackground;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f127587a, ((g) obj2).f127587a);
    }

    public final int hashCode() {
        return this.f127587a.hashCode();
    }
}
