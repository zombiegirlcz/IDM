package vaa;

import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.feature.pix.api.model.PixKey;
import com.revolut.feature.pix.api.model.PixKeys;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import vkm.z1;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class f0 extends oki.h implements a0 {

    @NotNull
    public static final c0 Companion = new c0();
    public final k o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f8a.a f287187p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f287188q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ogm.i f287189r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final t8a.a f287190s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l0 f287191t;
    public final ry9.d u;
    public final cli.y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final z1 f287192w;

    public f0(g0 stateMapper, k inputData, f8a.a pixAreaInteractor, b pixAreaProvider, ogm.i pixBeneficiaryInteractor, t8a.a pixKeysControllerModelExtension, l0 widgetEventsHandler, ry9.d sendFromClipboardExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pixAreaInteractor, "pixAreaInteractor");
        Intrinsics.checkNotNullParameter(pixAreaProvider, "pixAreaProvider");
        Intrinsics.checkNotNullParameter(pixBeneficiaryInteractor, "pixBeneficiaryInteractor");
        Intrinsics.checkNotNullParameter(pixKeysControllerModelExtension, "pixKeysControllerModelExtension");
        Intrinsics.checkNotNullParameter(widgetEventsHandler, "widgetEventsHandler");
        Intrinsics.checkNotNullParameter(sendFromClipboardExtension, "sendFromClipboardExtension");
        this.o = inputData;
        this.f287187p = pixAreaInteractor;
        this.f287188q = pixAreaProvider;
        this.f287189r = pixBeneficiaryInteractor;
        this.f287190s = pixKeysControllerModelExtension;
        this.f287191t = widgetEventsHandler;
        this.u = sendFromClipboardExtension;
        this.v = mra.d.b(this, new j(0), stateMapper, null, false, 12);
        z1 z1VarB = vkm.q.b(0, 6, null);
        z1VarB.k(Unit.f186387a);
        this.f287192w = z1VarB;
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(this.f287192w, new uec.d(continuation, this, 20)), null, null, new v44.e(this, continuation, 14), 3);
    }

    public final void I2(a aVar) {
        PixKey pixKeyA;
        PixKey pixKeyA2;
        PixKey pixKeyA3;
        int i = d0.f287184a[aVar.ordinal()];
        t8a.a aVar2 = this.f287190s;
        cli.y yVar = this.v;
        switch (i) {
            case 1:
                C2(u.f287215a);
                return;
            case 2:
                C2(m.f287207a);
                return;
            case 3:
                C2(t.f287214a);
                return;
            case 4:
                PixKeys pixKeys = (PixKeys) ((j) ((j2) yVar.f22677a).getValue()).f287199a.getContent();
                C2(new s(pixKeys != null ? pixKeys.a() : null));
                return;
            case 5:
                PixKeys pixKeys2 = (PixKeys) ((j) ((j2) yVar.f22677a).getValue()).f287199a.getContent();
                if (pixKeys2 == null || (pixKeyA = pixKeys2.a()) == null) {
                    return;
                }
                aVar2.Z2(pixKeyA);
                return;
            case 6:
                PixKeys pixKeys3 = (PixKeys) ((j) ((j2) yVar.f22677a).getValue()).f287199a.getContent();
                if (pixKeys3 == null || (pixKeyA2 = pixKeys3.a()) == null) {
                    return;
                }
                C1(aVar2.b3(pixKeyA2));
                return;
            case 7:
                C2(n.f287208a);
                return;
            case 8:
                C2(o.f287209a);
                return;
            case 9:
                C1(u0.b(new FeatureCommand(new FaqFeatureConfig.Starter("0e9f76b4-872b-49a3-8deb-d1a56bb6ea22", 2))));
                return;
            case 10:
                C2(new v(iaa.f.ONBOARDING));
                return;
            case 11:
                PixKeys pixKeys4 = (PixKeys) ((j) ((j2) yVar.f22677a).getValue()).f287199a.getContent();
                if (pixKeys4 == null || (pixKeyA3 = pixKeys4.a()) == null) {
                    return;
                }
                l1().M0(new kaa.a(pixKeyA3));
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
