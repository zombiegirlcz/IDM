package hx7;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Pair;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewKt;
import com.onfido.android.sdk.capture.internal.navigation.Navigator;
import com.onfido.workflow.internal.ui.LoadingScreen;
import com.revolut.core.ui_kit.views.navbar.WallpaperAssetSwitcher;
import com.revolut.feature.apm.bills.core.api.model.Bill;
import com.revolut.feature.crypto.remittance.models.domain.fees.CryptoWithdrawFeesBreakdownDetail;
import com.revolut.feature.crypto.withdraw.api.models.FiatCryptoMoney;
import com.revolut.feature.defi.common.models.domain.DeFiAssetAmount;
import com.revolut.feature.defi.common.models.dto.TokenAmountDto;
import com.revolut.feature.travel.flights.models.domain.common.Carrier;
import com.revolut.feature.travel.flights.models.domain.common.FlightPoint;
import com.revolut.feature_move_money.impl.model.MoveMoneyOrderInfo;
import com.revolut.retail.feature.api.trips.models.Trip;
import com.revolut.retail.feature.api.trips.models.TripTransactionAdjustment;
import ft3.d1;
import ft3.g1;
import hx0.b0;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import m2l.k0;
import mel.j0;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import qbf.u;
import retrofit2.HttpException;
import retrofit2.Response;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e {
    public static final svj.a A(Trip trip) {
        String str;
        Intrinsics.checkNotNullParameter(trip, "<this>");
        String str2 = trip.f99263a;
        ZonedDateTime zonedDateTime = trip.f99264b;
        Long lValueOf = zonedDateTime != null ? Long.valueOf(pu7.a.I(zonedDateTime)) : null;
        ZonedDateTime zonedDateTime2 = trip.f99265c;
        Long lValueOf2 = zonedDateTime2 != null ? Long.valueOf(pu7.a.I(zonedDateTime2)) : null;
        String str3 = trip.d.f297794a;
        List<TripTransactionAdjustment> list = trip.e;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (TripTransactionAdjustment tripTransactionAdjustment : list) {
            Intrinsics.checkNotNullParameter(tripTransactionAdjustment, "<this>");
            String str4 = tripTransactionAdjustment.f99267a;
            int i = tvj.a.f274778a[tripTransactionAdjustment.f99268b.ordinal()];
            if (i == 1) {
                str = "EXCLUDED";
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "INCLUDED";
            }
            arrayList.add(new svj.d(str4, str));
        }
        return new svj.a(str2, lValueOf, lValueOf2, str3, arrayList, pu7.a.I(trip.f99266g), trip.f);
    }

    public static Pair B(RandomAccessFile randomAccessFile, int i) throws IOException {
        int i2;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((int) Math.min(i, (-22) + length)) + 22);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long jCapacity = length - ((long) byteBufferAllocate.capacity());
        randomAccessFile.seek(jCapacity);
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        C(byteBufferAllocate);
        int iCapacity = byteBufferAllocate.capacity();
        if (iCapacity < 22) {
            i2 = -1;
        } else {
            int i3 = iCapacity - 22;
            int iMin = Math.min(i3, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
            for (int i5 = 0; i5 < iMin; i5++) {
                i2 = i3 - i5;
                if (byteBufferAllocate.getInt(i2) == 101010256 && ((char) byteBufferAllocate.getShort(i2 + 20)) == i5) {
                    break;
                }
            }
            i2 = -1;
        }
        if (i2 == -1) {
            return null;
        }
        byteBufferAllocate.position(i2);
        ByteBuffer byteBufferSlice = byteBufferAllocate.slice();
        byteBufferSlice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(byteBufferSlice, Long.valueOf(jCapacity + ((long) i2)));
    }

    public static void C(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    public static final com.revolut.kompot.navigable.vc.modal.a a(yji.l lVar, Function2 controllersFactory) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(controllersFactory, "controllersFactory");
        return new com.revolut.kompot.navigable.vc.modal.a(lVar, controllersFactory);
    }

    public static final qki.d b(qki.e eVar, Parcelable initialState) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        return new qki.d(initialState);
    }

    public static final lbf.a c(qbf.p pVar) {
        lbf.o oVar;
        if (!(pVar instanceof qbf.a)) {
            if (pVar instanceof u) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        qbf.a aVar = (qbf.a) pVar;
        String strA = aVar.getCode();
        int i = pbf.f.e[aVar.getType().ordinal()];
        if (i == 1) {
            oVar = lbf.o.TRADE;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            oVar = lbf.o.UNKNOWN;
        }
        return new lbf.a(strA, oVar, aVar.getFeePercent(), aVar.getPeriod(), aVar.getRecurring());
    }

    public static final qbf.p d(lbf.n nVar) {
        qbf.q qVar;
        if (!(nVar instanceof lbf.a)) {
            if (nVar == null) {
                return new u(0);
            }
            throw new NoWhenBranchMatchedException();
        }
        lbf.a aVar = (lbf.a) nVar;
        String str = aVar.f193663a;
        int i = pbf.f.f[aVar.f193664b.ordinal()];
        if (i == 1) {
            qVar = qbf.q.TRADE;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            qVar = qbf.q.UNKNOWN;
        }
        return new qbf.a(qVar, str, aVar.f193665c, aVar.d, aVar.e);
    }

    public static final b0 e(View view) {
        Bitmap bitmapDrawToBitmap$default;
        if (!ViewCompat.isLaidOut(view)) {
            return null;
        }
        int top = view.getTop();
        int left = view.getLeft();
        if (view instanceof WallpaperAssetSwitcher) {
            try {
                ((WallpaperAssetSwitcher) view).setScreenshotDrawingMode(true);
                bitmapDrawToBitmap$default = ViewKt.drawToBitmap$default(view, null, 1, null);
            } finally {
                ((WallpaperAssetSwitcher) view).setScreenshotDrawingMode(false);
            }
        } else {
            bitmapDrawToBitmap$default = ViewKt.drawToBitmap$default(view, null, 1, null);
        }
        return new b0(top, left, bitmapDrawToBitmap$default);
    }

    public static final void f(Navigator navigator) {
        Intrinsics.checkNotNullParameter(navigator, "<this>");
        navigator.backTo(LoadingScreen.f50189a);
    }

    public static final void g(Response response) {
        Intrinsics.checkNotNullParameter(response, "<this>");
        if (!response.isSuccessful()) {
            throw new HttpException(response);
        }
    }

    public static final void h(Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (!od0.a.g() && !od0.a.d()) {
            new Handler(Looper.getMainLooper()).post(new iri.c(exception, 1));
            return;
        }
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, exception, h0Var);
    }

    public static final FiatCryptoMoney i(dj0.d dVar, n9l.a aVar) {
        return new FiatCryptoMoney(pyd.c.K(dVar, aVar.f213663c, aVar.f213662b), dVar);
    }

    public static final Integer j(f01.c cVar, String id10) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(id10, "id");
        int iA = cVar.a(id10);
        Integer numValueOf = Integer.valueOf(iA);
        if (iA != 0) {
            return numValueOf;
        }
        return null;
    }

    public static final xi0.b k(MoveMoneyOrderInfo moveMoneyOrderInfo) {
        Intrinsics.checkNotNullParameter(moveMoneyOrderInfo, "<this>");
        int i = e8i.a.f123737a[moveMoneyOrderInfo.f.ordinal()];
        if (i == 1) {
            return moveMoneyOrderInfo.e.getCurrency();
        }
        if (i == 2) {
            return moveMoneyOrderInfo.d.getCurrency();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean l(gqd.c cVar, xi0.b targetCurrency) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        if (cVar instanceof gqd.b) {
            return false;
        }
        if (cVar instanceof gqd.a) {
            return tpd.a.d(((gqd.a) cVar).f145674c, targetCurrency);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final dj0.d m(List list, xi0.b defaultCurrency) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(defaultCurrency, "defaultCurrency");
        dj0.d.Companion.getClass();
        dj0.d dVarO0 = dj0.d.e;
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            dVarO0 = i == 0 ? mra.d.o0((amd.j) obj2) : pyd.c.O(dVarO0, mra.d.o0((amd.j) obj2));
            i = i2;
        }
        return dVarO0.k() ? new dj0.d(0L, defaultCurrency) : dVarO0;
    }

    public static final void n(Throwable exception) throws Throwable {
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (!od0.a.g() && !od0.a.d()) {
            throw exception;
        }
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, exception, h0Var);
    }

    public static final String o(xr3.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        if (cVar instanceof xr3.a) {
            return "applications_all";
        }
        if (!(cVar instanceof xr3.b)) {
            throw new NoWhenBranchMatchedException();
        }
        StringBuilder sb6 = new StringBuilder("applications_classifications_");
        Set<d1> set = ((xr3.b) cVar).f308204a;
        ArrayList arrayList = new ArrayList(w.t(set, 10));
        for (d1 d1Var : set) {
            String strI = g1.i(d1Var.f137810a);
            gt3.f fVar = d1Var.f137811b;
            String[] elements = {strI, fVar != null ? hb9.b.G(fVar) : null};
            Intrinsics.checkNotNullParameter(elements, "elements");
            arrayList.add(d0.k0(kotlin.collections.d.L(elements), "_", null, null, 0, null, 62));
        }
        sb6.append(d0.k0(d0.O0(arrayList), "-", null, null, 0, null, 62));
        return sb6.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public static final Bill p(hp1.b bVar) {
        ?? arrayList;
        ?? arrayList2;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        xo1.g gVarValueOf = xo1.g.valueOf(bVar.getPaymentMethod());
        xo1.j jVarValueOf = xo1.j.valueOf(bVar.getState());
        String strI = bVar.getTitle();
        List listC = bVar.getInputs();
        if (listC != null) {
            List list = listC;
            arrayList = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(sp1.c.a((gp1.b) it8.next()));
            }
        } else {
            arrayList = f0.f322471a;
        }
        List listB = bVar.getFields();
        if (listB != null) {
            List list2 = listB;
            arrayList2 = new ArrayList(w.t(list2, 10));
            Iterator it9 = list2.iterator();
            while (it9.hasNext()) {
                arrayList2.add(sp1.f.a((qp1.b) it9.next()));
            }
        } else {
            arrayList2 = f0.f322471a;
        }
        return new Bill(gVarValueOf, jVarValueOf, arrayList, arrayList2, bVar.getPaymentIntentId(), mo3.a.o(bVar.getAmount()), strI, bVar.getPocketId(), bVar.getTransactionId(), bVar.getScheduledDate() != null ? LocalDate.parse(bVar.getScheduledDate()) : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.feature.credit.card.api.models.presentation.CreditCardLargeButtonModel q(io4.l r9) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = r9.getTitle()
            io4.k r1 = r9.getAction()
            r2 = 0
            if (r1 == 0) goto L15
            com.revolut.feature.credit.card.api.models.presentation.CreditCardModelAction r1 = jo4.b.a(r1)
            goto L16
        L15:
            r1 = r2
        L16:
            java.lang.String r9 = r9.getStyle()
            if (r9 == 0) goto L86
            yhm.m$a r3 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L37 java.util.concurrent.CancellationException -> L84
            tl4.a[] r3 = tl4.a.values()     // Catch: java.lang.Throwable -> L37 java.util.concurrent.CancellationException -> L84
            int r4 = r3.length     // Catch: java.lang.Throwable -> L37 java.util.concurrent.CancellationException -> L84
            r5 = 0
        L24:
            if (r5 >= r4) goto L39
            r6 = r3[r5]     // Catch: java.lang.Throwable -> L37 java.util.concurrent.CancellationException -> L84
            java.lang.String r7 = r6.name()     // Catch: java.lang.Throwable -> L37 java.util.concurrent.CancellationException -> L84
            r8 = 1
            boolean r7 = kotlin.text.a0.z(r7, r9, r8)     // Catch: java.lang.Throwable -> L37 java.util.concurrent.CancellationException -> L84
            if (r7 == 0) goto L34
            goto L3a
        L34:
            int r5 = r5 + 1
            goto L24
        L37:
            r9 = move-exception
            goto L68
        L39:
            r6 = r2
        L3a:
            if (r6 == 0) goto L3d
            goto L6e
        L3d:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L37 java.util.concurrent.CancellationException -> L84
            java.lang.Class<tl4.a> r4 = tl4.a.class
            kotlin.jvm.internal.p0 r5 = kotlin.jvm.internal.o0.f186429a     // Catch: java.lang.Throwable -> L37 java.util.concurrent.CancellationException -> L84
            kotlin.reflect.KClass r4 = r5.b(r4)     // Catch: java.lang.Throwable -> L37 java.util.concurrent.CancellationException -> L84
            java.lang.String r4 = r4.m()     // Catch: java.lang.Throwable -> L37 java.util.concurrent.CancellationException -> L84
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L37 java.util.concurrent.CancellationException -> L84
            r5.<init>()     // Catch: java.lang.Throwable -> L37 java.util.concurrent.CancellationException -> L84
            java.lang.String r6 = "Unsupported enum value: "
            r5.append(r6)     // Catch: java.lang.Throwable -> L37 java.util.concurrent.CancellationException -> L84
            r5.append(r9)     // Catch: java.lang.Throwable -> L37 java.util.concurrent.CancellationException -> L84
            java.lang.String r9 = " for "
            r5.append(r9)     // Catch: java.lang.Throwable -> L37 java.util.concurrent.CancellationException -> L84
            r5.append(r4)     // Catch: java.lang.Throwable -> L37 java.util.concurrent.CancellationException -> L84
            java.lang.String r9 = r5.toString()     // Catch: java.lang.Throwable -> L37 java.util.concurrent.CancellationException -> L84
            r3.<init>(r9)     // Catch: java.lang.Throwable -> L37 java.util.concurrent.CancellationException -> L84
            throw r3     // Catch: java.lang.Throwable -> L37 java.util.concurrent.CancellationException -> L84
        L68:
            yhm.m$a r3 = yhm.m.INSTANCE
            yhm.n r6 = yhm.o.a(r9)
        L6e:
            java.lang.Throwable r9 = yhm.m.a(r6)
            if (r9 == 0) goto L77
            n(r9)
        L77:
            boolean r9 = r6 instanceof yhm.n
            if (r9 == 0) goto L7c
            goto L7d
        L7c:
            r2 = r6
        L7d:
            java.lang.Enum r2 = (java.lang.Enum) r2
            tl4.a r2 = (tl4.a) r2
            if (r2 != 0) goto L88
            goto L86
        L84:
            r9 = move-exception
            throw r9
        L86:
            tl4.a r2 = tl4.a.ACCENT
        L88:
            com.revolut.feature.credit.card.api.models.presentation.CreditCardLargeButtonModel r9 = new com.revolut.feature.credit.card.api.models.presentation.CreditCardLargeButtonModel
            r9.<init>(r0, r1, r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: hx7.e.q(io4.l):com.revolut.feature.credit.card.api.models.presentation.CreditCardLargeButtonModel");
    }

    public static final CryptoWithdrawFeesBreakdownDetail r(dl5.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String strE = aVar.getTitle();
        String strC = aVar.getDescription();
        String strD = aVar.getShortDescription();
        dj0.d dVarO = mo3.a.o(aVar.getAmount());
        jo3.a aVarB = aVar.getAmountInBaseCurrency();
        return new CryptoWithdrawFeesBreakdownDetail(strE, strC, strD, dVarO, aVarB != null ? mo3.a.o(aVarB) : null);
    }

    public static final DeFiAssetAmount s(com.revolut.feature.defi.common.models.dto.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        c36.c cVar = bVar.f71710a;
        String str = cVar.f20897a;
        String str2 = cVar.f20898b;
        TokenAmountDto tokenAmountDto = bVar.f71711b;
        return new DeFiAssetAmount(str, str2, tokenAmountDto.f71706a, tokenAmountDto.f71707b);
    }

    public static final Carrier t(t7g.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return new Carrier(fVar.f268671a, fVar.f268672b, fVar.f268673c);
    }

    public static final FlightPoint u(t7g.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        String str = iVar.f268675a;
        String str2 = iVar.f268676b;
        String str3 = iVar.f268677c;
        LocalDateTime localDateTime = LocalDateTime.parse(iVar.d);
        Intrinsics.checkNotNullExpressionValue(localDateTime, "parse(...)");
        return new FlightPoint(str, str2, str3, localDateTime);
    }

    public static final Trip v(svj.a aVar) {
        k0j.a aVar2;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String str = aVar.f266022a;
        Long l2 = aVar.f266023b;
        ZonedDateTime zonedDateTimeM = l2 != null ? pu7.a.M(l2.longValue(), g0m.a.f139502a) : null;
        Long l3 = aVar.f266024c;
        ZonedDateTime zonedDateTimeM2 = l3 != null ? pu7.a.M(l3.longValue(), g0m.a.f139502a) : null;
        wi0.a aVar3 = wi0.b.Companion;
        String str2 = aVar.d;
        aVar3.getClass();
        wi0.b bVarA = wi0.a.a(str2);
        List<svj.d> list = aVar.e;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (svj.d dVar : list) {
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            String str3 = dVar.f266027a;
            String str4 = dVar.f266028b;
            if (Intrinsics.f(str4, "EXCLUDED")) {
                aVar2 = k0j.a.EXCLUDED;
            } else {
                if (!Intrinsics.f(str4, "INCLUDED")) {
                    throw new UnsupportedOperationException(j6.a.q("unknown type ", str4));
                }
                aVar2 = k0j.a.INCLUDED;
            }
            arrayList.add(new TripTransactionAdjustment(str3, aVar2));
        }
        return new Trip(str, zonedDateTimeM, zonedDateTimeM2, bVarA, arrayList, aVar.f266025g, pu7.a.M(aVar.f, g0m.a.f139502a));
    }

    public static final d71.l w(bde.p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        return new d71.l(pVar.getNumber(), pVar.getLink());
    }

    public static final m7g.h x(t7g.u uVar) {
        m7g.h hVar;
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        m7g.g gVar = m7g.h.Companion;
        String str = uVar.f268693a;
        gVar.getClass();
        if (str != null) {
            m7g.h[] hVarArrValues = m7g.h.values();
            int length = hVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    hVar = null;
                    break;
                }
                hVar = hVarArrValues[i];
                if (a0.z(hVar.name(), str, true)) {
                    break;
                }
                i++;
            }
            if (hVar != null) {
                return hVar;
            }
        }
        return m7g.h.UNKNOWN;
    }

    public static final mel.f y(m2l.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        m2l.h hVar = iVar.f202205a;
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        k0 k0Var = hVar.f202199a;
        Intrinsics.checkNotNullParameter(k0Var, "<this>");
        mel.e eVar = new mel.e(j0.valueOf(k0Var.name()), hVar.f202200b, hVar.f202201c, hVar.d, hVar.e, hVar.f);
        m2l.e eVar2 = iVar.f202206b;
        Intrinsics.checkNotNullParameter(eVar2, "<this>");
        return new mel.f(eVar, new mel.c(mo3.a.o(eVar2.f202193a), mo3.a.o(eVar2.f202194b), mo3.a.o(eVar2.f202195c), eVar2.d), i.S(iVar.f202207c));
    }

    public static final z95.b z(cak.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        aak.b bVar = new aak.b(aVar.getName(), aVar.getExpirationDate(), aVar.getApplicationId(), aVar.getFlowType());
        Lazy lazy = z9k.a.f320511a;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        String strD = bVar.getName();
        String strB = bVar.getExpirationDate();
        Object value = z9k.a.f320511a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        LocalDateTime localDateTime = LocalDateTime.parse(strB, (DateTimeFormatter) value);
        Intrinsics.checkNotNullExpressionValue(localDateTime, "parse(...)");
        return new z95.b(strD, localDateTime, bVar.getApplicationId(), z95.a.valueOf(bVar.getFlowType()));
    }
}
