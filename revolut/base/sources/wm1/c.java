package wm1;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f298590a;

    public c(Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f298590a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f298590a, ((c) obj2).f298590a);
    }

    public final int hashCode() {
        return this.f298590a.hashCode();
    }
}
