package ukh;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.d7;
import org.jetbrains.annotations.NotNull;
import te0.w;
import ujb.v;

/* JADX INFO: loaded from: classes10.dex */
public final class q implements jki.p {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kpj.f f280767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d1h.h f280768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f280769c;

    public q(kpj.f wealthAccountHeaderUiMapper, d1h.h wealthRemoteDisclaimersMapper) {
        Intrinsics.checkNotNullParameter(wealthAccountHeaderUiMapper, "wealthAccountHeaderUiMapper");
        Intrinsics.checkNotNullParameter(wealthRemoteDisclaimersMapper, "wealthRemoteDisclaimersMapper");
        this.f280767a = wealthAccountHeaderUiMapper;
        this.f280768b = wealthRemoteDisclaimersMapper;
        this.f280769c = w.y0(new v(15));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        List list;
        c domainState = (c) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f280750a;
        Data data2 = domainState.f280752c;
        if (data == null || (list = (List) iii.c.f(t1.t(data, data2), new ud3.n(this, 27), new uj8.j(6), new uk2.w(this, 2))) == null) {
            list = (List) this.f280769c.getValue();
        }
        d1h.g gVar = domainState.f280751b;
        List[] elements = {list, gVar != null ? ((gah.g) this.f280768b).c(gVar, d7.DEFAULT) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new k(zhm.w.u(kotlin.collections.d.L(elements)));
    }
}
