package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.autopay.ui.screen.set_date.SetDateContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class l6 implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f119209a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SetDateContract$InputData f119210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f119211c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119212g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119213h;

    public l6(jm4.a3 a3Var, jm4.l2 l2Var, BaseScreen baseScreen, SetDateContract$InputData setDateContract$InputData) {
        this.f119210b = setDateContract$InputData;
        this.f119211c = e4m.b.b(e4m.c.a(baseScreen));
        int i = 26;
        this.d = e4m.b.b(new jm4.f1(a3Var, this, 2, i));
        this.e = e4m.b.b(new jm4.f1(a3Var, this, 1, i));
        this.f = e4m.b.b(new jm4.f1(a3Var, this, 0, i));
        this.f119212g = e4m.b.b(new jm4.f1(a3Var, this, 4, i));
        this.f119213h = e4m.b.b(new jm4.f1(a3Var, this, 3, i));
    }

    @Override // sji.b
    public final Set f() {
        switch (this.f119209a) {
        }
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        switch (this.f119209a) {
        }
        return ImmutableSet.of((yji.d) this.f.get());
    }

    public l6(jm4.a3 a3Var, jm4.j0 j0Var, BaseScreen baseScreen, SetDateContract$InputData setDateContract$InputData) {
        this.f119210b = setDateContract$InputData;
        this.f119211c = e4m.b.b(e4m.c.a(baseScreen));
        int i = 25;
        this.d = e4m.b.b(new jm4.f1(a3Var, this, 2, i));
        this.e = e4m.b.b(new jm4.f1(a3Var, this, 1, i));
        this.f = e4m.b.b(new jm4.f1(a3Var, this, 0, i));
        this.f119212g = e4m.b.b(new jm4.f1(a3Var, this, 4, i));
        this.f119213h = e4m.b.b(new jm4.f1(a3Var, this, 3, i));
    }

    public l6(c1 c1Var, d1 d1Var, BaseScreen baseScreen, SetDateContract$InputData setDateContract$InputData) {
        this.f119210b = setDateContract$InputData;
        this.f119211c = e4m.b.b(e4m.c.a(baseScreen));
        int i = 13;
        this.d = e4m.b.b(new g5(c1Var, this, 2, i));
        this.e = e4m.b.b(new g5(c1Var, this, 1, i));
        this.f = e4m.b.b(new g5(c1Var, this, 0, i));
        this.f119212g = e4m.b.b(new g5(c1Var, this, 4, i));
        this.f119213h = e4m.b.b(new g5(c1Var, this, 3, i));
    }
}
