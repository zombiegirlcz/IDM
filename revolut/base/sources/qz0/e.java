package qz0;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.GlideException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements u8.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f250319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f250320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f250321c;

    public /* synthetic */ e(Object obj2, Object obj3, int i) {
        this.f250319a = i;
        this.f250320b = obj2;
        this.f250321c = obj3;
    }

    @Override // u8.g
    public final boolean onLoadFailed(GlideException glideException, Object obj2, v8.l target, boolean z) {
        switch (this.f250319a) {
            case 0:
                Intrinsics.checkNotNullParameter(target, "target");
                if (((AtomicBoolean) this.f250320b).compareAndSet(false, true)) {
                    pfm.g gVar = (pfm.g) this.f250321c;
                    Exception exc2 = glideException;
                    if (glideException == null) {
                        exc2 = new Exception("GlideException while prefetch");
                    }
                    gVar.onError(exc2);
                }
                return true;
            default:
                Intrinsics.checkNotNullParameter(target, "target");
                Function0 function0 = (Function0) this.f250321c;
                if (function0 == null) {
                    return false;
                }
                function0.invoke();
                return false;
        }
    }

    @Override // u8.g
    public final boolean onResourceReady(Object obj2, Object model, v8.l lVar, c8.a dataSource, boolean z) {
        switch (this.f250319a) {
            case 0:
                Intrinsics.checkNotNullParameter((Drawable) obj2, "resource");
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                if (((AtomicBoolean) this.f250320b).compareAndSet(false, true)) {
                    ((pfm.g) this.f250321c).onComplete();
                }
                break;
            default:
                Drawable resource = (Drawable) obj2;
                Intrinsics.checkNotNullParameter(resource, "resource");
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                Function1 function1 = (Function1) this.f250320b;
                if (function1 != null) {
                    function1.invoke(resource);
                }
                break;
        }
        return false;
    }
}
