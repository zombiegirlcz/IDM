package jvf;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import yji.n;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends n {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l80.e f178880l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Job f178881m;

    public f(l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f178880l = dateProvider;
    }

    @Override // yji.n
    public final void F2() {
        Job job2 = this.f178881m;
        if (job2 != null) {
            job2.f(null);
        }
    }
}
