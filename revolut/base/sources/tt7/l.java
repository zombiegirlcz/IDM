package tt7;

import com.revolut.feature.insurance_credit.impl.data.model.action.Prompt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends com.revolut.feature.insurance_credit.impl.ui.screen.details.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Prompt f274250a;

    public l(Prompt prompt) {
        Intrinsics.checkNotNullParameter(prompt, "prompt");
        this.f274250a = prompt;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f274250a, ((l) obj2).f274250a);
    }

    public final int hashCode() {
        return this.f274250a.hashCode();
    }
}
