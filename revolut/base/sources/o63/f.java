package o63;

import com.revolut.feature.card_screen.api.navigation.descriptors.NamelessCardDialogDescriptor$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NamelessCardDialogDescriptor$InputData f222495a;

    public f(NamelessCardDialogDescriptor$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f222495a = inputData;
    }

    public final NamelessCardDialogDescriptor$InputData b() {
        return this.f222495a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f222495a, ((f) obj2).f222495a);
    }

    public final int hashCode() {
        return this.f222495a.f65369a.hashCode();
    }
}
