package n4d;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.feature.separate_favourites.item_data.impl.database.SeparateFavouritesItemDatabase;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes13.dex */
public final class q extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f212389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final is6.x f212390b = new is6.x(this, 22);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final is6.x f212391c = new is6.x(this, 23);

    public q(SeparateFavouritesItemDatabase separateFavouritesItemDatabase) {
        this.f212389a = separateFavouritesItemDatabase;
    }

    public static /* synthetic */ Unit k(q qVar, List list) {
        super.i(list);
        return Unit.f186387a;
    }

    public static /* synthetic */ Unit l(q qVar, List list, ArrayList arrayList) {
        super.j(arrayList, list);
        return Unit.f186387a;
    }

    @Override // n4d.n
    public final void a(String str, String str2, String str3) {
        DBUtil.performBlocking(this.f212389a, false, true, new be7.m(str, str2, str3, 2));
    }

    @Override // n4d.n
    public final int b(ArrayList arrayList) {
        return ((Integer) DBUtil.performBlocking(this.f212389a, false, true, new a54.c(9, com.google.android.gms.internal.mlkit_vision_face.a.u(arrayList, p.a.s("DELETE FROM plain_watchlist_items WHERE asset_type_key IN ("), ") and sync_state = 'SYNCED'"), arrayList))).intValue();
    }

    @Override // n4d.n
    public final DateTime c() {
        return (DateTime) DBUtil.performBlocking(this.f212389a, true, false, new o(this, 1));
    }

    @Override // n4d.n
    public final List d(List list) {
        return (List) DBUtil.performBlocking(this.f212389a, true, false, new moe.c(this, 26, prk.o.p(") AND  sync_state IN('ADD', 'SYNCED')", list, p.a.s("SELECT * FROM plain_watchlist_items WHERE asset_type_key IN (")), list));
    }

    @Override // n4d.n
    public final List e() {
        return (List) DBUtil.performBlocking(this.f212389a, true, false, new o(this, 0));
    }

    @Override // n4d.n
    public final void f(ArrayList arrayList) {
        DBUtil.performBlocking(this.f212389a, false, true, new p(this, arrayList, 0));
    }

    @Override // n4d.n
    public final void g(ArrayList arrayList) {
        DBUtil.performBlocking(this.f212389a, false, true, new p(this, arrayList, 1));
    }

    @Override // n4d.n
    public final void h(String str, String str2, String str3) {
        DBUtil.performBlocking(this.f212389a, false, true, new be7.m(str, str2, str3, 3));
    }

    @Override // n4d.n
    public final void i(List list) {
        DBUtil.performBlocking(this.f212389a, false, true, new n45.b(this, list, 8));
    }

    @Override // n4d.n
    public final void j(ArrayList arrayList, List list) {
        DBUtil.performBlocking(this.f212389a, false, true, new moe.c(this, list, arrayList, 27));
    }
}
