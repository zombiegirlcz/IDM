package xz0;

import com.bumptech.glide.load.engine.GlideException;
import java.io.File;
import java.util.Optional;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import v8.l;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements u8.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ufm.a f309756a;

    public b(ufm.a aVar) {
        this.f309756a = aVar;
    }

    @Override // u8.g
    public final boolean onLoadFailed(GlideException glideException, Object obj2, l target, boolean z) {
        Intrinsics.checkNotNullParameter(target, "target");
        this.f309756a.b(Optional.empty());
        return true;
    }

    @Override // u8.g
    public final boolean onResourceReady(Object obj2, Object model, l lVar, c8.a dataSource, boolean z) {
        File resource = (File) obj2;
        Intrinsics.checkNotNullParameter(resource, "resource");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.f309756a.b(u1.a(resource));
        return true;
    }
}
