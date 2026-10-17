package zzj;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.retail.feature.marketnews.impl.data.database.MarketNewsDatabase;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f326760a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yzj.a f326762c = new yzj.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zx1.f f326761b = new zx1.f(this, 1);

    public d(MarketNewsDatabase marketNewsDatabase) {
        this.f326760a = marketNewsDatabase;
    }

    public static /* synthetic */ Unit e(d dVar, rzj.c cVar, ArrayList arrayList) {
        super.d(cVar, arrayList);
        return Unit.f186387a;
    }

    @Override // zzj.b
    public final void a(rzj.c cVar) {
        DBUtil.performBlocking(this.f326760a, false, true, new c(this, cVar, 1));
    }

    @Override // zzj.b
    public final List b(rzj.c cVar) {
        return (List) DBUtil.performBlocking(this.f326760a, true, false, new c(this, cVar, 0));
    }

    @Override // zzj.b
    public final void c(ArrayList arrayList) {
        DBUtil.performBlocking(this.f326760a, false, true, new zp5.f(this, arrayList, 28));
    }

    @Override // zzj.b
    public final void d(rzj.c cVar, ArrayList arrayList) {
        DBUtil.performBlocking(this.f326760a, false, true, new yrk.e(this, 29, cVar, arrayList));
    }
}
