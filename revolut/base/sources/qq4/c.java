package qq4;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f248484a;

    public c(Data cardsData) {
        Intrinsics.checkNotNullParameter(cardsData, "cardsData");
        this.f248484a = cardsData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f248484a, ((c) obj2).f248484a);
    }

    public final int hashCode() {
        return this.f248484a.hashCode();
    }
}
