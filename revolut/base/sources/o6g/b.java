package o6g;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f222594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z80.b f222595b;

    public b(d passengerFieldMapper, z80.b phoneToolsProvider) {
        Intrinsics.checkNotNullParameter(passengerFieldMapper, "passengerFieldMapper");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        this.f222594a = passengerFieldMapper;
        this.f222595b = phoneToolsProvider;
    }
}
