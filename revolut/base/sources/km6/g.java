package km6;

import cli.y;
import cli.z;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends h implements z {
    public final f80.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f185728p;

    public g(c inputData, f80.a uriHelper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.o = uriHelper;
        this.f185728p = mra.d.b(this, new b(inputData.f185724a), new a54.b(17), null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f185728p;
    }
}
