package hz2;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f156996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f156997b;

    public k() {
        this((Data) null, 3);
    }

    public static k a(k kVar, Data terms, Data user, int i) {
        if ((i & 1) != 0) {
            terms = kVar.f156996a;
        }
        if ((i & 2) != 0) {
            user = kVar.f156997b;
        }
        kVar.getClass();
        Intrinsics.checkNotNullParameter(terms, "terms");
        Intrinsics.checkNotNullParameter(user, "user");
        return new k(terms, user);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f156996a, kVar.f156996a) && Intrinsics.f(this.f156997b, kVar.f156997b);
    }

    public final int hashCode() {
        return this.f156997b.hashCode() + (this.f156996a.hashCode() * 31);
    }

    public k(Data terms, Data user) {
        Intrinsics.checkNotNullParameter(terms, "terms");
        Intrinsics.checkNotNullParameter(user, "user");
        this.f156996a = terms;
        this.f156997b = user;
    }

    public /* synthetic */ k(Data data, int i) {
        this((i & 1) != 0 ? new Data(null, null, true, 3, null) : data, new Data(null, null, true, 3, null));
    }
}
