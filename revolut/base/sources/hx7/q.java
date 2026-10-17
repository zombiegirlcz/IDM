package hx7;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.hardware.Camera;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.defi.common.models.domain.DeFiAssetAmountWithFiat;
import com.revolut.feature.defi.common.models.domain.DeFiExchangeFee;
import com.revolut.feature.defi.common.models.domain.DeFiFee;
import com.revolut.feature.exchange.models.ExchangeOrder;
import com.revolut.feature.exchange.models.ExchangeOrderInfo;
import com.revolut.feature.tax_residency.impl.v2.models.DeclaredTaxResidency;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketInfo;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketThreshold;
import com.revolut.shared.feature.wealth.models.options.Option;
import e93.a0;
import e93.j0;
import e93.y;
import io.fotoapparat.exception.camera.CameraException;
import io.fotoapparat.exception.camera.UnsupportedLensException;
import ip0.jp;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import jrk.u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import le.u1;
import m2l.k0;
import mel.v;
import mm0.o;
import rlm.t;
import skm.e0;
import zhm.d0;
import zhm.h0;
import zhm.w;
import zw7.x0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class q {
    public static final String A(zm3.l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        if (lVar instanceof zm3.i) {
            return ((zm3.i) lVar).e.e;
        }
        if (lVar instanceof zm3.j) {
            return ((zm3.j) lVar).f323361c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final RevPointsPocketThreshold B(List list) {
        Object obj2;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterator it8 = list.iterator();
        if (it8.hasNext()) {
            Object next = it8.next();
            if (it8.hasNext()) {
                dj0.d dVar = ((RevPointsPocketThreshold) next).f97795c;
                do {
                    Object next2 = it8.next();
                    dj0.d dVar2 = ((RevPointsPocketThreshold) next2).f97795c;
                    if (dVar.compareTo(dVar2) < 0) {
                        next = next2;
                        dVar = dVar2;
                    }
                } while (it8.hasNext());
            }
            obj2 = next;
        } else {
            obj2 = null;
        }
        return (RevPointsPocketThreshold) obj2;
    }

    public static final RevPointsPocketThreshold C(RevPointsPocketThreshold revPointsPocketThreshold, List allThresholds) {
        Intrinsics.checkNotNullParameter(revPointsPocketThreshold, "<this>");
        Intrinsics.checkNotNullParameter(allThresholds, "allThresholds");
        int iIndexOf = d0.P0(allThresholds, new bdi.b()).indexOf(revPointsPocketThreshold);
        if (iIndexOf == -1) {
            return null;
        }
        return (RevPointsPocketThreshold) d0.e0(iIndexOf + 1, allThresholds);
    }

    public static final String D(zm3.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (aVar instanceof zm3.f) {
            return ((zm3.f) aVar).f323345a;
        }
        if (aVar instanceof zm3.i) {
            return ((zm3.i) aVar).e.f323345a;
        }
        if (aVar instanceof zm3.o) {
            return ((zm3.o) aVar).f323376a;
        }
        return null;
    }

    public static final String E(zm3.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (aVar instanceof zm3.g) {
            return F((zm3.g) aVar);
        }
        if (aVar instanceof zm3.p) {
            return G((zm3.p) aVar);
        }
        if (aVar instanceof zm3.j) {
            return ((zm3.j) aVar).f323362g;
        }
        if (aVar instanceof zm3.i) {
            return ((zm3.i) aVar).f323351b;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String F(zm3.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        if (gVar instanceof zm3.f) {
            return ((zm3.f) gVar).f323345a;
        }
        if (gVar instanceof zm3.e) {
            return ((zm3.e) gVar).f323340a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String G(zm3.p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        if (pVar instanceof zm3.o) {
            return ((zm3.o) pVar).f323376a;
        }
        if (pVar instanceof zm3.n) {
            return ((zm3.n) pVar).f323373a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String H(zm3.a aVar) {
        String str;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (aVar instanceof zm3.j) {
            String str2 = ((zm3.j) aVar).f323360b;
            str = str2.length() > 0 ? str2 : null;
            return str == null ? v(aVar) : str;
        }
        if (aVar instanceof zm3.i) {
            String str3 = ((zm3.i) aVar).e.d;
            str = str3.length() > 0 ? str3 : null;
            return str == null ? v(aVar) : str;
        }
        if (aVar instanceof zm3.e) {
            String str4 = ((zm3.e) aVar).d;
            str = str4.length() > 0 ? str4 : null;
            return str == null ? v(aVar) : str;
        }
        if (aVar instanceof zm3.f) {
            String str5 = ((zm3.f) aVar).d;
            str = str5.length() > 0 ? str5 : null;
            return str == null ? v(aVar) : str;
        }
        if (aVar instanceof zm3.n) {
            return ((zm3.n) aVar).f323373a;
        }
        if (aVar instanceof zm3.o) {
            return ((zm3.o) aVar).f323376a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final RevPointsPocketThreshold I(RevPointsPocketInfo revPointsPocketInfo, long j2, List thresholds) {
        Object objPrevious;
        dj0.d dVar;
        Intrinsics.checkNotNullParameter(revPointsPocketInfo, "<this>");
        Intrinsics.checkNotNullParameter(thresholds, "thresholds");
        dj0.d dVarO = pyd.c.O(revPointsPocketInfo.e, new dj0.d(j2, revPointsPocketInfo.e.f115083b));
        RevPointsPocketThreshold revPointsPocketThresholdT = t(revPointsPocketInfo, thresholds);
        ListIterator listIterator = thresholds.listIterator(thresholds.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            if (((RevPointsPocketThreshold) objPrevious).f97795c.compareTo(dVarO) <= 0) {
                break;
            }
        }
        RevPointsPocketThreshold revPointsPocketThreshold = (RevPointsPocketThreshold) objPrevious;
        if (revPointsPocketThreshold != null) {
            if (revPointsPocketThreshold.f97795c.f115082a > ((revPointsPocketThresholdT == null || (dVar = revPointsPocketThresholdT.f97795c) == null) ? 0L : dVar.f115082a)) {
                return revPointsPocketThreshold;
            }
        }
        return null;
    }

    public static final boolean J(Data data) {
        Collection collection;
        Intrinsics.checkNotNullParameter(data, "<this>");
        return (data.getLoading() || data.getError() != null || (collection = (Collection) data.getContent()) == null || collection.isEmpty()) ? false : true;
    }

    public static final boolean K(zm3.l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        if (lVar instanceof zm3.i) {
            return false;
        }
        if (!(lVar instanceof zm3.j)) {
            throw new NoWhenBranchMatchedException();
        }
        int i = zm3.c.f323336b[((zm3.j) lVar).e.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return true;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return false;
    }

    public static final boolean L(ExchangeOrderInfo exchangeOrderInfo) {
        Intrinsics.checkNotNullParameter(exchangeOrderInfo, "<this>");
        return cp5.d.z(exchangeOrderInfo.e) || cp5.d.z(exchangeOrderInfo.f);
    }

    public static final boolean M(zm3.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (aVar instanceof zm3.l) {
            return N((zm3.l) aVar);
        }
        if ((aVar instanceof zm3.e) || (aVar instanceof zm3.f) || (aVar instanceof zm3.n) || (aVar instanceof zm3.o)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean N(zm3.l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        if (lVar instanceof zm3.i) {
            int i = zm3.c.f323335a[((zm3.i) lVar).f.ordinal()];
            if (i == 1) {
                return true;
            }
            if (i == 2) {
                return false;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(lVar instanceof zm3.j)) {
            throw new NoWhenBranchMatchedException();
        }
        int i2 = zm3.c.f323336b[((zm3.j) lVar).e.ordinal()];
        if (i2 == 1 || i2 == 2) {
            return false;
        }
        if (i2 == 3) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean O(ExchangeOrderInfo exchangeOrderInfo) {
        Intrinsics.checkNotNullParameter(exchangeOrderInfo, "<this>");
        wd6.h hVar = exchangeOrderInfo.f72139c;
        return hVar == wd6.h.STOP || hVar == wd6.h.LIMIT;
    }

    public static final boolean P(ExchangeOrder exchangeOrder) {
        Intrinsics.checkNotNullParameter(exchangeOrder, "<this>");
        return exchangeOrder.getF72134a().f72139c == wd6.h.STOP_LOSS || exchangeOrder.getF72134a().f72139c == wd6.h.TAKE_PROFIT;
    }

    public static final boolean Q(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<DeclaredTaxResidency> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (DeclaredTaxResidency declaredTaxResidency : list2) {
            wi0.b bVar = declaredTaxResidency.f90159a;
            wi0.b.Companion.getClass();
            if (Intrinsics.f(bVar, wi0.b.f297770q3) && Intrinsics.f(declaredTaxResidency.f90160b, Boolean.TRUE)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean R(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<y> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (y yVar : list2) {
            if (yVar.f123899a == a0.MONTHLY && yVar.f123900b) {
                return true;
            }
        }
        return false;
    }

    public static final void S(t tVar, String key, String str) {
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        tVar.b(rlm.j.c(str), key);
    }

    public static final void T(t tVar, String key, Function1 builderAction) {
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        t tVar2 = new t();
        builderAction.invoke(tVar2);
        tVar.b(tVar2.a(), key);
    }

    public static final void U(ne0.j jVar, ne0.a cacheKey, Object value) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
        Intrinsics.checkNotNullParameter(value, "value");
        jVar.f(cacheKey.getKey(), value);
    }

    public static final void V(ConstraintSet constraintSet, View view, float f) {
        Intrinsics.checkNotNullParameter(constraintSet, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        constraintSet.setHorizontalBias(view.getId(), f);
    }

    public static final void W(ConstraintSet constraintSet, View view, int i) {
        Intrinsics.checkNotNullParameter(constraintSet, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        constraintSet.setMargin(view.getId(), 6, i);
    }

    public static final void X(qam.e eVar, sam.e orientationSensor) throws Throwable {
        Continuation continuation;
        Object next;
        Object next2;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(orientationSensor, "orientationSensor");
        nd.k kVar = eVar.f244067a;
        hbm.a aVar = eVar.d;
        kVar.getClass();
        nd.k.k();
        ArrayList availableCameras = eVar.f;
        fbm.d lensPositionSelector = eVar.f244070g;
        Intrinsics.checkNotNullParameter(availableCameras, "availableCameras");
        Intrinsics.checkNotNullParameter(lensPositionSelector, "lensPositionSelector");
        ArrayList arrayList = new ArrayList(w.t(availableCameras, 10));
        Iterator it8 = availableCameras.iterator();
        while (it8.hasNext()) {
            arrayList.add(((qam.b) it8.next()).f244057b.f193469b);
        }
        lam.c cVar = (lam.c) lensPositionSelector.invoke(d0.i1(arrayList));
        Iterator it9 = availableCameras.iterator();
        while (true) {
            continuation = null;
            if (!it9.hasNext()) {
                next = null;
                break;
            } else {
                next = it9.next();
                if (((qam.b) next).f244057b.f193469b.equals(cVar)) {
                    break;
                }
            }
        }
        qam.b bVar = (qam.b) next;
        if (bVar != null) {
            eVar.f244071h.U(bVar);
        } else {
            eVar.f244071h.h0(new UnsupportedLensException());
        }
        qam.b cameraDevice = eVar.c();
        cameraDevice.f244056a.getClass();
        nd.k.k();
        lam.c cVar2 = cameraDevice.f244057b.f193469b;
        Intrinsics.checkNotNullParameter(cVar2, "<this>");
        vim.f it10 = kotlin.ranges.f.o(0, Camera.getNumberOfCameras()).iterator();
        while (true) {
            if (!it10.f289625c) {
                next2 = null;
                break;
            } else {
                next2 = it10.next();
                if (cVar2.equals(qk.d.g(((Number) next2).intValue()).f193469b)) {
                    break;
                }
            }
        }
        Integer num = (Integer) next2;
        if (num == null) {
            throw new CameraException(null, "Device has no camera for the desired lens position(s).");
        }
        int iIntValue = num.intValue();
        try {
            Camera cameraOpen = Camera.open(iIntValue);
            Intrinsics.checkNotNullExpressionValue(cameraOpen, "open(cameraId)");
            cameraDevice.f244059g = cameraOpen;
            skm.r rVar = cameraDevice.f244058c;
            if (cameraOpen == null) {
                Intrinsics.r("camera");
                throw null;
            }
            rVar.U(v13.d.k(cameraOpen));
            Camera camera = cameraDevice.f244059g;
            if (camera == null) {
                Intrinsics.r("camera");
                throw null;
            }
            cameraDevice.e = new uvl.c(camera);
            Intrinsics.checkNotNullParameter(eVar, "<this>");
            Intrinsics.checkNotNullParameter(cameraDevice, "cameraDevice");
            e0.E(kotlin.coroutines.g.f186406a, new c34.d(eVar, cameraDevice, continuation, 9));
            cameraDevice.a(orientationSensor.d);
            cameraDevice.f244056a.getClass();
            nd.k.k();
            Camera camera2 = cameraDevice.f244059g;
            if (camera2 == null) {
                Intrinsics.r("camera");
                throw null;
            }
            jp jpVar = cameraDevice.k;
            if (jpVar == null) {
                Intrinsics.r("previewOrientation");
                throw null;
            }
            Camera.Size previewSize = camera2.getParameters().getPreviewSize();
            int i = previewSize.width;
            int i2 = previewSize.height;
            uam.i iVar = new uam.i(i, i2);
            if (!(jpVar instanceof sam.d)) {
                if (!(jpVar instanceof sam.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                iVar = new uam.i(i2, i);
            }
            nd.k.h("Preview resolution is: " + iVar);
            aVar.setScaleType(eVar.f244069c);
            aVar.setPreviewResolution(iVar);
            try {
                cameraDevice.b(aVar.getPreview());
                cameraDevice.c();
            } catch (IOException e) {
                eVar.f244067a.getClass();
                nd.k.h("Can't start preview because of the exception: " + e);
            }
        } catch (RuntimeException e2) {
            throw new CameraException(e2, "Failed to open camera with lens position: " + cVar2 + " and id: " + iIntValue);
        }
    }

    public static final void Y(ConstraintSet constraintSet, View source, View target, int i) {
        Intrinsics.checkNotNullParameter(constraintSet, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        constraintSet.connect(source.getId(), 6, target.getId(), 7, i);
    }

    public static final GradientDrawable a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(kli.a.k(context, 8.0f));
        gradientDrawable.setColor(kli.a.s(R$attr.uikit_colorForeground_5, context));
        return gradientDrawable;
    }

    public static final void a0(pd0.d function) throws IllegalAccessException {
        Function0 function0 = function.f235036a;
        Intrinsics.checkNotNullParameter(pd0.a.f235034a, "<this>");
        Intrinsics.checkNotNullParameter(function, "function");
        if (pd0.c.f235035a) {
            throw new IllegalAccessException((String) function0.invoke());
        }
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "Assertions", (String) function0.invoke(), null, h0Var);
    }

    public static final iv0.k b(Function1 onAnimatedValueChanged) {
        Intrinsics.checkNotNullParameter(onAnimatedValueChanged, "onAnimatedValueChanged");
        return new iv0.k(onAnimatedValueChanged);
    }

    public static final qmd.a b0(yld.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        switch (qmd.b.f247804a[dVar.ordinal()]) {
            case 1:
                return qmd.a.SPENDING;
            case 2:
                return qmd.a.INCOME;
            case 3:
                return qmd.a.CASHFLOW;
            case 4:
                return qmd.a.NET_BALANCE;
            case 5:
                return qmd.a.EARNINGS;
            case 6:
                return qmd.a.SALES;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final int c(LogRecord logRecord) {
        int iIntValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        if (iIntValue > level.intValue()) {
            return 5;
        }
        return logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
    }

    public static final DeFiFee c0(c36.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        DeFiAssetAmountWithFiat deFiAssetAmountWithFiatG = i.G(kVar.f20903a);
        c36.h hVar = kVar.f20904b;
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        return new DeFiFee(deFiAssetAmountWithFiatG, new DeFiExchangeFee(i.G(hVar.f20900a), new BigDecimal(hVar.f20901b)), i.G(kVar.f20905c));
    }

    public static final boolean d(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            if (((y) it8.next()).f123900b) {
                return true;
            }
        }
        return false;
    }

    public static final j0 d0(n6l.t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        dj0.d dVarO = mo3.a.o(tVar.getPoints());
        return new j0(dj0.d.c(dVarO, 0L, xi0.b.a(dVarO.f115083b, 6), 1), mo3.a.o(tVar.getDiscount()), mo3.a.o(tVar.getFinalTotal()));
    }

    public static final boolean e(mm0.o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        if ((oVar instanceof mm0.m) || (oVar instanceof mm0.p)) {
            return false;
        }
        if ((oVar instanceof mm0.n) || (oVar instanceof o.a)) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final ArrayList e0(List list) {
        mel.j0 j0VarValueOf;
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<u> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (u uVar : list2) {
            Intrinsics.checkNotNullParameter(uVar, "<this>");
            Instant instant = uVar.f178077a;
            k0 k0Var = uVar.f178078b;
            if (k0Var != null) {
                Intrinsics.checkNotNullParameter(k0Var, "<this>");
                j0VarValueOf = mel.j0.valueOf(k0Var.name());
            } else {
                j0VarValueOf = null;
            }
            arrayList.add(new v(instant, j0VarValueOf, cj9.c.Q(uVar.f178079c)));
        }
        return arrayList;
    }

    public static final void f(ConstraintSet constraintSet, View source, View target, int i) {
        Intrinsics.checkNotNullParameter(constraintSet, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        constraintSet.connect(source.getId(), 4, target.getId(), 3, i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
    
        if (r1.equals("VERIFYING") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
    
        if (r1.equals("PROCESSING") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
    
        r1 = r0.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0084, code lost:
    
        if (r1 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0086, code lost:
    
        r7 = mo3.a.o(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008a, code lost:
    
        r1 = r0.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008e, code lost:
    
        if (r1 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0090, code lost:
    
        r5 = new ru.h(r1.intValue(), r7, r0.a());
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a3, code lost:
    
        throw new java.lang.IllegalArgumentException("Required value was null.");
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final ru.a f0(tu.a r8) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hx7.q.f0(tu.a):ru.a");
    }

    public static void g(ConstraintSet constraintSet, ShimmerFrameLayout source, BasicNavBar target) {
        Intrinsics.checkNotNullParameter(constraintSet, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(constraintSet, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        constraintSet.connect(source.getId(), 6, target.getId(), 6, 0);
        Intrinsics.checkNotNullParameter(constraintSet, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        constraintSet.connect(source.getId(), 7, target.getId(), 7, 0);
    }

    public static final ru.k g0(tu.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dj0.d dVarO = mo3.a.o(dVar.getTotalReward());
        List listA = dVar.getInvitees();
        ArrayList arrayList = new ArrayList(w.t(listA, 10));
        Iterator it8 = listA.iterator();
        while (it8.hasNext()) {
            arrayList.add(f0((tu.a) it8.next()));
        }
        return new ru.k(dVarO, arrayList);
    }

    public static void h(ConstraintSet constraintSet, View view) {
        Intrinsics.checkNotNullParameter(constraintSet, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        i(constraintSet, view, 0);
        Intrinsics.checkNotNullParameter(constraintSet, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(constraintSet, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        constraintSet.connect(view.getId(), 3, 0, 3, 0);
        Intrinsics.checkNotNullParameter(constraintSet, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        constraintSet.connect(view.getId(), 4, 0, 4, 0);
    }

    public static final teh.a h0(meh.c cVar) throws Throwable {
        qel.b bVar;
        String str;
        qel.a aVar;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        xi0.b bVar2 = new xi0.b(6, cVar.f204677c, null);
        LocalDate localDate = LocalDate.parse(cVar.f204676b);
        String str2 = cVar.f204675a;
        Intrinsics.h(localDate);
        List<meh.f> list = cVar.d;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (meh.f fVar : list) {
            String str3 = fVar.f204679a;
            LocalDate localDate2 = localDate;
            ej0.b bVar3 = new ej0.b(new BigDecimal(fVar.f204680b), bVar2);
            String str4 = fVar.f204681c;
            qel.b[] bVarArrValues = qel.b.values();
            int length = bVarArrValues.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    bVar = null;
                    break;
                }
                bVar = bVarArrValues[i2];
                if (kotlin.text.a0.z(bVar.name(), str4, true)) {
                    break;
                }
                i2++;
            }
            if (bVar == null) {
                bVar = qel.b.CALL;
            }
            qel.b bVar4 = bVar;
            int i3 = fVar.d;
            String str5 = fVar.e;
            qel.a[] aVarArrValues = qel.a.values();
            int length2 = aVarArrValues.length;
            while (true) {
                if (i >= length2) {
                    str = str2;
                    aVar = null;
                    break;
                }
                aVar = aVarArrValues[i];
                str = str2;
                if (kotlin.text.a0.z(aVar.name(), str5, true)) {
                    break;
                }
                i++;
                str2 = str;
            }
            if (aVar == null) {
                e.n(new IllegalStateException(j6.a.q("Unknown option status: ", str5)));
                aVar = qel.a.UNKNOWN;
            }
            arrayList.add(new Option(str3, bVar3, bVar2, bVar4, i3, localDate2, aVar));
            localDate = localDate2;
            str2 = str;
        }
        return new teh.a(str2, localDate, bVar2, arrayList, cVar.e, cVar.f);
    }

    public static final void i(ConstraintSet constraintSet, View view, int i) {
        Intrinsics.checkNotNullParameter(constraintSet, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(constraintSet, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        constraintSet.connect(view.getId(), 6, 0, 6, i);
        Intrinsics.checkNotNullParameter(constraintSet, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        constraintSet.connect(view.getId(), 7, 0, 7, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00d9 A[LOOP:0: B:34:0x00d3->B:36:0x00d9, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final tu.a i0(ru.a r15) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hx7.q.i0(ru.a):tu.a");
    }

    public static final tu.d j0(ru.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        jo3.a aVarP = mo3.a.p(kVar.f257370a);
        ArrayList arrayList = kVar.f257371b;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(i0((ru.a) it8.next()));
        }
        return new tu.d(aVarP, arrayList2);
    }

    public static void k(ConstraintSet constraintSet, ShimmerFrameLayout source, BasicNavBar target) {
        Intrinsics.checkNotNullParameter(constraintSet, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(constraintSet, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        constraintSet.connect(source.getId(), 3, target.getId(), 3, 0);
        Intrinsics.checkNotNullParameter(constraintSet, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        constraintSet.connect(source.getId(), 4, target.getId(), 4, 0);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    public static final ix7.v k0(ArrayList arrayList, UUID requestId) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        String string = requestId.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            x0 x0Var = (x0) it8.next();
            arrayList2.add(new ix7.e0(u1.g(x0Var.f325861a, o.f156406a), x0Var.f325862b));
        }
        return new ix7.v(string, arrayList2);
    }

    public static final void l(ConstraintSet constraintSet, ConstraintLayout view) {
        Intrinsics.checkNotNullParameter(constraintSet, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        constraintSet.constrainWidth(view.getId(), 0);
    }

    public static final void l0(ConstraintSet constraintSet, View source, View target, int i) {
        Intrinsics.checkNotNullParameter(constraintSet, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        constraintSet.connect(source.getId(), 3, target.getId(), 4, i);
    }

    public static final boolean m(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<y> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (y yVar : list2) {
            if (yVar.f123899a == a0.DAILY && yVar.f123900b) {
                return true;
            }
        }
        return false;
    }

    public static void n(ConstraintSet constraintSet, View source, View target) {
        Intrinsics.checkNotNullParameter(constraintSet, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        constraintSet.connect(source.getId(), 7, target.getId(), 6, 0);
    }

    public static final String o(List list, wi0.b countryCode) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((DeclaredTaxResidency) next).f90159a, countryCode)) {
                break;
            }
        }
        DeclaredTaxResidency declaredTaxResidency = (DeclaredTaxResidency) next;
        if (declaredTaxResidency != null) {
            return declaredTaxResidency.f90163h;
        }
        return null;
    }

    public static final Object p(ne0.j jVar, ne0.a cacheKey) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
        return jVar.get(cacheKey.getKey());
    }

    public static final String q(zm3.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        if (gVar instanceof zm3.e) {
            return j6.a.q("email:", ((zm3.e) gVar).f323340a);
        }
        if (gVar instanceof zm3.f) {
            return j6.a.q("tel:", ((zm3.f) gVar).f323345a);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String r(zm3.p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        if (pVar instanceof zm3.n) {
            return j6.a.q("email:", ((zm3.n) pVar).f323373a);
        }
        if (pVar instanceof zm3.o) {
            return j6.a.q("tel:", ((zm3.o) pVar).f323376a);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String s(zm3.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (aVar instanceof zm3.l) {
            return ((zm3.l) aVar).getCountry();
        }
        if ((aVar instanceof zm3.g) || (aVar instanceof zm3.p)) {
            return "";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final RevPointsPocketThreshold t(RevPointsPocketInfo revPointsPocketInfo, List allThresholds) {
        Intrinsics.checkNotNullParameter(revPointsPocketInfo, "<this>");
        Intrinsics.checkNotNullParameter(allThresholds, "allThresholds");
        Iterator it8 = allThresholds.iterator();
        RevPointsPocketThreshold revPointsPocketThreshold = null;
        while (it8.hasNext()) {
            RevPointsPocketThreshold revPointsPocketThreshold2 = (RevPointsPocketThreshold) it8.next();
            if (revPointsPocketInfo.e.compareTo(revPointsPocketThreshold2.f97795c) >= 0 && (revPointsPocketThreshold == null || revPointsPocketThreshold2.f97795c.compareTo(revPointsPocketThreshold.f97795c) > 0)) {
                revPointsPocketThreshold = revPointsPocketThreshold2;
            }
        }
        return revPointsPocketThreshold;
    }

    public static final Integer u(List list) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((y) next).f123899a == a0.DAILY) {
                break;
            }
        }
        y yVar = (y) next;
        if (yVar != null) {
            return Integer.valueOf(yVar.f123901c);
        }
        return null;
    }

    public static final String v(zm3.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (aVar instanceof zm3.g) {
            return ((zm3.g) aVar).getName();
        }
        if (aVar instanceof zm3.j) {
            return y((zm3.j) aVar);
        }
        if (aVar instanceof zm3.i) {
            return ((zm3.i) aVar).e.f323347c;
        }
        if (aVar instanceof zm3.n) {
            return ((zm3.n) aVar).f323373a;
        }
        if (aVar instanceof zm3.o) {
            return ((zm3.o) aVar).f323376a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String w(zm3.l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        if (lVar instanceof zm3.i) {
            return ((zm3.i) lVar).e.d;
        }
        if (lVar instanceof zm3.j) {
            return ((zm3.j) lVar).f323360b;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String x(zm3.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        String[] elements = {gVar.getFirstName(), gVar.getLastName()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return d0.k0(kotlin.collections.d.L(elements), " ", null, null, 0, null, 62);
    }

    public static final String y(zm3.j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        String str = jVar.f323359a;
        String str2 = jVar.d;
        String str3 = jVar.f323361c;
        String str4 = jVar.f323360b;
        if (str.length() > 0) {
            return jVar.f323359a;
        }
        if (str4.length() > 0 || str3.length() > 0) {
            return com.google.android.gms.internal.mlkit_vision_face.a.o(str4, " ", str3);
        }
        if (str2 != null && (!kotlin.text.d0.W(str2))) {
            return str2;
        }
        m70.a.c(t0.f186434a);
        return "";
    }

    public static final Integer z(f01.c cVar, String id10) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(id10, "id");
        int iA = cVar.a(id10);
        Integer numValueOf = Integer.valueOf(iA);
        if (iA != 0) {
            return numValueOf;
        }
        return null;
    }
}
