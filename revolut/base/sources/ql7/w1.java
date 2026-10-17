package ql7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.driver.details.AdditionalDriverDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class w1 implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f247509a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AdditionalDriverDetailsScreenContract$InputData f247510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f247511c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f247512g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f247513h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f247514j;

    public w1(k0 k0Var, n nVar, BaseScreen baseScreen, AdditionalDriverDetailsScreenContract$InputData additionalDriverDetailsScreenContract$InputData) {
        this.f247510b = additionalDriverDetailsScreenContract$InputData;
        this.f247511c = e4m.b.b(e4m.c.a(baseScreen));
        int i = 1;
        this.d = e4m.b.b(new v1(k0Var, this, 3, i));
        this.e = e4m.b.b(new v1(k0Var, this, 2, i));
        this.f = e4m.b.b(new v1(k0Var, this, 1, i));
        this.f247512g = e4m.b.b(new v1(k0Var, this, 0, i));
        this.f247513h = e4m.b.b(new v1(k0Var, this, 4, i));
        this.i = e4m.b.b(new v1(k0Var, this, 6, i));
        this.f247514j = e4m.b.b(new v1(k0Var, this, 5, i));
    }

    @Override // sji.b
    public final Set f() {
        switch (this.f247509a) {
        }
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        switch (this.f247509a) {
        }
        return ImmutableSet.of((yji.d) this.f247512g.get(), (yji.d) this.f247513h.get());
    }

    public w1(k0 k0Var, t0 t0Var, BaseScreen baseScreen, AdditionalDriverDetailsScreenContract$InputData additionalDriverDetailsScreenContract$InputData) {
        this.f247510b = additionalDriverDetailsScreenContract$InputData;
        this.f247511c = e4m.b.b(e4m.c.a(baseScreen));
        int i = 0;
        this.d = e4m.b.b(new v1(k0Var, this, 3, i));
        this.e = e4m.b.b(new v1(k0Var, this, 2, i));
        this.f = e4m.b.b(new v1(k0Var, this, 1, i));
        this.f247512g = e4m.b.b(new v1(k0Var, this, 0, i));
        this.f247513h = e4m.b.b(new v1(k0Var, this, 4, i));
        this.i = e4m.b.b(new v1(k0Var, this, 6, i));
        this.f247514j = e4m.b.b(new v1(k0Var, this, 5, i));
    }
}
