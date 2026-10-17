package fbc;

import kbc.c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kbc.b f133535a;

    public b(kbc.b deliveryMapper, c orderImageMapper) {
        Intrinsics.checkNotNullParameter(deliveryMapper, "deliveryMapper");
        Intrinsics.checkNotNullParameter(orderImageMapper, "orderImageMapper");
        this.f133535a = deliveryMapper;
    }
}
