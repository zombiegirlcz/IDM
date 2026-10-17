package zq;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.biometric_verification.impl.data.db.BiometricVerificationDatabase;
import z8g.i;
import znd.u0;

/* JADX INFO: loaded from: classes17.dex */
public final class e extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f324343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f324344b = new i(10);

    public e(BiometricVerificationDatabase biometricVerificationDatabase) {
        this.f324343a = biometricVerificationDatabase;
    }

    @Override // zq.c
    public final Object a(b bVar) {
        return DBUtil.performSuspending(this.f324343a, false, true, new u0(17), bVar);
    }

    @Override // zq.c
    public final Object b(lo.c cVar) {
        return DBUtil.performSuspending(this.f324343a, true, false, new u0(16), cVar);
    }

    @Override // zq.c
    public final Object c(ar.b bVar, ll6.i iVar) {
        return DBUtil.performInTransactionSuspending(this.f324343a, new d(this, bVar, 0), iVar);
    }

    @Override // zq.c
    public final Object e(ar.b bVar, b bVar2) {
        bVar.getClass();
        return DBUtil.performSuspending(this.f324343a, false, true, new d(this, bVar, 1), bVar2);
    }
}
