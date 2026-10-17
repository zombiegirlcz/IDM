package g39;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import nsh.o;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f140241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f140242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f140243c;

    public b(o extension, Set controllerExtensions, Set controllerModelExtensions) {
        Intrinsics.checkNotNullParameter(extension, "extension");
        Intrinsics.checkNotNullParameter(controllerExtensions, "controllerExtensions");
        Intrinsics.checkNotNullParameter(controllerModelExtensions, "controllerModelExtensions");
        this.f140241a = extension;
        this.f140242b = controllerExtensions;
        this.f140243c = controllerModelExtensions;
    }
}
