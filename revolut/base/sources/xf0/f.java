package xf0;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.core.faq.data.db.FaqDatabase;
import xd2.n;

/* JADX INFO: loaded from: classes.dex */
public final class f extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f304750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qra.g f304751b = new qra.g(1);

    public f(FaqDatabase faqDatabase) {
        this.f304750a = faqDatabase;
    }

    @Override // xf0.e
    public final int a() {
        return ((Integer) DBUtil.performBlocking(this.f304750a, false, true, new n(10))).intValue();
    }

    @Override // xf0.e
    public final zf0.e b(String str) {
        return (zf0.e) DBUtil.performBlocking(this.f304750a, true, false, new wsg.j(str, 28));
    }

    @Override // xf0.e
    public final void c(zf0.e eVar) {
        DBUtil.performBlocking(this.f304750a, false, true, new x52.a(this, eVar, 27));
    }
}
