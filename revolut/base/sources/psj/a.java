package psj;

import androidx.room.RoomDatabase;
import ay1.f;
import com.revolut.retail.feature.impl.AnalyticsDatabase;
import qsj.c;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f239489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f239490b = new f(this, 17);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public qsj.a f239491c;
    public c d;

    public a(AnalyticsDatabase analyticsDatabase) {
        this.f239489a = analyticsDatabase;
    }

    public final synchronized qsj.a a() {
        try {
            if (this.f239491c == null) {
                this.f239491c = (qsj.a) this.f239489a.getTypeConverter(qsj.a.class);
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return this.f239491c;
    }

    public final synchronized c b() {
        try {
            if (this.d == null) {
                this.d = (c) this.f239489a.getTypeConverter(c.class);
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return this.d;
    }
}
