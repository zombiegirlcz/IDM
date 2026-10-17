package kr9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.payments.groups.impl.ui_new.details_bill.GroupDetailsBillScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class p implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f188782a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GroupDetailsBillScreenContract$InputData f188783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f188784c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f188785g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f188786h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f188787j;

    public p(l lVar, a aVar, BaseScreen baseScreen, GroupDetailsBillScreenContract$InputData groupDetailsBillScreenContract$InputData) {
        this.f188784c = lVar;
        this.f188783b = groupDetailsBillScreenContract$InputData;
        this.d = e4m.b.b(e4m.c.a(baseScreen));
        int i = 3;
        this.e = e4m.b.b(new m(lVar, this, 2, i));
        this.f = e4m.b.b(new m(lVar, this, 1, i));
        this.f188785g = e4m.b.b(new m(lVar, this, 0, i));
        this.f188786h = e4m.b.b(new m(lVar, this, 4, i));
        this.i = e4m.b.b(new m(lVar, this, 5, i));
        this.f188787j = e4m.b.b(new m(lVar, this, 3, i));
    }

    @Override // sji.b
    public final Set f() {
        switch (this.f188782a) {
        }
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        switch (this.f188782a) {
        }
        return ImmutableSet.of((yji.d) this.f188785g.get());
    }

    public p(l lVar, g gVar, BaseScreen baseScreen, GroupDetailsBillScreenContract$InputData groupDetailsBillScreenContract$InputData) {
        this.f188784c = lVar;
        this.f188783b = groupDetailsBillScreenContract$InputData;
        this.d = e4m.b.b(e4m.c.a(baseScreen));
        int i = 1;
        this.e = e4m.b.b(new m(lVar, this, 2, i));
        this.f = e4m.b.b(new m(lVar, this, 1, i));
        this.f188785g = e4m.b.b(new m(lVar, this, 0, i));
        this.f188786h = e4m.b.b(new m(lVar, this, 4, i));
        this.i = e4m.b.b(new m(lVar, this, 5, i));
        this.f188787j = e4m.b.b(new m(lVar, this, 3, i));
    }
}
