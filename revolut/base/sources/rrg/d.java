package rrg;

import com.revolut.feature.view.image.impl.ui.gallery.ImageGalleryScreenContract$InputData;
import jki.g;
import jki.h;
import jki.i;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends g implements h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f256838p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p stateMapper, ImageGalleryScreenContract$InputData inputData) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f256838p = new b(inputData.f94825a, inputData.f94826b);
    }

    @Override // jki.g
    public final i r2() {
        return this.f256838p;
    }
}
