package fag;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.revolut.data.model.Data;
import com.revolut.feature_travel_hotels_models.booking.request.HotelsPropertyBookingRequestStatus;
import com.revolut.feature_travel_hotels_models.dropoff.TravelHotelsDropoff;
import com.revolut.feature_travel_hotels_models.favorites.HotelsFavorites;
import com.revolut.feature_travel_hotels_models.location.HotelsLocation;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyGuestsReviews;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tof.i7;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class m0 implements kfm.o, kfm.g, hc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f133346b;

    public /* synthetic */ m0(Object obj2, int i) {
        this.f133345a = i;
        this.f133346b = obj2;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f133345a) {
            case 9:
                ((l0) this.f133346b).invoke(obj2);
                break;
            default:
                ((l0) this.f133346b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f133345a) {
            case 0:
                f7l.c cVar = (f7l.c) this.f133346b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) cVar.invoke(p0);
            case 1:
                f7l.c cVar2 = (f7l.c) this.f133346b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (HotelsFavorites) cVar2.invoke(p0);
            case 2:
                o0 o0Var = (o0) this.f133346b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (HotelsLocation) o0Var.invoke(p0);
            case 3:
                o0 o0Var2 = (o0) this.f133346b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (HotelsPropertyGuestsReviews) o0Var2.invoke(p0);
            case 4:
                f7l.c cVar3 = (f7l.c) this.f133346b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) cVar3.invoke(p0);
            case 5:
                o0 o0Var3 = (o0) this.f133346b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) o0Var3.invoke(p0);
            case 6:
                o0 o0Var4 = (o0) this.f133346b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (TravelHotelsDropoff) o0Var4.invoke(p0);
            case 7:
                o0 o0Var5 = (o0) this.f133346b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) o0Var5.invoke(p0);
            case 8:
                o0 o0Var6 = (o0) this.f133346b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) o0Var6.invoke(p0);
            case 9:
            case 13:
            case 19:
            case 20:
            default:
                fe9.f fVar = (fe9.f) this.f133346b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.n) fVar.invoke(p0);
            case 10:
                o0 o0Var7 = (o0) this.f133346b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) o0Var7.invoke(p0);
            case 11:
                f9g.l lVar = (f9g.l) this.f133346b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) lVar.invoke(p0);
            case 12:
                o0 o0Var8 = (o0) this.f133346b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (HotelsPropertyBookingRequestStatus) o0Var8.invoke(p0);
            case 14:
                f0m.c cVar4 = (f0m.c) this.f133346b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (lk0.e) cVar4.invoke(p0);
            case 15:
                f0m.c cVar5 = (f0m.c) this.f133346b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (lk0.e) cVar5.invoke(p0);
            case 16:
                o0 o0Var9 = (o0) this.f133346b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) o0Var9.invoke(p0);
            case 17:
                o0 o0Var10 = (o0) this.f133346b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ggi.a) o0Var10.invoke(p0);
            case 18:
                f2i.x xVar = (f2i.x) this.f133346b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) xVar.invoke(p0);
            case 21:
                o0 o0Var11 = (o0) this.f133346b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (i7) o0Var11.invoke(p0);
            case 22:
                fca.d dVar = (fca.d) this.f133346b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) dVar.invoke(p0);
            case 23:
                o0 o0Var12 = (o0) this.f133346b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) o0Var12.invoke(p0);
            case 24:
                fe9.f fVar2 = (fe9.f) this.f133346b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) fVar2.invoke(p0);
            case 25:
                ffk.k kVar = (ffk.k) this.f133346b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) kVar.invoke(p0);
            case 26:
                f0d.l lVar2 = (f0d.l) this.f133346b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) lVar2.invoke(p0);
            case 27:
                f9g.l lVar3 = (f9g.l) this.f133346b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) lVar3.invoke(p0);
            case 28:
                ard.t tVar = (ard.t) this.f133346b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) tVar.invoke(p0);
        }
    }

    @Override // hc.a
    public Object execute() {
        switch (this.f133345a) {
            case 19:
                gc.j jVar = (gc.j) ((gc.d) this.f133346b);
                long jB = jVar.f142292b.b() - jVar.d.d;
                SQLiteDatabase sQLiteDatabaseD = jVar.d();
                sQLiteDatabaseD.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(jB)};
                    Cursor cursorRawQuery = sQLiteDatabaseD.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (cursorRawQuery.moveToNext()) {
                        try {
                            jVar.i(cursorRawQuery.getInt(0), cc.d.MESSAGE_TOO_OLD, cursorRawQuery.getString(1));
                        } catch (Throwable th10) {
                            cursorRawQuery.close();
                            throw th10;
                        }
                        break;
                    }
                    cursorRawQuery.close();
                    int iDelete = sQLiteDatabaseD.delete("events", "timestamp_ms < ?", strArr);
                    sQLiteDatabaseD.setTransactionSuccessful();
                    sQLiteDatabaseD.endTransaction();
                    return Integer.valueOf(iDelete);
                } catch (Throwable th11) {
                    sQLiteDatabaseD.endTransaction();
                    throw th11;
                }
            default:
                com.google.firebase.messaging.t tVar = (com.google.firebase.messaging.t) this.f133346b;
                Iterator it8 = ((Iterable) ((gc.j) ((gc.d) tVar.f49544c)).g(new a5.a(16))).iterator();
                while (it8.hasNext()) {
                    ((gpk.c) tVar.d).h((zb.j) it8.next(), 1, false);
                }
                return null;
        }
    }
}
