package ove;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.topup_screen.impl.flows.cvv.screen.CvvScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class x implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f230169a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CvvScreenContract$InputData f230170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f230171c;
    public final e4m.e d;

    public x(t tVar, h hVar, CvvScreenContract$InputData cvvScreenContract$InputData) {
        this.f230170b = cvvScreenContract$InputData;
        int i = 1;
        this.f230171c = e4m.b.b(new w(tVar, this, 1, i));
        this.d = e4m.b.b(new w(tVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f230169a) {
        }
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f230169a) {
        }
        return ImmutableSet.of();
    }

    public x(t tVar, j jVar, CvvScreenContract$InputData cvvScreenContract$InputData) {
        this.f230170b = cvvScreenContract$InputData;
        int i = 0;
        this.f230171c = e4m.b.b(new w(tVar, this, 1, i));
        this.d = e4m.b.b(new w(tVar, this, 0, i));
    }
}
