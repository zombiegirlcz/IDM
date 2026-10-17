package tx1;

import androidx.room.RoomDatabase;
import androidx.room.RxRoom;
import androidx.room.util.DBUtil;
import com.revolut.feature.apm.core.contacts.database.ApmContactsDatabase;
import dcl.g0;
import efm.d0;
import efm.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes20.dex */
public final class i extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f275312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ay1.f f275313b = new ay1.f(this, 23);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0 f275314c = new g0(18);

    public i(ApmContactsDatabase apmContactsDatabase) {
        this.f275312a = apmContactsDatabase;
    }

    public static /* synthetic */ Unit k(i iVar, ArrayList arrayList) {
        super.j(arrayList);
        return Unit.f186387a;
    }

    public static wx1.c l(String str) {
        str.getClass();
        switch (str) {
            case "DELETED":
                return wx1.c.DELETED;
            case "NOT_REGISTERED":
                return wx1.c.NOT_REGISTERED;
            case "ACTIVE":
                return wx1.c.ACTIVE;
            default:
                throw new IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(str));
        }
    }

    public static void m() {
        List list = Collections.EMPTY_LIST;
    }

    @Override // tx1.a
    public final void a() {
        DBUtil.performBlocking(this.f275312a, false, true, new tx.f(5));
    }

    @Override // tx1.a
    public final Object b(ArrayList arrayList, c cVar) {
        return DBUtil.performSuspending(this.f275312a, false, true, new e(this, arrayList, 2), cVar);
    }

    @Override // tx1.a
    public final efm.k c(String str) {
        return RxRoom.createMaybe(this.f275312a, true, false, new g(this, str, 1));
    }

    @Override // tx1.a
    public final d0 d(String str) {
        return RxRoom.createSingle(this.f275312a, true, false, new g(this, str, 0));
    }

    @Override // tx1.a
    public final Object e(c cVar) {
        return DBUtil.performSuspending(this.f275312a, true, false, new f(this, 0), cVar);
    }

    @Override // tx1.a
    public final efm.b f(ArrayList arrayList) {
        return RxRoom.createCompletable(this.f275312a, false, true, new e(this, arrayList, 3));
    }

    @Override // tx1.a
    public final void g(ArrayList arrayList) {
        DBUtil.performBlocking(this.f275312a, false, true, new e(this, arrayList, 1));
    }

    @Override // tx1.a
    public final r h(String str) {
        g gVar = new g(this, str, 2);
        return RxRoom.createObservable(this.f275312a, false, new String[]{"bizum_contacts"}, gVar);
    }

    @Override // tx1.a
    public final r i() {
        f fVar = new f(this, 1);
        return RxRoom.createObservable(this.f275312a, false, new String[]{"bizum_contacts"}, fVar);
    }

    @Override // tx1.a
    public final void j(ArrayList arrayList) {
        DBUtil.performBlocking(this.f275312a, false, true, new e(this, arrayList, 0));
    }
}
