package svl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sq5.j;
import wul.o;
import xul.n;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements g {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f266042b = new j(14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f266043a;

    public f(o orderMapper, n orderTypeMapper) {
        Intrinsics.checkNotNullParameter(orderMapper, "orderMapper");
        Intrinsics.checkNotNullParameter(orderTypeMapper, "orderTypeMapper");
        this.f266043a = orderTypeMapper;
    }
}
