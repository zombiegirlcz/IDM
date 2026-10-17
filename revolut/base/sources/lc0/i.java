package lc0;

import android.graphics.Bitmap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f193754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f193755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f193756c;

    public i(Bitmap bitmap, boolean z, Function1 onCreated) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(onCreated, "onCreated");
        this.f193754a = bitmap;
        this.f193755b = z;
        this.f193756c = onCreated;
    }
}
