package c00;

import bw.t;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f20089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f20090b;

    public g(f coordinatesTransformer, t openCvProxy) {
        Intrinsics.checkNotNullParameter(coordinatesTransformer, "coordinatesTransformer");
        Intrinsics.checkNotNullParameter(openCvProxy, "openCvProxy");
        this.f20089a = coordinatesTransformer;
        this.f20090b = openCvProxy;
    }
}
