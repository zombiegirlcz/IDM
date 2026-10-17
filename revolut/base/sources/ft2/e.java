package ft2;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f137784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f137785b;

    public e(Data invitee, boolean z) {
        Intrinsics.checkNotNullParameter(invitee, "invitee");
        this.f137784a = invitee;
        this.f137785b = z;
    }

    public static e a(e eVar, Data invitee, int i) {
        if ((i & 1) != 0) {
            invitee = eVar.f137784a;
        }
        boolean z = (i & 2) != 0 ? eVar.f137785b : true;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(invitee, "invitee");
        return new e(invitee, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f137784a, eVar.f137784a) && this.f137785b == eVar.f137785b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f137785b) + (this.f137784a.hashCode() * 31);
    }
}
