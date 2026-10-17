package sdd;

import androidx.room.RoomDatabase;
import androidx.room.RxRoom;
import androidx.room.util.DBUtil;
import com.revolut.feature.shared.vaults.domain.impl.data.database.VaultsDatabase;
import efm.d0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import ofg.i;
import rvc.k;
import vdd.o;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f261862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f261863b = new i(this, 25);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f261864c = new i(26);

    public e(VaultsDatabase vaultsDatabase) {
        this.f261862a = vaultsDatabase;
    }

    public static /* synthetic */ Unit o(e eVar, vdd.i iVar) {
        super.l(iVar);
        return Unit.f186387a;
    }

    @Override // sdd.b
    public final int a(String str) {
        return ((Integer) DBUtil.performBlocking(this.f261862a, false, true, new k(str, 27))).intValue();
    }

    @Override // sdd.b
    public final List b(String str) {
        return (List) DBUtil.performBlocking(this.f261862a, true, false, new k(25, str, this));
    }

    @Override // sdd.b
    public final d0 c(String str) {
        return RxRoom.createSingle(this.f261862a, true, false, new d(this, str, 2));
    }

    @Override // sdd.b
    public final vdd.i d(String str) {
        return (vdd.i) DBUtil.performBlocking(this.f261862a, true, false, new d(this, str, 1));
    }

    @Override // sdd.b
    public final List e(String str) {
        return (List) DBUtil.performBlocking(this.f261862a, false, true, new d(this, str, 0));
    }

    @Override // sdd.b
    public final void f(vdd.i iVar) {
        DBUtil.performBlocking(this.f261862a, false, true, new c(this, iVar, 0));
    }

    @Override // sdd.b
    public final void g(o oVar) {
        DBUtil.performBlocking(this.f261862a, false, true, new s31.a(this, oVar, 28));
    }

    @Override // sdd.b
    public final void h(ArrayList arrayList) {
        DBUtil.performBlocking(this.f261862a, false, true, new s31.a(this, arrayList, 29));
    }

    @Override // sdd.b
    public final boolean i(String str) {
        return ((Boolean) DBUtil.performBlocking(this.f261862a, true, false, new k(str, 26))).booleanValue();
    }

    @Override // sdd.b
    public final List k(pcd.b bVar, ArrayList arrayList) {
        return (List) DBUtil.performBlocking(this.f261862a, false, true, new s06.e(this, 11, bVar, arrayList));
    }

    @Override // sdd.b
    public final void l(vdd.i iVar) {
        DBUtil.performBlocking(this.f261862a, false, true, new c(this, iVar, 1));
    }
}
