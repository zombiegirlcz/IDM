package e82;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class j extends q implements Function1 {
    public static final j f = new j();

    public j() {
        super(1, z92.f.class, "toLogString", "toLogString(Lcom/revolut/feature/apm/multibanco/sdk/proxy/models/results/MBWaySdkQRCodeResult;)Ljava/lang/String;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        z92.e p0 = (z92.e) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p0, "<this>");
        String str = p0.f320301a;
        String str2 = p0.f320302b;
        boolean z = p0.f320303c;
        String str3 = p0.d;
        StringBuilder sbM = v0.a.m("MBWaySdkQRCodeResult(amount=", str, ", currency=", str2, ", isValid=");
        sbM.append(z);
        sbM.append(", qrCodeType=");
        sbM.append(str3);
        sbM.append(")");
        return sbM.toString();
    }
}
