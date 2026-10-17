package hc0;

import android.graphics.Bitmap;
import efm.d0;
import f0d.m;
import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lc0.j;
import pfm.h;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f150763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bitmap f150764b;

    public /* synthetic */ a(Bitmap bitmap, int i) {
        this.f150763a = i;
        this.f150764b = bitmap;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f150763a) {
            case 0:
                File file = (File) obj2;
                Intrinsics.checkNotNullParameter(file, "file");
                return new h(new m(file, this.f150764b, 29), 2).f(d0.m(file));
            default:
                j updateStateWithCameraMode = (j) obj2;
                Intrinsics.checkNotNullParameter(updateStateWithCameraMode, "$this$updateStateWithCameraMode");
                return j.a(updateStateWithCameraMode, null, null, this.f150764b, null, null, false, 123);
        }
    }
}
