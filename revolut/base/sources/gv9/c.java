package gv9;

import androidx.room.RxRoom;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface c {

    @NotNull
    public static final b Companion = b.f147091a;

    static efm.b a(c cVar, String str, String str2, String str3, Long l2, Long l3, int i) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            l2 = null;
        }
        if ((i & 16) != 0) {
            l3 = null;
        }
        return RxRoom.createCompletable(((j) cVar).f147114a, false, true, new a5b.a(str2, (Object) str3, (Object) l2, (Object) l3, (Object) str, 18));
    }
}
