package e77;

import com.revolut.feature.giro.impl.ui.form.domain.FormState;
import com.revolut.feature.giro.impl.ui.review.domain.SelectedPocket;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FormState f123092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SelectedPocket f123093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f123094c;

    public f(FormState formState, SelectedPocket selectedPocket, boolean z) {
        Intrinsics.checkNotNullParameter(formState, "formState");
        Intrinsics.checkNotNullParameter(selectedPocket, "selectedPocket");
        this.f123092a = formState;
        this.f123093b = selectedPocket;
        this.f123094c = z;
    }

    public static f a(f fVar, SelectedPocket selectedPocket, boolean z, int i) {
        FormState formState = fVar.f123092a;
        if ((i & 2) != 0) {
            selectedPocket = fVar.f123093b;
        }
        if ((i & 4) != 0) {
            z = fVar.f123094c;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(formState, "formState");
        Intrinsics.checkNotNullParameter(selectedPocket, "selectedPocket");
        return new f(formState, selectedPocket, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f123092a, fVar.f123092a) && Intrinsics.f(this.f123093b, fVar.f123093b) && this.f123094c == fVar.f123094c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f123094c) + ((this.f123093b.hashCode() + (this.f123092a.hashCode() * 31)) * 31);
    }
}
