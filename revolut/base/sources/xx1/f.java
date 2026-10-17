package xx1;

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

/* JADX INFO: loaded from: classes20.dex */
public final class f extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f309387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ay1.f f309388b = new ay1.f(this, 28);

    public f(ApmContactsDatabase apmContactsDatabase) {
        this.f309387a = apmContactsDatabase;
    }

    public static /* synthetic */ Unit i(f fVar, ArrayList arrayList) {
        super.h(arrayList);
        return Unit.f186387a;
    }

    public static wx1.a j(String str) {
        str.getClass();
        if (str.equals("BUSINESS")) {
            return wx1.a.BUSINESS;
        }
        if (str.equals("PERSONAL")) {
            return wx1.a.PERSONAL;
        }
        throw new IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(str));
    }

    public static wx1.b k(String str) {
        str.getClass();
        if (str.equals("DELETED")) {
            return wx1.b.DELETED;
        }
        if (str.equals("ACTIVE")) {
            return wx1.b.ACTIVE;
        }
        throw new IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(str));
    }

    public static void l() {
        List list = Collections.EMPTY_LIST;
    }

    @Override // xx1.a
    public final void a() {
        DBUtil.performBlocking(this.f309387a, false, true, new xub.e(21));
    }

    @Override // xx1.a
    public final k b(String str) {
        return RxRoom.createMaybe(this.f309387a, true, false, new d(this, str, 0));
    }

    @Override // xx1.a
    public final d0 c(String str) {
        return RxRoom.createSingle(this.f309387a, true, false, new d(this, str, 1));
    }

    @Override // xx1.a
    public final efm.b d(ArrayList arrayList) {
        return RxRoom.createCompletable(this.f309387a, false, true, new c(this, arrayList, 2));
    }

    @Override // xx1.a
    public final void e(ArrayList arrayList) {
        DBUtil.performBlocking(this.f309387a, false, true, new c(this, arrayList, 1));
    }

    @Override // xx1.a
    public final r f(String str) {
        d dVar = new d(this, str, 2);
        return RxRoom.createObservable(this.f309387a, false, new String[]{"iris_contacts"}, dVar);
    }

    @Override // xx1.a
    public final r g() {
        xw9.c cVar = new xw9.c(this, 1);
        return RxRoom.createObservable(this.f309387a, false, new String[]{"iris_contacts"}, cVar);
    }

    @Override // xx1.a
    public final void h(ArrayList arrayList) {
        DBUtil.performBlocking(this.f309387a, false, true, new c(this, arrayList, 0));
    }
}
