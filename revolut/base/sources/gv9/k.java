package gv9;

import androidx.room.RoomDatabase;
import androidx.room.RxRoom;
import com.revolut.feature.payments.messaging.data.impl.data.database.SocialPaymentsDatabase;
import gqd.s;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f147117a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fv9.a f147119c = new fv9.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ay1.f f147118b = new ay1.f(this, 5);

    public k(SocialPaymentsDatabase socialPaymentsDatabase) {
        this.f147117a = socialPaymentsDatabase;
    }

    public static void a() {
        List list = Collections.EMPTY_LIST;
    }

    public final efm.b b(List list) {
        list.getClass();
        return RxRoom.createCompletable(this.f147117a, false, true, new s(this, list, 26));
    }
}
