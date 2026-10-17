package p15;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.credit.help.impl.network.CreditHelpService;
import java.lang.reflect.Type;
import java.util.Map;
import k3c.k;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import or4.i;
import org.jetbrains.annotations.NotNull;
import oxd.m;
import p0l.d;
import ue0.c;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();
    public static final Type e = new TypeToken<Map<String, ? extends n15.a>>() { // from class: com.revolut.feature.credit.help.impl.repository.CreditHelpRepository$Companion$CREDIT_HELP_COUNTRY_CONFIG_TYPE$1
    }.getType();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditHelpService f231873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f231874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f231875c;
    public final x4l.c d;

    public b(CreditHelpService api2, j memoryCache, c storage) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f231873a = api2;
        this.f231874b = memoryCache;
        this.f231875c = storage;
        Continuation continuation = null;
        this.d = new x4l.c(new k(this, continuation, 22), new m(this, 12), new i(this, 22), new d(this, continuation, 1), new l05.b(this, continuation, 29));
    }
}
