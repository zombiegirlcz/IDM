package yc9;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f312570a;

    public d(Data cardData) {
        Intrinsics.checkNotNullParameter(cardData, "cardData");
        this.f312570a = cardData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f312570a, ((d) obj2).f312570a);
    }

    public final int hashCode() {
        return this.f312570a.hashCode();
    }
}
