package ibg;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f160167a;

    public d() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f160167a, ((d) obj2).f160167a);
    }

    public final int hashCode() {
        return this.f160167a.hashCode();
    }

    public d(Data hotelsProperty) {
        Intrinsics.checkNotNullParameter(hotelsProperty, "hotelsProperty");
        this.f160167a = hotelsProperty;
    }

    public /* synthetic */ d(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
