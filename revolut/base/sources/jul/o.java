package jul;

import afa.s;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import au0.a2;
import au0.m4;
import b9.w2;
import cli.y;
import com.fasterxml.jackson.databind.JavaType;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.navigation.Navigator;
import com.onfido.android.sdk.capture.internal.navigation.Screen;
import com.onfido.javax.inject.Provider;
import com.onfido.workflow.internal.ui.HostedWebModuleScreen;
import com.onfido.workflow.internal.ui.LoadingScreen;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.travel.miles.api.model.TravelMilesRate;
import com.revolut.feature.travel.miles.impl.ui.screen.transfer.TravelMilesTransferScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.stock_details_overview.StockDetailsOverviewController;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import com.revolut.uicomponent.widgets.support_edit_text.MultipleDrawableMaterialEditText;
import efm.f0;
import efm.r;
import i9g.b0;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import ip0.l0;
import java.lang.reflect.Type;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kl.g0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import le.h0;
import m2f.t;
import ml.p;
import p9.i0;
import pig.x;
import te8.z;
import tx0.r3;
import vkm.j2;
import vkm.q;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public final class o implements kfm.b, igm.o, el.b, fgm.b, i0, zp0.c, f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f178695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f178696c;

    public /* synthetic */ o(Object obj2, Object obj3, int i) {
        this.f178694a = i;
        this.f178695b = obj2;
        this.f178696c = obj3;
    }

    public static final List b(o oVar, List list, Object obj2) {
        if (obj2 != null) {
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    if (Intrinsics.f(it8.next(), obj2)) {
                    }
                }
            }
            return d0.E0(list2, u.c(obj2));
        }
        return list;
    }

    public static r3 f(nel.n nVar) {
        return new r3(new yy0.j(new InstrumentImage(nVar.f214596b, 24, Integer.valueOf(R$drawable.uikit_icn_circle_background), Integer.valueOf(R$attr.uikit_colorGreyTone5))));
    }

    @Override // p9.i0
    public JavaType a(Type type) {
        return ((w9.f) this.f178695b).b(null, type, (w9.e) this.f178696c);
    }

    @Override // kfm.b
    public void accept(Object obj2, Object obj3) {
        ((Map) obj2).put(((kfm.o) this.f178696c).apply(obj3), ((kfm.o) this.f178695b).apply(obj3));
    }

    @Override // igm.o
    public Object apply(Object obj2) {
        List backStackSnapshot = (List) obj2;
        nl.e eVar = (nl.e) this.f178696c;
        Intrinsics.checkNotNullParameter(backStackSnapshot, "backStackSnapshot");
        if (backStackSnapshot.isEmpty()) {
            ((g0) this.f178695b).invoke();
        }
        ArrayList arrayListA = nl.e.a(eVar, backStackSnapshot);
        OnfidoRemoteConfig onfidoRemoteConfig = eVar.f216899a;
        Screen screen = (Screen) d0.o0(arrayListA);
        boolean z = false;
        if (screen == null) {
            return new p(false, false, false);
        }
        boolean z3 = onfidoRemoteConfig.isStudioUserFlowExitEnabled() && !d0.T(u.c(LoadingScreen.f50189a), screen);
        if (!onfidoRemoteConfig.isStudioUserFlowExitEnabled() ? arrayListA.size() > 1 || onfidoRemoteConfig.isStudioUserFlowBackButtonEnabled() : arrayListA.size() > 1) {
            z = true;
        }
        return new p(z, z3, screen instanceof HostedWebModuleScreen);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bc, code lost:
    
        if (r9 == r2) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(gim.c r9, java.lang.String r10, boolean r11) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f178695b
            gxa.c r0 = (gxa.c) r0
            boolean r1 = r9 instanceof lxa.a
            if (r1 == 0) goto L17
            r1 = r9
            lxa.a r1 = (lxa.a) r1
            int r2 = r1.f200538y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f200538y = r2
            goto L1c
        L17:
            lxa.a r1 = new lxa.a
            r1.<init>(r8, r9)
        L1c:
            java.lang.Object r9 = r1.f200536w
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f200538y
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r3 == 0) goto L47
            if (r3 == r6) goto L3f
            if (r3 == r5) goto L3b
            if (r3 != r4) goto L33
            yhm.o.b(r9)
            goto Lbf
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            yhm.o.b(r9)
            return r9
        L3f:
            boolean r11 = r1.v
            java.lang.String r10 = r1.u
            yhm.o.b(r9)
            goto L6f
        L47:
            yhm.o.b(r9)
            if (r11 == 0) goto L94
            java.lang.Object r9 = r8.f178696c
            wwa.b r9 = (wwa.b) r9
            r1.u = r10
            r1.v = r11
            r1.f200538y = r6
            mwa.b r9 = r9.f300637a
            uwa.q r9 = (uwa.q) r9
            r9.getClass()
            un8.j r3 = new un8.j
            r4 = 14
            r3.<init>(r9, r10, r7, r4)
            skm.p0 r9 = skm.p0.f264001a
            elm.f r9 = elm.f.f127540b
            java.lang.Object r9 = skm.e0.J(r9, r3, r1)
            if (r9 != r2) goto L6f
            goto Lbe
        L6f:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L91
            r1.u = r7
            r1.v = r11
            r1.f200538y = r5
            r0.getClass()
            gxa.b r9 = new gxa.b
            r9.<init>(r0, r10, r7, r6)
            skm.p0 r10 = skm.p0.f264001a
            elm.f r10 = elm.f.f127540b
            java.lang.Object r9 = skm.e0.J(r10, r9, r1)
            if (r9 != r2) goto L90
            goto Lbe
        L90:
            return r9
        L91:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L94:
            r1.u = r7
            r1.v = r11
            r1.f200538y = r4
            mk0.a r9 = r0.f147741b
            java.lang.String r11 = "PERSONALIZED_TRACKING_CONFETTI"
            java.lang.Object r0 = kii.e.n(r11, r9)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto La8
            zhm.f0 r0 = zhm.f0.f322471a
        La8:
            tk0.e r3 = new tk0.e
            r3.<init>(r11)
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.ArrayList r10 = zhm.d0.F0(r10, r0)
            java.lang.Object r9 = r9.e(r3, r10, r1)
            if (r9 != r2) goto Lba
            goto Lbc
        Lba:
            kotlin.Unit r9 = kotlin.Unit.f186387a
        Lbc:
            if (r9 != r2) goto Lbf
        Lbe:
            return r2
        Lbf:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: jul.o.c(gim.c, java.lang.String, boolean):java.lang.Object");
    }

    public h0 d() {
        List list = (List) this.f178695b;
        if (list != null) {
            return new h0(list, (String) this.f178696c);
        }
        throw new IllegalStateException("Missing required properties: files");
    }

    public Object e(String str, gim.i iVar) {
        efm.d0 d0VarFirstOrError = m70.a.g(rd0.e.c(hj8.a.a((hj8.a) this.f178695b, str, w4l.h.f294642c), kotlin.coroutines.g.f186406a), null, new qc8.a(0), 1).firstOrError();
        qc7.d dVar = new qc7.d(3, new q2g.h(this, str, 28));
        d0VarFirstOrError.getClass();
        pfm.a aVar = new pfm.a(d0VarFirstOrError, dVar, 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        Object objA = nim.a.a(aVar, iVar);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }

    public String g(lzl.a type, Number obj2) {
        DecimalFormat decimalFormatH;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(obj2, "obj");
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f178696c;
        Object obj3 = linkedHashMap.get(type);
        Object obj4 = obj3;
        if (obj3 == null) {
            int i = lzl.b.f201025a[type.ordinal()];
            if (i == 1) {
                decimalFormatH = h("#,##0");
            } else if (i == 2) {
                DecimalFormat decimalFormatH2 = h("0.#");
                decimalFormatH2.setRoundingMode(RoundingMode.DOWN);
                decimalFormatH = decimalFormatH2;
            } else if (i == 3) {
                DecimalFormat decimalFormatH3 = h("0.0#");
                decimalFormatH3.setRoundingMode(RoundingMode.DOWN);
                decimalFormatH = decimalFormatH3;
            } else if (i == 4) {
                DecimalFormat decimalFormatH4 = h("0.##");
                decimalFormatH4.setRoundingMode(RoundingMode.DOWN);
                decimalFormatH = decimalFormatH4;
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                DecimalFormat decimalFormatH5 = h("0.00");
                decimalFormatH5.setRoundingMode(RoundingMode.DOWN);
                decimalFormatH = decimalFormatH5;
            }
            Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
            linkedHashMap.put(type, decimalFormatH);
            obj4 = decimalFormatH;
        }
        String str = ((DecimalFormat) obj4).format(obj2);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @Override // com.onfido.javax.inject.Provider
    public Object get() {
        return new nl.g0((Navigator) ((Provider) this.f178695b).get(), (sl.f) ((Provider) this.f178696c).get());
    }

    public DecimalFormat h(String str) {
        return new DecimalFormat(str, DecimalFormatSymbols.getInstance(((s80.b) ((qd0.b) this.f178695b)).a()));
    }

    public boolean i() {
        Editable text;
        gzl.c cVar = (gzl.c) this.f178695b;
        return (!cVar.hasFocus() || (text = cVar.getText()) == null || text.length() == 0) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(com.revolut.feature_move_money.api.model.AccountWrapper r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof m6i.b
            if (r0 == 0) goto L13
            r0 = r6
            m6i.b r0 = (m6i.b) r0
            int r1 = r0.f203126x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f203126x = r1
            goto L18
        L13:
            m6i.b r0 = new m6i.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f203126x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature_move_money.api.model.AccountWrapper r5 = r0.u
            yhm.o.b(r6)
            goto L47
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            java.lang.Object r6 = r4.f178695b
            wa7.m r6 = (wa7.m) r6
            t38.e r6 = r6.k()
            r0.u = r5
            r0.f203126x = r3
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            java.util.Set r6 = (java.util.Set) r6
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L52
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L52:
            java.lang.Object r0 = r4.f178696c
            za7.c r0 = (za7.c) r0
            java.lang.String r5 = r0.a(r5)
            boolean r5 = r6.contains(r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: jul.o.j(com.revolut.feature_move_money.api.model.AccountWrapper, gim.c):java.lang.Object");
    }

    @Override // zp0.c
    public void k(String extractedValue, String formatted, boolean z) {
        TravelMilesTransferScreen travelMilesTransferScreen = (TravelMilesTransferScreen) this.f178696c;
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(formatted, "formattedValue");
        int i = pig.f.f236480a[((l0) this.f178695b).ordinal()];
        Continuation continuation = null;
        if (i == 1) {
            com.revolut.feature.travel.miles.impl.ui.screen.transfer.a aVar = (com.revolut.feature.travel.miles.impl.ui.screen.transfer.a) travelMilesTransferScreen.d();
            aVar.getClass();
            Intrinsics.checkNotNullParameter(formatted, "text");
            y yVar = aVar.z;
            TravelMilesRate rate = (TravelMilesRate) ((pig.j) ((j2) yVar.f22677a).getValue()).e.getContent();
            if (rate == null) {
                return;
            }
            pig.b bVar = aVar.f94390s;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(formatted, "formatted");
            double dDoubleValue = 0.0d;
            try {
                Number number = bVar.f236476a.parse(formatted);
                if (number != null) {
                    dDoubleValue = number.doubleValue();
                }
            } catch (ParseException unused) {
            }
            RevPoints revPointsA = qvb.a.a(dDoubleValue);
            if (revPointsA.equals(((pig.j) ((j2) yVar.f22677a).getValue()).f)) {
                return;
            }
            aVar.v.getClass();
            Intrinsics.checkNotNullParameter(rate, "rate");
            int i2 = (int) (dDoubleValue / rate.f94112a);
            if (i2 > 999999) {
                aVar.n2(new x(aVar, formatted, continuation, 1), new whi.b(6));
                return;
            } else {
                aVar.H2(yVar, new c18.c(revPointsA, formatted, i2, aVar));
                return;
            }
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        com.revolut.feature.travel.miles.impl.ui.screen.transfer.a aVar2 = (com.revolut.feature.travel.miles.impl.ui.screen.transfer.a) travelMilesTransferScreen.d();
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(formatted, "text");
        y yVar2 = aVar2.z;
        TravelMilesRate rate2 = (TravelMilesRate) ((pig.j) ((j2) yVar2.f22677a).getValue()).e.getContent();
        if (rate2 == null) {
            return;
        }
        pig.b bVar2 = aVar2.f94390s;
        bVar2.getClass();
        Intrinsics.checkNotNullParameter(formatted, "formatted");
        int iIntValue = 0;
        try {
            Number number2 = bVar2.f236476a.parse(formatted);
            if (number2 != null) {
                iIntValue = number2.intValue();
            }
        } catch (ParseException unused2) {
        }
        if (iIntValue == ((pig.j) ((j2) yVar2.f22677a).getValue()).f236485h) {
            return;
        }
        if (iIntValue > 999999) {
            aVar2.n2(new x(aVar2, formatted, continuation, 0), new whi.b(6));
            return;
        }
        aVar2.v.getClass();
        Intrinsics.checkNotNullParameter(rate2, "rate");
        int i3 = iIntValue;
        aVar2.H2(yVar2, new t(rate2.f94112a * ((double) iIntValue), aVar2, i3, formatted, 2));
    }

    public t38.e l(w4l.k loadingStrategy, Address address) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        kpj.e eVar = (kpj.e) this.f178695b;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return new t38.e(nim.a.v(eVar.f188255a.j(loadingStrategy), new kpj.a(2)), 24, ((dl2.a) this.f178696c).b(false), new amf.k(this, address, null, 6));
    }

    public r m(io3.d pocket, xi0.b baseCurrency) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        ppk.f fVar = (ppk.f) this.f178695b;
        xi0.a aVar = xi0.b.Companion;
        String str = pocket.f163147c;
        aVar.getClass();
        r map = pd.b.t(fVar.e(v1.c.w(xi0.a.a(str), baseCurrency), n9l.b.SEC_3), new qz9.o(pocket, 10, this, baseCurrency)).map(new r83.d(6, new s(pocket, 16)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public r n(String propertyId, LocalDate checkIn, LocalDate checkOut, String roomsOccupancy) {
        Intrinsics.checkNotNullParameter(propertyId, "propertyId");
        Intrinsics.checkNotNullParameter(checkIn, "checkIn");
        Intrinsics.checkNotNullParameter(checkOut, "checkOut");
        Intrinsics.checkNotNullParameter(roomsOccupancy, "roomsOccupancy");
        return m70.a.g(((b0) this.f178695b).a(new yfi.a(propertyId, Boolean.TRUE, checkIn, checkOut, roomsOccupancy), false), null, new n87.r(22), 1);
    }

    public r o(String propertyId, LocalDate checkIn, LocalDate checkOut, String roomsOccupancy) {
        Intrinsics.checkNotNullParameter(propertyId, "propertyId");
        Intrinsics.checkNotNullParameter(checkIn, "checkIn");
        Intrinsics.checkNotNullParameter(checkOut, "checkOut");
        Intrinsics.checkNotNullParameter(roomsOccupancy, "roomsOccupancy");
        return m70.a.g(((b0) this.f178695b).d(new cgi.c(propertyId, checkIn, checkOut, roomsOccupancy)), null, new n87.r(23), 1);
    }

    @Override // fgm.b
    public void onComplete() {
        ((fgm.b) this.f178695b).onComplete();
    }

    @Override // fgm.b, efm.f0
    public void onError(Throwable th10) {
        switch (this.f178694a) {
            case 18:
                fgm.b bVar = (fgm.b) this.f178695b;
                try {
                    if (!((igm.p) this.f178696c).test(th10)) {
                        bVar.onError(th10);
                    } else {
                        bVar.onComplete();
                    }
                } catch (Throwable th11) {
                    ce9.m.F(th11);
                    bVar.onError(new CompositeException(th10, th11));
                    return;
                }
                break;
            default:
                ((f0) this.f178696c).onError(th10);
                break;
        }
    }

    @Override // fgm.b
    public void onSubscribe(Disposable disposable) {
        ((fgm.b) this.f178695b).onSubscribe(disposable);
    }

    @Override // efm.f0
    public void onSuccess(Object obj2) {
        ((f0) this.f178696c).onSuccess(obj2);
    }

    public r p(String str) {
        if (str != null && !kotlin.text.d0.W(str)) {
            r rVarX = new ufm.i(((ang.f) this.f178695b).f(false), new ny7.j(new nvg.b0(this, str, 7), 10), 1).x();
            Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
            return rVarX;
        }
        od0.i.Companion.getClass();
        r rVarJust = r.just(od0.i.f224256b);
        Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
        return rVarJust;
    }

    public Flow q(Function1 watchlistSelector, Set assetTypeKeys, String orderingKey, Integer num) {
        Intrinsics.checkNotNullParameter(watchlistSelector, "watchlistSelector");
        Intrinsics.checkNotNullParameter(assetTypeKeys, "assetTypeKeys");
        Intrinsics.checkNotNullParameter(orderingKey, "orderingKey");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return boh.f.e(boh.f.e(nim.a.v(((n4d.m) ((a4d.a) this.f178695b)).c(d0.d1(assetTypeKeys), loadingStrategy), new js7.c(7, watchlistSelector)), new l3d.m(this, orderingKey, 0)), new khg.s(this, 17, num, orderingKey));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object r(java.util.List r12, kotlin.jvm.functions.Function2 r13, gim.c r14) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jul.o.r(java.util.List, kotlin.jvm.functions.Function2, gim.c):java.lang.Object");
    }

    public void s(List list) {
        if (list == null) {
            throw new NullPointerException("Null files");
        }
        this.f178695b = list;
    }

    public void t(String str) {
        this.f178696c = str;
    }

    public void u() {
        Editable text;
        Drawable drawable = (Drawable) this.f178696c;
        gzl.c cVar = (gzl.c) this.f178695b;
        Drawable[] compoundDrawables = cVar.getCompoundDrawables();
        Intrinsics.checkNotNullExpressionValue(compoundDrawables, "getCompoundDrawables(...)");
        Drawable drawable2 = compoundDrawables[0];
        Drawable drawable3 = compoundDrawables[1];
        if (!i()) {
            drawable = ((cVar.hasFocus() || (text = cVar.getText()) == null || text.length() == 0) && !Intrinsics.f(compoundDrawables[2], drawable)) ? compoundDrawables[2] : null;
        }
        cVar.setCompoundDrawablesWithIntrinsicBounds(drawable2, drawable3, drawable, compoundDrawables[3]);
    }

    public o(fnc.s buttonValidator, k4j.a buttonResourcesProvider) {
        this.f178694a = 1;
        Intrinsics.checkNotNullParameter(buttonValidator, "buttonValidator");
        Intrinsics.checkNotNullParameter(buttonResourcesProvider, "buttonResourcesProvider");
        this.f178695b = buttonValidator;
        this.f178696c = buttonResourcesProvider;
    }

    @Override // efm.f0
    public void onSubscribe(ifm.c cVar) {
        lfm.d.c((ofm.i) this.f178695b, cVar);
    }

    public o(i97.d remoteSearchRepository, l80.h timeProvider) {
        this.f178694a = 5;
        Intrinsics.checkNotNullParameter(remoteSearchRepository, "remoteSearchRepository");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        this.f178695b = remoteSearchRepository;
        this.f178696c = timeProvider;
    }

    public o(wa7.m hiddenAccountsInteractor, za7.c hiddenBalancesIdProvider) {
        this.f178694a = 9;
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        Intrinsics.checkNotNullParameter(hiddenBalancesIdProvider, "hiddenBalancesIdProvider");
        this.f178695b = hiddenAccountsInteractor;
        this.f178696c = hiddenBalancesIdProvider;
    }

    public o(gxa.c personalizedTrackingRepository, wwa.b inviteCampaignHomeInteractor) {
        this.f178694a = 7;
        Intrinsics.checkNotNullParameter(personalizedTrackingRepository, "personalizedTrackingRepository");
        Intrinsics.checkNotNullParameter(inviteCampaignHomeInteractor, "inviteCampaignHomeInteractor");
        this.f178695b = personalizedTrackingRepository;
        this.f178696c = inviteCampaignHomeInteractor;
    }

    public o(mp.r productIntroInteractor) {
        this.f178694a = 16;
        Intrinsics.checkNotNullParameter(productIntroInteractor, "productIntroInteractor");
        this.f178695b = productIntroInteractor;
        this.f178696c = q.b(0, 2, ukm.f.DROP_OLDEST);
    }

    public o(qd0.b languageProvider) {
        this.f178694a = 8;
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f178695b = languageProvider;
        this.f178696c = new LinkedHashMap();
    }

    public o(sf0.h serverErrorParser, zte.b cardPaymentsTopUpDialogs) {
        this.f178694a = 23;
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(cardPaymentsTopUpDialogs, "cardPaymentsTopUpDialogs");
        this.f178695b = serverErrorParser;
        this.f178696c = cardPaymentsTopUpDialogs;
    }

    public o(mu5.f cryptoInvestmentsInteractor, xv5.c cryptoCommodityBaseCurrencyInteractor) {
        this.f178694a = 3;
        Intrinsics.checkNotNullParameter(cryptoInvestmentsInteractor, "cryptoInvestmentsInteractor");
        Intrinsics.checkNotNullParameter(cryptoCommodityBaseCurrencyInteractor, "cryptoCommodityBaseCurrencyInteractor");
        this.f178695b = cryptoInvestmentsInteractor;
        this.f178696c = cryptoCommodityBaseCurrencyInteractor;
    }

    public o(gte.a featureToggleInteractor, z juniorProductsInteractor) {
        this.f178694a = 19;
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(juniorProductsInteractor, "juniorProductsInteractor");
        this.f178695b = featureToggleInteractor;
        this.f178696c = juniorProductsInteractor;
    }

    public o(jt0.b statsGroupMetricsProvider, w2 screenerFilterFactory) {
        this.f178694a = 29;
        Intrinsics.checkNotNullParameter(statsGroupMetricsProvider, "statsGroupMetricsProvider");
        Intrinsics.checkNotNullParameter(screenerFilterFactory, "screenerFilterFactory");
        this.f178695b = statsGroupMetricsProvider;
        this.f178696c = screenerFilterFactory;
    }

    public o(kbb.c screenerMetricsProvider, w2 screenerFilterFactory) {
        this.f178694a = 25;
        Intrinsics.checkNotNullParameter(screenerMetricsProvider, "screenerMetricsProvider");
        Intrinsics.checkNotNullParameter(screenerFilterFactory, "screenerFilterFactory");
        this.f178695b = screenerMetricsProvider;
        this.f178696c = screenerFilterFactory;
    }

    public o(hj8.a juniorProfileInteractor, te8.e juniorAccountInteractor) {
        this.f178694a = 24;
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(juniorAccountInteractor, "juniorAccountInteractor");
        this.f178695b = juniorProfileInteractor;
        this.f178696c = juniorAccountInteractor;
    }

    public o(ang.f userInteractor, z80.b phoneTools) {
        this.f178694a = 17;
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(phoneTools, "phoneTools");
        this.f178695b = userInteractor;
        this.f178696c = phoneTools;
    }

    public o(ppk.f ratesInteractor, wsg.n walletInteractor) {
        this.f178694a = 27;
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f178695b = ratesInteractor;
        this.f178696c = walletInteractor;
    }

    public o(ue0.c storage, l80.e dateProvider) {
        this.f178694a = 2;
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f178695b = storage;
        this.f178696c = dateProvider;
    }

    public o(swg.f repository, kgm.i indicatorStockAssetProvider) {
        this.f178694a = 20;
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(indicatorStockAssetProvider, "indicatorStockAssetProvider");
        this.f178695b = repository;
        this.f178696c = indicatorStockAssetProvider;
    }

    public o(b0 travelHotelsPropertyInteractor, ang.f userInteractor, l93.f revolutCardsInteractor, p8g.b travelHotelsDropoffInteractor, i9g.h0 travelSearchParamsInteractor) {
        this.f178694a = 13;
        Intrinsics.checkNotNullParameter(travelHotelsPropertyInteractor, "travelHotelsPropertyInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(travelHotelsDropoffInteractor, "travelHotelsDropoffInteractor");
        Intrinsics.checkNotNullParameter(travelSearchParamsInteractor, "travelSearchParamsInteractor");
        this.f178695b = travelHotelsPropertyInteractor;
        this.f178696c = userInteractor;
    }

    public o(kpj.e merchantRevolutShopInteractor, dl2.a merchantRevolutShopFiscalInteractor) {
        this.f178694a = 12;
        Intrinsics.checkNotNullParameter(merchantRevolutShopInteractor, "merchantRevolutShopInteractor");
        Intrinsics.checkNotNullParameter(merchantRevolutShopFiscalInteractor, "merchantRevolutShopFiscalInteractor");
        this.f178695b = merchantRevolutShopInteractor;
        this.f178696c = merchantRevolutShopFiscalInteractor;
    }

    public o(Context context, Resources resources, MultipleDrawableMaterialEditText editText) {
        this.f178694a = 26;
        int i = R$attr.uikit_colorForeground_50;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(editText, "editText");
        this.f178695b = editText;
        Drawable drawable = null;
        Drawable drawable2 = ResourcesCompat.getDrawable(resources, com.revolut.uicomponent.R$drawable.ic_cross_grey_24dp, null);
        if (drawable2 != null) {
            DrawableCompat.setTint(drawable2, kli.a.s(i, context));
            drawable = drawable2;
        }
        this.f178696c = drawable;
        qyl.a listener = new qyl.a(this, 0);
        editText.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        editText.f148164c.add(listener);
        editText.addTextChangedListener(new a2(this, 7));
        editText.a(new m4(this, 10));
    }

    public o(m titleMapper, l descriptionMapper, d1h.h wealthRemoteDisclaimersMapper) {
        this.f178694a = 0;
        Intrinsics.checkNotNullParameter(titleMapper, "titleMapper");
        Intrinsics.checkNotNullParameter(descriptionMapper, "descriptionMapper");
        Intrinsics.checkNotNullParameter(wealthRemoteDisclaimersMapper, "wealthRemoteDisclaimersMapper");
        this.f178695b = descriptionMapper;
        this.f178696c = wealthRemoteDisclaimersMapper;
    }

    public o(a4d.a multipleWatchlistsRepository, jid.z watchlistItemTransformer) {
        this.f178694a = 4;
        Intrinsics.checkNotNullParameter(multipleWatchlistsRepository, "multipleWatchlistsRepository");
        Intrinsics.checkNotNullParameter(watchlistItemTransformer, "watchlistItemTransformer");
        this.f178695b = multipleWatchlistsRepository;
        this.f178696c = watchlistItemTransformer;
    }

    public o() {
        this.f178694a = 6;
    }

    public o(StockDetailsOverviewController stockDetailsOverviewController) {
        this.f178694a = 11;
        this.f178695b = stockDetailsOverviewController.f104056s0;
        this.f178696c = stockDetailsOverviewController.g0;
    }
}
