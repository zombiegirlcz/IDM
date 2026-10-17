package l1a;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import thf.m;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f191503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f01.a f191504b;

    public c(m transactionTextResourcesMapper, f01.a uiKitResources) {
        Intrinsics.checkNotNullParameter(transactionTextResourcesMapper, "transactionTextResourcesMapper");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f191503a = transactionTextResourcesMapper;
        this.f191504b = uiKitResources;
    }
}
