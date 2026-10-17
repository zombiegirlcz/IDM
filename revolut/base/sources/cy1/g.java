package cy1;

import androidx.room.RoomDatabase;
import androidx.room.RxRoom;
import androidx.room.util.DBUtil;
import com.revolut.feature.apm.core.contacts.database.ApmContactsDatabase;
import cul.n0;
import cw7.j;
import efm.d0;
import efm.k;
import efm.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f110030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ay1.f f110031b = new ay1.f(this, 3);

    public g(ApmContactsDatabase apmContactsDatabase) {
        this.f110030a = apmContactsDatabase;
    }

    public static /* synthetic */ Unit i(g gVar, ArrayList arrayList) {
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

    @Override // cy1.a
    public final void a() {
        DBUtil.performBlocking(this.f110030a, false, true, new j(14));
    }

    @Override // cy1.a
    public final k b(String str) {
        return RxRoom.createMaybe(this.f110030a, true, false, new e(this, str, 1));
    }

    @Override // cy1.a
    public final d0 c(String str) {
        return RxRoom.createSingle(this.f110030a, true, false, new e(this, str, 0));
    }

    @Override // cy1.a
    public final efm.b d(ArrayList arrayList) {
        return RxRoom.createCompletable(this.f110030a, false, true, new d(this, arrayList, 2));
    }

    @Override // cy1.a
    public final void e(ArrayList arrayList) {
        DBUtil.performBlocking(this.f110030a, false, true, new d(this, arrayList, 1));
    }

    @Override // cy1.a
    public final r f(String str) {
        e eVar = new e(this, str, 2);
        return RxRoom.createObservable(this.f110030a, false, new String[]{"spin_contacts"}, eVar);
    }

    @Override // cy1.a
    public final r g() {
        n0 n0Var = new n0(this, 20);
        return RxRoom.createObservable(this.f110030a, false, new String[]{"spin_contacts"}, n0Var);
    }

    @Override // cy1.a
    public final void h(ArrayList arrayList) {
        DBUtil.performBlocking(this.f110030a, false, true, new d(this, arrayList, 0));
    }
}
