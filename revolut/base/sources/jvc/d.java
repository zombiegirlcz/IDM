package jvc;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.feature.security_hub.impl.R$id;
import com.revolut.feature.security_hub.impl.ui.security_hub.SecurityHubScreen;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SecurityHubScreen f178819b;

    public /* synthetic */ d(SecurityHubScreen securityHubScreen, int i) {
        this.f178818a = i;
        this.f178819b = securityHubScreen;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f178818a;
        SecurityHubScreen securityHubScreen = this.f178819b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = SecurityHubScreen.U;
                return ((dli.c) securityHubScreen.T.getValue()).w().f;
            case 1:
                KProperty[] kPropertyArr2 = SecurityHubScreen.U;
                return (a0) ((vtc.v) securityHubScreen.R.getValue()).i.get();
            default:
                KProperty[] kPropertyArr3 = SecurityHubScreen.U;
                SecurityHubScreen securityHubScreen2 = this.f178819b;
                return dli.f.a(securityHubScreen2, securityHubScreen2.R2(), zhm.v.k(securityHubScreen2.N, new RowLoadingDelegate(), new FullScreenStateDelegate(), securityHubScreen2.P), R$id.security_hub_recyclerView, null, null, null, 56);
        }
    }
}
