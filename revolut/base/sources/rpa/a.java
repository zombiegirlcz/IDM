package rpa;

import ipa.h;
import ipa.j;
import ipa.k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v60.i;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements lpa.a {

    @NotNull
    public static final C1412a Companion = new C1412a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f256307a = new i();

    /* JADX INFO: renamed from: rpa.a$a, reason: collision with other inner class name */
    public static final class C1412a {
        private C1412a() {
        }
    }

    @Override // hpa.a
    public final boolean b(j message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (k.l(message) != h.CONTEXTUAL_PUSH) {
            return false;
        }
        String strH = k.h(message);
        String strO = k.o(message);
        String str = (String) message.get("text");
        String str2 = (String) message.get("icon");
        String str3 = (String) message.get("deeplink");
        String str4 = (String) message.get("display_until");
        this.f256307a.onNext(new lpa.b(strH, strO, str, str2, str3, str4 != null ? Long.valueOf(Long.parseLong(str4)) : null));
        return true;
    }
}
