package fem;

import kem.q0;
import kem.v;
import kem.y;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public interface b extends v, CoroutineScope {
    oem.e getAttributes();

    CoroutineContext getCoroutineContext();

    y getMethod();

    q0 getUrl();
}
