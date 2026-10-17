package jj5;

import ak5.j;
import b9k.f;
import kotlin.jvm.internal.Intrinsics;
import l70.e;
import vc.s;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f174635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f174636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bpj.a f174637c;
    public final ei5.d d;
    public final ebj.b e;
    public final ak5.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final oda.d f174638g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f174639h = this;

    public b(e eVar, ue5.b bVar, ei5.d dVar, ak5.a aVar, j jVar, ebj.b bVar2, bpj.a aVar2, oda.d dVar2) {
        this.f174635a = jVar;
        this.f174636b = eVar;
        this.f174637c = aVar2;
        this.d = dVar;
        this.e = bVar2;
        this.f = aVar;
        this.f174638g = dVar2;
    }

    public final f a() {
        com.revolut.feature.crypto.remittance.api.navigation.a cryptoRemittanceCurrencyChooserFlowProvider = (com.revolut.feature.crypto.remittance.api.navigation.a) this.f174635a.o.get();
        s.j(cryptoRemittanceCurrencyChooserFlowProvider);
        e eVar = this.f174636b;
        fkg.a qrCodeGenerator = eVar.d();
        xoj.a featuresInteractor = this.f174637c.a();
        s.j(featuresInteractor);
        xh5.a cryptoFeatureEnabledInteractor = this.d.a();
        s.j(cryptoFeatureEnabledInteractor);
        c70.a clipboard = eVar.z();
        s.j(clipboard);
        r70.c hapticEngine = eVar.A();
        s.j(hapticEngine);
        nj5.a receiveWidgetCatalogueProvider = new nj5.a();
        Intrinsics.checkNotNullParameter(cryptoRemittanceCurrencyChooserFlowProvider, "cryptoRemittanceCurrencyChooserFlowProvider");
        Intrinsics.checkNotNullParameter(qrCodeGenerator, "qrCodeGenerator");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(cryptoFeatureEnabledInteractor, "cryptoFeatureEnabledInteractor");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(hapticEngine, "hapticEngine");
        Intrinsics.checkNotNullParameter(receiveWidgetCatalogueProvider, "receiveWidgetCatalogueProvider");
        f fVar = new f();
        fVar.f13817b = cryptoRemittanceCurrencyChooserFlowProvider;
        fVar.f13816a = qrCodeGenerator;
        fVar.f13818c = featuresInteractor;
        fVar.d = cryptoFeatureEnabledInteractor;
        fVar.e = clipboard;
        fVar.f = hapticEngine;
        fVar.f13819g = receiveWidgetCatalogueProvider;
        return fVar;
    }
}
