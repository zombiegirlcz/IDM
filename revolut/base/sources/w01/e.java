package w01;

import android.content.Context;
import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Bitmap.CompressFormat f293609c = Bitmap.CompressFormat.JPEG;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f293610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zk0.b f293611b;

    public e(Context context, zk0.b fileSystemRepository) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
        this.f293610a = context;
        this.f293611b = fileSystemRepository;
    }
}
