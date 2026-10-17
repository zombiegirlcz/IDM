package sw6;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f266115a;

    public e() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f266115a, ((e) obj2).f266115a);
    }

    public final int hashCode() {
        return this.f266115a.hashCode();
    }

    public e(Data pluginDetails) {
        Intrinsics.checkNotNullParameter(pluginDetails, "pluginDetails");
        this.f266115a = pluginDetails;
    }

    public /* synthetic */ e(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
