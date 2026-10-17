package xek;

import androidx.room.RoomDatabase;
import androidx.room.RxRoom;
import androidx.room.util.DBUtil;
import com.revolut.retail.feature.pricing_plans.impl.database.PricingPlansDatabase;
import efm.d0;
import gv9.i;
import java.util.ArrayList;
import kotlin.Unit;
import xd2.n;

/* JADX INFO: loaded from: classes13.dex */
public final class c extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f304695a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cfk.b f304697c = new cfk.b();
    public final cfk.a d = new cfk.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f304696b = new i(this, 4);

    public c(PricingPlansDatabase pricingPlansDatabase) {
        this.f304695a = pricingPlansDatabase;
    }

    public static /* synthetic */ Unit e(c cVar, ArrayList arrayList) {
        super.d(arrayList);
        return Unit.f186387a;
    }

    @Override // xek.a
    public final d0 a() {
        return RxRoom.createSingle(this.f304695a, true, false, new xe7.a(this, 2));
    }

    @Override // xek.a
    public final void b() {
        DBUtil.performBlocking(this.f304695a, false, true, new n(8));
    }

    @Override // xek.a
    public final void c(ArrayList arrayList) {
        DBUtil.performBlocking(this.f304695a, false, true, new b(this, arrayList, 1));
    }

    @Override // xek.a
    public final void d(ArrayList arrayList) {
        DBUtil.performBlocking(this.f304695a, false, true, new b(this, arrayList, 0));
    }
}
