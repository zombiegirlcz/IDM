package eh9;

import com.youTransactor.uCube.rpc.Constants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f125793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f125794b;

    public /* synthetic */ r(z zVar, int i) {
        this.f125793a = i;
        this.f125794b = zVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f125793a) {
            case 0:
                h1j.b output = (h1j.b) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                z zVar = this.f125794b;
                zVar.H2(zVar.A, new efb.i(18));
                if (output instanceof h1j.d) {
                    zVar.l2(new e8e.w(zVar, (h1j.d) output, null, 20), new yi5.b(26));
                }
                return Unit.f186387a;
            case 1:
                a update = (a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return a.a(update, null, null, ((a) ((j2) this.f125794b.A.f22677a).getValue()).d + 1, null, Constants.TAG_BLE_FIRMWARE_VERSION);
            default:
                dpf.c output2 = (dpf.c) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (output2 instanceof dpf.b) {
                    z zVar2 = this.f125794b;
                    zVar2.H2(zVar2.A, new bg2.p(output2, 3));
                }
                return Unit.f186387a;
        }
    }
}
