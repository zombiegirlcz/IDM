package f44;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import dp4.a1;
import e31.i;
import eul.f;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mp.p;
import ne0.d;
import zhm.d0;

/* JADX INFO: loaded from: classes22.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f132007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditPluginsService f132008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f132009c;
    public final x4l.c d;

    public c(CreditPluginsService creditPluginsService, p creditApplicationDtoMapper, d memoryCache) {
        Intrinsics.checkNotNullParameter(creditApplicationDtoMapper, "creditApplicationDtoMapper");
        Intrinsics.checkNotNullParameter(creditPluginsService, "creditPluginsService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f132007a = creditApplicationDtoMapper;
        this.f132008b = creditPluginsService;
        this.f132009c = memoryCache;
        Continuation continuation = null;
        this.d = new x4l.c(new a1(this, continuation, 22), new f0m.c(this, 8), new f(this, 15), new i(2, 5, continuation), new eci.a(3, 2, continuation));
    }

    public static String a(a aVar) {
        fu3.a aVar2;
        List list;
        String str = aVar.f132004c.f137835a;
        boolean z = aVar.f132003b;
        mv3.i iVar = aVar.f132002a;
        String strName = null;
        List listO0 = (iVar == null || (list = iVar.f209128a) == null) ? null : d0.O0(list);
        Long l2 = iVar != null ? iVar.f209129b : null;
        Long l3 = iVar != null ? iVar.f209130c : null;
        if (iVar != null && (aVar2 = iVar.d) != null) {
            strName = aVar2.name();
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append(str);
        sb6.append(".");
        sb6.append(z);
        sb6.append(".");
        sb6.append(listO0);
        sb6.append(".");
        sb6.append(l2);
        sb6.append(".");
        sb6.append(l3);
        return a0.d.u(sb6, ".", strName, "}");
    }
}
