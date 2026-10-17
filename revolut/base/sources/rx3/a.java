package rx3;

import a0.d;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ve0.c;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f258017a;

    public a(c storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f258017a = storage;
    }

    public final Boolean a(String str, String str2) {
        Boolean bool = (Boolean) this.f258017a.T2(d.s("credit_intro_showed_", str, "_", str2), Boolean.TYPE);
        return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
    }

    public final Unit b(String str, String str2) {
        String strS = d.s("credit_intro_showed_", str, "_", str2);
        this.f258017a.G(Boolean.TRUE, strS, Boolean.TYPE);
        return Unit.f186387a;
    }
}
