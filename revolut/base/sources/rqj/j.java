package rqj;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.retail.feature.impl.budget.database.BudgetHistoryDatabase;
import java.util.ArrayList;
import java.util.List;
import w2a.q;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f256566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ay1.f f256567b = new ay1.f(this, 20);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public sqj.a f256568c;

    public j(BudgetHistoryDatabase budgetHistoryDatabase) {
        this.f256566a = budgetHistoryDatabase;
    }

    @Override // rqj.h
    public final Object a(String str, long j2, long j3, g gVar) {
        return DBUtil.performSuspending(this.f256566a, false, true, new i(str, j3, j2), gVar);
    }

    @Override // rqj.h
    public final Object b(String str, long j2, long j3, wih.c cVar) {
        return DBUtil.performSuspending(this.f256566a, true, false, new e1.c(this, str, j3, j2), cVar);
    }

    @Override // rqj.h
    public final Object c(List list, g gVar) {
        list.getClass();
        return DBUtil.performSuspending(this.f256566a, false, true, new rgf.m(this, list, 26), gVar);
    }

    @Override // rqj.h
    public final Object d(String str, long j2, long j3, ArrayList arrayList, q qVar) {
        return DBUtil.performInTransactionSuspending(this.f256566a, new g5d.e(this, str, j2, j3, arrayList), qVar);
    }

    public final synchronized sqj.a f() {
        try {
            if (this.f256568c == null) {
                this.f256568c = (sqj.a) this.f256566a.getTypeConverter(sqj.a.class);
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return this.f256568c;
    }
}
