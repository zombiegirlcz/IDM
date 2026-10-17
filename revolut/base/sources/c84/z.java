package c84;

import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class z extends yji.n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g f22113l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final rz3.c f22114m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final PluginFlowContract$Input f22115n;

    public z(g pluginControllerModelExtension, rz3.c creditApplicationRouter, PluginFlowContract$Input input) {
        Intrinsics.checkNotNullParameter(pluginControllerModelExtension, "pluginControllerModelExtension");
        Intrinsics.checkNotNullParameter(creditApplicationRouter, "creditApplicationRouter");
        Intrinsics.checkNotNullParameter(input, "input");
        this.f22113l = pluginControllerModelExtension;
        this.f22114m = creditApplicationRouter;
        this.f22115n = input;
    }
}
