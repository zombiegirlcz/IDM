package rf3;

import kotlin.jvm.internal.Intrinsics;
import te0.r;
import te0.w;
import ufm.n;

/* JADX INFO: loaded from: classes13.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zm0.c f253687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f253688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f253689c;
    public final ang.f d;
    public final ing.b e;
    public final z80.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r f253690g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r f253691h;

    public l(zm0.c sessionProvider, h chatRelatedInteractor, i chatVersionProvider, ang.f userInteractor, ing.b legacyUserStorage, z80.b phoneTools) {
        Intrinsics.checkNotNullParameter(sessionProvider, "sessionProvider");
        Intrinsics.checkNotNullParameter(chatRelatedInteractor, "chatRelatedInteractor");
        Intrinsics.checkNotNullParameter(chatVersionProvider, "chatVersionProvider");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(legacyUserStorage, "legacyUserStorage");
        Intrinsics.checkNotNullParameter(phoneTools, "phoneTools");
        this.f253687a = sessionProvider;
        this.f253688b = chatRelatedInteractor;
        this.f253689c = chatVersionProvider;
        this.d = userInteractor;
        this.e = legacyUserStorage;
        this.f = phoneTools;
        this.f253690g = new r();
        this.f253691h = new r();
    }

    public final n a() {
        this.f253689c.getClass();
        h hVar = this.f253688b;
        hVar.getClass();
        Intrinsics.checkNotNullParameter("4.5.0", "chatAppVersion");
        tf3.a aVar = hVar.f253682a;
        aVar.getClass();
        Intrinsics.checkNotNullParameter("4.5.0", "chatAppVersion");
        return w.i0(aVar.f270222a.getVerificationTokenForChat(new e20.e()));
    }
}
