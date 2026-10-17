package gah;

import eh9.j;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.q;
import w4l.k;
import wkm.l;
import wli.x;
import yji.n;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends n implements d1h.e, d1h.f, d1h.d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d1h.d f142178l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d1h.f f142179m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final x f142180n;
    public final vii.c o;

    public e(d1h.d clauseDestinationProvider, d1h.f dataProvider, x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(dataProvider, "dataProvider");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(clauseDestinationProvider, "clauseDestinationProvider");
        this.f142178l = clauseDestinationProvider;
        this.f142179m = dataProvider;
        this.f142180n = deeplinkHandler;
        this.o = new vii.c();
    }

    @Override // d1h.d
    public final d1h.c C1(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        return this.f142178l.C1(clickData);
    }

    @Override // d1h.f
    public final Flow R1(List scopes, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return this.f142179m.R1(scopes, loadingStrategy);
    }

    public final l Z2(List scopes) {
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        return q.Q(oi0.d.w(this.o), new j((Continuation) null, this, scopes, 12));
    }
}
