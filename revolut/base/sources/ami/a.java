package ami;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements wli.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f6433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f6434b;

    public a(ImmutableMap allProviders) {
        Intrinsics.checkNotNullParameter(allProviders, "allProviders");
        this.f6433a = allProviders;
        this.f6434b = yhm.j.b(new a2g.a(this, 19));
    }

    @Override // wli.d
    public final Map a() {
        return (Map) this.f6434b.getValue();
    }
}
