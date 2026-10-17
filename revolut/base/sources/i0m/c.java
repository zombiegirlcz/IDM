package i0m;

import hzl.h;
import kotlin.jvm.internal.Intrinsics;
import yqi.f;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f157500a;

    public c() {
        this((Object) null);
    }

    @Override // yqi.f
    public final yqi.d validate(Object obj2) {
        hzl.d validationData = (hzl.d) obj2;
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        if (validationData.f157254a.length() > this.f157500a) {
            return new yqi.d(validationData, new h(0));
        }
        yqi.d.Companion.getClass();
        return yqi.c.a(validationData);
    }

    public c(int i) {
        this.f157500a = i;
    }

    public /* synthetic */ c(Object obj2) {
        this(12);
    }
}
