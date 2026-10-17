package c3e;

import kl.t1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.w;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t1 f20939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihm.b f20940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f20941c;
    public final Object d;

    public c(t1 storeDealsInteractor, yk0.d schedulerProvider) {
        Intrinsics.checkNotNullParameter(storeDealsInteractor, "storeDealsInteractor");
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        this.f20939a = storeDealsInteractor;
        this.f20940b = j6.a.h("create(...)");
        this.d = w.y0(new a(this, 0));
    }
}
