package com.revolut.feature.onboarding.impl.missinginfo;

import ang.f;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.onboarding.impl.missinginfo.MissingInfoFlowContract$Step;
import com.revolut.feature_retail_user_declarations.occupation.OccupationChooserFlowInputData;
import com.revolut.feature_retail_user_declarations.purpose.PurposeOfAccountFlowInputData;
import com.revolut.feature_retail_user_declarations.purpose.model.PurposeOfAccountProductType;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.kompot.navigable.vc.ViewController;
import dki.g;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import y7k.g0;
import y99.h;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends g implements y99.d {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final h f78299t;
    public final aci.a u;
    public final bci.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final f f78300w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final MissingInfoFlowContract$Step f78301x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final MissingInfoFlowContract$State f78302y;

    public d(MissingInfoFlowContract$InputData input, h router, aci.a purposeOfAccountInteractor, bci.d purposeOfAccountDtoMapper, f userInteractor) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(purposeOfAccountInteractor, "purposeOfAccountInteractor");
        Intrinsics.checkNotNullParameter(purposeOfAccountDtoMapper, "purposeOfAccountDtoMapper");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f78299t = router;
        this.u = purposeOfAccountInteractor;
        this.v = purposeOfAccountDtoMapper;
        this.f78300w = userInteractor;
        this.f78301x = input.f78290a;
        this.f78302y = MissingInfoFlowContract$State.f78291a;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        MissingInfoFlowContract$Step step = (MissingInfoFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof MissingInfoFlowContract$Step.PurposeOfAccount) {
            ViewController viewControllerE1 = e1(new ybi.a(new PurposeOfAccountFlowInputData(((MissingInfoFlowContract$Step.PurposeOfAccount) step).f78293a, PurposeOfAccountProductType.Personal.f97718a, null, null, null, null, 60)));
            g0 block = new g0(this, viewControllerE1, 2);
            Intrinsics.checkNotNullParameter(block, "block");
            viewControllerE1.H = block;
            return viewControllerE1;
        }
        if (!(step instanceof MissingInfoFlowContract$Step.OccupationChooser)) {
            throw new NoWhenBranchMatchedException();
        }
        ViewController viewControllerE12 = e1(new rbi.b(new OccupationChooserFlowInputData(((MissingInfoFlowContract$Step.OccupationChooser) step).f78292a, new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), 28)));
        y8a.h block2 = new y8a.h(this, 2);
        Intrinsics.checkNotNullParameter(block2, "block");
        viewControllerE12.H = block2;
        return viewControllerE12;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.f78302y;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f78301x;
    }
}
