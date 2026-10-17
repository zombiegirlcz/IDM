package androidx.compose.ui.platform;

import android.os.Looper;
import android.view.Choreographer;
import androidx.core.os.HandlerCompat;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import skm.e0;
import skm.p0;
import zkm.o;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lkotlin/coroutines/CoroutineContext;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class AndroidUiDispatcher$Companion$Main$2 extends u implements Function0<CoroutineContext> {
    public static final AndroidUiDispatcher$Companion$Main$2 INSTANCE = new AndroidUiDispatcher$Companion$Main$2();

    public AndroidUiDispatcher$Companion$Main$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final CoroutineContext invoke() {
        Choreographer choreographer;
        if (AndroidUiDispatcher_androidKt.isMainThread()) {
            choreographer = Choreographer.getInstance();
        } else {
            p0 p0Var = p0.f264001a;
            choreographer = (Choreographer) e0.E(o.f323119a, new AndroidUiDispatcher$Companion$Main$2$dispatcher$1(null));
        }
        AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(choreographer, HandlerCompat.createAsync(Looper.getMainLooper()), null);
        return androidUiDispatcher.plus(androidUiDispatcher.getFrameClock());
    }
}
