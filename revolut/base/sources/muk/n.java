package muk;

import cli.o;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z0h.q1;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
public final class n implements cli.n {

    @NotNull
    private static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ouk.e f209048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q1 f209049b;

    public n(ouk.b counterMapper, ouk.e indicatorsMapper, q1 wealthDisclaimersMapper) {
        Intrinsics.checkNotNullParameter(counterMapper, "counterMapper");
        Intrinsics.checkNotNullParameter(indicatorsMapper, "indicatorsMapper");
        Intrinsics.checkNotNullParameter(wealthDisclaimersMapper, "wealthDisclaimersMapper");
        this.f209048a = indicatorsMapper;
        this.f209049b = wealthDisclaimersMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f209043b;
        List listB = data != null ? ((aah.m) this.f209049b).b(data) : null;
        if (listB == null) {
            listB = f0.f322471a;
        }
        return new k(d0.E0(listB, (List) iii.c.f(domainState.f209042a, new msb.c(this, 27), new mqg.a(26), new mgh.i(this, 8))));
    }
}
