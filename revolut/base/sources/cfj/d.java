package cfj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tij.b f23720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tij.g f23721b;

    public d(tij.b dataPlanItemsBuilder, tij.g mobilePlanItemsBuilder) {
        Intrinsics.checkNotNullParameter(dataPlanItemsBuilder, "dataPlanItemsBuilder");
        Intrinsics.checkNotNullParameter(mobilePlanItemsBuilder, "mobilePlanItemsBuilder");
        this.f23720a = dataPlanItemsBuilder;
        this.f23721b = mobilePlanItemsBuilder;
    }
}
