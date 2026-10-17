package lu7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_embedded.impl.ui.screen.detail.EmbeddedInsuranceDetailScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class y implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f200191a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EmbeddedInsuranceDetailScreenContract$InputData f200192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f200193c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f200194g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f200195h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f200196j;

    public y(s sVar, i iVar, BaseScreen baseScreen, EmbeddedInsuranceDetailScreenContract$InputData embeddedInsuranceDetailScreenContract$InputData) {
        this.f200193c = sVar;
        this.f200192b = embeddedInsuranceDetailScreenContract$InputData;
        this.d = e4m.b.b(e4m.c.a(baseScreen));
        int i = 20;
        this.e = e4m.b.b(new lti.l(sVar, this, 2, i));
        this.f = e4m.b.b(new lti.l(sVar, this, 1, i));
        this.f200194g = e4m.b.b(new lti.l(sVar, this, 0, i));
        this.f200195h = e4m.b.b(new lti.l(sVar, this, 4, i));
        this.i = e4m.b.b(new lti.l(sVar, this, 5, i));
        this.f200196j = e4m.b.b(new lti.l(sVar, this, 3, i));
    }

    public final j60.a b() {
        switch (this.f200191a) {
        }
        return (j60.a) this.f.get();
    }

    @Override // sji.b
    public final Set f() {
        switch (this.f200191a) {
        }
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        switch (this.f200191a) {
        }
        return ImmutableSet.of((yji.d) this.f200194g.get());
    }

    public y(s sVar, BaseScreen baseScreen, EmbeddedInsuranceDetailScreenContract$InputData embeddedInsuranceDetailScreenContract$InputData) {
        this.f200193c = sVar;
        this.f200192b = embeddedInsuranceDetailScreenContract$InputData;
        this.d = e4m.b.b(e4m.c.a(baseScreen));
        int i = 21;
        this.e = e4m.b.b(new lti.l(sVar, this, 2, i));
        this.f = e4m.b.b(new lti.l(sVar, this, 1, i));
        this.f200194g = e4m.b.b(new lti.l(sVar, this, 0, i));
        this.f200195h = e4m.b.b(new lti.l(sVar, this, 4, i));
        this.i = e4m.b.b(new lti.l(sVar, this, 5, i));
        this.f200196j = e4m.b.b(new lti.l(sVar, this, 3, i));
    }
}
