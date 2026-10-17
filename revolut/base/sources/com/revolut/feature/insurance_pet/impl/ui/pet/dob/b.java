package com.revolut.feature.insurance_pet.impl.ui.pet.dob;

import efm.r;
import kotlin.jvm.internal.Intrinsics;
import rz7.f;
import rz7.g;
import te0.w;
import ty1.c;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f76352a;

    public b(g state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f76352a = state;
    }

    @Override // rz7.f
    public final r M() {
        return this.f76352a.getDateOfBirth().a();
    }

    @Override // rz7.f
    public final r S() {
        r map = this.f76352a.getDateOfBirth().a().map(new c(new tyg.g(4), 20));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // rz7.f
    public final efm.b u(DOBInputData date) {
        Intrinsics.checkNotNullParameter(date, "date");
        return w.z0(this.f76352a.getDateOfBirth(), date);
    }
}
