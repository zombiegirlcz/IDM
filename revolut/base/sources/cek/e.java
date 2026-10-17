package cek;

import androidx.room.RoomDatabase;
import androidx.room.RxRoom;
import androidx.room.util.DBUtil;
import c7e.i;
import com.revolut.retail.feature.pod_nominees.impl.data.database.PodNomineesDatabase;
import efm.r;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f23494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ark.c f23495b = new ark.c(this, 6);

    public e(PodNomineesDatabase podNomineesDatabase) {
        this.f23494a = podNomineesDatabase;
    }

    public static /* synthetic */ Unit f(e eVar, ArrayList arrayList) {
        super.e(arrayList);
        return Unit.f186387a;
    }

    @Override // cek.c
    public final List a() {
        return (List) DBUtil.performBlocking(this.f23494a, true, false, new ce9.a(this, 2));
    }

    @Override // cek.c
    public final void b(ArrayList arrayList) {
        DBUtil.performBlocking(this.f23494a, false, true, new d(this, arrayList, 1));
    }

    @Override // cek.c
    public final r c(String str) {
        i iVar = new i(this, str, 11);
        return RxRoom.createObservable(this.f23494a, false, new String[]{"pod_nominees"}, iVar);
    }

    @Override // cek.c
    public final void d() {
        DBUtil.performBlocking(this.f23494a, false, true, new ccg.c(19));
    }

    @Override // cek.c
    public final void e(ArrayList arrayList) {
        DBUtil.performBlocking(this.f23494a, false, true, new d(this, arrayList, 0));
    }
}
