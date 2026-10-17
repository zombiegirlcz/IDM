package dy1;

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
public final class g extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f121043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ay1.f f121044b = new ay1.f(this, 4);

    public g(ApmContactsDatabase apmContactsDatabase) {
        this.f121043a = apmContactsDatabase;
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

    @Override // dy1.a
    public final void a() {
        DBUtil.performBlocking(this.f121043a, false, true, new dwi.f(19));
    }

    @Override // dy1.a
    public final k b(String str) {
        return RxRoom.createMaybe(this.f121043a, true, false, new e(this, str, 0));
    }

    @Override // dy1.a
    public final d0 c(String str) {
        return RxRoom.createSingle(this.f121043a, true, false, new e(this, str, 1));
    }

    @Override // dy1.a
    public final efm.b d(ArrayList arrayList) {
        return RxRoom.createCompletable(this.f121043a, false, true, new d(this, arrayList, 2));
    }

    @Override // dy1.a
    public final void e(ArrayList arrayList) {
        DBUtil.performBlocking(this.f121043a, false, true, new d(this, arrayList, 0));
    }

    @Override // dy1.a
    public final r f(String str) {
        e eVar = new e(this, str, 2);
        return RxRoom.createObservable(this.f121043a, false, new String[]{"wero_contacts"}, eVar);
    }

    @Override // dy1.a
    public final r g() {
        dug.a aVar = new dug.a(this, 13);
        return RxRoom.createObservable(this.f121043a, false, new String[]{"wero_contacts"}, aVar);
    }

    @Override // dy1.a
    public final void h(ArrayList arrayList) {
        DBUtil.performBlocking(this.f121043a, false, true, new d(this, arrayList, 1));
    }
}
