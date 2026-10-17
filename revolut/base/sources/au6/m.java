package au6;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f9567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vkm.j2 f9568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f9569c;

    public m(ue0.c storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f9567a = storage;
        this.f9568b = vkm.q.c(Boolean.FALSE);
        this.f9569c = new AtomicBoolean(false);
    }

    public final boolean a() {
        return pd.b.j((Boolean) j6.a.k(Boolean.TYPE, this.f9567a, "FreelancerAcquiringOrderLoadingMetadataRepository:Storage:HasLoaded"));
    }

    public final void b(boolean z) {
        vkm.j2 j2Var;
        Object value;
        do {
            j2Var = this.f9568b;
            value = j2Var.getValue();
            ((Boolean) value).getClass();
        } while (!j2Var.h(value, Boolean.valueOf(z)));
    }
}
