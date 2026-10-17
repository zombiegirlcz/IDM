package sv9;

import ang.f;
import kotlin.jvm.internal.Intrinsics;
import pv9.k;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f265857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cv9.a f265858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gv9.c f265859c;
    public final qv9.a d;
    public final iv9.k e;

    public c(f userInteractor, cv9.a encryptionInteractor, gv9.c messagesDao, qv9.a base64Wrapper, iv9.k chatMessageMapper) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(encryptionInteractor, "encryptionInteractor");
        Intrinsics.checkNotNullParameter(messagesDao, "messagesDao");
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        Intrinsics.checkNotNullParameter(chatMessageMapper, "chatMessageMapper");
        this.f265857a = userInteractor;
        this.f265858b = encryptionInteractor;
        this.f265859c = messagesDao;
        this.d = base64Wrapper;
        this.e = chatMessageMapper;
    }
}
