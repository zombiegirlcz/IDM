package i0m;

import hzl.i;
import kotlin.jvm.internal.Intrinsics;
import yqi.f;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f157501a;

    public d() {
        this((Object) null);
    }

    @Override // yqi.f
    public final yqi.d validate(Object obj2) {
        hzl.d validationData = (hzl.d) obj2;
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        if (validationData.f157254a.length() < this.f157501a) {
            return new yqi.d(validationData, new i(0));
        }
        yqi.d.Companion.getClass();
        return yqi.c.a(validationData);
    }

    public d(int i) {
        this.f157501a = i;
    }

    public /* synthetic */ d(Object obj2) {
        this(6);
    }
}
