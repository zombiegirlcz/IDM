package ir8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements g {
    @Override // yqi.f
    public final yqi.d validate(Object obj2) {
        j validationData = (j) obj2;
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        if (validationData.f168018a <= 0) {
            return new yqi.d(validationData, h.f168017a);
        }
        yqi.d.Companion.getClass();
        return yqi.c.a(validationData);
    }
}
