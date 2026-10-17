package do2;

import com.revolut.feature.bank_account_switching.impl.ui.form.domain.FormData;
import com.revolut.feature.bank_account_switching.impl.ui.form.domain.FormState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FormState f116377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FormData f116378b;

    public h(FormState formState, FormData formData) {
        Intrinsics.checkNotNullParameter(formState, "formState");
        Intrinsics.checkNotNullParameter(formData, "formData");
        this.f116377a = formState;
        this.f116378b = formData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f116377a, hVar.f116377a) && Intrinsics.f(this.f116378b, hVar.f116378b);
    }

    public final int hashCode() {
        return this.f116378b.hashCode() + (this.f116377a.hashCode() * 31);
    }
}
