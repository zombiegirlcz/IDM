package tsk;

import android.content.Context;
import android.icu.text.MeasureFormat;
import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.data.model.Data;
import com.revolut.feature.pay_bills_taxes.impl.ui.errors.FormFieldError;
import com.revolut.feature.pay_bills_taxes.impl.ui.errors.FormServerError;
import com.revolut.feature.robo.impl.ui.screen.widgets.projection_chart.pen_contribution.PenContributionScreen;
import com.revolut.feature.robo.impl.ui.screen.widgets.projection_chart.pen_contribution.PenContributionScreenContract$InputData;
import e8h.i0;
import io.reactivex.exceptions.CompositeException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.n0;
import kotlin.text.a0;
import kotlinx.coroutines.flow.Flow;
import nkm.y;
import okhttp3.ResponseBody;
import retrofit2.HttpException;
import retrofit2.Response;
import skm.p0;
import ulm.b1;
import ulm.s1;
import wp5.e0;
import wp5.v;
import xzg.j0;
import xzg.l0;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class t implements kfm.o, zp0.c, wu.g, kfm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f274169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f274170b;

    public /* synthetic */ t() {
        this.f274169a = 23;
    }

    public static final List a(t tVar, Data data) {
        Collection collectionValues;
        Map map = (Map) data.getContent();
        List listP0 = null;
        if (map != null && (collectionValues = map.values()) != null) {
            Collection collection = collectionValues;
            ArrayList arrayList = new ArrayList(w.t(collection, 10));
            Iterator it8 = collection.iterator();
            while (it8.hasNext()) {
                List<cel.m> listA = ((cel.n) it8.next()).a();
                ArrayList arrayList2 = new ArrayList(w.t(listA, 10));
                for (cel.m mVar : listA) {
                    Integer numValueOf = Integer.valueOf(mVar.f23505b);
                    cel.k kVar = mVar.f23506c;
                    arrayList2.add(new Pair(numValueOf, kVar != null ? Integer.valueOf(kVar.b()) : null));
                }
                arrayList.add(arrayList2);
            }
            List listU = d0.U(w.u(arrayList));
            if (listU != null) {
                listP0 = d0.P0(listU, new s());
            }
        }
        return listP0 == null ? f0.f322471a : listP0;
    }

    public static void d(ArrayList arrayList, wu.h hVar) {
        Iterator it8 = arrayList.iterator();
        long length = 0;
        while (it8.hasNext()) {
            length += ((File) it8.next()).length();
        }
        if (length <= 104857600) {
            return;
        }
        Iterator it9 = arrayList.iterator();
        n0 n0Var = new n0();
        n0Var.f186428a = length;
        while (n0Var.f186428a > 104857600 && it9.hasNext()) {
            File file = (File) it9.next();
            try {
                long length2 = file.length();
                if (file.delete()) {
                    hVar.f300045a += length2;
                    n0Var.f186428a -= length2;
                    it9.remove();
                    Unit unit = Unit.f186387a;
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void e(File file, wu.h hVar) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        nkm.g gVar = new nkm.g(y.n(lim.n.k(file, FileWalkDirection.BOTTOM_UP), new b22.j(file, 10)));
        while (gVar.hasNext()) {
            File file2 = (File) gVar.next();
            try {
                long length = file2.length();
                if (file2.delete()) {
                    hVar.f300045a += length;
                    Unit unit = Unit.f186387a;
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean f(qua.p payment) {
        Intrinsics.checkNotNullParameter(payment, "payment");
        if (payment.f249314a.f160152c != ibd.h.INTERNAL_CHARITY) {
            return false;
        }
        String str = payment.k;
        return str == null || str.length() == 0;
    }

    public static qua.p h(qua.p payment, Map charities) {
        Intrinsics.checkNotNullParameter(payment, "payment");
        Intrinsics.checkNotNullParameter(charities, "charities");
        ba6.l lVar = (ba6.l) charities.get(payment.f249318c);
        return lVar == null ? payment : qua.p.a(payment, null, null, null, null, null, lVar.f13939b, null, null, null, 0, null, -1025, 33554431);
    }

    public static CompositeClause x(tij.n nVar) {
        Integer num = nVar.f271562b;
        Clause[] elements = {num != null ? yjj.g.a(num.intValue(), Integer.valueOf(nVar.f271563c)) : null, nVar.f271561a};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), kotlin.collections.d.L(elements));
    }

    @Override // kfm.g
    public /* synthetic */ void accept(Object obj2) {
        ((fjm.j) this.f274170b).invoke(obj2);
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public /* synthetic */ Object apply(Object obj2) {
        switch (this.f274169a) {
            case 1:
                return ((t33.r) this.f274170b).invoke(obj2);
            case 6:
                return ((up5.s) this.f274170b).invoke(obj2);
            case 7:
                return ((up5.s) this.f274170b).invoke(obj2);
            case 10:
                return ((vx5.r) this.f274170b).invoke(obj2);
            case 13:
                return ((e0) this.f274170b).invoke(obj2);
            default:
                return ((wrj.p) this.f274170b).invoke(obj2);
        }
    }

    public yb.r b() {
        return new yb.r((Integer) this.f274170b);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public vjj.k c(dej.l2 r4, dej.l2 r5, kotlin.jvm.functions.Function1 r6) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f274170b
            rul.e r0 = (rul.e) r0
            java.lang.String r1 = "parcelMapper"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
            r1 = 0
            if (r4 == 0) goto L25
            com.revolut.retail.feature.esim.api.model.EsimHyperText r2 = r4.f113587a
            java.lang.String r2 = r2.f100276a
            boolean r2 = kotlin.text.d0.W(r2)
            if (r2 != 0) goto L17
            goto L18
        L17:
            r4 = r1
        L18:
            if (r4 == 0) goto L25
            int r2 = com.revolut.core.ui_kit_resources.R$attr.uikit_colorForeground
            tij.n r4 = r0.g(r4, r2, r6)
            com.revolut.core.ui_kit.models.CompositeClause r4 = x(r4)
            goto L26
        L25:
            r4 = r1
        L26:
            if (r5 == 0) goto L3f
            com.revolut.retail.feature.esim.api.model.EsimHyperText r2 = r5.f113587a
            java.lang.String r2 = r2.f100276a
            boolean r2 = kotlin.text.d0.W(r2)
            if (r2 != 0) goto L33
            goto L34
        L33:
            r5 = r1
        L34:
            if (r5 == 0) goto L3f
            r1 = 2
            tij.n r5 = rul.e.h(r0, r5, r6, r1)
            com.revolut.core.ui_kit.models.CompositeClause r1 = x(r5)
        L3f:
            vjj.k r5 = new vjj.k
            r5.<init>(r4, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tsk.t.c(dej.l2, dej.l2, kotlin.jvm.functions.Function1):vjj.k");
    }

    public Integer g(String str) {
        if (!a0.H(str, "16_", false)) {
            return null;
        }
        int iA = ((f01.a) this.f274170b).a("24_" + kotlin.text.d0.e0(str, "16_"));
        Integer numValueOf = Integer.valueOf(iA);
        if (iA != 0) {
            return numValueOf;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(tof.a3 r26, tof.t3 r27, do3.n r28, gim.c r29) {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tsk.t.i(tof.a3, tof.t3, do3.n, gim.c):java.lang.Object");
    }

    public FormServerError j(Throwable throwable) {
        Object next;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (throwable instanceof HttpException) {
            return l((HttpException) throwable);
        }
        if (throwable instanceof CompositeException) {
            List list = ((CompositeException) throwable).f163108a;
            Intrinsics.checkNotNullExpressionValue(list, "getExceptions(...)");
            Iterator it8 = list.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (((Throwable) next) instanceof HttpException) {
                    break;
                }
            }
            Throwable th10 = (Throwable) next;
            if (th10 != null) {
                return l((HttpException) th10);
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zp0.c
    public void k(String amount, String formattedValue, boolean z) {
        Intrinsics.checkNotNullParameter(amount, "extractedValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        uoc.g gVar = (uoc.g) ((PenContributionScreen) this.f274170b).X.getValue();
        gVar.getClass();
        Intrinsics.checkNotNullParameter(amount, "amount");
        w80.b bVar = gVar.f281613q;
        PenContributionScreenContract$InputData penContributionScreenContract$InputData = gVar.f281612p;
        long j2 = 100;
        gVar.x2(new uif.d(new dj0.d((bVar.b(amount, penContributionScreenContract$InputData.f85223c.f115083b.f306286a) / j2) * j2, penContributionScreenContract$InputData.f85223c.f115083b), gVar, 6));
    }

    public FormServerError l(HttpException httpException) throws IOException {
        String strString;
        vf9.d dVar;
        ResponseBody responseBodyErrorBody;
        Response<?> response = httpException.response();
        if (response == null || (responseBodyErrorBody = response.errorBody()) == null) {
            strString = null;
        } else {
            mmm.h hVarG = responseBodyErrorBody.source().C5().clone();
            s1 s1Var = ResponseBody.Companion;
            b1 b1VarContentType = responseBodyErrorBody.contentType();
            long jContentLength = responseBodyErrorBody.contentLength();
            s1Var.getClass();
            strString = s1.b(hVarG, b1VarContentType, jContentLength).string();
        }
        if (strString != null) {
            try {
                dVar = (vf9.d) ((kg.o) this.f274170b).c(strString, vf9.d.class);
            } catch (Exception e) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                dVar = null;
            }
        } else {
            dVar = null;
        }
        if (dVar == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        if (dVar.getErrors() == null) {
            return null;
        }
        int iA = dVar.getCode();
        String strC = dVar.getMessage();
        List<vf9.c> listB = dVar.getErrors();
        ArrayList arrayList = new ArrayList(w.t(listB, 10));
        for (vf9.c cVar : listB) {
            Intrinsics.checkNotNullParameter(cVar, "<this>");
            String strA = cVar.getCode();
            String strB = cVar.getMessage();
            if (strB == null) {
                strB = "";
            }
            arrayList.add(new FormFieldError(strA, strB, cVar.getPath()));
        }
        return new FormServerError(iA, strC, arrayList);
    }

    public String m(String username) {
        Intrinsics.checkNotNullParameter(username, "username");
        return kotlin.text.f0.U0(16, ((bm0.a) this.f274170b).b(username));
    }

    public Object n(String str, yr.c cVar) throws Throwable {
        lr.e eVar = (lr.e) this.f274170b;
        eVar.getClass();
        p0 p0Var = p0.f264001a;
        Object objJ = skm.e0.J(elm.f.f127540b, new lr.d(eVar, str, null, 0), cVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }

    public vkm.d o(String agentId, u2f.j product) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(agentId, "agentId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        k1f.d dVar = (k1f.d) this.f274170b;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(agentId, "agentId");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return rd0.e.b(dVar.e.e(new i1f.a(agentId, product), loadingStrategy));
    }

    public vkm.d p(u2f.j product) {
        Intrinsics.checkNotNullParameter(product, "product");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        k1f.d dVar = (k1f.d) this.f274170b;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return rd0.e.b(dVar.d.e(product, loadingStrategy));
    }

    public efm.r q() {
        efm.r map = ue0.e.p(aa6.c.a((aa6.c) this.f274170b, false), h0.f322473a).map(new yta.c(1, new ysk.a(9)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return nim.a.w(map, new ysk.a(10));
    }

    public efm.r r(String ref2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        qrk.a aVar = (qrk.a) this.f274170b;
        i.Companion.getClass();
        vkm.d dVarA = qrk.a.a(aVar, ref2, b.f274144b, 4, 4);
        h0 h0Var = h0.f322473a;
        return rd0.e.c(new tse.c(new Flow[]{rd0.e.n(dVarA, h0Var), rd0.e.n(qrk.a.a(aVar, ref2, b.f274145c, 4, 4), h0Var)}, this, 3), kotlin.coroutines.g.f186406a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0039 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public vkm.y s(java.util.List r9) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tsk.t.s(java.util.List):vkm.y");
    }

    public efm.r t(j0 assetType, l0 timeSpan, boolean z) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        i0 i0Var = (i0) this.f274170b;
        e8h.e0 params = new e8h.e0(assetType, timeSpan);
        Intrinsics.checkNotNullParameter(params, "params");
        return i0Var.d.f(params, z);
    }

    public pfm.r u(j0 assetType, xzg.n0 filter) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(filter, "filter");
        i0 i0Var = (i0) this.f274170b;
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(filter, "filter");
        pfm.h hVar = new pfm.h(new a09.a0(i0Var, 7, assetType, filter), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return te0.w.g0(hVar);
    }

    public void v(Integer num) {
        this.f274170b = num;
    }

    public wu.f w(wu.b config) {
        Intrinsics.checkNotNullParameter(config, "config");
        wu.h hVar = new wu.h(0);
        try {
            File cacheDir = ((sz.b) this.f274170b).f266712a.getCacheDir();
            Intrinsics.checkNotNullExpressionValue(cacheDir, "getCacheDir(...)");
            e(cacheDir, hVar);
            Intrinsics.checkNotNullParameter(cacheDir, "<this>");
            ArrayList arrayListK = y.K(y.F(y.n(y.n(lim.n.k(cacheDir, FileWalkDirection.BOTTOM_UP), new wsg.a(24)), new v(config, cacheDir, 22)), new wu.i()));
            config.getClass();
            d(arrayListK, hVar);
            e(cacheDir, hVar);
            long j2 = hVar.f300045a;
            return j2 == 0 ? wu.c.f300042a : new wu.d(j2);
        } catch (Throwable th10) {
            return new wu.e(th10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0096, code lost:
    
        if (r1 == r5) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object y(u2f.j r18, java.lang.String r19, gim.c r20) throws java.lang.Throwable {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            boolean r4 = r3 instanceof u1f.a
            if (r4 == 0) goto L1b
            r4 = r3
            u1f.a r4 = (u1f.a) r4
            int r5 = r4.f276402y
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1b
            int r5 = r5 - r6
            r4.f276402y = r5
            goto L20
        L1b:
            u1f.a r4 = new u1f.a
            r4.<init>(r0, r3)
        L20:
            java.lang.Object r3 = r4.f276400w
            fim.a r5 = fim.a.COROUTINE_SUSPENDED
            int r6 = r4.f276402y
            r7 = 2
            r8 = 1
            r9 = 0
            if (r6 == 0) goto L45
            if (r6 == r8) goto L3b
            if (r6 != r7) goto L33
            yhm.o.b(r3)
            goto L99
        L33:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3b:
            java.lang.String r1 = r4.v
            u2f.j r2 = r4.u
            yhm.o.b(r3)
            r14 = r1
            r15 = r2
            goto L6f
        L45:
            yhm.o.b(r3)
            vkm.d r3 = r0.o(r2, r1)
            tyg.g r6 = new tyg.g
            r10 = 24
            r6.<init>(r10)
            akg.n r3 = nim.a.v(r3, r6)
            zfd.e r3 = zi0.c.w(r3)
            r6 = 3
            jhi.b r3 = mo3.a.g(r3, r9, r9, r6)
            r4.u = r1
            r4.v = r2
            r4.f276402y = r8
            java.lang.Object r3 = vkm.q.x(r3, r4)
            if (r3 != r5) goto L6d
            goto L98
        L6d:
            r15 = r1
            r14 = r2
        L6f:
            r13 = r3
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r1 = r0.f274170b
            r12 = r1
            k1f.d r12 = (k1f.d) r12
            r4.u = r9
            r4.v = r9
            r4.f276402y = r7
            r12.getClass()
            i4g.d r10 = new i4g.d
            r16 = 0
            r11 = 19
            r10.<init>(r11, r12, r13, r14, r15, r16)
            skm.p0 r1 = skm.p0.f264001a
            elm.f r1 = elm.f.f127540b
            java.lang.Object r1 = skm.e0.J(r1, r10, r4)
            if (r1 != r5) goto L94
            goto L96
        L94:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L96:
            if (r1 != r5) goto L99
        L98:
            return r5
        L99:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tsk.t.y(u2f.j, java.lang.String, gim.c):java.lang.Object");
    }

    public /* synthetic */ t(com.revolut.kompot.navigable.a aVar, int i) {
        this.f274169a = i;
        this.f274170b = aVar;
    }

    public t(fjm.j function) {
        this.f274169a = 20;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f274170b = function;
    }

    public t(t33.r function) {
        this.f274169a = 1;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f274170b = function;
    }

    public t(up5.s function) {
        this.f274169a = 6;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f274170b = function;
    }

    public t(up5.s function, byte b4) {
        this.f274169a = 7;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f274170b = function;
    }

    public t(vx5.r function) {
        this.f274169a = 10;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f274170b = function;
    }

    public t(e0 function) {
        this.f274169a = 13;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f274170b = function;
    }

    public t(wrj.p function) {
        this.f274169a = 15;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f274170b = function;
    }

    public t(bm0.a cryptoWrapper) {
        this.f274169a = 26;
        Intrinsics.checkNotNullParameter(cryptoWrapper, "cryptoWrapper");
        this.f274170b = cryptoWrapper;
    }

    public t(lr.e repository) {
        this.f274169a = 27;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f274170b = repository;
    }

    public t(lr.c networkRepository) {
        this.f274169a = 28;
        Intrinsics.checkNotNullParameter(networkRepository, "networkRepository");
        this.f274170b = networkRepository;
    }

    public t(Context context) {
        this.f274169a = 14;
        sz.b cacheAccessor = new sz.b(context, 1);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cacheAccessor, "cacheAccessor");
        this.f274170b = cacheAccessor;
    }

    public t(mm.d actionsDispatcher) {
        this.f274169a = 21;
        Intrinsics.checkNotNullParameter(actionsDispatcher, "actionsDispatcher");
        this.f274170b = actionsDispatcher;
    }

    public t(v6a.a payNowQrRepository) {
        this.f274169a = 16;
        Intrinsics.checkNotNullParameter(payNowQrRepository, "payNowQrRepository");
        this.f274170b = payNowQrRepository;
    }

    public t(MeasureFormat measureFormat) {
        this.f274169a = 3;
        Intrinsics.checkNotNullParameter(measureFormat, "measureFormat");
        this.f274170b = measureFormat;
    }

    public t(i4b.f legalEntityContextProvider, nd.l mapper) {
        this.f274169a = 22;
        Intrinsics.checkNotNullParameter(legalEntityContextProvider, "legalEntityContextProvider");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f274170b = legalEntityContextProvider;
    }

    public t(h12.h apmAreaProvider) {
        this.f274169a = 5;
        Intrinsics.checkNotNullParameter(apmAreaProvider, "apmAreaProvider");
        this.f274170b = apmAreaProvider;
    }

    public t(kg.o gson) {
        this.f274169a = 8;
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.f274170b = gson;
    }

    public t(aa6.c donationsInteractor) {
        this.f274169a = 29;
        Intrinsics.checkNotNullParameter(donationsInteractor, "donationsInteractor");
        this.f274170b = donationsInteractor;
    }

    public t(i0 repository) {
        this.f274169a = 17;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f274170b = repository;
    }

    public t(qrk.a interactor) {
        this.f274169a = 0;
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.f274170b = interactor;
    }

    public t(rul.e displayItemMapper) {
        this.f274169a = 25;
        Intrinsics.checkNotNullParameter(displayItemMapper, "displayItemMapper");
        this.f274170b = displayItemMapper;
    }

    public t(l80.e dateProvider) {
        this.f274169a = 12;
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f274170b = dateProvider;
    }

    public t(qm.e advisedComponentsInteractor) {
        this.f274169a = 11;
        Intrinsics.checkNotNullParameter(advisedComponentsInteractor, "advisedComponentsInteractor");
        this.f274170b = advisedComponentsInteractor;
    }

    public t(k1f.d repository) {
        this.f274169a = 2;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f274170b = repository;
    }

    public t(vi9.o payLaterOverLimitTileMapper) {
        this.f274169a = 9;
        Intrinsics.checkNotNullParameter(payLaterOverLimitTileMapper, "payLaterOverLimitTileMapper");
        this.f274170b = payLaterOverLimitTileMapper;
    }

    public t(zlf.a bankTransferChargesMapper, mkf.f dataResolver) {
        this.f274169a = 18;
        Intrinsics.checkNotNullParameter(bankTransferChargesMapper, "bankTransferChargesMapper");
        Intrinsics.checkNotNullParameter(dataResolver, "dataResolver");
        this.f274170b = dataResolver;
    }

    public t(f01.a uiKitResources) {
        this.f274169a = 24;
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f274170b = uiKitResources;
    }
}
