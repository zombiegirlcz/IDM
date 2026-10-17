package yv7;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f317128a;

    public f() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f317128a, ((f) obj2).f317128a);
    }

    public final int hashCode() {
        return this.f317128a.hashCode();
    }

    public f(Data insuranceDetails) {
        Intrinsics.checkNotNullParameter(insuranceDetails, "insuranceDetails");
        this.f317128a = insuranceDetails;
    }

    public /* synthetic */ f(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
