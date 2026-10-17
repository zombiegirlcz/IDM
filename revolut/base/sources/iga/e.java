package iga;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f161101a;

    public e(Data benefitsLayout) {
        Intrinsics.checkNotNullParameter(benefitsLayout, "benefitsLayout");
        this.f161101a = benefitsLayout;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f161101a, ((e) obj2).f161101a);
    }

    public final int hashCode() {
        return this.f161101a.hashCode();
    }
}
