package nsf;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.transfer_reasons.impl.ui.search.TransferReasonsSearchScreenContract$InputData;
import java.util.Set;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes9.dex */
public final class t implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f218857a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferReasonsSearchScreenContract$InputData f218858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Flow f218859c;
    public final b d;
    public final e4m.e e;
    public final e4m.e f;

    public t(b bVar, d dVar, TransferReasonsSearchScreenContract$InputData transferReasonsSearchScreenContract$InputData, Flow flow) {
        this.d = bVar;
        this.f218858b = transferReasonsSearchScreenContract$InputData;
        this.f218859c = flow;
        int i = 21;
        this.e = e4m.b.b(new nk7.k(bVar, this, 1, i));
        this.f = e4m.b.b(new nk7.k(bVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f218857a) {
        }
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f218857a) {
        }
        return ImmutableSet.of(new c84.w((ntf.r) this.f.get()));
    }

    public t(b bVar, f fVar, TransferReasonsSearchScreenContract$InputData transferReasonsSearchScreenContract$InputData, Flow flow) {
        this.d = bVar;
        this.f218858b = transferReasonsSearchScreenContract$InputData;
        this.f218859c = flow;
        int i = 20;
        this.e = e4m.b.b(new nk7.k(bVar, this, 1, i));
        this.f = e4m.b.b(new nk7.k(bVar, this, 0, i));
    }
}
