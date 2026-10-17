package fc7;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import nsh.o;

/* JADX INFO: loaded from: classes21.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f133655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f133656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f133657c;

    public h(o extension, Set controllerExtensions, Set controllerModelExtensions) {
        Intrinsics.checkNotNullParameter(extension, "extension");
        Intrinsics.checkNotNullParameter(controllerExtensions, "controllerExtensions");
        Intrinsics.checkNotNullParameter(controllerModelExtensions, "controllerModelExtensions");
        this.f133655a = extension;
        this.f133656b = controllerExtensions;
        this.f133657c = controllerModelExtensions;
    }
}
