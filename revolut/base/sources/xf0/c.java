package xf0;

import androidx.room.RoomDatabase;
import androidx.room.RxRoom;
import androidx.room.util.DBUtil;
import com.revolut.core.faq.data.db.FaqDatabase;
import com.revolut.core.faq.data.db.typeconverters.FaqListConverter;
import efm.d0;
import java.util.ArrayList;
import xd2.n;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f304746a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FaqListConverter f304748c = new FaqListConverter();
    public final ag0.a d = new ag0.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gv9.i f304747b = new gv9.i(this, 5);

    public c(FaqDatabase faqDatabase) {
        this.f304746a = faqDatabase;
    }

    @Override // xf0.a
    public final void a(String str) {
        DBUtil.performBlocking(this.f304746a, false, true, new wsg.j(str, 27));
    }

    @Override // xf0.a
    public final int b() {
        return ((Integer) DBUtil.performBlocking(this.f304746a, false, true, new n(9))).intValue();
    }

    @Override // xf0.a
    public final efm.k c(String str, String str2) {
        return RxRoom.createMaybe(this.f304746a, true, false, new wtl.f(this, 18, str, str2));
    }

    @Override // xf0.a
    public final d0 d(String str) {
        return RxRoom.createSingle(this.f304746a, true, false, new b(this, str, 0));
    }

    @Override // xf0.a
    public final d0 e(String str) {
        return RxRoom.createSingle(this.f304746a, true, false, new b(this, str, 1));
    }

    @Override // xf0.a
    public final void f(ArrayList arrayList) {
        DBUtil.performBlocking(this.f304746a, false, true, new x52.a(this, arrayList, 26));
    }
}
