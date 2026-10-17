package com.fourthline.orca.internal;

import com.google.common.base.Optional;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class nn {
    public final ww a(fe1 viewNavigator, Optional customClicksHandler) {
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(customClicksHandler, "customClicksHandler");
        Object objOr = customClicksHandler.or(new qm(viewNavigator));
        Intrinsics.checkNotNullExpressionValue(objOr, "or(...)");
        return (ww) objOr;
    }

    public final ww c(fe1 viewNavigator, Optional customClicksHandler) {
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(customClicksHandler, "customClicksHandler");
        Object objOr = customClicksHandler.or(new mo(viewNavigator));
        Intrinsics.checkNotNullExpressionValue(objOr, "or(...)");
        return (ww) objOr;
    }

    public final ww b(fe1 viewNavigator, Optional customClicksHandler) {
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(customClicksHandler, "customClicksHandler");
        Object objOr = customClicksHandler.or(new sm(viewNavigator));
        Intrinsics.checkNotNullExpressionValue(objOr, "or(...)");
        return (ww) objOr;
    }

    public final yw a(Optional customStateBuilder, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(customStateBuilder, "customStateBuilder");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        Object objOr = customStateBuilder.or(new rm(imageServiceLocator));
        Intrinsics.checkNotNullExpressionValue(objOr, "or(...)");
        return (yw) objOr;
    }

    public final yw b(Optional customStateBuilder, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(customStateBuilder, "customStateBuilder");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        Object objOr = customStateBuilder.or(new no(true, imageServiceLocator));
        Intrinsics.checkNotNullExpressionValue(objOr, "or(...)");
        return (yw) objOr;
    }

    public final yw a(to repository, Optional customStateBuilder, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(customStateBuilder, "customStateBuilder");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        Object objOr = customStateBuilder.or(new tm(false, new ol1(repository, 5), imageServiceLocator));
        Intrinsics.checkNotNullExpressionValue(objOr, "or(...)");
        return (yw) objOr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int a(to toVar) {
        return toVar.k().getValidationConfig().getMinPersonAge();
    }

    public final ap a(Optional customProvider) {
        Intrinsics.checkNotNullParameter(customProvider, "customProvider");
        return (ap) customProvider.or(new ze());
    }
}
