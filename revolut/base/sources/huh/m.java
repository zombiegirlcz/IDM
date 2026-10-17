package huh;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import vkm.z1;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements zth.b {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final atb.a f155666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cuh.b f155667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z1 f155668c;

    public m(atb.a documentsInteractor, cuh.b repository) {
        Intrinsics.checkNotNullParameter(documentsInteractor, "documentsInteractor");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f155666a = documentsInteractor;
        this.f155667b = repository;
        this.f155668c = q.b(0, 7, null);
    }
}
