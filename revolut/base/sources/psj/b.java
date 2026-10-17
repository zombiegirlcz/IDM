package psj;

import androidx.room.RoomDatabase;
import ay1.f;
import com.revolut.retail.feature.impl.AnalyticsDatabase;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f239492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f239493b = new f(this, 18);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public qsj.b f239494c;

    public b(AnalyticsDatabase analyticsDatabase) {
        this.f239492a = analyticsDatabase;
    }

    public final synchronized qsj.b a() {
        try {
            if (this.f239494c == null) {
                this.f239494c = (qsj.b) this.f239492a.getTypeConverter(qsj.b.class);
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return this.f239494c;
    }
}
