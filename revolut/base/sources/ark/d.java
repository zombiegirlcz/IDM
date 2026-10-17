package ark;

import androidx.room.RoomDatabase;
import com.revolut.retail.feature.stockdetails.impl.data.database.StockDetailsDatabase;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f8731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f8732b = new c(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f8733c = new c(this, 1);

    public d(StockDetailsDatabase stockDetailsDatabase) {
        this.f8731a = stockDetailsDatabase;
    }
}
