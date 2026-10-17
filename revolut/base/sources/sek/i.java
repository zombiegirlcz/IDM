package sek;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f262206a;

    public i(Data podNominees) {
        Intrinsics.checkNotNullParameter(podNominees, "podNominees");
        this.f262206a = podNominees;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f262206a, ((i) obj2).f262206a);
    }

    public final int hashCode() {
        return this.f262206a.hashCode();
    }
}
