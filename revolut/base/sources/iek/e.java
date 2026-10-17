package iek;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f160753a;

    public e(Data podNomineeData) {
        Intrinsics.checkNotNullParameter(podNomineeData, "podNomineeData");
        this.f160753a = podNomineeData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f160753a, ((e) obj2).f160753a);
    }

    public final int hashCode() {
        return this.f160753a.hashCode();
    }
}
