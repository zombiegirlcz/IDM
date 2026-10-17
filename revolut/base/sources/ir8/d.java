package ir8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements g {
    @Override // yqi.f
    public final yqi.d validate(Object obj2) {
        j validationData = (j) obj2;
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        return new yqi.d(validationData, srf.d.a(new c(validationData)).f316033b);
    }
}
