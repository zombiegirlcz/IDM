package wsj;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.retail.feature.impl.AnalyticsDatabase;
import dcl.g0;
import java.util.ArrayList;
import java.util.List;
import wp5.v;
import ysj.k;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f299743a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public xsj.b f299745c;
    public xsj.c d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ay1.f f299744b = new ay1.f(this, 26);
    public final g0 e = new g0(21);
    public final c f = new c(this, 0);

    public d(AnalyticsDatabase analyticsDatabase) {
        this.f299743a = analyticsDatabase;
    }

    @Override // wsj.a
    public final List a() {
        return (List) DBUtil.performBlocking(this.f299743a, true, false, new wpj.b(this, 7));
    }

    @Override // wsj.a
    public final void b() {
        DBUtil.performBlocking(this.f299743a, false, true, new wsg.a(10));
    }

    public final synchronized xsj.b c() {
        try {
            if (this.f299745c == null) {
                this.f299745c = (xsj.b) this.f299743a.getTypeConverter(xsj.b.class);
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return this.f299745c;
    }

    public final synchronized xsj.c d() {
        try {
            if (this.d == null) {
                this.d = (xsj.c) this.f299743a.getTypeConverter(xsj.c.class);
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return this.d;
    }

    @Override // t11.b2
    public final void delete(Object obj2) {
        k kVar = (k) obj2;
        kVar.getClass();
        DBUtil.performBlocking(this.f299743a, false, true, new b(this, kVar, 0));
    }

    @Override // wsj.a
    public final void insertAll(List list) {
        DBUtil.performBlocking(this.f299743a, false, true, new v(this, (ArrayList) list, 17));
    }

    @Override // t11.b2
    public final int update(Object obj2) {
        k kVar = (k) obj2;
        kVar.getClass();
        return ((Integer) DBUtil.performBlocking(this.f299743a, false, true, new b(this, kVar, 1))).intValue();
    }
}
