package j3f;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.feature.trading.impl.data.database.TradingDatabase;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f171179a;

    public b(TradingDatabase tradingDatabase) {
        this.f171179a = tradingDatabase;
    }

    public static void b() {
        List list = Collections.EMPTY_LIST;
    }

    @Override // j3f.a
    public final List a() {
        return (List) DBUtil.performBlocking(this.f171179a, true, false, new j1.e(29));
    }
}
