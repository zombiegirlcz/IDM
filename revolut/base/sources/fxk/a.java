package fxk;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import vkm.d;
import w4l.k;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zwk.a f138837a;

    public a(zwk.a repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f138837a = repository;
    }

    public final d a(List exchanges, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(exchanges, "exchanges");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        zwk.a aVar = this.f138837a;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(exchanges, "exchanges");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return aVar.d.b(exchanges, loadingStrategy);
    }
}
