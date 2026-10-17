package bs9;

import bq5.o0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r10.f f18091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f18092c;

    public /* synthetic */ c(r10.f fVar, String str, int i) {
        this.f18090a = i;
        this.f18091b = fVar;
        this.f18092c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        do3.n user = (do3.n) obj2;
        switch (this.f18090a) {
            case 0:
                Intrinsics.checkNotNullParameter(user, "user");
                return ((mv9.k) this.f18091b.b).i(new dv9.k(r10.f.v0(user), this.f18092c)).ignoreElements().C();
            default:
                Intrinsics.checkNotNullParameter(user, "user");
                return ue0.e.H(((mv9.k) this.f18091b.b).f(new dv9.k(r10.f.v0(user), this.f18092c), ev9.a.REMOTE_POLLING, null), zhm.h0.f322473a, new o0(28));
        }
    }
}
