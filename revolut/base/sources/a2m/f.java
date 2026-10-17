package a2m;

import java.io.Serializable;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import m2m.m;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g2m.a f947a;

    public f(g2m.a repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f947a = repository;
    }

    public final Serializable a(String str, z2m.a aVar, Continuation continuation) {
        return !aVar.a() ? f0.f322471a : ((m) this.f947a).h(str, (gim.c) continuation);
    }
}
