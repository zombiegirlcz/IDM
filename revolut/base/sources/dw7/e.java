package dw7;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f120338a;

    public e(Data cards) {
        Intrinsics.checkNotNullParameter(cards, "cards");
        this.f120338a = cards;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f120338a, ((e) obj2).f120338a);
    }

    public final int hashCode() {
        return this.f120338a.hashCode();
    }
}
