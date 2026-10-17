package fgl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r10.a f135098a;

    public f(r10.a instrumentImageConfigProvider) {
        Intrinsics.checkNotNullParameter(instrumentImageConfigProvider, "instrumentImageConfigProvider");
        this.f135098a = instrumentImageConfigProvider;
    }

    public final String a(String ref2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        String strM0 = this.f135098a.m0();
        if (strM0 != null) {
            return com.google.android.gms.internal.mlkit_vision_face.a.o(strM0, ref2, "@4x.png");
        }
        return null;
    }
}
