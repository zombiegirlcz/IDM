package h4d;

import a5g.i;
import androidx.room.RoomDatabase;
import androidx.room.RxRoom;
import androidx.room.util.DBUtil;
import avj.o;
import com.revolut.feature.separate_favourites.item_data.impl.database.SeparateFavouritesItemDatabase;
import dcl.s0;
import efm.r;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class c extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f149332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s0 f149333b = new s0(17);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s0 f149334c = new s0(18);

    public c(SeparateFavouritesItemDatabase separateFavouritesItemDatabase) {
        this.f149332a = separateFavouritesItemDatabase;
    }

    @Override // h4d.a
    public final void a(String str, String str2) {
        DBUtil.performBlocking(this.f149332a, false, true, new o(str, str2, 14));
    }

    @Override // h4d.a
    public final List b() {
        return (List) DBUtil.performBlocking(this.f149332a, true, false, new h3d.a(10));
    }

    @Override // h4d.a
    public final i4d.a c() {
        return (i4d.a) DBUtil.performBlocking(this.f149332a, true, false, new h3d.a(9));
    }

    @Override // h4d.a
    public final void d(int i) {
        DBUtil.performBlocking(this.f149332a, false, true, new i(i, 20));
    }

    @Override // h4d.a
    public final void e(i4d.a aVar) {
        DBUtil.performBlocking(this.f149332a, false, true, new b(this, aVar, 1));
    }

    @Override // h4d.a
    public final void f(i4d.a aVar) {
        DBUtil.performBlocking(this.f149332a, false, true, new b(this, aVar, 0));
    }

    @Override // h4d.a
    public final r g() {
        h3d.a aVar = new h3d.a(11);
        return RxRoom.createObservable(this.f149332a, false, new String[]{"converter_items"}, aVar);
    }
}
