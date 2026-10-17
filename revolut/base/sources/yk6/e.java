package yk6;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f314580a;

    public e(Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f314580a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f314580a, ((e) obj2).f314580a);
    }

    public final int hashCode() {
        return this.f314580a.hashCode();
    }
}
