package fah;

import kotlin.jvm.internal.Intrinsics;
import nii.y0;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f133408l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final n60.a f133409m;

    public a(c networkConnectionErrorStatusDialogMapper, n60.a keyboardControllerExtension) {
        Intrinsics.checkNotNullParameter(networkConnectionErrorStatusDialogMapper, "networkConnectionErrorStatusDialogMapper");
        Intrinsics.checkNotNullParameter(keyboardControllerExtension, "keyboardControllerExtension");
        this.f133408l = networkConnectionErrorStatusDialogMapper;
        this.f133409m = keyboardControllerExtension;
    }

    @Override // fah.b
    public final boolean Z2(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (!tj0.a.a(error)) {
            return false;
        }
        this.f133409m.R();
        this.f133408l.getClass();
        L2(new y0("no-connection-dialog", c.a(), false, 4));
        return true;
    }
}
