package d9a;

import com.revolut.feature.pix.api.model.AliasRegistrationType;
import d3i.g;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends h {
    public final AliasRegistrationType o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z8a.a f112358p;

    public d(AliasRegistrationType inputData, z8a.a aliasRegistrationExtension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(aliasRegistrationExtension, "aliasRegistrationExtension");
        this.o = inputData;
        this.f112358p = aliasRegistrationExtension;
    }

    @Override // yji.l
    public final void I1() {
        l2(new g(this, this.o, null, 8), new yi5.b(26));
    }
}
