package b77;

import aii.r;
import com.revolut.feature.giro.impl.ui.form.domain.FormState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FormState f12925a;

    public i(FormState formState) {
        Intrinsics.checkNotNullParameter(formState, "formState");
        this.f12925a = formState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f12925a, ((i) obj2).f12925a);
    }

    public final int hashCode() {
        return this.f12925a.hashCode();
    }
}
