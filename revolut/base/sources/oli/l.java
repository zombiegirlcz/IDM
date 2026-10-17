package oli;

import android.os.Bundle;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import t80.t;
import vkm.t1;

/* JADX INFO: loaded from: classes10.dex */
public interface l {
    void e(Bundle bundle);

    void g(Bundle bundle);

    default Object h(int i, int i2, t tVar) {
        return Unit.f186387a;
    }

    t80.i i();

    t1 j();

    Object k(String str, Continuation continuation);

    default void onCreate() {
    }

    default void onDestroy() {
    }
}
