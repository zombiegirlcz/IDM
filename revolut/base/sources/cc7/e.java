package cc7;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f22947a;

    public e(Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f22947a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f22947a, ((e) obj2).f22947a);
    }

    public final int hashCode() {
        return this.f22947a.hashCode();
    }
}
