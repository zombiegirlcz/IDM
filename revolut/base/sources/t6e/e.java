package t6e;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes8.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f268314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f268315b;

    public e(dj0.d money, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(dateTime, "dateTime");
        Intrinsics.checkNotNullParameter(money, "money");
        this.f268314a = dateTime;
        this.f268315b = money;
    }

    public static e a(e eVar, dj0.d money) {
        DateTime dateTime = eVar.f268314a;
        Intrinsics.checkNotNullParameter(dateTime, "dateTime");
        Intrinsics.checkNotNullParameter(money, "money");
        return new e(money, dateTime);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f268314a, eVar.f268314a) && Intrinsics.f(this.f268315b, eVar.f268315b);
    }

    public final int hashCode() {
        return this.f268315b.hashCode() + (this.f268314a.hashCode() * 31);
    }
}
