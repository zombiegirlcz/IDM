package xf0;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.core.faq.data.db.FaqDatabase;
import java.util.ArrayList;
import java.util.List;
import s7a.l0;

/* JADX INFO: loaded from: classes.dex */
public final class i extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f304754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0g.b f304755b = new t0g.b(20);

    public i(FaqDatabase faqDatabase) {
        this.f304754a = faqDatabase;
    }

    @Override // xf0.g
    public final int a(String str) {
        return ((Integer) DBUtil.performBlocking(this.f304754a, false, true, new h(str, 0))).intValue();
    }

    @Override // xf0.g
    public final List b(String str) {
        return (List) DBUtil.performBlocking(this.f304754a, true, false, new wsg.j(str, 29));
    }

    @Override // xf0.g
    public final void c(ArrayList arrayList) {
        DBUtil.performBlocking(this.f304754a, false, true, new x52.a(this, arrayList, 28));
    }

    @Override // xf0.g
    public final List d(String str, String str2) {
        return (List) DBUtil.performBlocking(this.f304754a, true, false, new l0(str2, str, 5));
    }
}
