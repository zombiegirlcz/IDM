package afe;

import elm.f;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements yee.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4029a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4030b;

    public b(bfe.d detector) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        this.f4030b = detector;
    }

    @Override // yee.a
    public final Object a(Continuation continuation) {
        Continuation continuation2 = null;
        switch (this.f4029a) {
            case 0:
                a aVar = new a(this, continuation2, 0);
                p0 p0Var = p0.f264001a;
                return e0.J(f.f127540b, aVar, continuation);
            default:
                a aVar2 = new a(this, continuation2, 2);
                p0 p0Var2 = p0.f264001a;
                return e0.J(f.f127540b, aVar2, continuation);
        }
    }

    public b(Set appDetectors) {
        Intrinsics.checkNotNullParameter(appDetectors, "appDetectors");
        this.f4030b = appDetectors;
    }
}
