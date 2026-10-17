package m3d;

import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wsg.n;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f202366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ppk.f f202367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f202368c;

    public d(Set providers, n walletInteractor, ppk.f ratesInteractor) {
        Intrinsics.checkNotNullParameter(providers, "providers");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        this.f202366a = walletInteractor;
        this.f202367b = ratesInteractor;
        Set set = providers;
        int iB = q0.b(w.t(set, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        for (Object obj2 : set) {
            linkedHashMap.put(((x3d.a) obj2).a(), obj2);
        }
        this.f202368c = linkedHashMap;
    }
}
