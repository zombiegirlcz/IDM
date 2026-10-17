package lhi;

import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import n30.p0;

/* JADX INFO: loaded from: classes13.dex */
public final class y implements hpa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f195312a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f195313b;

    public y(jgi.d walletUpdatesPushHandler) {
        Intrinsics.checkNotNullParameter(walletUpdatesPushHandler, "walletUpdatesPushHandler");
        this.f195313b = walletUpdatesPushHandler;
    }

    @Override // hpa.a
    public final boolean b(ipa.j data) {
        int i = this.f195312a;
        Object obj2 = this.f195313b;
        Intrinsics.checkNotNullParameter(data, "message");
        switch (i) {
            case 0:
                p0 p0Var = (p0) ((m30.j) obj2);
                Intrinsics.checkNotNullParameter(data, "data");
                if (!Intrinsics.f(data.get("twi_message_type"), "twilio.voice.call")) {
                    return false;
                }
                if (((n30.d0) p0Var.f211658g.v0(new n30.d0(0), "TWILIO_REGISTRATION_STATE_V1", n30.d0.class)).getFcmTokenHash() == null) {
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.b(rd0.c.DEBUG, "InAppCalls", "Twilio push ignored — not registered (logged out)", null, null, 16);
                    return true;
                }
                if (((com.revolut.feature.in_app_calls.a) p0Var.d).a(p0Var.f211656b.getContext(), data)) {
                    return true;
                }
                ((be7.j) p0Var.f.get()).b((String) data.get("twi_call_sid"));
                return true;
            case 1:
                mm0.o oVarD = ((cn0.g) ((zm0.c) obj2)).d();
                if (!ipa.k.p(data) || (oVarD instanceof mm0.m)) {
                    gom.e.f145194a.d("Push is not valid: data=%s", new HashMap(data));
                    return true;
                }
                gom.e.f145194a.d("Push message: %s", ipa.k.i(data));
                return false;
            default:
                return ((jgi.d) obj2).a(data);
        }
    }

    public y(m30.j inAppCallRequestsInteractor) {
        Intrinsics.checkNotNullParameter(inAppCallRequestsInteractor, "inAppCallRequestsInteractor");
        this.f195313b = inAppCallRequestsInteractor;
    }

    public y(zm0.c sessionProvider) {
        Intrinsics.checkNotNullParameter(sessionProvider, "sessionProvider");
        this.f195313b = sessionProvider;
    }
}
