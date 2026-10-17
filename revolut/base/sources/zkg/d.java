package zkg;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wkg.g;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements b {

    @NotNull
    public static final c Companion = new c();
    public static final Set d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final blg.a f322978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xkg.a f322979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f322980c;

    static {
        String[] elements = {"name", "reason", "state", "taskId", "handoff", "identifier", "language", "customer", "product", "additionalProduct", "company", "payroll"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        d = kotlin.collections.d.y0(elements);
    }

    public d(blg.a atomicRepository, xkg.a atomicBroadcastReceiver, g atomicSdkWrapper) {
        Intrinsics.checkNotNullParameter(atomicRepository, "atomicRepository");
        Intrinsics.checkNotNullParameter(atomicBroadcastReceiver, "atomicBroadcastReceiver");
        Intrinsics.checkNotNullParameter(atomicSdkWrapper, "atomicSdkWrapper");
        this.f322978a = atomicRepository;
        this.f322979b = atomicBroadcastReceiver;
        this.f322980c = atomicSdkWrapper;
    }
}
