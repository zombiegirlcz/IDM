package com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.review;

import android.os.Bundle;
import android.view.Window;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import eq5.b0;
import hpi.c;
import hpi.g;
import hpi.h;
import hpi.k;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import opi.b;
import org.jmrtd.cbeff.ISO781611;
import te0.n;
import te0.w;
import vp5.e;
import vpi.d;
import wf5.a;
import wp5.i;
import wp5.o;
import yp0.y;
import z4l.j;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui/withdrawtoaddress/review/CryptoWithdrawToAddressReviewActivity;", "Lhpi/h;", "Lwp5/i;", "Lwp5/o;", "<init>", "()V", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoWithdrawToAddressReviewActivity extends h implements o {
    public static final /* synthetic */ int A0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public e f71176t0;
    public b u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public b0 f71177v0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final String f71175s0 = "CRYPTO_WITHDRAW_TO_ADDRESS_FLOW";

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Object f71178w0 = w.y0(new wp0.b(this, 2));

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final Object f71179x0 = w.y0(new a(27));
    public final Object y0 = w.y0(new a(28));
    public final Object z0 = w.y0(new a(29));

    @Override // nri.b
    public final pri.e F0() {
        e eVar = this.f71176t0;
        if (eVar != null) {
            return (i) eVar.J.get();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF71163r0() {
        return this.f71175s0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        e eVar = this.f71176t0;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // hpi.d
    public final c b1() {
        c cVar = new c(new k(BitmapDescriptorFactory.HUE_RED, R$attr.uikit_windowBackground, ISO781611.SMT_TAG));
        d.Companion.getClass();
        d configuration = d.f291221b;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        cVar.f154552h = configuration;
        g.Companion.getClass();
        g keyboardSuggestionsConfiguration = g.f154557b;
        Intrinsics.checkNotNullParameter(keyboardSuggestionsConfiguration, "keyboardSuggestionsConfiguration");
        cVar.k = keyboardSuggestionsConfiguration;
        c.b(cVar);
        return cVar;
    }

    public final b0 c1() {
        b0 b0Var = this.f71177v0;
        if (b0Var != null) {
            return b0Var;
        }
        Intrinsics.r("delegatesContainer");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        vp5.d dVar = ((vp5.d) com.bumptech.glide.c.l(this).b(null, this.f71175s0)).E;
        xoi.d dVarG = rd0.e.g(this, bundle, null);
        d.Companion.getClass();
        ypi.h.Companion.getClass();
        g.Companion.getClass();
        e eVar = new e(dVar, dVarG);
        this.f71176t0 = eVar;
        this.u0 = (b) eVar.k.get();
        this.f71177v0 = (b0) eVar.K.get();
        if (bundle == null) {
            CryptoWithdrawToAddressReviewContract$SendToConfig cryptoWithdrawToAddressReviewContract$SendToConfig = (CryptoWithdrawToAddressReviewContract$SendToConfig) G0();
            e eVar2 = this.f71176t0;
            if (eVar2 == null) {
                Intrinsics.r("activityComponent");
                throw null;
            }
            up5.e eVar3 = (up5.e) ((up5.c) eVar2.f291097b.H.get());
            te0.e eVarW0 = eVar3.w0();
            od0.h hVar = od0.i.Companion;
            String str = cryptoWithdrawToAddressReviewContract$SendToConfig.f71182a;
            hVar.getClass();
            eVarW0.set(od0.h.a(str));
            n nVar = eVar3.f281875c;
            KProperty[] kPropertyArr = up5.e.v;
            nVar.getValue(eVar3, kPropertyArr[1]).set(od0.h.a(cryptoWithdrawToAddressReviewContract$SendToConfig.f71184c));
            eVar3.E0().set(od0.h.a(cryptoWithdrawToAddressReviewContract$SendToConfig.f71183b));
            eVar3.F0().set(cryptoWithdrawToAddressReviewContract$SendToConfig.getE());
            eVar3.f.getValue(eVar3, kPropertyArr[4]).set(Boolean.valueOf(cryptoWithdrawToAddressReviewContract$SendToConfig.F7()));
        }
        if (((Boolean) jo0.g.v.getValue()).booleanValue()) {
            Window window = getWindow();
            Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
            rv0.h.a(window);
        }
        super.onCreate(bundle);
        RecyclerView recyclerViewZ0 = Z0();
        y.h(recyclerViewZ0, (j) this.f71178w0.getValue(), new LinearLayoutManager(recyclerViewZ0.getContext()));
        b bVar = this.u0;
        if (bVar != null) {
            bVar.Y("CRYPTO_WITHDRAW_DIALOG_DELEGATES_KEY", v.k(new CellDetailsDelegate(), (LargeActionButtonDelegate) this.f71179x0.getValue(), new AccountCellItemDelegate(), (TwinHorizontalButtonDelegate) this.z0.getValue(), (RowDelegate) this.y0.getValue()));
        } else {
            Intrinsics.r("expandableDialogActivityDelegate");
            throw null;
        }
    }

    @Override // nri.b, in0.g
    public final boolean p0() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zqi.a
    public final void setItems(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ((j) this.f71178w0.getValue()).c(items);
    }
}
