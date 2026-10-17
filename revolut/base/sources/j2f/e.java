package j2f;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f170845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f170846b;

    public e() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f170845a, eVar.f170845a) && Intrinsics.f(this.f170846b, eVar.f170846b);
    }

    public final int hashCode() {
        return this.f170846b.hashCode() + (this.f170845a.hashCode() * 31);
    }

    public e(Data agentDetails, Data userVouchers) {
        Intrinsics.checkNotNullParameter(agentDetails, "agentDetails");
        Intrinsics.checkNotNullParameter(userVouchers, "userVouchers");
        this.f170845a = agentDetails;
        this.f170846b = userVouchers;
    }

    public /* synthetic */ e(int i) {
        this(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
    }
}
