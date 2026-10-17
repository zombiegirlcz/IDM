package af1;

import dda.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i80.a f3822b;

    public /* synthetic */ f(i80.a aVar, int i) {
        this.f3821a = i;
        this.f3822b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f3821a) {
            case 0:
                ((c) obj2).getClass();
                return new c(this.f3822b);
            default:
                pea.g gVar = (pea.g) obj2;
                j qrCodeProvider = gVar.f235349a;
                String qrCodeText = gVar.f235350b;
                Intrinsics.checkNotNullParameter(qrCodeProvider, "qrCodeProvider");
                Intrinsics.checkNotNullParameter(qrCodeText, "qrCodeText");
                return new pea.g(qrCodeProvider, qrCodeText, this.f3822b);
        }
    }
}
