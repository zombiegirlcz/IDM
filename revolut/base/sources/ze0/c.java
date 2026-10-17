package ze0;

import ald.o;
import java.util.concurrent.ConcurrentHashMap;
import jki.d;
import kotlin.jvm.internal.Intrinsics;
import no.f2;
import qe0.s;
import ue0.e;

/* JADX INFO: loaded from: classes.dex */
public final class c implements a {
    public final s a(ue0.c storage, long j2) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new s(new d(2, storage, e.class, "putSync", "putSync(Lcom/revolut/core/data/storage/Storage;Ljava/lang/String;Ljava/lang/Object;)V", 1, 10), new f2(storage, 27), j2);
    }

    public final s b(long j2) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        return new s(new b(2, 8, ConcurrentHashMap.class, concurrentHashMap, "put", "put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"), new o(1, concurrentHashMap, ConcurrentHashMap.class, "get", "get(Ljava/lang/Object;)Ljava/lang/Object;", 0, 20), j2);
    }
}
