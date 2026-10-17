package abm;

import io.fotoapparat.exception.camera.CameraException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import nd.k;
import skm.e0;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends u implements Function0 {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f2991h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj2, Object obj3, int i) {
        super(0);
        this.f = i;
        this.f2991h = obj2;
        this.i = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws Throwable {
        switch (this.f) {
            case 0:
                ((laj.b) this.f2991h).invoke(this.i);
                break;
            case 1:
                ((qam.e) this.f2991h).c().a((sam.f) this.i);
                break;
            case 2:
                break;
            case 3:
                iam.e eVar = (iam.e) this.f2991h;
                eVar.f160065b.getClass();
                k.k();
                qam.e eVar2 = eVar.d;
                nam.e newConfiguration = (nam.e) this.i;
                Intrinsics.checkNotNullParameter(eVar2, "<this>");
                Intrinsics.checkNotNullParameter(newConfiguration, "newConfiguration");
                qam.b cameraDevice = eVar2.c();
                eVar2.d(newConfiguration);
                Intrinsics.checkNotNullParameter(eVar2, "<this>");
                Intrinsics.checkNotNullParameter(cameraDevice, "cameraDevice");
                e0.E(kotlin.coroutines.g.f186406a, new c34.d(eVar2, cameraDevice, (Continuation) null, 9));
                break;
            default:
                ((Function1) this.f2991h).invoke((CameraException) this.i);
                break;
        }
        return Unit.f186387a;
    }
}
