package ing;

import android.content.Context;
import do3.n;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.j;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f162934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ang.a f162935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f162936c;
    public String d;

    public b(Context context, ang.a legacyUserProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(legacyUserProvider, "legacyUserProvider");
        this.f162934a = context;
        this.f162935b = legacyUserProvider;
        this.f162936c = j.b(new androidx.lifecycle.b(this, 27));
    }

    public final synchronized String a() {
        String str = this.d;
        if (str != null && str.length() != 0) {
            return this.d;
        }
        n nVarA = this.f162935b.a();
        return nVarA != null ? nVarA.i : null;
    }
}
