package jjl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f175015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nn0.c f175016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final th0.a f175017c;

    public b(Context context, nn0.c coreSignatureApi, th0.a mobileServicesApi) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coreSignatureApi, "coreSignatureApi");
        Intrinsics.checkNotNullParameter(mobileServicesApi, "mobileServicesApi");
        this.f175015a = context;
        this.f175016b = coreSignatureApi;
        this.f175017c = mobileServicesApi;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f175015a, bVar.f175015a) && Intrinsics.f(this.f175016b, bVar.f175016b) && Intrinsics.f(this.f175017c, bVar.f175017c);
    }

    public final int hashCode() {
        return this.f175017c.hashCode() + ((this.f175016b.hashCode() + (this.f175015a.hashCode() * 31)) * 31);
    }
}
