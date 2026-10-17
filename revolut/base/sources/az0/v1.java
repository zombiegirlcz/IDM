package az0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.GlideException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;

/* JADX INFO: loaded from: classes20.dex */
public final class v1 implements u8.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final skm.l f11368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f11369c;

    public v1(Context context, skm.l continuation) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        this.f11367a = context;
        this.f11368b = continuation;
        this.f11369c = new AtomicBoolean(false);
    }

    @Override // u8.g
    public final boolean onLoadFailed(GlideException glideException, Object obj2, v8.l target, boolean z) {
        Intrinsics.checkNotNullParameter(target, "target");
        if (this.f11369c.compareAndSet(false, true)) {
            m.Companion companion = yhm.m.INSTANCE;
            Throwable illegalStateException = glideException;
            if (glideException == null) {
                illegalStateException = new IllegalStateException("Unknown failure in loading wallpaper image");
            }
            this.f11368b.resumeWith(yhm.o.a(illegalStateException));
            ix0.h1.b(new a4.a(this, target, 10));
        }
        return false;
    }

    @Override // u8.g
    public final boolean onResourceReady(Object obj2, Object model, v8.l lVar, c8.a dataSource, boolean z) {
        Drawable resource = (Drawable) obj2;
        Intrinsics.checkNotNullParameter(resource, "resource");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        if (this.f11369c.compareAndSet(false, true)) {
            m.Companion companion = yhm.m.INSTANCE;
            this.f11368b.resumeWith(Unit.f186387a);
        }
        return false;
    }
}
