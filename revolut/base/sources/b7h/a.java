package b7h;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import nh7.b;
import nh7.d;
import ph7.c;
import zhm.d0;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f13040a;

    public a(j memoryCache, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
                this.f13040a = memoryCache;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
                this.f13040a = memoryCache;
                break;
            default:
                Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
                this.f13040a = memoryCache;
                break;
        }
    }

    public static c a(d dVar) {
        nh7.c cVarC = dVar.c();
        if (cVarC instanceof nh7.a) {
            return ((nh7.a) cVarC).f215377a;
        }
        if (cVarC instanceof b) {
            return (c) d0.b0(((b) cVarC).f215378a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
