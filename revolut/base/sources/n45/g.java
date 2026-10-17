package n45;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.feature.credit.loan.impl.database.LoanDatabase;
import is6.x;
import mll.h;
import o45.e2;

/* JADX INFO: loaded from: classes13.dex */
public final class g extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f212302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f212303b = new x(21);

    public g(LoanDatabase loanDatabase) {
        this.f212302a = loanDatabase;
    }

    @Override // n45.f
    public final e2 a(String str) {
        return (e2) DBUtil.performBlocking(this.f212302a, true, false, new h(str, 16));
    }

    @Override // n45.f
    public final void b(e2 e2Var) {
        DBUtil.performBlocking(this.f212302a, false, true, new b(this, e2Var, 4));
    }
}
