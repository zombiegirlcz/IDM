package o7;

import a2i.j;
import a83.p0;
import a9j.n;
import afl.t0;
import android.content.Context;
import androidx.room.util.DBUtil;
import aw0.k7;
import aw0.o9;
import clh.u;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.AssetClauseType;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.customer_present.tips.impl.screen.custom_tip.CustomTipScreen;
import com.revolut.feature.topup_screen.impl.data.network.service.ExternalCardVerificationService;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.tracking.v3.SwipeToTradeContext;
import cu8.r0;
import d7.g0;
import e06.h;
import grl.hd;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import kfm.o;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import lf8.k;
import n3f.a0;
import n3f.e0;
import n3f.g;
import o97.d0;
import o97.f0;
import o97.r;
import o97.y;
import qua.p;
import sgl.e;
import sgl.f;
import tof.a3;
import tof.o3;
import tof.v6;
import ufm.i;
import zhm.h0;
import zhm.q0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes16.dex */
public final class d implements o, u2h.b, zp0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f222641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f222642b;

    public d(j function) {
        this.f222641a = 5;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f222642b = function;
    }

    public static u98.a e(LocalDate localDate, LocalDate localDate2, LocalDate localDate3, LocalDate localDate4, LocalDate localDate5, Integer num) {
        return localDate2.compareTo((ChronoLocalDate) localDate) > 0 ? u98.a.FUTURE_DATE : localDate2.compareTo((ChronoLocalDate) localDate3) <= 0 ? u98.a.TOO_OLD : localDate2.compareTo((ChronoLocalDate) localDate4) > 0 ? u98.a.TOO_YOUNG : (localDate5 == null || num == null || Period.between(localDate5, localDate2).getYears() >= num.intValue()) ? u98.a.ELIGIBLE : u98.a.INVALID_AGE_DIFFERENCE;
    }

    public static void x(d dVar, Data data, Data data2, int i) {
        if ((i & 1) != 0) {
            data = null;
        }
        if ((i & 2) != 0) {
            data2 = null;
        }
        com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.c cVar = (com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.c) dVar.f222642b;
        cVar.H2(cVar.D, new p0(data, data2, 3));
    }

    public static void y(d dVar, Data data, Data data2, int i) {
        if ((i & 1) != 0) {
            data = null;
        }
        if ((i & 2) != 0) {
            data2 = null;
        }
        com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.b bVar = (com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.b) dVar.f222642b;
        bVar.H2(bVar.z, new p0(data, data2, 9));
    }

    public u98.a a(LocalDate dateOfBirth, lf8.j youthTaxAdvantageConfig, LocalDate localDate, Integer num) {
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(youthTaxAdvantageConfig, "youthTaxAdvantageConfig");
        LocalDate localDateW = oi0.d.W(((df0.b) this.f222642b).a());
        k kVar = youthTaxAdvantageConfig.f194674b;
        LocalDate localDateMinusDays = localDateW.minusYears(kVar.f194676a).minusDays(kVar.f194677b);
        Intrinsics.checkNotNullExpressionValue(localDateMinusDays, "minusDays(...)");
        k kVar2 = youthTaxAdvantageConfig.f194673a;
        LocalDate localDateMinusDays2 = localDateW.minusYears(kVar2.f194676a).minusDays(kVar2.f194677b);
        Intrinsics.checkNotNullExpressionValue(localDateMinusDays2, "minusDays(...)");
        return e(localDateW, dateOfBirth, localDateMinusDays, localDateMinusDays2, localDate, num);
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public /* synthetic */ Object apply(Object obj2) {
        switch (this.f222641a) {
            case 1:
                return ((n) this.f222642b).invoke(obj2);
            case 5:
                return ((j) this.f222642b).invoke(obj2);
            case 8:
                return ((j) this.f222642b).invoke(obj2);
            default:
                return ((c0d.j) this.f222642b).invoke(obj2);
        }
    }

    public zjh.c b() {
        return new zjh.c(this);
    }

    public i c(p recurringPayment, List transactions) {
        dj0.d dVar;
        Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        xi0.a aVar = xi0.b.Companion;
        String str = recurringPayment.i;
        aVar.getClass();
        xi0.b bVarA = xi0.a.a(str);
        ArrayList<a3> arrayList = new ArrayList();
        for (Object obj2 : transactions) {
            v6 v6Var = ((a3) obj2).f;
            if (v6Var == v6.COMPLETED || v6Var == v6.PENDING) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (a3 a3Var : arrayList) {
            o3 o3Var = a3Var.J;
            if (o3Var == null || (dVar = o3Var.f272965a) == null) {
                dVar = a3Var.k;
            }
            arrayList2.add(dVar);
        }
        return ((i9e.c) this.f222642b).a(arrayList2, bVarA);
    }

    public boolean d(int i, LocalDate dateOfBirth) {
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        return Period.between(dateOfBirth, oi0.d.W(((df0.b) this.f222642b).a())).getYears() >= i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
    
        if (r10 == r2) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(java.lang.String r9, gim.c r10) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f222642b
            fe8.a r0 = (fe8.a) r0
            boolean r1 = r10 instanceof ae8.i
            if (r1 == 0) goto L17
            r1 = r10
            ae8.i r1 = (ae8.i) r1
            int r2 = r1.f3512w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f3512w = r2
            goto L1c
        L17:
            ae8.i r1 = new ae8.i
            r1.<init>(r8, r10)
        L1c:
            java.lang.Object r10 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f3512w
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L3d
            if (r3 == r5) goto L39
            if (r3 != r4) goto L31
            yhm.o.b(r10)     // Catch: java.lang.Exception -> L2f
            goto L70
        L2f:
            r9 = move-exception
            goto L73
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            yhm.o.b(r10)
            goto L5d
        L3d:
            yhm.o.b(r10)
            r1.f3512w = r5
            r10 = r0
            fe8.i r10 = (fe8.i) r10
            r10.getClass()
            skm.p0 r3 = skm.p0.f264001a
            elm.f r3 = elm.f.f127540b
            fe8.e r7 = new fe8.e
            r7.<init>(r10, r9, r6, r5)
            java.lang.Object r9 = skm.e0.J(r3, r7, r1)
            if (r9 != r2) goto L58
            goto L5a
        L58:
            kotlin.Unit r9 = kotlin.Unit.f186387a
        L5a:
            if (r9 != r2) goto L5d
            goto L6f
        L5d:
            r1.f3512w = r4     // Catch: java.lang.Exception -> L2f
            fe8.i r0 = (fe8.i) r0     // Catch: java.lang.Exception -> L2f
            x4l.c r9 = r0.i     // Catch: java.lang.Exception -> L2f
            kotlin.Unit r10 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L2f
            r0 = 0
            java.lang.Object r9 = r9.d(r10, r0, r1)     // Catch: java.lang.Exception -> L2f
            if (r9 != r2) goto L6d
            r10 = r9
        L6d:
            if (r10 != r2) goto L70
        L6f:
            return r2
        L70:
            kotlin.Unit r9 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L2f
            goto L7c
        L73:
            zhm.h0 r10 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            rd0.d.a(r0, r6, r6, r9, r10)
        L7c:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.d.f(java.lang.String, gim.c):java.lang.Object");
    }

    public g0 g(Context context, String str, InputStream inputStream, String str2, String str3) {
        g0 g0VarI;
        a aVar;
        b bVar = (b) this.f222642b;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            r7.c.a("Handling zip response.");
            a aVar2 = a.ZIP;
            g0VarI = str3 != null ? d7.n.i(context, new ZipInputStream(new FileInputStream(bVar.y(str, inputStream, aVar2))), str) : d7.n.i(context, new ZipInputStream(inputStream), null);
            aVar = aVar2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
            r7.c.a("Handling gzip response.");
            aVar = a.GZIP;
            if (str3 != null) {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(new FileInputStream(bVar.y(str, inputStream, aVar)));
                HashMap map = d7.n.f111702a;
                g0VarI = d7.n.e(u1.r(gZIPInputStream), str);
            } else {
                GZIPInputStream gZIPInputStream2 = new GZIPInputStream(inputStream);
                HashMap map2 = d7.n.f111702a;
                g0VarI = d7.n.e(u1.r(gZIPInputStream2), null);
            }
        } else {
            r7.c.a("Received json response.");
            aVar = a.JSON;
            if (str3 != null) {
                FileInputStream fileInputStream = new FileInputStream(bVar.y(str, inputStream, aVar).getAbsolutePath());
                HashMap map3 = d7.n.f111702a;
                g0VarI = d7.n.e(u1.r(fileInputStream), str);
            } else {
                HashMap map4 = d7.n.f111702a;
                g0VarI = d7.n.e(u1.r(inputStream), null);
            }
        }
        if (str3 != null && g0VarI.f111669a != null) {
            File file = new File(bVar.t(), b.g(str, aVar, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean zRenameTo = file.renameTo(file2);
            r7.c.a("Copying temp file to real file (" + file2 + ")");
            if (!zRenameTo) {
                r7.c.b("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
            }
        }
        return g0VarI;
    }

    public ArrayList h() {
        f fVar;
        j3f.i iVar = (j3f.i) this.f222642b;
        List<e0> list = (List) DBUtil.performBlocking(iVar.f171187a, true, false, new iyi.i(iVar, 14));
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (e0 e0Var : list) {
            Intrinsics.checkNotNullParameter(e0Var, "<this>");
            String str = e0Var.f212044a;
            ZonedDateTime zonedDateTime = e0Var.f212045b;
            ZonedDateTime zonedDateTime2 = e0Var.f212046c;
            a0 a0Var = e0Var.d;
            if (a0Var != null) {
                String str2 = a0Var.f212002a;
                String str3 = a0Var.f212003b;
                e eVarA = mif.e0.A(a0Var.f212004c);
                float f = a0Var.d;
                jo3.b bVar = a0Var.e;
                e eVarA2 = bVar != null ? mif.e0.A(bVar) : null;
                jo3.b bVar2 = a0Var.f;
                e eVarA3 = bVar2 != null ? mif.e0.A(bVar2) : null;
                jo3.b bVar3 = a0Var.f212005g;
                fVar = new f(str2, str3, eVarA, f, eVarA2, eVarA3, bVar3 != null ? mif.e0.A(bVar3) : null, a0Var.f212006h);
            } else {
                fVar = null;
            }
            n3f.a aVar = e0Var.e;
            sgl.a aVar2 = aVar != null ? new sgl.a(mif.e0.A(aVar.f212000a), aVar.f212001b) : null;
            n3f.j jVar = e0Var.f;
            sgl.c cVar = jVar != null ? new sgl.c(jVar.f212058a, jVar.f212059b, mif.e0.A(jVar.f212060c)) : null;
            n3f.k kVar = e0Var.f212047g;
            sgl.d dVar = kVar != null ? new sgl.d(kVar.f212061a, kVar.f212062b, mif.e0.A(kVar.f212063c)) : null;
            g gVar = e0Var.f212048h;
            arrayList.add(new sgl.g(str, zonedDateTime, zonedDateTime2, fVar, aVar2, cVar, dVar, gVar != null ? new sgl.b(mif.e0.A(gVar.f212052a)) : null));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof d6a.a
            if (r0 == 0) goto L13
            r0 = r7
            d6a.a r0 = (d6a.a) r0
            int r1 = r0.f111466w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f111466w = r1
            goto L18
        L13:
            d6a.a r0 = new d6a.a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f111466w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L28
            goto L70
        L28:
            r7 = move-exception
            goto L82
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            yhm.o.b(r7)
            yhm.m$a r7 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L28
            java.lang.Object r7 = r6.f222642b     // Catch: java.lang.Throwable -> L28
            l63.a r7 = (l63.a) r7     // Catch: java.lang.Throwable -> L28
            b93.d r2 = b93.d.ALL     // Catch: java.lang.Throwable -> L28
            d73.l r7 = (d73.l) r7     // Catch: java.lang.Throwable -> L28
            efm.r r7 = r7.a(r4, r2)     // Catch: java.lang.Throwable -> L28
            vkm.d r7 = rd0.e.b(r7)     // Catch: java.lang.Throwable -> L28
            zhm.h0 r2 = zhm.h0.f322473a     // Catch: java.lang.Throwable -> L28
            vkm.y r7 = rd0.e.d(r7, r2)     // Catch: java.lang.Throwable -> L28
            d27.d0 r2 = new d27.d0     // Catch: java.lang.Throwable -> L28
            r5 = 24
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L28
            akg.n r7 = nim.a.v(r7, r2)     // Catch: java.lang.Throwable -> L28
            zfd.e r7 = zi0.c.w(r7)     // Catch: java.lang.Throwable -> L28
            czh.a r2 = new czh.a     // Catch: java.lang.Throwable -> L28
            r5 = 19
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L28
            jhi.b r7 = mo3.a.g(r7, r4, r2, r3)     // Catch: java.lang.Throwable -> L28
            r0.f111466w = r3     // Catch: java.lang.Throwable -> L28
            java.lang.Object r7 = vkm.q.z(r7, r0)     // Catch: java.lang.Throwable -> L28
            if (r7 != r1) goto L70
            return r1
        L70:
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> L28
            if (r7 != 0) goto L76
            zhm.f0 r7 = zhm.f0.f322471a     // Catch: java.lang.Throwable -> L28
        L76:
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L28
            java.lang.Integer r0 = new java.lang.Integer     // Catch: java.lang.Throwable -> L28
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L28
            yhm.m$a r7 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L28
            goto L88
        L82:
            yhm.m$a r0 = yhm.m.INSTANCE
            yhm.n r0 = yhm.o.a(r7)
        L88:
            boolean r7 = r0 instanceof yhm.n
            if (r7 == 0) goto L8d
            goto L8e
        L8d:
            r4 = r0
        L8e:
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L97
            int r7 = r4.intValue()
            goto L98
        L97:
            r7 = 0
        L98:
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.d.i(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable j(java.lang.String r6, gim.c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof df7.f
            if (r0 == 0) goto L13
            r0 = r7
            df7.f r0 = (df7.f) r0
            int r1 = r0.f113806x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f113806x = r1
            goto L18
        L13:
            df7.f r0 = new df7.f
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f113806x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r6 = r0.u
            yhm.o.b(r7)
            goto L52
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r7)
            java.lang.Object r7 = r5.f222642b
            ge3.e r7 = (ge3.e) r7
            efm.r r7 = ge3.e.a(r7, r6)
            vkm.d r7 = rd0.e.b(r7)
            d83.i r2 = new d83.i
            r4 = 20
            r2.<init>(r7, r4)
            r0.u = r6
            r0.f113806x = r3
            java.lang.Object r7 = vkm.q.z(r2, r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            com.revolut.data.model.Data r7 = (com.revolut.data.model.Data) r7
            if (r7 == 0) goto L60
            java.lang.Object r0 = r7.getContent()
            tof.i3 r0 = (tof.i3) r0
            if (r0 != 0) goto L5f
            goto L60
        L5f:
            return r0
        L60:
            if (r7 == 0) goto L68
            java.lang.Throwable r7 = r7.getError()
            if (r7 != 0) goto L73
        L68:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unknown transaction id: "
            java.lang.String r6 = j6.a.q(r0, r6)
            r7.<init>(r6)
        L73:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.d.j(java.lang.String, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zp0.c
    public void k(String extractedValue, String formattedValue, boolean z) {
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        h hVar = (h) ((CustomTipScreen) this.f222642b).K.getValue();
        hVar.getClass();
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        hVar.H2(hVar.f121436q, new e06.g(formattedValue, hVar.o.b(formattedValue, hVar.f121435p.f71620a.f115083b.f306286a), 0));
    }

    public void l(ai0.a bitmapDescriptor) {
        Intrinsics.checkNotNullParameter(bitmapDescriptor, "bitmapDescriptor");
        ((MarkerOptions) this.f222642b).icon(bitmapDescriptor.f5145a);
    }

    public List m(Data data, List commodities, boolean z) {
        d0 g0Var;
        int i;
        Intrinsics.checkNotNullParameter(commodities, "commodities");
        klh.c cVar = (klh.c) this.f222642b;
        List list = commodities;
        int iB = q0.b(w.t(list, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Object obj2 : list) {
            jih.a aVar = (jih.a) obj2;
            y searchPayload = new y(r.WEALTH_COMMODITIES, aVar.f174489a, null, 60);
            xi0.b commodity = aVar.f174489a;
            Intrinsics.checkNotNullParameter(searchPayload, "searchPayload");
            Intrinsics.checkNotNullParameter(commodity, "commodity");
            p5d.b bVar = new p5d.b(commodity.f306286a, "commodity", null);
            AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
            SwipeToTradeContext.a aVarNewBuilder = SwipeToTradeContext.newBuilder();
            aVarNewBuilder.h(commodity.f306286a);
            aVarNewBuilder.i(hd.COMMODITY);
            w0 w0VarA = aVarNewBuilder.a();
            companion.getClass();
            linkedHashMap.put(obj2, new zkh.i(searchPayload, bVar, new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA))));
        }
        ArrayList arrayListC = cVar.c(linkedHashMap, commodities);
        if (arrayListC.size() <= 3) {
            g0Var = new f0(new TextLocalisedClause(R$string.search_block_commodities_name, null, null, 14), "wealth-commodities-header-list-id");
        } else {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.search_block_commodities_name, null, null, 14);
            if (!z) {
                i = com.revolut.feature.globalsearch.api.R$string.search_block_header_show_more;
            } else {
                if (!z) {
                    throw new NoWhenBranchMatchedException();
                }
                i = com.revolut.feature.globalsearch.api.R$string.search_block_header_show_less;
            }
            g0Var = new o97.g0(textLocalisedClause, new TextLocalisedClause(i, null, null, 14), "wealth-commodities-header-list-id", new y(r.WEALTH_COMMODITIES, new u("wealth-commodities-header-list-id", z), null, 60));
        }
        boolean zIsEmpty = arrayListC.isEmpty();
        List listV0 = arrayListC;
        if (zIsEmpty) {
            return zhm.f0.f322471a;
        }
        if (!z) {
            listV0 = zhm.d0.V0(arrayListC, 3);
        }
        List items = listV0;
        yp0.b.k(items, 0, 0, 0, 0, 31);
        Intrinsics.checkNotNullParameter(items, "items");
        return v.k(g0Var, new o97.e0(t5d.d.b(data, items)));
    }

    public q06.k n(jf0.c deeplink) {
        q06.k kVar;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        wli.d dVar = (wli.d) this.f222642b;
        List list = (List) dVar.a().get(deeplink.e(1));
        if (list != null) {
            Iterator it8 = list.iterator();
            q06.k kVar2 = null;
            while (it8.hasNext()) {
                b60.c cVarA = ((zli.c) it8.next()).a();
                q06.k kVar3 = cVarA instanceof q06.k ? (q06.k) cVarA : null;
                if (kVar3 != null && kVar3.a(deeplink)) {
                    if (kVar2 == null) {
                        kVar2 = kVar3;
                    } else if (kVar2.getClass().equals(kVar3.getClass())) {
                        continue;
                    } else {
                        String str = deeplink.f173629c;
                        String name = kVar2.getClass().getName();
                        String name2 = kVar3.getClass().getName();
                        StringBuilder sbM = v0.a.m("Conflicting DeeplinkRouteResolvers for path ", str, ": ", name, ", ");
                        sbM.append(name2);
                        IllegalStateException illegalStateException = new IllegalStateException(sbM.toString());
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                        od0.a aVar = od0.a.f224253a;
                        if (od0.a.e()) {
                            throw illegalStateException;
                        }
                    }
                }
            }
            if (kVar2 != null) {
                return kVar2;
            }
        }
        Iterator it9 = dVar.a().values().iterator();
        while (it9.hasNext()) {
            Iterator it10 = ((List) it9.next()).iterator();
            while (true) {
                if (!it10.hasNext()) {
                    kVar = null;
                    break;
                }
                b60.c cVarA2 = ((zli.c) it10.next()).a();
                kVar = cVarA2 instanceof q06.k ? (q06.k) cVarA2 : null;
                if (kVar != null && kVar.a(deeplink)) {
                    break;
                }
            }
            if (kVar != null) {
                return kVar;
            }
        }
        return null;
    }

    public void o(String str, String str2) {
        ((HashMap) this.f222642b).put(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Clause p(dj0.d value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(value, "value");
        k7 k7Var = null;
        ScaleMode scaleMode = null;
        boolean z = false;
        return new MoneyClause(value, new MoneyClause.Format.Defaults(k7Var, scaleMode, z, false, 15), 0 == true ? 1 : 0, o9.NON_SENSITIVE, 4);
    }

    public TextLocalisedClause q(afl.h decimalRange) {
        Intrinsics.checkNotNullParameter(decimalRange, "decimalRange");
        return new TextLocalisedClause(R$string.wealth_stock_details_stats_price_volume_range_to, v.k(s(decimalRange.f4599a), s(decimalRange.f4600b)), null, 12);
    }

    public TextLocalisedClause r(t0 range) {
        Intrinsics.checkNotNullParameter(range, "range");
        return new TextLocalisedClause(R$string.wealth_stock_details_stats_price_volume_range_to, v.k(p(range.f4647a), p(range.f4648b)), null, 12);
    }

    public Clause s(BigDecimal value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(value, "value");
        BigDecimal bigDecimalMultiply = value.multiply(new BigDecimal(100));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        return new PercentageClause(bigDecimalMultiply, x3h.a.f302754b, (Style) null, 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Clause t(ej0.b value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(value, "value");
        BigDecimal bigDecimal = value.f126703a;
        k7 k7Var = null;
        ScaleMode.TradingPrecise tradingPrecise = ScaleMode.TradingPrecise.f51443a;
        boolean z = false;
        return new AssetClause(bigDecimal, new AssetClauseType.Money(new MoneyClause.Format.Defaults(k7Var, tradingPrecise, z, false, 5)), value.f126704b.f306286a, 0 == true ? 1 : 0, o9.NON_SENSITIVE, 8);
    }

    public TextLocalisedClause u(afl.g decimalMoneyRange) {
        Intrinsics.checkNotNullParameter(decimalMoneyRange, "decimalMoneyRange");
        return new TextLocalisedClause(R$string.wealth_stock_details_stats_price_volume_range_to, v.k(t(decimalMoneyRange.f4596a), t(decimalMoneyRange.f4597b)), null, 12);
    }

    public Clause v(dj0.d value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return ((x3h.a) this.f222642b).f(value);
    }

    public Clause w(BigDecimal value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(value, "value");
        return new NumberClause(value, x3h.a.f302753a, null, null, 12);
    }

    public yqi.d z(dcb.b input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return ((srf.h) this.f222642b).validate(new dcb.a(new srf.b(input.f112850a, input.f112851b, input.d, input.f112852c, 1.0d, input.e), new dcb.c(input.f112850a)));
    }

    public d(j function, byte b4) {
        this.f222641a = 8;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f222642b = function;
    }

    public d(n function) {
        this.f222641a = 1;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f222642b = function;
    }

    public d(c0d.j function) {
        this.f222641a = 15;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f222642b = function;
    }

    public /* synthetic */ d(Object obj2, int i) {
        this.f222641a = i;
        this.f222642b = obj2;
    }

    public d(lrk.a repository) {
        this.f222641a = 10;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f222642b = repository;
    }

    public d(b3i.i itemMapper, b3i.f fiatMapper, b3i.e commodityMapper) {
        this.f222641a = 9;
        Intrinsics.checkNotNullParameter(itemMapper, "itemMapper");
        Intrinsics.checkNotNullParameter(fiatMapper, "fiatMapper");
        Intrinsics.checkNotNullParameter(commodityMapper, "commodityMapper");
        this.f222642b = commodityMapper;
    }

    public d(j3f.i tradingEventsDao) {
        this.f222641a = 19;
        Intrinsics.checkNotNullParameter(tradingEventsDao, "tradingEventsDao");
        this.f222642b = tradingEventsDao;
    }

    public d(mra.k cardSchemeToIconMapper) {
        this.f222641a = 27;
        Intrinsics.checkNotNullParameter(cardSchemeToIconMapper, "cardSchemeToIconMapper");
        this.f222642b = cardSchemeToIconMapper;
    }

    public d(srf.h transferValidator) {
        this.f222641a = 21;
        Intrinsics.checkNotNullParameter(transferValidator, "transferValidator");
        this.f222642b = transferValidator;
    }

    public d(MarkerOptions internal) {
        this.f222641a = 3;
        Intrinsics.checkNotNullParameter(internal, "internal");
        this.f222642b = internal;
    }

    public d(ExternalCardVerificationService externalCardVerificationService) {
        this.f222641a = 6;
        Intrinsics.checkNotNullParameter(externalCardVerificationService, "externalCardVerificationService");
        this.f222642b = externalCardVerificationService;
    }

    public d(ge3.e transactionCategorisationInteractor) {
        this.f222641a = 22;
        Intrinsics.checkNotNullParameter(transactionCategorisationInteractor, "transactionCategorisationInteractor");
        this.f222642b = transactionCategorisationInteractor;
    }

    public d(r0 kycRequiredActionTransformer) {
        this.f222641a = 16;
        Intrinsics.checkNotNullParameter(kycRequiredActionTransformer, "kycRequiredActionTransformer");
        this.f222642b = kycRequiredActionTransformer;
    }

    public d(fe8.a repository) {
        this.f222641a = 2;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f222642b = repository;
    }

    public d(wli.d registry) {
        this.f222641a = 4;
        Intrinsics.checkNotNullParameter(registry, "registry");
        this.f222642b = registry;
    }

    public d(i9e.c amountConverter) {
        this.f222641a = 12;
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        this.f222642b = amountConverter;
    }

    public d(x3h.a statsLabelsFormatter) {
        this.f222641a = 24;
        Intrinsics.checkNotNullParameter(statsLabelsFormatter, "statsLabelsFormatter");
        this.f222642b = statsLabelsFormatter;
    }

    public d(b0a.k peerToPeerChatInteractor) {
        this.f222641a = 18;
        Intrinsics.checkNotNullParameter(peerToPeerChatInteractor, "peerToPeerChatInteractor");
        this.f222642b = peerToPeerChatInteractor;
    }

    public d(df0.b dateProvider) {
        this.f222641a = 11;
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f222642b = dateProvider;
    }

    public d(g9e.a subscriptionListInteractor) {
        this.f222641a = 14;
        Intrinsics.checkNotNullParameter(subscriptionListInteractor, "subscriptionListInteractor");
        this.f222642b = subscriptionListInteractor;
    }

    public d(l63.a cardsContentInteractor) {
        this.f222641a = 20;
        Intrinsics.checkNotNullParameter(cardsContentInteractor, "cardsContentInteractor");
        this.f222642b = cardsContentInteractor;
    }

    public d(bgc.e rewardsInteractor) {
        this.f222641a = 28;
        Intrinsics.checkNotNullParameter(rewardsInteractor, "rewardsInteractor");
        this.f222642b = rewardsInteractor;
    }

    public d() {
        this.f222641a = 26;
        this.f222642b = new HashMap();
    }

    public d(b bVar, nd.k kVar) {
        this.f222641a = 0;
        this.f222642b = bVar;
    }

    public d(klh.c commoditiesMapper, t5d.d swipeAssetTradeActionsMapper) {
        this.f222641a = 13;
        Intrinsics.checkNotNullParameter(commoditiesMapper, "commoditiesMapper");
        Intrinsics.checkNotNullParameter(swipeAssetTradeActionsMapper, "swipeAssetTradeActionsMapper");
        this.f222642b = commoditiesMapper;
    }

    public d(r10.r uiMapperProvider) {
        this.f222641a = 23;
        Intrinsics.checkNotNullParameter(uiMapperProvider, "uiMapperProvider");
        this.f222642b = uiMapperProvider;
    }
}
