package tv4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f274698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f274699b;

    public e(Data content, Data upcomingPayments) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(upcomingPayments, "upcomingPayments");
        this.f274698a = content;
        this.f274699b = upcomingPayments;
    }

    public static e a(e eVar, Data content, Data upcomingPayments, int i) {
        if ((i & 1) != 0) {
            content = eVar.f274698a;
        }
        if ((i & 2) != 0) {
            upcomingPayments = eVar.f274699b;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(upcomingPayments, "upcomingPayments");
        return new e(content, upcomingPayments);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f274698a, eVar.f274698a) && Intrinsics.f(this.f274699b, eVar.f274699b);
    }

    public final int hashCode() {
        return this.f274699b.hashCode() + (this.f274698a.hashCode() * 31);
    }
}
