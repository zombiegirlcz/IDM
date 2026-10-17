package uk2;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f280641a;

    public a(Data listAtms) {
        Intrinsics.checkNotNullParameter(listAtms, "listAtms");
        this.f280641a = listAtms;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f280641a, ((a) obj2).f280641a);
    }

    public final int hashCode() {
        return this.f280641a.hashCode();
    }

    public a() {
        this(new Data(null, null, true, 3, null));
    }
}
