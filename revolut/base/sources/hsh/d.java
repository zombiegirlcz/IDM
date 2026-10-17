package hsh;

import com.revolut.feature.widgets.impl.network.WidgetService;
import gsh.a0;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f155059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WidgetService f155060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineScope f155061c;
    public final csh.c d;
    public final ConcurrentHashMap e;

    public d(a0 localRepository, WidgetService service, CoroutineScope scope, l80.e dateProvider, csh.c sharedWidgetsNetworkConfiguration) {
        Intrinsics.checkNotNullParameter(localRepository, "localRepository");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(sharedWidgetsNetworkConfiguration, "sharedWidgetsNetworkConfiguration");
        this.f155059a = localRepository;
        this.f155060b = service;
        this.f155061c = scope;
        this.d = sharedWidgetsNetworkConfiguration;
        this.e = new ConcurrentHashMap();
    }
}
