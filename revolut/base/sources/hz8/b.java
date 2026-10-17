package hz8;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.feature.learn.shared.impl.data.database.LearnDatabase;
import dcl.s0;
import hul.v;
import jz8.o;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f157056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s0 f157057b = new s0(this, 19);

    public b(LearnDatabase learnDatabase) {
        this.f157056a = learnDatabase;
    }

    @Override // hz8.a
    public final void a(o oVar) {
        oVar.getClass();
        DBUtil.performBlocking(this.f157056a, false, true, new v(this, oVar, 13));
    }
}
