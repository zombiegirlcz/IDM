package sv9;

import ang.f;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import pv9.d;
import sdi.k;
import sp5.h;
import te0.w;
import ufm.i;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cv9.a f265851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gv9.c f265852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qv9.a f265853c;
    public final f d;

    public a(cv9.a encryptionInteractor, gv9.c messagesDao, qv9.a base64Wrapper, f userInteractor) {
        Intrinsics.checkNotNullParameter(encryptionInteractor, "encryptionInteractor");
        Intrinsics.checkNotNullParameter(messagesDao, "messagesDao");
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f265851a = encryptionInteractor;
        this.f265852b = messagesDao;
        this.f265853c = base64Wrapper;
        this.d = userInteractor;
    }

    public final i a(List messages) {
        Intrinsics.checkNotNullParameter(messages, "messages");
        i iVar = new i(w.H0(((d) this.f265851a).j(), this.d.f(false)), new h(20, new k(this, messages, 29)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
