package mjj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f206054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wnj.a f206055b;

    public d(a allowancesIconsMapper, wnj.a descriptorApplier) {
        Intrinsics.checkNotNullParameter(allowancesIconsMapper, "allowancesIconsMapper");
        Intrinsics.checkNotNullParameter(descriptorApplier, "descriptorApplier");
        this.f206054a = allowancesIconsMapper;
        this.f206055b = descriptorApplier;
    }
}
