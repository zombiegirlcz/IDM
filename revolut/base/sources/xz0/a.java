package xz0;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.GlideException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import v8.l;

/* JADX INFO: loaded from: classes.dex */
public final class a implements u8.g {
    private a() {
    }

    @Override // u8.g
    public final boolean onLoadFailed(GlideException glideException, Object obj2, l target, boolean z) {
        Intrinsics.checkNotNullParameter(target, "target");
        if ((obj2 instanceof j ? (j) obj2 : null) == null) {
            return false;
        }
        c.f309757c.put(((j) obj2).f309768a, Unit.f186387a);
        return false;
    }

    @Override // u8.g
    public final boolean onResourceReady(Object obj2, Object model, l lVar, c8.a dataSource, boolean z) {
        Drawable resource = (Drawable) obj2;
        Intrinsics.checkNotNullParameter(resource, "resource");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        return false;
    }
}
