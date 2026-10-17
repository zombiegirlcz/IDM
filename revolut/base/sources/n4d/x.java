package n4d;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import com.revolut.feature.separate_favourites.item_data.impl.database.SeparateFavouritesItemDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import n33.v0;

/* JADX INFO: loaded from: classes7.dex */
public final class x extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f212415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final is6.x f212416b = new is6.x(24);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final is6.x f212417c = new is6.x(this, 25);
    public final is6.x d = new is6.x(this, 26);

    public x(SeparateFavouritesItemDatabase separateFavouritesItemDatabase) {
        this.f212415a = separateFavouritesItemDatabase;
    }

    public static /* synthetic */ ArrayList o(x xVar, ArrayList arrayList) {
        return (ArrayList) super.h(arrayList);
    }

    public static /* synthetic */ Unit p(x xVar, List list) {
        super.m(list);
        return Unit.f186387a;
    }

    public static /* synthetic */ Unit q(x xVar, ArrayList arrayList) {
        super.n(arrayList);
        return Unit.f186387a;
    }

    public static void r() {
        List list = Collections.EMPTY_LIST;
    }

    @Override // n4d.s
    public final void a() {
        DBUtil.performBlocking(this.f212415a, false, true, new v0(25));
    }

    @Override // n4d.s
    public final void b() {
        DBUtil.performBlocking(this.f212415a, false, true, new v0(26));
    }

    @Override // n4d.s
    public final void c() {
        DBUtil.performBlocking(this.f212415a, false, true, new v0(24));
    }

    @Override // n4d.s
    public final void d(String str, String str2, String str3, String str4) {
        DBUtil.performBlocking(this.f212415a, false, true, new t(str, str2, str3, str4, 0));
    }

    @Override // n4d.s
    public final List e() {
        return (List) DBUtil.performBlocking(this.f212415a, true, false, new n1.y(this, 17));
    }

    @Override // n4d.s
    public final List f(String str, ArrayList arrayList) {
        StringBuilder sbS = p.a.s("\n         SELECT * FROM plain_multiple_watchlists_items\n            WHERE watchlist_id = ? AND asset_type_key IN (");
        StringUtil.appendPlaceholders(sbS, arrayList.size());
        sbS.append(") AND sync_state != 'REMOVE'");
        sbS.append("\n");
        sbS.append("            ORDER BY added_time AND from_code   ");
        return (List) DBUtil.performBlocking(this.f212415a, true, false, new w(this, v0.a.i(sbS, "\n", "        "), str, arrayList));
    }

    @Override // n4d.s
    public final List g() {
        return (List) DBUtil.performBlocking(this.f212415a, true, false, new v0(23));
    }

    @Override // n4d.s
    public final List h(ArrayList arrayList) {
        return (List) DBUtil.performBlocking(this.f212415a, false, true, new v(this, arrayList, 0));
    }

    @Override // n4d.s
    public final void i(List list) {
        list.getClass();
        DBUtil.performBlocking(this.f212415a, false, true, new u(this, list, 2));
    }

    @Override // n4d.s
    public final void j(List list) {
        list.getClass();
        DBUtil.performBlocking(this.f212415a, false, true, new u(this, list, 0));
    }

    @Override // n4d.s
    public final void k(o4d.e eVar) {
        DBUtil.performBlocking(this.f212415a, false, true, new n45.b(this, eVar, 9));
    }

    @Override // n4d.s
    public final void l(String str, String str2, String str3, String str4) {
        DBUtil.performBlocking(this.f212415a, false, true, new t(str, str2, str3, str4, 1));
    }

    @Override // n4d.s
    public final void m(List list) {
        DBUtil.performBlocking(this.f212415a, false, true, new u(this, list, 1));
    }

    @Override // n4d.s
    public final void n(ArrayList arrayList) {
        DBUtil.performBlocking(this.f212415a, false, true, new v(this, arrayList, 1));
    }
}
