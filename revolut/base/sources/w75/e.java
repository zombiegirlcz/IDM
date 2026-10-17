package w75;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f295469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f295470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f295471c;
    public final String d;

    public e(String loanId, List borrowers, Data backupCard, String str) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        Intrinsics.checkNotNullParameter(borrowers, "borrowers");
        Intrinsics.checkNotNullParameter(backupCard, "backupCard");
        this.f295469a = loanId;
        this.f295470b = borrowers;
        this.f295471c = backupCard;
        this.d = str;
    }

    public static e a(e eVar, List borrowers, Data backupCard, String str, int i) {
        String loanId = eVar.f295469a;
        if ((i & 2) != 0) {
            borrowers = eVar.f295470b;
        }
        if ((i & 4) != 0) {
            backupCard = eVar.f295471c;
        }
        if ((i & 8) != 0) {
            str = eVar.d;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        Intrinsics.checkNotNullParameter(borrowers, "borrowers");
        Intrinsics.checkNotNullParameter(backupCard, "backupCard");
        return new e(loanId, borrowers, backupCard, str);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f295469a, eVar.f295469a) && Intrinsics.f(this.f295470b, eVar.f295470b) && Intrinsics.f(this.f295471c, eVar.f295471c) && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f295471c, p.a.d(this.f295469a.hashCode() * 31, 31, this.f295470b), 31);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
