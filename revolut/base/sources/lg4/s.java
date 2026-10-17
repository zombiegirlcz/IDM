package lg4;

import cli.y;
import com.revolut.feature.credit.application.plugins.impl.ui.photo_upload.summary.PhotosUploadSummaryControllerContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class s extends oki.h implements j {
    public final PhotosUploadSummaryControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wx3.c f195063p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f195064q;

    public s(cli.n stateMapper, PhotosUploadSummaryControllerContract$InputData inputData, wx3.c photosUploadPluginInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(photosUploadPluginInteractor, "photosUploadPluginInteractor");
        this.o = inputData;
        this.f195063p = photosUploadPluginInteractor;
        this.f195064q = mra.d.b(this, new i(f0.f322471a), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, this.f195063p.a(this.o.f68203a), null, new le8.d(this, (Continuation) null, 3), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f195064q;
    }
}
