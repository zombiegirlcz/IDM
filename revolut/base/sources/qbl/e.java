package qbl;

import com.revolut.shared.feature.user_declarations.api.navigation.DateOfBirthControllerDescriptor$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateOfBirthControllerDescriptor$InputData f244376a;

    public e(DateOfBirthControllerDescriptor$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f244376a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f244376a, ((e) obj2).f244376a);
    }

    public final int hashCode() {
        return this.f244376a.hashCode();
    }
}
