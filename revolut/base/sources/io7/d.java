package io7;

import cli.j;
import com.revolut.feature.insurance_car.impl.data.model.AdditionalDriver;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdditionalDriver f163196a;

    public d(AdditionalDriver driver) {
        Intrinsics.checkNotNullParameter(driver, "driver");
        this.f163196a = driver;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f163196a, ((d) obj2).f163196a);
    }

    public final int hashCode() {
        return this.f163196a.hashCode() * 31;
    }
}
