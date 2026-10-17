package pb2;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f234606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tb2.a f234607b;

    public h() {
        this(0);
    }

    public static h a(h hVar, Data pendingAction, tb2.a aVar, int i) {
        if ((i & 1) != 0) {
            pendingAction = hVar.f234606a;
        }
        if ((i & 2) != 0) {
            aVar = hVar.f234607b;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(pendingAction, "pendingAction");
        return new h(pendingAction, aVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f234606a, hVar.f234606a) && Intrinsics.f(this.f234607b, hVar.f234607b);
    }

    public final int hashCode() {
        int iHashCode = this.f234606a.hashCode() * 31;
        tb2.a aVar = this.f234607b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public h(Data pendingAction, tb2.a aVar) {
        Intrinsics.checkNotNullParameter(pendingAction, "pendingAction");
        this.f234606a = pendingAction;
        this.f234607b = aVar;
    }

    public /* synthetic */ h(int i) {
        this(new Data(null, null, true, 3, null), null);
    }
}
