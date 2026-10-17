package hz8;

import androidx.room.RoomDatabase;
import com.revolut.feature.learn.shared.impl.data.database.LearnDatabase;
import dcl.s0;
import u09.v;

/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f157078a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gz8.c f157080c = new gz8.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s0 f157079b = new s0(this, 24);

    public k(LearnDatabase learnDatabase) {
        this.f157078a = learnDatabase;
    }

    public static String a(v vVar) {
        switch (j.f157077a[vVar.ordinal()]) {
            case 1:
                return "CRYPTO";
            case 2:
                return "TRADING";
            case 3:
                return "FRAUD";
            case 4:
                return "APP_TIPS";
            case 5:
                return "PRO";
            case 6:
                return "YOUTH_TRADING";
            default:
                throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + vVar);
        }
    }
}
