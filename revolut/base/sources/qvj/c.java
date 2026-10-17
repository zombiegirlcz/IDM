package qvj;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import ay1.f;
import com.revolut.retail.feature.impl.AnalyticsDatabase;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import ofg.i;
import qc0.w;
import qsa.p;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f249712a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public rvj.a f249714c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f249713b = new f(this, 19);
    public final i d = new i(12);

    public c(AnalyticsDatabase analyticsDatabase) {
        this.f249712a = analyticsDatabase;
    }

    public static /* synthetic */ Unit j(c cVar) {
        super.a();
        return Unit.f186387a;
    }

    public static /* synthetic */ Unit k(c cVar, ArrayList arrayList, long j2) {
        super.h(j2, arrayList);
        return Unit.f186387a;
    }

    @Override // qvj.a
    public final void a() {
        DBUtil.performBlocking(this.f249712a, false, true, new b(this, 1));
    }

    @Override // qvj.a
    public final void b() {
        DBUtil.performBlocking(this.f249712a, false, true, new p(27));
    }

    @Override // qvj.a
    public final void c() {
        DBUtil.performBlocking(this.f249712a, false, true, new p(26));
    }

    @Override // qvj.a
    public final void d(String str) {
        DBUtil.performBlocking(this.f249712a, false, true, new w(str, 22));
    }

    @Override // qvj.a
    public final List e() {
        return (List) DBUtil.performBlocking(this.f249712a, true, false, new b(this, 0));
    }

    @Override // qvj.a
    public final Long f() {
        return (Long) DBUtil.performBlocking(this.f249712a, true, false, new p(25));
    }

    @Override // qvj.a
    public final void g(List list) {
        list.getClass();
        DBUtil.performBlocking(this.f249712a, false, true, new qpb.a(this, list, 15));
    }

    @Override // qvj.a
    public final void h(long j2, ArrayList arrayList) {
        DBUtil.performBlocking(this.f249712a, false, true, new csl.a(this, arrayList, j2, 18));
    }

    @Override // qvj.a
    public final void i(svj.f fVar) {
        DBUtil.performBlocking(this.f249712a, false, true, new qpb.a(this, fVar, 16));
    }

    public final synchronized rvj.a l() {
        try {
            if (this.f249714c == null) {
                this.f249714c = (rvj.a) this.f249712a.getTypeConverter(rvj.a.class);
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return this.f249714c;
    }
}
