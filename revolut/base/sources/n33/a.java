package n33;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f211681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l71.d f211682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ do3.n f211683c;

    public /* synthetic */ a(l71.d dVar, do3.n nVar, int i) {
        this.f211681a = i;
        this.f211682b = dVar;
        this.f211683c = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ec5.b cryptoAccount = (ec5.b) obj2;
        switch (this.f211681a) {
            case 0:
                Intrinsics.checkNotNullParameter(cryptoAccount, "cryptoAccount");
                return new k(this.f211682b.a(), do3.q.y(this.f211683c), cryptoAccount.f124429a == ec5.g.RDAEL);
            default:
                Intrinsics.checkNotNullParameter(cryptoAccount, "cryptoAccount");
                return new od3.s(this.f211682b.a(), do3.q.y(this.f211683c), cryptoAccount.f124429a == ec5.g.RDAEL);
        }
    }
}
