package zul;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zmj.p0;

/* JADX INFO: loaded from: classes12.dex */
public final class n0 implements cli.n {

    @NotNull
    public static final i0 Companion = new i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0 f325547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f325548b;

    public n0(m0 toolbarMapper, h0 buttonMapper, k0 contentMapper) {
        Intrinsics.checkNotNullParameter(toolbarMapper, "toolbarMapper");
        Intrinsics.checkNotNullParameter(buttonMapper, "buttonMapper");
        Intrinsics.checkNotNullParameter(contentMapper, "contentMapper");
        this.f325547a = toolbarMapper;
        this.f325548b = contentMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        Data data;
        n domainState = (n) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data2 = domainState.f;
        m0 m0Var = this.f325547a;
        v vVar = (v) iii.c.f(data2, new zrd.q(m0Var, 11), new zo2.h(m0Var, 18), new ymk.y(m0Var, domainState, 28));
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data3 = domainState.d;
        Data data4 = domainState.e;
        Data data5 = domainState.f;
        u uVar = new u(new TextLocalisedClause(R.string.common_action_continue, null, null, 14), ((Boolean) iii.c.f(t1.u(data3, data4, data5), new zr2.o(29), new zs4.d(7), new p0(4))).booleanValue());
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data dataW = t1.w(data3, data4, zi0.c.P(domainState.f325541b, false, null, 3), data5, domainState.f325543g);
        k0 k0Var = this.f325548b;
        Collection collection = (Collection) iii.c.f(dataW, new zrd.q(k0Var, 10), new zs4.d(8), new zhl.l(k0Var, domainState, 11));
        ruk.a0 a0Var = k0Var.f325532b;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data6 = domainState.i;
        Data data7 = domainState.f325544h;
        try {
            Object content = data7.getContent();
            data = new Data(content != null ? ((TradingLegalEntityInformation) content).f105106a : null, data7.getError(), data7.getLoading());
        } catch (Throwable th10) {
            data = new Data(null, th10, data7.getLoading());
        }
        return new w(vVar, uVar, zhm.d0.E0((List) iii.c.f(t1.t(data6, data), new l0(0), new zs4.d(9), new ymk.y(a0Var, 27)), collection));
    }
}
