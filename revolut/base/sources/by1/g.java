package by1;

import androidx.room.RoomDatabase;
import androidx.room.RxRoom;
import androidx.room.util.DBUtil;
import bq7.j;
import bxg.t;
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
    public final RoomDatabase f19727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ay1.f f19728b = new ay1.f(this, 1);

    public g(ApmContactsDatabase apmContactsDatabase) {
        this.f19727a = apmContactsDatabase;
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

    @Override // by1.a
    public final void a() {
        DBUtil.performBlocking(this.f19727a, false, true, new t(2));
    }

    @Override // by1.a
    public final k b(String str) {
        return RxRoom.createMaybe(this.f19727a, true, false, new e(this, str, 1));
    }

    @Override // by1.a
    public final d0 c(String str) {
        return RxRoom.createSingle(this.f19727a, true, false, new e(this, str, 0));
    }

    @Override // by1.a
    public final efm.b d(ArrayList arrayList) {
        return RxRoom.createCompletable(this.f19727a, false, true, new d(this, arrayList, 2));
    }

    @Override // by1.a
    public final void e(ArrayList arrayList) {
        DBUtil.performBlocking(this.f19727a, false, true, new d(this, arrayList, 0));
    }

    @Override // by1.a
    public final r f(String str) {
        e eVar = new e(this, str, 2);
        return RxRoom.createObservable(this.f19727a, false, new String[]{"qvik_contacts"}, eVar);
    }

    @Override // by1.a
    public final r g() {
        j jVar = new j(this, 26);
        return RxRoom.createObservable(this.f19727a, false, new String[]{"qvik_contacts"}, jVar);
    }

    @Override // by1.a
    public final void h(ArrayList arrayList) {
        DBUtil.performBlocking(this.f19727a, false, true, new d(this, arrayList, 1));
    }
}
