package b22;

import cli.y;
import com.revolut.feature.apm.core.ui.impl.ui.alias_claim.form.upload.ApmAliasClaimUploadScreenContract$InputData;
import e60.s;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class m extends oki.h implements dli.b {
    public final e60.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f11867p;

    public m(e60.a mediaPickerControllerExtension, ApmAliasClaimUploadScreenContract$InputData inputData, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(mediaPickerControllerExtension, "mediaPickerControllerExtension");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mediaPickerControllerExtension;
        this.f11867p = mra.d.b(this, new e(inputData.f62342a), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, new an9.i(rd0.e.b(((s) this.o).f122868g), 18), null, null, new avk.i(this, null, 15), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f11867p;
    }
}
