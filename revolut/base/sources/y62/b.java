package y62;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import l80.e;
import l80.f;
import org.jetbrains.annotations.NotNull;
import yji.n;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends n {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f311118l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Job f311119m;

    public b(e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f311118l = dateProvider;
    }

    @Override // yji.n
    public final void F2() {
        Job job2 = this.f311119m;
        if (job2 != null) {
            job2.f(null);
        }
    }

    public final long Z2() {
        return ((f) this.f311118l).b().toEpochMilli();
    }
}
