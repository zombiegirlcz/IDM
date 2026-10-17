package sll;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qll.r;

/* JADX INFO: loaded from: classes12.dex */
public final class h extends a {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f264231b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(z80.b phoneToolsProvider, r inputData) {
        super(phoneToolsProvider);
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f264231b = inputData;
    }
}
