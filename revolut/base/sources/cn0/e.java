package cn0;

import hn0.n;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes19.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f25334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f25335b;

    public e(n securityRepositoryInteractor, c passcodeMetadataProvider) {
        Intrinsics.checkNotNullParameter(securityRepositoryInteractor, "securityRepositoryInteractor");
        Intrinsics.checkNotNullParameter(passcodeMetadataProvider, "passcodeMetadataProvider");
        this.f25334a = securityRepositoryInteractor;
        this.f25335b = passcodeMetadataProvider;
    }

    public final Object a(Continuation continuation) {
        p0 p0Var = p0.f264001a;
        return e0.J(elm.f.f127540b, new d(this, null, 0), continuation);
    }
}
