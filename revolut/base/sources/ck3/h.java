package ck3;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f24760a;

    public h(Data disclaimerData) {
        Intrinsics.checkNotNullParameter(disclaimerData, "disclaimerData");
        this.f24760a = disclaimerData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f24760a, ((h) obj2).f24760a);
    }

    public final int hashCode() {
        return this.f24760a.hashCode();
    }
}
