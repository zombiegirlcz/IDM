package qz0;

import android.graphics.drawable.PictureDrawable;
import com.bumptech.glide.load.engine.GlideException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class m extends vz0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function0 f250331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f250332b;

    public m(Function0 function0, Function1 function1) {
        this.f250331a = function0;
        this.f250332b = function1;
    }

    @Override // vz0.c
    public final void a(PictureDrawable resource, Object model, v8.l lVar, c8.a dataSource, boolean z) {
        Intrinsics.checkNotNullParameter(resource, "resource");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Function1 function1 = this.f250332b;
        if (function1 != null) {
            function1.invoke(resource);
        }
        super.a(resource, model, lVar, dataSource, z);
    }

    @Override // vz0.c, u8.g
    public final boolean onLoadFailed(GlideException glideException, Object obj2, v8.l target, boolean z) {
        Intrinsics.checkNotNullParameter(target, "target");
        Function0 function0 = this.f250331a;
        if (function0 != null) {
            function0.invoke();
        }
        super.onLoadFailed(glideException, obj2, target, z);
        return false;
    }

    @Override // vz0.c, u8.g
    public final /* bridge */ /* synthetic */ boolean onResourceReady(Object obj2, Object obj3, v8.l lVar, c8.a aVar, boolean z) {
        a((PictureDrawable) obj2, obj3, lVar, aVar, z);
        return false;
    }
}
