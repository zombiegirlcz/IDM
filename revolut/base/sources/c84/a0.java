package c84;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public abstract class a0 extends oki.h implements yki.g {
    public final g o;

    public a0(g pluginControllerModelExtension) {
        Intrinsics.checkNotNullParameter(pluginControllerModelExtension, "pluginControllerModelExtension");
        this.o = pluginControllerModelExtension;
    }

    @Override // yji.l
    public boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return this.o.d3(throwable);
    }
}
