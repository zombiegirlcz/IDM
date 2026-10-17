package com.revolut.feature.view.image.impl.flow;

import com.revolut.feature.view.image.core.BaseViewImageContract$InputData;
import com.revolut.feature.view.image.impl.flow.ViewImageFlowContract$InputData;
import com.revolut.feature.view.image.impl.flow.ViewImageFlowContract$Step;
import com.revolut.feature.view.image.impl.ui.PreviewImageScreen;
import com.revolut.feature.view.image.impl.ui.gallery.ImageGalleryScreen;
import com.revolut.feature.view.image.impl.ui.gallery.ImageGalleryScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import org.c;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends g implements nrg.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ViewImageFlowContract$Step f94824t;
    public final ViewImageFlowContract$EmptyState u;

    public a(ViewImageFlowContract$InputData inputData, org.a dataMapper) {
        ViewImageFlowContract$Step.PreviewImage previewImage;
        ViewImageFlowContract$Step imageGallery;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dataMapper, "dataMapper");
        if (inputData instanceof ViewImageFlowContract$InputData.Gallery) {
            ViewImageFlowContract$InputData.Gallery gallery = (ViewImageFlowContract$InputData.Gallery) inputData;
            imageGallery = new ViewImageFlowContract$Step.ImageGallery(new ImageGalleryScreenContract$InputData(gallery.f94817a, gallery.f94818b));
        } else {
            if (inputData instanceof ViewImageFlowContract$InputData.Local) {
                ViewImageFlowContract$InputData.Local inputData2 = (ViewImageFlowContract$InputData.Local) inputData;
                ((c) dataMapper).getClass();
                Intrinsics.checkNotNullParameter(inputData2, "inputData");
                previewImage = new ViewImageFlowContract$Step.PreviewImage(new BaseViewImageContract$InputData.Local(inputData2.f94819a));
            } else {
                if (!(inputData instanceof ViewImageFlowContract$InputData.Remote)) {
                    throw new NoWhenBranchMatchedException();
                }
                ViewImageFlowContract$InputData.Remote inputData3 = (ViewImageFlowContract$InputData.Remote) inputData;
                c cVar = (c) dataMapper;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(inputData3, "inputData");
                String str = inputData3.f94820a;
                previewImage = new ViewImageFlowContract$Step.PreviewImage(new BaseViewImageContract$InputData.Remote(inputData3.f94821b, a0.H(str, "http", false) ? str : com.google.android.gms.internal.mlkit_vision_face.a.o(d0.g0(cVar.f228956a, "/"), "/", d0.e0(str, "/"))));
            }
            imageGallery = previewImage;
        }
        this.f94824t = imageGallery;
        this.u = ViewImageFlowContract$EmptyState.f94816a;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        ViewImageFlowContract$Step step = (ViewImageFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof ViewImageFlowContract$Step.PreviewImage) {
            return new PreviewImageScreen(((ViewImageFlowContract$Step.PreviewImage) step).f94823a);
        }
        if (step instanceof ViewImageFlowContract$Step.ImageGallery) {
            return new ImageGalleryScreen(((ViewImageFlowContract$Step.ImageGallery) step).f94822a);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.u;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f94824t;
    }
}
