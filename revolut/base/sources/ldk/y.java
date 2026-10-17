package ldk;

import com.revolut.data.model.Data;
import klf.a3;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import skm.a2;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class y extends oki.h implements dli.b {
    public final gdk.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l80.e f194184p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vii.b f194185q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a2 f194186r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final cli.y f194187s;

    public y(gdk.a milestoneRewardsInteractor, l80.e dateTimeProvider, a0 stateMapper) {
        Intrinsics.checkNotNullParameter(milestoneRewardsInteractor, "milestoneRewardsInteractor");
        Intrinsics.checkNotNullParameter(dateTimeProvider, "dateTimeProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = milestoneRewardsInteractor;
        this.f194184p = dateTimeProvider;
        this.f194185q = new vii.b();
        this.f194187s = mra.d.b(this, new f(new Data(null, null, true, 3, null), false), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, rd0.e.n(vkm.q.Q(this.f194185q, new a3(continuation, this, 29)), h0.f322473a), null, null, new l1g.e(this, continuation, 26), 3);
    }

    public final void I2(Object obj2, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        if (obj2 instanceof s) {
            C2(new q(((s) obj2).f194176a));
            return;
        }
        if (obj2 instanceof t) {
            C2(new p(((t) obj2).f194177a));
        } else if (obj2 instanceof u) {
            C2(new l(((u) obj2).f194178a));
        } else if (obj2 instanceof v) {
            C2(new n(((v) obj2).f194179a));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f194187s;
    }
}
