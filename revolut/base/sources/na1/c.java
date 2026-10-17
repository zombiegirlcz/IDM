package na1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f213674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qa1.h f213675b;

    public /* synthetic */ c(qa1.h hVar, int i) {
        this.f213674a = i;
        this.f213675b = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f213674a) {
            case 0:
                ea1.b.a("Upload Bluetooth firmware file: " + this.f213675b.f243939a + "...", fa1.k.INFO);
                break;
            default:
                ea1.b.a("Upload firmware file: " + this.f213675b.f243939a + "...", fa1.k.INFO);
                break;
        }
        return Unit.f186387a;
    }
}
