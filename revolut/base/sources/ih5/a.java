package ih5;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f161293a;

    public a() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f161293a, ((a) obj2).f161293a);
    }

    public final int hashCode() {
        return this.f161293a.hashCode();
    }

    public a(Data breakdown) {
        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
        this.f161293a = breakdown;
    }

    public /* synthetic */ a(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
