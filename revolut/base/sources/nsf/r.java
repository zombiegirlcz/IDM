package nsf;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.transfer_reasons.impl.ui.reasons.TransferReasonsScreenContract$InputData;
import java.util.Set;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes9.dex */
public final class r implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f218851a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferReasonsScreenContract$InputData f218852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Flow f218853c;
    public final Flow d;
    public final e4m.e e;
    public final e4m.e f;

    public r(b bVar, d dVar, TransferReasonsScreenContract$InputData transferReasonsScreenContract$InputData, Flow flow, Flow flow2) {
        this.f218852b = transferReasonsScreenContract$InputData;
        this.f218853c = flow;
        this.d = flow2;
        int i = 19;
        this.e = e4m.b.b(new nk7.k(bVar, this, 1, i));
        this.f = e4m.b.b(new nk7.k(bVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f218851a) {
        }
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f218851a) {
        }
        return ImmutableSet.of();
    }

    public r(b bVar, f fVar, TransferReasonsScreenContract$InputData transferReasonsScreenContract$InputData, Flow flow, Flow flow2) {
        this.f218852b = transferReasonsScreenContract$InputData;
        this.f218853c = flow;
        this.d = flow2;
        int i = 18;
        this.e = e4m.b.b(new nk7.k(bVar, this, 1, i));
        this.f = e4m.b.b(new nk7.k(bVar, this, 0, i));
    }
}
