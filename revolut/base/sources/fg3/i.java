package fg3;

import cli.y;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends oki.h implements dli.b {

    @NotNull
    public static final h Companion = new h();
    public final zf3.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jg3.a f134892p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f134893q;

    public i(b inputData, j stateMapper, zf3.a checkTopUpInteractor, jg3.a checkTopUpScanDialogHelper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(checkTopUpInteractor, "checkTopUpInteractor");
        Intrinsics.checkNotNullParameter(checkTopUpScanDialogHelper, "checkTopUpScanDialogHelper");
        this.o = checkTopUpInteractor;
        this.f134892p = checkTopUpScanDialogHelper;
        this.f134893q = mra.d.b(this, new a(inputData.f134886a, inputData.f134887b), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f134893q;
    }
}
