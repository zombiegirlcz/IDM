package aw4;

import ahe.y0;
import al4.n;
import ang.f;
import com.revolut.data.model.Data;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import od0.i;
import vkm.q;
import w4l.k;
import yb5.e;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f10730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb5.b f10731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f10732c;

    public b(n creditCardInteractor, lb5.b autoPayInteractor, f userInteractor) {
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(autoPayInteractor, "autoPayInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f10730a = creditCardInteractor;
        this.f10731b = autoPayInteractor;
        this.f10732c = userInteractor;
    }

    public final Flow a(String facilityId, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Flow flowG = ((e) this.f10731b).g(facilityId, loadingStrategy);
        i.Companion.getClass();
        return q.q(q.Q(flowG, new y0((Continuation) null, new Data(i.f224256b, null, false, 6, null), this, facilityId, loadingStrategy, 1)));
    }
}
