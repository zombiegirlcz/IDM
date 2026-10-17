package ro5;

import androidx.room.RoomDatabase;
import com.revolut.feature.crypto.withdraw.impl.database.CryptoWithdrawDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f255882a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public to5.d f255884c;
    public to5.b d;
    public to5.c e;
    public to5.a f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f255883b = new c(this, 0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f255885g = new c(this, 1);

    public d(CryptoWithdrawDatabase cryptoWithdrawDatabase) {
        this.f255882a = cryptoWithdrawDatabase;
    }

    public final synchronized to5.a a() {
        try {
            if (this.f == null) {
                this.f = (to5.a) this.f255882a.getTypeConverter(to5.a.class);
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return this.f;
    }

    public final synchronized to5.b b() {
        try {
            if (this.d == null) {
                this.d = (to5.b) this.f255882a.getTypeConverter(to5.b.class);
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return this.d;
    }

    public final synchronized to5.c c() {
        try {
            if (this.e == null) {
                this.e = (to5.c) this.f255882a.getTypeConverter(to5.c.class);
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return this.e;
    }

    public final synchronized to5.d d() {
        try {
            if (this.f255884c == null) {
                this.f255884c = (to5.d) this.f255882a.getTypeConverter(to5.d.class);
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return this.f255884c;
    }
}
