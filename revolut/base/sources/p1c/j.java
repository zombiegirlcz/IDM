package p1c;

import com.revolut.kompot.common.IOData$EmptyInput;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IOData$EmptyInput f231894a;

    public j() {
        IOData$EmptyInput inputData = IOData$EmptyInput.f98299a;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f231894a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f231894a, ((j) obj2).f231894a);
    }

    public final int hashCode() {
        return this.f231894a.hashCode();
    }
}
