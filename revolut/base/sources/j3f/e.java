package j3f;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.feature.trading.impl.data.database.TradingDatabase;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f171181a;

    public e(TradingDatabase tradingDatabase) {
        this.f171181a = tradingDatabase;
    }

    public static void b() {
        List list = Collections.EMPTY_LIST;
    }

    @Override // j3f.c
    public final List a() {
        return (List) DBUtil.performBlocking(this.f171181a, true, false, new d(0));
    }
}
