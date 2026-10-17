package com.revolut.feature.card_input.common.ui;

import a08.p0;
import a0d.g;
import akl.s;
import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.view.Window;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.card_input.common.CardInputContract$Configuration;
import com.revolut.feature.card_input.common.ui.CardInputActivity;
import com.revolut.feature.cards_core.api.CardsCoreApi$Toggles;
import hpi.c;
import hpi.h;
import java.util.List;
import jy2.k;
import jy2.l;
import jy2.n;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import ky2.a;
import ky2.d;
import nx2.f;
import opi.b;
import org.jmrtd.cbeff.ISO781611;
import pri.e;
import rfm.m;
import te0.w;
import v60.i;
import yhm.j;
import yp0.y;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/card_input/common/ui/CardInputActivity;", "Lhpi/h;", "Ljy2/i;", "Ljy2/l;", "<init>", "()V", "feature_card_input_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardInputActivity extends h implements l {
    public static final /* synthetic */ int B0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public a f64753s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public b f64754t0;
    public k u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public gte.a f64755v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Lazy f64756w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final Object f64757x0;
    public final Object z0;
    public final Object y0 = w.y0(new nwf.b(8));
    public final i A0 = new i();

    public CardInputActivity() {
        final int i = 0;
        this.f64756w0 = j.b(new Function0(this) { // from class: ny2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardInputActivity f220622b;

            {
                this.f220622b = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CardInputActivity cardInputActivity = this.f220622b;
                switch (i2) {
                    case 0:
                        int i3 = CardInputActivity.B0;
                        return ((CardInputContract$Configuration) cardInputActivity.G0()).f64744a;
                    case 1:
                        int i5 = CardInputActivity.B0;
                        return new InputTextDelegate(new f(cardInputActivity, 2));
                    default:
                        int i6 = CardInputActivity.B0;
                        return new z4l.j(7, u.c((InputTextDelegate) cardInputActivity.f64757x0.getValue()), false);
                }
            }
        });
        final int i2 = 1;
        this.f64757x0 = w.y0(new Function0(this) { // from class: ny2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardInputActivity f220622b;

            {
                this.f220622b = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CardInputActivity cardInputActivity = this.f220622b;
                switch (i22) {
                    case 0:
                        int i3 = CardInputActivity.B0;
                        return ((CardInputContract$Configuration) cardInputActivity.G0()).f64744a;
                    case 1:
                        int i5 = CardInputActivity.B0;
                        return new InputTextDelegate(new f(cardInputActivity, 2));
                    default:
                        int i6 = CardInputActivity.B0;
                        return new z4l.j(7, u.c((InputTextDelegate) cardInputActivity.f64757x0.getValue()), false);
                }
            }
        });
        final int i3 = 2;
        this.z0 = w.y0(new Function0(this) { // from class: ny2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardInputActivity f220622b;

            {
                this.f220622b = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CardInputActivity cardInputActivity = this.f220622b;
                switch (i22) {
                    case 0:
                        int i32 = CardInputActivity.B0;
                        return ((CardInputContract$Configuration) cardInputActivity.G0()).f64744a;
                    case 1:
                        int i5 = CardInputActivity.B0;
                        return new InputTextDelegate(new f(cardInputActivity, 2));
                    default:
                        int i6 = CardInputActivity.B0;
                        return new z4l.j(7, u.c((InputTextDelegate) cardInputActivity.f64757x0.getValue()), false);
                }
            }
        });
    }

    @Override // nri.b
    public final e F0() {
        a aVar = this.f64753s0;
        if (aVar != null) {
            return aVar.b();
        }
        Intrinsics.r("component");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0 */
    public final String getF85901s0() {
        return (String) this.f64756w0.getValue();
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        a aVar = this.f64753s0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("component");
        throw null;
    }

    @Override // hpi.d
    public final c b1() {
        hpi.b bVar = new hpi.b(new hpi.k(BitmapDescriptorFactory.HUE_RED, R$attr.uikit_windowBackground, ISO781611.SMT_TAG));
        xpi.f.Companion.getClass();
        xpi.f configuration = xpi.f.f307976c;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        bVar.f = configuration;
        c.b(bVar);
        c.c(bVar);
        return bVar;
    }

    public final k c1() {
        k kVar = this.u0;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.r("state");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        CardInputContract$Configuration cardInputContract$Configuration = (CardInputContract$Configuration) G0();
        qy2.b bVar = (qy2.b) ((d) com.bumptech.glide.c.l(this).b(null, getF85901s0())).s().h(rd0.e.g(this, bundle, null));
        xpi.f.Companion.getClass();
        qy2.b bVar2 = (qy2.b) bVar.k();
        ypi.h.Companion.getClass();
        qy2.b bVar3 = (qy2.b) bVar2.b(ypi.h.f);
        switch (bVar3.f250120a) {
            case 0:
                bVar3.e = cardInputContract$Configuration;
                break;
            default:
                bVar3.e = cardInputContract$Configuration;
                break;
        }
        a aVar = (a) bVar3.build();
        this.f64753s0 = aVar;
        if (aVar == null) {
            Intrinsics.r("component");
            throw null;
        }
        aVar.M(this);
        n nVar = (n) c1();
        te0.j jVar = nVar.f179316b;
        KProperty[] kPropertyArr = n.f179315r;
        jVar.getValue(nVar, kPropertyArr[0]).set(cardInputContract$Configuration.f64744a);
        te0.e eVarW0 = ((n) c1()).w0();
        od0.h hVar = od0.i.Companion;
        String str = cardInputContract$Configuration.i;
        hVar.getClass();
        eVarW0.set(od0.h.a(str));
        n nVar2 = (n) c1();
        nVar2.d.getValue(nVar2, kPropertyArr[2]).set(Integer.valueOf(cardInputContract$Configuration.f64746c));
        n nVar3 = (n) c1();
        nVar3.e.getValue(nVar3, kPropertyArr[3]).set(Integer.valueOf(cardInputContract$Configuration.d));
        n nVar4 = (n) c1();
        w.s0(nVar4.f.getValue(nVar4, kPropertyArr[4]), cardInputContract$Configuration.e);
        n nVar5 = (n) c1();
        nVar5.f179317c.getValue(nVar5, kPropertyArr[1]).set(Integer.valueOf(cardInputContract$Configuration.f64745b));
        n nVar6 = (n) c1();
        nVar6.i.getValue(nVar6, kPropertyArr[7]).set(od0.h.a(cardInputContract$Configuration.f));
        n nVar7 = (n) c1();
        nVar7.f179320j.getValue(nVar7, kPropertyArr[8]).set(od0.h.a(cardInputContract$Configuration.f64747g));
        ((n) c1()).z0().set(Boolean.valueOf(cardInputContract$Configuration.f64748h));
        n nVar8 = (n) c1();
        nVar8.f179323n.getValue(nVar8, kPropertyArr[13]).set(cardInputContract$Configuration.f64750l);
        n nVar9 = (n) c1();
        nVar9.o.getValue(nVar9, kPropertyArr[14]).set(Boolean.valueOf(cardInputContract$Configuration.f64749j));
        n nVar10 = (n) c1();
        nVar10.f179324p.getValue(nVar10, kPropertyArr[15]).set(od0.h.a(cardInputContract$Configuration.k));
        gte.a aVar2 = this.f64755v0;
        if (aVar2 == null) {
            Intrinsics.r("featureToggleInteractor");
            throw null;
        }
        if (((jte.d) aVar2).c(CardsCoreApi$Toggles.CardNumberCustomKeyboard.f65557c)) {
            Window window = getWindow();
            Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
            rv0.h.a(window);
        }
        super.onCreate(bundle);
        RecyclerView recyclerViewZ0 = Z0();
        y.h(recyclerViewZ0, (z4l.j) this.z0.getValue(), new LinearLayoutManager(recyclerViewZ0.getContext()));
        b bVar4 = this.f64754t0;
        if (bVar4 == null) {
            Intrinsics.r("expandableDialogActivityDelegate");
            throw null;
        }
        ?? r06 = this.y0;
        bVar4.Y("CARD_INPUT_DELEGATES_KEY", u.c((LargeActionButtonDelegate) r06.getValue()));
        bVar4.Y("LINK_CARD_DELEGATES_KEY", u.c((LargeActionButtonDelegate) r06.getValue()));
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, androidx.view.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        jy2.i iVar;
        Intrinsics.checkNotNullParameter(intent, "intent");
        w53.b.Companion.getClass();
        Tag tag2 = w53.a.a(intent);
        if (tag2 != null && (iVar = (jy2.i) this.f218652a0) != null) {
            ly2.l lVar = (ly2.l) iVar;
            Intrinsics.checkNotNullParameter(tag2, "tag");
            b63.a aVar = (b63.a) lVar.f200647l;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(tag2, "tag");
            rfm.w wVarH = o70.a.h(((f63.d) aVar.i).d(tag2));
            ly2.b bVar = new ly2.b(lVar, 5);
            s sVar = lVar.i;
            Function0 function0J = lVar.J();
            m mVar = new m(wVarH, new g(25, new lak.l(new BreadcrumbException(), 27)), 2);
            Intrinsics.checkNotNullExpressionValue(mVar, "onErrorResumeNext(...)");
            rfm.b bVar2 = new rfm.b(new p0(24, bVar), new p0(24, sVar), new j7a.j(4, function0J));
            mVar.i(bVar2);
            Intrinsics.checkNotNullExpressionValue(bVar2, "subscribe(...)");
            w.j0(lVar.f239031a, bVar2);
        }
        super.onNewIntent(intent);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zqi.a
    public final void setItems(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ((z4l.j) this.z0.getValue()).c(items);
    }
}
