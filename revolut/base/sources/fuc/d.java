package fuc;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f138172a;

    public d() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f138172a, ((d) obj2).f138172a);
    }

    public final int hashCode() {
        return this.f138172a.hashCode();
    }

    public d(Data cards) {
        Intrinsics.checkNotNullParameter(cards, "cards");
        this.f138172a = cards;
    }

    public /* synthetic */ d(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
