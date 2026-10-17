package ji1;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends com.revolut.feature.address.common.impl.flow.screen.find.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f174328a;

    public h(Data result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f174328a = result;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f174328a, ((h) obj2).f174328a);
    }

    public final int hashCode() {
        return this.f174328a.hashCode();
    }
}
