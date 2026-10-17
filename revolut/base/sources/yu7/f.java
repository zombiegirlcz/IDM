package yu7;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f316899a;

    public f(Data cards) {
        Intrinsics.checkNotNullParameter(cards, "cards");
        this.f316899a = cards;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f316899a, ((f) obj2).f316899a);
    }

    public final int hashCode() {
        return this.f316899a.hashCode();
    }
}
