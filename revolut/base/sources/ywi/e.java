package ywi;

import com.revolut.data.model.Data;
import jki.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f317445a;

    public e(Data amenitiesData) {
        Intrinsics.checkNotNullParameter(amenitiesData, "amenitiesData");
        this.f317445a = amenitiesData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f317445a, ((e) obj2).f317445a);
    }

    public final int hashCode() {
        return this.f317445a.hashCode();
    }

    public e() {
        this(new Data(null, null, true, 3, null));
    }
}
