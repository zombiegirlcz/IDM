package g3b;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.u;

/* JADX INFO: loaded from: classes6.dex */
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f140257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f140258b;

    public i(u persistentFieldProvider) {
        Intrinsics.checkNotNullParameter(persistentFieldProvider, "persistentFieldProvider");
        this.f140257a = persistentFieldProvider;
        this.f140258b = yhm.j.b(new fp3.a(this, 19));
    }
}
