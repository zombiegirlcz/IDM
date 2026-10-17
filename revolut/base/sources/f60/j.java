package f60;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class j implements e4m.e {
    public static e60.s a(com.revolut.kompot.navigable.a controller, t80.v mediaPicker, e60.z itemsProvider, rp0.m dialogDisplayer, e60.t extensionModel, nji.b controllerUtils) {
        a.Companion.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(mediaPicker, "mediaPicker");
        Intrinsics.checkNotNullParameter(itemsProvider, "itemsProvider");
        Intrinsics.checkNotNullParameter(dialogDisplayer, "dialogDisplayer");
        Intrinsics.checkNotNullParameter(extensionModel, "extensionModel");
        Intrinsics.checkNotNullParameter(controllerUtils, "controllerUtils");
        return new e60.s(controller, mediaPicker, itemsProvider, dialogDisplayer, extensionModel, controllerUtils);
    }
}
