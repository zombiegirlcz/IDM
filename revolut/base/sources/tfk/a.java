package tfk;

import dha.c;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f270326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f270327b;

    public a(CoroutineScope coroutineScope, c repository) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f270326a = coroutineScope;
        this.f270327b = repository;
    }
}
