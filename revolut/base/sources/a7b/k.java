package a7b;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f1820a;

    public k(Data planAdditionalValueData) {
        Intrinsics.checkNotNullParameter(planAdditionalValueData, "planAdditionalValueData");
        this.f1820a = planAdditionalValueData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f1820a, ((k) obj2).f1820a);
    }

    public final int hashCode() {
        return this.f1820a.hashCode();
    }
}
