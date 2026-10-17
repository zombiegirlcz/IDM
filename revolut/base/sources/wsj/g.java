package wsj;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.retail.feature.impl.AnalyticsDatabase;
import dcl.g0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import vx9.v;
import wsg.j;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f299749a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public xsj.a f299751c;
    public xsj.d d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ay1.f f299750b = new ay1.f(this, 27);
    public final g0 e = new g0(22);
    public final c f = new c(this, 1);

    public g(AnalyticsDatabase analyticsDatabase) {
        this.f299749a = analyticsDatabase;
    }

    public static /* synthetic */ Unit e(g gVar, String str, ArrayList arrayList) {
        super.a(str, arrayList);
        return Unit.f186387a;
    }

    @Override // wsj.e
    public final void a(String str, ArrayList arrayList) {
        DBUtil.performBlocking(this.f299749a, false, true, new v(29, arrayList, this, str));
    }

    @Override // wsj.e
    public final List b() {
        return (List) DBUtil.performBlocking(this.f299749a, true, false, new wpj.b(this, 8));
    }

    @Override // wsj.e
    public final void c() {
        DBUtil.performBlocking(this.f299749a, false, true, new wsg.a(11));
    }

    @Override // wsj.e
    public final void d(String str) {
        DBUtil.performBlocking(this.f299749a, false, true, new j(str, 1));
    }

    @Override // t11.b2
    public final void delete(Object obj2) {
        ysj.g gVar = (ysj.g) obj2;
        gVar.getClass();
        DBUtil.performBlocking(this.f299749a, false, true, new f(this, gVar, 1));
    }

    public final synchronized xsj.a f() {
        try {
            if (this.f299751c == null) {
                this.f299751c = (xsj.a) this.f299749a.getTypeConverter(xsj.a.class);
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return this.f299751c;
    }

    public final synchronized xsj.d g() {
        try {
            if (this.d == null) {
                this.d = (xsj.d) this.f299749a.getTypeConverter(xsj.d.class);
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return this.d;
    }

    @Override // wsj.e
    public final void insertAll(List list) {
        DBUtil.performBlocking(this.f299749a, false, true, new wp5.v(this, (ArrayList) list, 18));
    }

    @Override // t11.b2
    public final int update(Object obj2) {
        ysj.g gVar = (ysj.g) obj2;
        gVar.getClass();
        return ((Integer) DBUtil.performBlocking(this.f299749a, false, true, new f(this, gVar, 0))).intValue();
    }
}
