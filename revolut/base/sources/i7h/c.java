package i7h;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.feature.wealth.impl.data.database.WealthDatabase;
import dcl.s0;
import ho6.n;
import hsa.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f159302a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j7h.a f159304c = new j7h.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s0 f159303b = new s0(this, 26);

    public c(WealthDatabase wealthDatabase) {
        this.f159302a = wealthDatabase;
    }

    public static /* synthetic */ Unit h(c cVar, String str, ArrayList arrayList) {
        super.e(str, arrayList);
        return Unit.f186387a;
    }

    @Override // i7h.a
    public final void a(String str) {
        DBUtil.performBlocking(this.f159302a, false, true, new n(str, 17));
    }

    @Override // i7h.a
    public final void b(String str) {
        DBUtil.performBlocking(this.f159302a, false, true, new n(str, 18));
    }

    @Override // i7h.a
    public final d c(String str) {
        return (d) DBUtil.performBlocking(this.f159302a, true, false, new b(this, str, 1));
    }

    @Override // i7h.a
    public final List d(String str) {
        return (List) DBUtil.performBlocking(this.f159302a, true, false, new b(this, str, 0));
    }

    @Override // i7h.a
    public final void e(String str, ArrayList arrayList) {
        DBUtil.performBlocking(this.f159302a, false, true, new l(this, arrayList, str, 14));
    }

    @Override // i7h.a
    public final void f(d dVar) {
        DBUtil.performBlocking(this.f159302a, false, true, new i25.e(this, dVar, 5));
    }

    @Override // i7h.a
    public final void g(ArrayList arrayList) {
        DBUtil.performBlocking(this.f159302a, false, true, new i25.e(this, arrayList, 6));
    }
}
