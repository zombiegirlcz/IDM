package com.fourthline.orca.internal;

import android.content.Context;
import android.graphics.Bitmap;
import com.fourthline.orca.internal.gp0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class hp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f29369a;

    public hp0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f29369a = context;
    }

    public final Bitmap a(gp0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (!(file instanceof gp0.a)) {
            if (file instanceof gp0.b) {
                return ((gp0.b) file).a();
            }
            throw new NoWhenBranchMatchedException();
        }
        String path = ((gp0.a) file).a().getPath();
        qj0 qj0Var = new qj0(this.f29369a);
        Intrinsics.h(path);
        return (Bitmap) zhm.d0.d0(qj0Var.a(path));
    }
}
