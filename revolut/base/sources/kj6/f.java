package kj6;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f184308a;

    public f(Data consentsGroupData) {
        Intrinsics.checkNotNullParameter(consentsGroupData, "consentsGroupData");
        this.f184308a = consentsGroupData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f184308a, ((f) obj2).f184308a);
    }

    public final int hashCode() {
        return this.f184308a.hashCode();
    }
}
