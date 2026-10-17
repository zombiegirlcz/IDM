package nwl;

import com.revolut.ui.login.pin.LoginActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f220005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f220006b;

    public /* synthetic */ a(l lVar, int i) {
        this.f220005a = i;
        this.f220006b = lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f220005a) {
            case 0:
                this.f220006b.D.onComplete();
                break;
            default:
                owl.a aVar = (owl.a) this.f220006b.L();
                if (aVar != null) {
                    LoginActivity loginActivity = (LoginActivity) aVar;
                    loginActivity.f107073s0.e(new lwl.g(loginActivity, 0));
                }
                break;
        }
        return Unit.f186387a;
    }
}
