package dt2;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f117347a;

    public e(Data campaignState) {
        Intrinsics.checkNotNullParameter(campaignState, "campaignState");
        this.f117347a = campaignState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f117347a, ((e) obj2).f117347a);
    }

    public final int hashCode() {
        return this.f117347a.hashCode();
    }
}
