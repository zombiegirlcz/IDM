package fgl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r10.a f135099a;

    public h(r10.a instrumentImageConfigProvider) {
        Intrinsics.checkNotNullParameter(instrumentImageConfigProvider, "instrumentImageConfigProvider");
        this.f135099a = instrumentImageConfigProvider;
    }

    public final String a(String origin, String id10) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(id10, "id");
        String strM0 = this.f135099a.m0();
        if (strM0 != null) {
            return com.google.android.gms.internal.mlkit_vision_face.a.p(strM0, origin, "-", id10, "-issuer@4x.png");
        }
        return null;
    }
}
