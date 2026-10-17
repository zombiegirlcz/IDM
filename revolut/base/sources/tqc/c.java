package tqc;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f273548a;

    public c() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f273548a, ((c) obj2).f273548a);
    }

    public final int hashCode() {
        return this.f273548a.hashCode();
    }

    public c(Data disputeData) {
        Intrinsics.checkNotNullParameter(disputeData, "disputeData");
        this.f273548a = disputeData;
    }

    public /* synthetic */ c(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
