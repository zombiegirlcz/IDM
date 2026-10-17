package g09;

import a09.m;
import efm.r;
import fs2.k;
import fwf.n;
import kotlin.jvm.internal.Intrinsics;
import u09.v;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f139373a;

    public e(m repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f139373a = repository;
    }

    public final r a(String courseId) {
        Intrinsics.checkNotNullParameter(courseId, "courseId");
        m mVar = this.f139373a;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(courseId, "courseId");
        return nim.a.w(mVar.e.f(courseId, false), new n(26));
    }

    public final r b(v domain, u09.n nVar) {
        Intrinsics.checkNotNullParameter(domain, "domain");
        m mVar = this.f139373a;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(domain, "domain");
        return nim.a.w(mVar.d.f(domain, true), new k(nVar, this));
    }
}
