package dzd;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f121314a;

    public a(Data years) {
        Intrinsics.checkNotNullParameter(years, "years");
        this.f121314a = years;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f121314a, ((a) obj2).f121314a);
    }

    public final int hashCode() {
        return this.f121314a.hashCode();
    }
}
