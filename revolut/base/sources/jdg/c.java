package jdg;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f173066a;

    public c() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f173066a, ((c) obj2).f173066a);
    }

    public final int hashCode() {
        return this.f173066a.hashCode();
    }

    public c(Data property) {
        Intrinsics.checkNotNullParameter(property, "property");
        this.f173066a = property;
    }

    public /* synthetic */ c(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
