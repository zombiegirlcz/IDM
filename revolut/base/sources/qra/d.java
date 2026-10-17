package qra;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.feature.push_to_card.impl.storage.database.PushToCardDatabase;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import qc0.w;
import qgf.o;
import qpb.i;

/* JADX INFO: loaded from: classes13.dex */
public final class d extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f248674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ao.g f248675b = new ao.g(this, 29);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ipk.d f248676c = new ipk.d(this, 5);

    public d(PushToCardDatabase pushToCardDatabase) {
        this.f248674a = pushToCardDatabase;
    }

    public static /* synthetic */ Unit i(d dVar, ArrayList arrayList) {
        super.g(arrayList);
        return Unit.f186387a;
    }

    @Override // qra.a
    public final void a(String str) {
        DBUtil.performBlocking(this.f248674a, false, true, new w(str, 18));
    }

    @Override // qra.a
    public final List b() {
        return (List) DBUtil.performBlocking(this.f248674a, true, false, new o(this, 25));
    }

    @Override // qra.a
    public final sra.b c(String str) {
        return (sra.b) DBUtil.performBlocking(this.f248674a, true, false, new qpb.a(this, str, 4));
    }

    @Override // qra.a
    public final void d(sra.b bVar) {
        DBUtil.performBlocking(this.f248674a, false, true, new c(this, bVar, 1));
    }

    @Override // qra.a
    public final void e(ArrayList arrayList) {
        DBUtil.performBlocking(this.f248674a, false, true, new b(this, arrayList, 0));
    }

    @Override // qra.a
    public final void f() {
        DBUtil.performBlocking(this.f248674a, false, true, new i(21));
    }

    @Override // qra.a
    public final void g(ArrayList arrayList) {
        DBUtil.performBlocking(this.f248674a, false, true, new b(this, arrayList, 1));
    }

    @Override // qra.a
    public final void h(sra.b bVar) {
        DBUtil.performBlocking(this.f248674a, false, true, new c(this, bVar, 0));
    }
}
