package dbi;

import com.revolut.kompot.common.ParcelableDestination;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import lg0.e;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements xii.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f112753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f112754b;

    public b(d destinationFactory) {
        Intrinsics.checkNotNullParameter(destinationFactory, "destinationFactory");
        this.f112753a = destinationFactory;
        this.f112754b = y0.b("email-verify");
    }

    @Override // xii.b
    public final Set a() {
        return this.f112754b;
    }

    @Override // xii.b
    public final ParcelableDestination e(e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return this.f112753a.a(null);
    }
}
