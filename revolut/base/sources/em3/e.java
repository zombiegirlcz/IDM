package em3;

import cli.k;
import cli.y;
import com.revolut.feature.contacts.api.navigation.BlockUserBottomSheetInputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r10.t;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends oki.h implements dli.b {

    @NotNull
    public static final c Companion = new c();
    public final BlockUserBottomSheetInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f127598p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f127599q;

    public e(h stateMapper, BlockUserBottomSheetInputData inputData, t contactDetailActionsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(contactDetailActionsInteractor, "contactDetailActionsInteractor");
        this.o = inputData;
        this.f127598p = contactDetailActionsInteractor;
        this.f127599q = mra.d.b(this, k.f25028a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f127599q;
    }
}
