package i79;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f159217a;

    public g(Data inboxItems) {
        Intrinsics.checkNotNullParameter(inboxItems, "inboxItems");
        this.f159217a = inboxItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f159217a, ((g) obj2).f159217a);
    }

    public final int hashCode() {
        return this.f159217a.hashCode();
    }
}
