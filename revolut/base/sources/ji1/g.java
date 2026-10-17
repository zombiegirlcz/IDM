package ji1;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends com.revolut.feature.address.common.impl.flow.screen.find.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f174326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f174327b;

    public g(Data result, String str) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f174326a = result;
        this.f174327b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f174326a, gVar.f174326a) && Intrinsics.f(this.f174327b, gVar.f174327b);
    }

    public final int hashCode() {
        int iHashCode = this.f174326a.hashCode() * 31;
        String str = this.f174327b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
