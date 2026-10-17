package u2a;

import com.revolut.feature.payments.transfers.personalisation.impl.ui.gallery.TransferPersonalisationGallerySelectorContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferPersonalisationGallerySelectorContract$InputData f276583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r2a.a f276584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f80.a f276585c;

    public a(TransferPersonalisationGallerySelectorContract$InputData inputData, r2a.a personalisationUiInfoMapper, f80.a uriHelper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(personalisationUiInfoMapper, "personalisationUiInfoMapper");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.f276583a = inputData;
        this.f276584b = personalisationUiInfoMapper;
        this.f276585c = uriHelper;
    }
}
