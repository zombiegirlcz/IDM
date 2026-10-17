package kzb;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f191088a;

    public f() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f191088a, ((f) obj2).f191088a);
    }

    public final int hashCode() {
        return this.f191088a.hashCode();
    }

    public f(Data earnOptionsBottomSheet) {
        Intrinsics.checkNotNullParameter(earnOptionsBottomSheet, "earnOptionsBottomSheet");
        this.f191088a = earnOptionsBottomSheet;
    }

    public /* synthetic */ f(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
