package doc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class w {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r10.r f116524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f116525b;

    public w(foc.g dataMapper, r10.r uiMapperProvider, v parcelMapper) {
        Intrinsics.checkNotNullParameter(dataMapper, "dataMapper");
        Intrinsics.checkNotNullParameter(uiMapperProvider, "uiMapperProvider");
        Intrinsics.checkNotNullParameter(parcelMapper, "parcelMapper");
        this.f116524a = uiMapperProvider;
        this.f116525b = parcelMapper;
    }
}
