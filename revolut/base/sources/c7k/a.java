package c7k;

import com.revolut.domain.models.moneyrequest.MoneyRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyRequest f22045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f22047c;

    public a(MoneyRequest moneyRequest, String note, boolean z) {
        Intrinsics.checkNotNullParameter(moneyRequest, "moneyRequest");
        Intrinsics.checkNotNullParameter(note, "note");
        this.f22045a = moneyRequest;
        this.f22046b = note;
        this.f22047c = z;
    }

    public static a a(a aVar, String note, boolean z, int i) {
        MoneyRequest moneyRequest = aVar.f22045a;
        if ((i & 4) != 0) {
            z = aVar.f22047c;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(moneyRequest, "moneyRequest");
        Intrinsics.checkNotNullParameter(note, "note");
        return new a(moneyRequest, note, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f22045a, aVar.f22045a) && Intrinsics.f(this.f22046b, aVar.f22046b) && this.f22047c == aVar.f22047c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f22047c) + p.a.c(this.f22045a.hashCode() * 31, 31, this.f22046b);
    }
}
