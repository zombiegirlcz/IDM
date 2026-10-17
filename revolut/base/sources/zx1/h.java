package zx1;

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
import zrd.q;
import zul.l0;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f326031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f326032b = new f(this, 0);

    public h(ApmContactsDatabase apmContactsDatabase) {
        this.f326031a = apmContactsDatabase;
    }

    public static /* synthetic */ Unit i(h hVar, ArrayList arrayList) {
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

    @Override // zx1.a
    public final void a() {
        DBUtil.performBlocking(this.f326031a, false, true, new l0(8));
    }

    @Override // zx1.a
    public final k b(String str) {
        return RxRoom.createMaybe(this.f326031a, true, false, new e(this, str, 1));
    }

    @Override // zx1.a
    public final d0 c(String str) {
        return RxRoom.createSingle(this.f326031a, true, false, new e(this, str, 0));
    }

    @Override // zx1.a
    public final efm.b d(ArrayList arrayList) {
        return RxRoom.createCompletable(this.f326031a, false, true, new d(this, arrayList, 2));
    }

    @Override // zx1.a
    public final void e(ArrayList arrayList) {
        DBUtil.performBlocking(this.f326031a, false, true, new d(this, arrayList, 1));
    }

    @Override // zx1.a
    public final r f(String str) {
        e eVar = new e(this, str, 2);
        return RxRoom.createObservable(this.f326031a, false, new String[]{"multibanco_contacts"}, eVar);
    }

    @Override // zx1.a
    public final r g() {
        q qVar = new q(this, 15);
        return RxRoom.createObservable(this.f326031a, false, new String[]{"multibanco_contacts"}, qVar);
    }

    @Override // zx1.a
    public final void h(ArrayList arrayList) {
        DBUtil.performBlocking(this.f326031a, false, true, new d(this, arrayList, 0));
    }
}
