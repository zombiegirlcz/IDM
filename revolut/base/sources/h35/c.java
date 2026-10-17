package h35;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.Window;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.j;
import com.google.crypto.tink.shaded.protobuf.q;
import com.revolut.feature.credit.application.plugins.impl.ui.valuators.list.ValuatorsListScreen;
import com.revolut.feature.crypto.withdraw.api.models.CryptoWithdrawOrder;
import com.revolut.feature.travel.flights.impl.ui.screen.location_picker.TravelFlightsLocationPickerScreen;
import com.revolut.feature_exchange.impl.ui.exchange_v2.market_order.MarketOrderActivityV2;
import hd.r;
import hf6.h;
import hp5.m;
import hwe.t;
import id.f;
import id.l;
import id.n;
import ix0.p1;
import java.security.GeneralSecurityException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kfm.o;
import kfm.p;
import kl.t1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import md.l1;
import md.w2;
import mx0.dd;
import r10.v;
import v61.k;
import yt8.i;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class c implements o, p, OnApplyWindowInsetsListener, hd.b, dd, p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f149037a;

    public /* synthetic */ c() {
        this.f149037a = 3;
        m mVar = m.f;
    }

    @Override // hd.b
    public ad.c a(r rVar) throws GeneralSecurityException {
        switch (this.f149037a) {
            case 16:
                if (!((String) rVar.f151364a).equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
                }
                try {
                    md.c cVarC = md.c.C((j) rVar.f151366c, q.a());
                    if (cVarC.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    v vVar = new v(24);
                    vVar.f250863b = null;
                    vVar.f250864c = null;
                    vVar.d = id.c.f;
                    vVar.z(cVarC.y().size());
                    int iX = cVarC.z().x();
                    if (iX < 10 || 16 < iX) {
                        throw new GeneralSecurityException(a0.d.n("Invalid tag size for AesCmacParameters: ", iX));
                    }
                    vVar.f250864c = Integer.valueOf(iX);
                    vVar.d = f.a((w2) rVar.e);
                    id.d dVarH = vVar.h();
                    r10.r rVar2 = new r10.r();
                    rVar2.f250852b = null;
                    rVar2.f250853c = null;
                    rVar2.f250851a = dVarH;
                    rVar2.f250852b = new t1(od.a.a(cVarC.y().e()), 24);
                    rVar2.f250853c = (Integer) rVar.f;
                    return rVar2.h();
                } catch (InvalidProtocolBufferException | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing AesCmacKey failed");
                }
            default:
                if (!((String) rVar.f151364a).equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
                }
                try {
                    l1 l1VarD = l1.D((j) rVar.f151366c, q.a());
                    if (l1VarD.B() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    h30.q qVar = new h30.q(10);
                    qVar.f148941b = null;
                    qVar.f148942c = null;
                    qVar.d = null;
                    qVar.e = id.c.o;
                    qVar.f148941b = Integer.valueOf(l1VarD.z().size());
                    qVar.f148942c = Integer.valueOf(l1VarD.A().z());
                    qVar.d = n.a(l1VarD.A().y());
                    qVar.e = n.b((w2) rVar.e);
                    l lVarT0 = qVar.t0();
                    mp.p pVar = new mp.p(26);
                    pVar.f207710c = null;
                    pVar.d = null;
                    pVar.f207709b = lVarT0;
                    pVar.f207710c = new t1(od.a.a(l1VarD.z().e()), 24);
                    pVar.d = (Integer) rVar.f;
                    return pVar.g();
                } catch (InvalidProtocolBufferException | IllegalArgumentException unused2) {
                    throw new GeneralSecurityException("Parsing HmacKey failed");
                }
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f149037a) {
            case 0:
                e eVar = e.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (a) eVar.invoke(p0);
            case 1:
            case 13:
            case 15:
            case 16:
            case 17:
            case 18:
            case 20:
            case 22:
            case 23:
            case 25:
            default:
                joe.m mVar = joe.m.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) mVar.invoke(p0);
            case 2:
                h hVar = h.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) hVar.invoke(p0);
            case 3:
                m mVar2 = m.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (CryptoWithdrawOrder) mVar2.invoke(p0);
            case 4:
                hp5.l lVar = hp5.l.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (CryptoWithdrawOrder) lVar.invoke(p0);
            case 5:
                hp5.n nVar = hp5.n.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ko5.l) nVar.invoke(p0);
            case 6:
                hqa.a aVar = hqa.a.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) aVar.invoke(p0);
            case 7:
                hqa.b bVar = hqa.b.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) bVar.invoke(p0);
            case 8:
                return (i) hwe.p.f.invoke(p0);
            case 9:
                return (i) t.f.invoke(p0);
            case 10:
                i2i.d dVar = i2i.d.f;
                KProperty[] kPropertyArr = MarketOrderActivityV2.I0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) dVar.invoke(p0);
            case 11:
                i31.b bVar2 = i31.b.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (k) bVar2.invoke(p0);
            case 12:
                i4i.f fVar = i4i.f.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (z3i.a) fVar.invoke(p0);
            case 14:
                Throwable error = (Throwable) p0;
                Intrinsics.checkNotNullParameter(error, "error");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 19:
                return ((do3.n) p0).i;
            case 21:
                Throwable it8 = (Throwable) p0;
                Intrinsics.checkNotNullParameter(it8, "it");
                return f0.f322471a;
            case 24:
                iwk.o oVar = iwk.o.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) oVar.invoke(p0);
            case 26:
                jb3.i iVar = jb3.i.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (dj0.d) iVar.invoke(p0);
            case 27:
                jb3.h hVar2 = jb3.h.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (fb3.d) hVar2.invoke(p0);
        }
    }

    @Override // mx0.dd
    public Animator d(View animatedView) {
        switch (this.f149037a) {
            case 22:
                Intrinsics.checkNotNullParameter(animatedView, "animatedView");
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(animatedView, (Property<View, Float>) View.ALPHA, animatedView.getAlpha(), 1.0f), ObjectAnimator.ofFloat(animatedView, (Property<View, Float>) View.TRANSLATION_Y, animatedView.getTranslationY(), BitmapDescriptorFactory.HUE_RED));
                animatorSet.setDuration(300L);
                return animatorSet;
            default:
                Intrinsics.checkNotNullParameter(animatedView, "animatedView");
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(ObjectAnimator.ofFloat(animatedView, (Property<View, Float>) View.ALPHA, animatedView.getAlpha(), BitmapDescriptorFactory.HUE_RED), ObjectAnimator.ofFloat(animatedView, (Property<View, Float>) View.TRANSLATION_Y, animatedView.getTranslationY(), r6.b.a(animatedView, "getContext(...)", 16.0f)));
                animatorSet2.setDuration(300L);
                return animatorSet2;
        }
    }

    @Override // ix0.p1
    public void f(Object obj2, Context context) {
        Window window;
        dx0.c style = (dx0.c) obj2;
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(context, "context");
        Activity activityI = z92.f.i(context);
        if (activityI == null || (window = activityI.getWindow()) == null) {
            return;
        }
        dx0.e.c(window, context, style);
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat insets) {
        KProperty[] kPropertyArr = TravelFlightsLocationPickerScreen.T;
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        return insets;
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        switch (this.f149037a) {
            case 1:
                Boolean bool = (Boolean) p0;
                Intrinsics.h(bool);
                return bool.booleanValue();
            default:
                ij4.d dVar = ij4.d.f;
                KProperty[] kPropertyArr = ValuatorsListScreen.U;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) dVar.invoke(p0)).booleanValue();
        }
    }

    public /* synthetic */ c(int i) {
        this.f149037a = i;
    }

    public /* synthetic */ c(int i, Function1 function1) {
        this.f149037a = i;
    }
}
