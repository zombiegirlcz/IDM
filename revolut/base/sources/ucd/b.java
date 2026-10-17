package ucd;

import com.revolut.feature.shared.savings.request.impl.data.network.SavingsRequestService;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import pti.s;
import u6b.k;
import u7k.w;
import ue0.c;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingsRequestService f279029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f279030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f279031c;
    public final x4l.c d;

    public b(SavingsRequestService service, j memoryCache, c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f279029a = service;
        this.f279030b = memoryCache;
        this.f279031c = storage;
        Continuation continuation = null;
        this.d = new x4l.c(new s(this, continuation, 22), new k(this, 25), new w(this, 9), new u07.b(this, continuation, 24), new ska.c(this, continuation, 18));
    }

    public static final List a(b bVar) {
        List listJ = (List) bVar.f279030b.get("SAVING_ACCOUNT_REQUESTS_KEY");
        if (listJ == null) {
            List list = (List) p.a.j(scd.c.class, KTypeProjection.INSTANCE, List.class, bVar.f279031c, "SAVING_ACCOUNT_REQUESTS_KEY");
            listJ = list != null ? yoj.b.J(list) : null;
        }
        return listJ == null ? f0.f322471a : listJ;
    }
}
