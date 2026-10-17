package xab;

import com.revolut.feature.retail.legacy.login.impl.login.LoginFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class g implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f303819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LoginFragment f303820b;

    public /* synthetic */ g(LoginFragment loginFragment, int i) {
        this.f303819a = i;
        this.f303820b = loginFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f303819a) {
            case 0:
                LoginFragment loginFragment = this.f303820b;
                loginFragment.requireActivity().setResult(-1);
                loginFragment.requireActivity().finish();
                break;
            default:
                this.f303820b.C0();
                break;
        }
        return Unit.f186387a;
    }
}
