package u95;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f278390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f278391b;

    public h() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f278390a, hVar.f278390a) && Intrinsics.f(this.f278391b, hVar.f278391b);
    }

    public final int hashCode() {
        return this.f278391b.hashCode() + (this.f278390a.hashCode() * 31);
    }

    public h(Data overdraftDetails, Data agreements) {
        Intrinsics.checkNotNullParameter(overdraftDetails, "overdraftDetails");
        Intrinsics.checkNotNullParameter(agreements, "agreements");
        this.f278390a = overdraftDetails;
        this.f278391b = agreements;
    }

    public /* synthetic */ h(int i) {
        this(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
    }
}
