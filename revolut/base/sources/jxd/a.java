package jxd;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.standingordertopup.impl.ui.flow.auto_top_up.AutoTopUpFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AutoTopUpFlowContract$InputData f179135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f179136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f179137c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f179138g;

    public a(f fVar, AutoTopUpFlowContract$InputData autoTopUpFlowContract$InputData) {
        this.f179136b = fVar;
        this.f179135a = autoTopUpFlowContract$InputData;
        int i = 3;
        this.d = e4m.b.b(new jqa.h(fVar, this, 1, i));
        this.e = e4m.b.b(new jqa.h(fVar, this, 2, i));
        this.f = e4m.b.b(new jqa.h(fVar, this, 0, i));
        this.f179138g = e4m.b.b(new jqa.h(fVar, this, 3, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
