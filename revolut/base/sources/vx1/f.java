package vx1;

import androidx.room.RoomDatabase;
import androidx.room.RxRoom;
import androidx.room.util.DBUtil;
import com.revolut.feature.apm.core.contacts.database.ApmContactsDatabase;
import efm.d0;
import efm.k;
import efm.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import vq5.x;
import vw4.j;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f292796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ay1.f f292797b = new ay1.f(this, 25);

    public f(ApmContactsDatabase apmContactsDatabase) {
        this.f292796a = apmContactsDatabase;
    }

    public static /* synthetic */ Unit i(f fVar, ArrayList arrayList) {
        super.h(arrayList);
        return Unit.f186387a;
    }

    public static wx1.b j(String str) {
        str.getClass();
        if (str.equals("DELETED")) {
            return wx1.b.DELETED;
        }
        if (str.equals("ACTIVE")) {
            return wx1.b.ACTIVE;
        }
        throw new IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(str));
    }

    public static void k() {
        List list = Collections.EMPTY_LIST;
    }

    @Override // vx1.a
    public final void a() {
        DBUtil.performBlocking(this.f292796a, false, true, new j(4));
    }

    @Override // vx1.a
    public final k b(String str) {
        return RxRoom.createMaybe(this.f292796a, true, false, new d(this, str, 0));
    }

    @Override // vx1.a
    public final d0 c(String str) {
        return RxRoom.createSingle(this.f292796a, true, false, new d(this, str, 1));
    }

    @Override // vx1.a
    public final efm.b d(ArrayList arrayList) {
        return RxRoom.createCompletable(this.f292796a, false, true, new c(this, arrayList, 2));
    }

    @Override // vx1.a
    public final void e(ArrayList arrayList) {
        DBUtil.performBlocking(this.f292796a, false, true, new c(this, arrayList, 1));
    }

    @Override // vx1.a
    public final r f(String str) {
        d dVar = new d(this, str, 2);
        return RxRoom.createObservable(this.f292796a, false, new String[]{"breb_contacts"}, dVar);
    }

    @Override // vx1.a
    public final r g() {
        x xVar = new x(this, 28);
        return RxRoom.createObservable(this.f292796a, false, new String[]{"breb_contacts"}, xVar);
    }

    @Override // vx1.a
    public final void h(ArrayList arrayList) {
        DBUtil.performBlocking(this.f292796a, false, true, new c(this, arrayList, 0));
    }
}
