package wok;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f298940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f298941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f298942c;
    public final String d;

    public e(Data invite, Data entry, String str, boolean z) {
        Intrinsics.checkNotNullParameter(invite, "invite");
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.f298940a = invite;
        this.f298941b = entry;
        this.f298942c = z;
        this.d = str;
    }

    public static e a(e eVar, Data invite, Data entry, int i) {
        if ((i & 1) != 0) {
            invite = eVar.f298940a;
        }
        if ((i & 2) != 0) {
            entry = eVar.f298941b;
        }
        boolean z = (i & 4) != 0 ? eVar.f298942c : true;
        String str = (i & 8) != 0 ? eVar.d : null;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(invite, "invite");
        Intrinsics.checkNotNullParameter(entry, "entry");
        return new e(invite, entry, str, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f298940a, eVar.f298940a) && Intrinsics.f(this.f298941b, eVar.f298941b) && this.f298942c == eVar.f298942c && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(kii.e.c(this.f298941b, this.f298940a.hashCode() * 31, 31), 31, this.f298942c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
