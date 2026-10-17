package n85;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f213208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f213209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f213210c;
    public final String d;

    public f(Data loan, Data repayments, Data user, String str) {
        Intrinsics.checkNotNullParameter(loan, "loan");
        Intrinsics.checkNotNullParameter(repayments, "repayments");
        Intrinsics.checkNotNullParameter(user, "user");
        this.f213208a = loan;
        this.f213209b = repayments;
        this.f213210c = user;
        this.d = str;
    }

    public static f a(f fVar, Data loan, Data repayments, Data user, String str, int i) {
        if ((i & 1) != 0) {
            loan = fVar.f213208a;
        }
        if ((i & 2) != 0) {
            repayments = fVar.f213209b;
        }
        if ((i & 4) != 0) {
            user = fVar.f213210c;
        }
        if ((i & 8) != 0) {
            str = fVar.d;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(loan, "loan");
        Intrinsics.checkNotNullParameter(repayments, "repayments");
        Intrinsics.checkNotNullParameter(user, "user");
        return new f(loan, repayments, user, str);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f213208a, fVar.f213208a) && Intrinsics.f(this.f213209b, fVar.f213209b) && Intrinsics.f(this.f213210c, fVar.f213210c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f213210c, kii.e.c(this.f213209b, this.f213208a.hashCode() * 31, 31), 31);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
