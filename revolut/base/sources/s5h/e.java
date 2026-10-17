package s5h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f260080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gjh.e f260081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f260082c;

    public e(b controllerExtension, gjh.e controllerModelExtension, d mapper) {
        Intrinsics.checkNotNullParameter(controllerExtension, "controllerExtension");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f260080a = controllerExtension;
        this.f260081b = controllerModelExtension;
        this.f260082c = mapper;
    }
}
