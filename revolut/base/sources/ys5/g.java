package ys5;

import aii.u;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements sr5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f316407a;

    public g(h hVar) {
        this.f316407a = hVar;
    }

    @Override // sr5.a
    public final void a(rhf.e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f316407a.e.b(new dt5.b(descriptor));
    }

    @Override // sr5.a
    public final void b(u destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f316407a.e.b(new dt5.d(destination));
    }
}
