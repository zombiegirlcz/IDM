package ujd;

import com.revolut.feature.sign_in_methods.api.navigation.SignInMethodsDestination;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import lg0.e;
import lg0.g;
import org.jetbrains.annotations.NotNull;
import rd0.c;
import rd0.d;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements xii.b {

    @NotNull
    public static final C1549a Companion = new C1549a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f280605a = y0.b("sso/bankid-se");

    /* JADX INFO: renamed from: ujd.a$a, reason: collision with other inner class name */
    public static final class C1549a {
        private C1549a() {
        }
    }

    @Override // xii.b
    public final Set a() {
        return this.f280605a;
    }

    @Override // xii.b
    public final ParcelableDestination e(e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        String strA = g.a("challengeId", deeplink.f195041c);
        if (strA != null) {
            return new SignInMethodsDestination(new SignInMethodsDestination.DeeplinkData.BankIdDeeplink(strA));
        }
        String name = a.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.a(c.ERROR, name, "Deeplink doesn't have required `challengeId` query parameter", null, h0Var);
        return null;
    }
}
