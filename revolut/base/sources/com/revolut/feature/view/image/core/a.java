package com.revolut.feature.view.image.core;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.FileImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.b;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.view.image.core.BaseViewImageContract$InputData;
import hrg.c;
import hrg.d;
import java.io.File;
import jki.i;
import jki.m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.y0;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseViewImageContract$InputData f94815a;

    public a(BaseViewImageContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f94815a = inputData;
    }

    @Override // jki.p
    public final m a(i iVar) {
        Image urlImage;
        hrg.a domainState = (hrg.a) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        BaseViewImageContract$InputData baseViewImageContract$InputData = this.f94815a;
        if (baseViewImageContract$InputData instanceof BaseViewImageContract$InputData.Local) {
            urlImage = new FileImage(((BaseViewImageContract$InputData.Local) baseViewImageContract$InputData).f94812a, (FileImage.Placeholder) null, new ImageTransformations((CircleTransformation) null, false, true, (Integer) null, (Integer) null, (Integer) null, 475), 10);
        } else {
            if (!(baseViewImageContract$InputData instanceof BaseViewImageContract$InputData.Remote)) {
                throw new NoWhenBranchMatchedException();
            }
            BaseViewImageContract$InputData.Remote remote = (BaseViewImageContract$InputData.Remote) baseViewImageContract$InputData;
            String str = remote.f94813a;
            UrlImage.SimpleCustomHeaders simpleCustomHeaders = new UrlImage.SimpleCustomHeaders(y0.b("X-Device-Id"), domainState.f154823a);
            ImageTransformations imageTransformations = new ImageTransformations((CircleTransformation) null, false, true, (Integer) null, (Integer) null, (Integer) null, 475);
            File file = remote.f94814b;
            urlImage = new UrlImage(str, null, null, null, 0L, simpleCustomHeaders, null, null, null, file != null ? new FileImage(file, (FileImage.Placeholder) null, new ImageTransformations((CircleTransformation) null, false, true, (Integer) null, (Integer) null, (Integer) null, 475), 10) : b.c("3D018", null, null, null, 30), false, imageTransformations, null, null, false, false, 504766);
        }
        return new d(urlImage);
    }
}
