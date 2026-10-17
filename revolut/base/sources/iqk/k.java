package iqk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements d {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f167891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f167892b;

    public k(h mapper, f navigationProvider) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(navigationProvider, "navigationProvider");
        this.f167891a = mapper;
        this.f167892b = navigationProvider;
    }
}
