package jnb;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f176668a;

    public b(Data contentData) {
        Intrinsics.checkNotNullParameter(contentData, "contentData");
        this.f176668a = contentData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f176668a, ((b) obj2).f176668a);
    }

    public final int hashCode() {
        return this.f176668a.hashCode();
    }
}
