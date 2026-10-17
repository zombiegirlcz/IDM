package iam;

import io.fotoapparat.exception.camera.CameraException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends u implements Function1 {
    public static final a f = new a(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        CameraException it8 = (CameraException) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        return Unit.f186387a;
    }
}
