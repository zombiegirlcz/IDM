package d28;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import nsh.o;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f110782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f110783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f110784c;

    public f(o extension, Set controllerExtensions, Set controllerModelExtensions) {
        Intrinsics.checkNotNullParameter(extension, "extension");
        Intrinsics.checkNotNullParameter(controllerExtensions, "controllerExtensions");
        Intrinsics.checkNotNullParameter(controllerModelExtensions, "controllerModelExtensions");
        this.f110782a = extension;
        this.f110783b = controllerExtensions;
        this.f110784c = controllerModelExtensions;
    }
}
