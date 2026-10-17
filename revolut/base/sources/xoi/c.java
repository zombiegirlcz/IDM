package xoi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class c extends fsi.c implements nri.c {

    @NotNull
    public static final b Companion = new b();
    public static final fsi.b i = new fsi.b("EXTERNAL_SCREEN_DELEGATE_ID");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final yri.a f307856h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(yri.a screensInteractor) {
        super(i);
        Intrinsics.checkNotNullParameter(screensInteractor, "screensInteractor");
        this.f307856h = screensInteractor;
    }

    @Override // nri.c
    public final void z0() {
        this.f307856h.b(true);
    }
}
