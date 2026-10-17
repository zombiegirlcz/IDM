package w60;

import com.revolut.core.account.region.domain.model.AccountRegion;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x60.a f295357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f295358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f295359c;

    public b(x60.a repository) {
        kp.d accountRegionHostsConfiguration = kp.d.f187954a;
        Intrinsics.checkNotNullParameter(accountRegionHostsConfiguration, "accountRegionHostsConfiguration");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f295357a = repository;
        this.f295358b = (Set) kp.d.f187955b.getValue();
        this.f295359c = (Set) kp.d.f187956c.getValue();
    }

    public static String a(String str, String str2) {
        AccountRegion.INSTANCE.getClass();
        return (Intrinsics.f(str2, "undefined") || Intrinsics.f(str2, "global")) ? str : com.google.android.gms.internal.mlkit_vision_face.a.o(str2, "-", str);
    }

    public final String b(String host) {
        String strA;
        Intrinsics.checkNotNullParameter(host, "host");
        kp.d dVar = kp.d.f187954a;
        String strA2 = ((x60.c) this.f295357a).a();
        String strV0 = d0.v0(host, "-", "");
        Set set = this.f295359c;
        if (set.contains(host) || set.contains(strV0)) {
            strA = host;
        } else {
            Set set2 = this.f295358b;
            strA = set2.contains(host) ? a(host, strA2) : (strV0.length() != 0 && set2.contains(strV0)) ? a(strV0, strA2) : null;
        }
        return strA == null ? host : strA;
    }
}
