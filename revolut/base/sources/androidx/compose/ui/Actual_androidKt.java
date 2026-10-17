package androidx.compose.ui;

import a3l.c;
import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0000\u001a\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0000\u001a\u0012\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"currentTimeMillis", "", "handler", "Landroid/os/Handler;", "postDelayed", "", "delayMillis", "block", "Lkotlin/Function0;", "", "removePost", "token", "ui"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class Actual_androidKt {

    @NotNull
    private static final Handler handler = new Handler(Looper.getMainLooper());

    public static final long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @NotNull
    public static final Object postDelayed(long j2, @NotNull Function0<Unit> function0) {
        c cVar = new c(5, function0);
        handler.postDelayed(cVar, j2);
        return cVar;
    }

    public static final void removePost(Object obj2) {
        if ((obj2 instanceof Runnable ? (Runnable) obj2 : null) == null) {
            return;
        }
        handler.removeCallbacks((Runnable) obj2);
    }
}
