package af9;

import com.revolut.feature.password.R$id;
import com.revolut.feature.password.ui.create_password.CreatePasswordScreen;
import com.revolut.feature.password.ui.create_password.CreatePasswordScreenContract$InputData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import ljl.r;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CreatePasswordScreen f3963b;

    public /* synthetic */ a(CreatePasswordScreen createPasswordScreen, int i) {
        this.f3962a = i;
        this.f3963b = createPasswordScreen;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f3962a;
        CreatePasswordScreen createPasswordScreen = this.f3963b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = CreatePasswordScreen.S;
                qji.b bVarU2 = createPasswordScreen.U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.password.ui.create_password.di.CreatePasswordScreenInjector");
                ljl.c cVar = (ljl.c) bVarU2;
                return new r(cVar.f, cVar.f195894g);
            case 1:
                KProperty[] kPropertyArr2 = CreatePasswordScreen.S;
                return (j) ((r) createPasswordScreen.N.getValue()).f196088c.get();
            default:
                KProperty[] kPropertyArr3 = CreatePasswordScreen.S;
                CreatePasswordScreen createPasswordScreen2 = this.f3963b;
                return dli.f.a(createPasswordScreen2, (j) createPasswordScreen2.O.getValue(), u.c(createPasswordScreen2.L), R$id.createPasswordScreen_recyclerView, null, null, null, 56);
        }
    }

    public /* synthetic */ a(CreatePasswordScreen createPasswordScreen, CreatePasswordScreenContract$InputData createPasswordScreenContract$InputData) {
        this.f3962a = 0;
        this.f3963b = createPasswordScreen;
    }
}
