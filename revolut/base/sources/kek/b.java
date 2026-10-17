package kek;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.pod_nominees.impl.edit.PodNomineeEditScreenContract$InputData;
import java.util.Set;
import yji.n;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PodNomineeEditScreenContract$InputData f183109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f183110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f183111c;
    public final e4m.e d;

    public b(c cVar, d dVar, PodNomineeEditScreenContract$InputData podNomineeEditScreenContract$InputData) {
        this.f183109a = podNomineeEditScreenContract$InputData;
        this.f183110b = e4m.b.b(new il8.d(cVar, dVar, this, 0, 16));
        int i = 16;
        this.f183111c = e4m.b.b(new il8.d(cVar, dVar, this, 2, i));
        this.d = e4m.b.b(new il8.d(cVar, dVar, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.f183110b.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
