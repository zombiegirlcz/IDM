package qbl;

import com.revolut.shared.feature.user_declarations.api.navigation.NameControllerDescriptor$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NameControllerDescriptor$InputData f244377a;

    public f(NameControllerDescriptor$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f244377a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f244377a, ((f) obj2).f244377a);
    }

    public final int hashCode() {
        return this.f244377a.hashCode();
    }
}
