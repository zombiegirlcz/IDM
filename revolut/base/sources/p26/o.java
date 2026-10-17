package p26;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f232098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f232099b;

    public o(Data headerData, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerData, "headerData");
        this.f232098a = items;
        this.f232099b = headerData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f232098a, oVar.f232098a) && Intrinsics.f(this.f232099b, oVar.f232099b);
    }

    public final int hashCode() {
        return this.f232099b.hashCode() + (this.f232098a.hashCode() * 31);
    }
}
