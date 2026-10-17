package c2f;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f20769a;

    public d() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f20769a, ((d) obj2).f20769a);
    }

    public final int hashCode() {
        return this.f20769a.hashCode();
    }

    public d(Data agentDetails) {
        Intrinsics.checkNotNullParameter(agentDetails, "agentDetails");
        this.f20769a = agentDetails;
    }

    public /* synthetic */ d(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
