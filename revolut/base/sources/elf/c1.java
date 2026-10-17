package elf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class c1 extends yji.n {

    @NotNull
    public static final b1 Companion = new b1();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f01.a f127304l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c70.a f127305m;

    public c1(f01.a uiKitResources, c70.a clipboard) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        this.f127304l = uiKitResources;
        this.f127305m = clipboard;
    }
}
