package rpl;

import cli.y;
import com.revolut.sso.impl.ui.revolut_id.documents.document_photo.DocumentPhotoScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h extends oki.h implements f {
    public final k o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f256424p;

    public h(DocumentPhotoScreenContract$InputData inputData, l stateMapper, k shareInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(shareInteractor, "shareInteractor");
        this.o = shareInteractor;
        this.f256424p = mra.d.b(this, new c(inputData.f106740a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f256424p;
    }
}
