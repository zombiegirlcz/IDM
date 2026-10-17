package lhi;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes13.dex */
public final class b0 implements hpa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f195261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b90.a f195262b;

    public b0(b90.a pushMessagesTools, int i) {
        this.f195261a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(pushMessagesTools, "pushMessagesTools");
                this.f195262b = pushMessagesTools;
                break;
            default:
                Intrinsics.checkNotNullParameter(pushMessagesTools, "pushMessagesTools");
                this.f195262b = pushMessagesTools;
                break;
        }
    }

    @Override // hpa.a
    public final boolean b(ipa.j message) {
        switch (this.f195261a) {
            case 0:
                Intrinsics.checkNotNullParameter(message, "message");
                if (ipa.k.t(message)) {
                    b90.a.c(this.f195262b, message, new b90.f(b90.b.DASHBOARD, (String) null, 6), null, ipa.l.HIGH, null, null, 52);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(message, "message");
                String strE = ipa.k.e(message);
                if (strE != null && new Regex("referral(/?\\w+)*").b(strE) != null) {
                    b90.a.c(this.f195262b, message, new b90.f(b90.b.DEEPLINK, strE, 4), null, null, null, null, 60);
                }
                break;
        }
        return true;
    }
}
