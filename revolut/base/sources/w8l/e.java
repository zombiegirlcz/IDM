package w8l;

import com.revolut.data.model.Data;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f295653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f295654b;

    public e(Data screenData, Set expandedMoreInfoIds) {
        Intrinsics.checkNotNullParameter(screenData, "screenData");
        Intrinsics.checkNotNullParameter(expandedMoreInfoIds, "expandedMoreInfoIds");
        this.f295653a = screenData;
        this.f295654b = expandedMoreInfoIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f295653a, eVar.f295653a) && Intrinsics.f(this.f295654b, eVar.f295654b);
    }

    public final int hashCode() {
        return this.f295654b.hashCode() + (this.f295653a.hashCode() * 31);
    }
}
