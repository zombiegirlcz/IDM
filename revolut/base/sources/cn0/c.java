package cn0;

import gim.i;
import hn0.m;
import hn0.n;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f25330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f25331b;

    public c(m securityRepository, n securityRepositoryInteractor) {
        Intrinsics.checkNotNullParameter(securityRepository, "securityRepository");
        Intrinsics.checkNotNullParameter(securityRepositoryInteractor, "securityRepositoryInteractor");
        this.f25330a = securityRepository;
        this.f25331b = securityRepositoryInteractor;
    }

    public final Object a(i iVar) {
        p0 p0Var = p0.f264001a;
        return e0.J(elm.f.f127540b, new c65.i(this, null, 28), iVar);
    }
}
