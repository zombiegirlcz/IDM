package ni1;

import cli.n;
import cli.y;
import com.revolut.feature.address.common.api.navigation.SelectAddressControllerDescriptor$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.d0;
import n8a.r;
import nb6.p;
import nhg.f0;
import skm.a2;

/* JADX INFO: loaded from: classes20.dex */
public final class i extends oki.h implements dli.b {
    public final rh1.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e0m.f f215630p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final SelectAddressControllerDescriptor$InputData f215631q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a2 f215632r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f215633s;

    public i(n stateMapper, rh1.b addressFlowInteractor, e0m.f postcodeValidator, SelectAddressControllerDescriptor$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(addressFlowInteractor, "addressFlowInteractor");
        Intrinsics.checkNotNullParameter(postcodeValidator, "postcodeValidator");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = addressFlowInteractor;
        this.f215630p = postcodeValidator;
        this.f215631q = inputData;
        this.f215633s = mra.d.b(this, new f(null, inputData.f60961b), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        SelectAddressControllerDescriptor$InputData selectAddressControllerDescriptor$InputData = this.f215631q;
        if (d0.W(selectAddressControllerDescriptor$InputData.f60961b)) {
            return;
        }
        I2(selectAddressControllerDescriptor$InputData.f60961b);
    }

    public final void I2(String str) {
        a2 a2Var = this.f215632r;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        String strReplace = new Regex("\\s").replace(str, "");
        boolean zW = d0.W(str);
        y yVar = this.f215633s;
        if (zW) {
            H2(yVar, new f0(5));
            return;
        }
        wi0.a aVar = wi0.b.Companion;
        String str2 = this.f215631q.f60960a;
        aVar.getClass();
        wi0.b bVarA = wi0.a.a(str2);
        if (!(com.bumptech.glide.d.q(bVarA) ? this.f215630p.a(strReplace, bVarA) : true)) {
            H2(yVar, new mll.h(strReplace, 27));
        } else {
            H2(yVar, new mll.h(strReplace, 28));
            this.f215632r = l2(new r(13, this, strReplace, continuation), new p(1, this, i.class, "doOnError", "doOnError(Ljava/lang/Throwable;)Z", 0, 8));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f215633s;
    }
}
