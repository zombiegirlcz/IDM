package cu8;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.kyc.impl.KycActivity;
import com.revolut.feature.kyc.impl.KycScreenContract$Configuration;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KycActivity f108821b;

    public /* synthetic */ b(KycActivity kycActivity, int i) {
        this.f108820a = i;
        this.f108821b = kycActivity;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f108820a;
        KycActivity kycActivity = this.f108821b;
        switch (i) {
            case 0:
                int i2 = KycActivity.B0;
                return kycActivity.c1().f77541a;
            case 1:
                int i3 = KycActivity.B0;
                return (KycScreenContract$Configuration) kycActivity.G0();
            default:
                int i5 = KycActivity.B0;
                return zhm.u.c((LargeActionButtonDelegate) kycActivity.A0.getValue());
        }
    }
}
