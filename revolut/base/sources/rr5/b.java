package rr5;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import nsh.o;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f256694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f256695b;

    public b(o extension, Set controllerModelExtensions) {
        Intrinsics.checkNotNullParameter(extension, "extension");
        Intrinsics.checkNotNullParameter(controllerModelExtensions, "controllerModelExtensions");
        this.f256694a = extension;
        this.f256695b = controllerModelExtensions;
    }
}
