package k18;

import ahe.m0;
import akg.n;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.ParcelableSpan;
import android.text.Spanned;
import android.text.TextPaint;
import bbg.c0;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.onfido.android.sdk.capture.common.data.ThemeDataSource;
import com.onfido.android.sdk.capture.internal.navigation.Navigator;
import com.onfido.javax.inject.Provider;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.model.faq.PigeonNode;
import com.revolut.data.model.Data;
import com.revolut.feature.alipay.impl.data.network.AlipayPlusQrCodeService;
import com.revolut.feature.robo.impl.data.network.RoboAccountService;
import com.revolut.feature.shared.help_centre.impl.utils.FaqHiddenException;
import com.revolut.feature.shared.help_centre.impl.utils.FaqNotFoundException;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.trade_rev_points.api.TradeRevPointsApi$Toggles$TrainsPoints;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.MarketOrderActivity;
import com.revolut.kompot.bridge.impl.rootflow.KompotFlowContract$Configuration;
import com.revolut.shared.feature.wealth.domain.impl.data.network.PerformanceParametersService;
import efm.r;
import eh9.j;
import fg0.k;
import fgm.p;
import gsi.g;
import hg0.m;
import igm.o;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import ip0.i0;
import ip0.l0;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipFile;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.coroutines.flow.Flow;
import l8.w;
import nl.q0;
import nl.v0;
import ns0.t;
import o76.d;
import pkf.x;
import rnb.v;
import sl.f;
import uc.e;
import uc.h;
import vc.s;
import vkm.q;
import vkm.v1;
import vkm.y;
import w4l.i;
import wf0.k0;
import wkm.l;
import zh9.u0;
import zhm.d0;
import zhm.h0;
import zhm.r0;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements w, zp0.c, o, el.b, fgm.b, p, e, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f180140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f180141c;
    public Object d;

    public /* synthetic */ c(int i, Serializable serializable, Object obj2, Object obj3) {
        this.f180139a = i;
        this.d = obj2;
        this.f180140b = serializable;
        this.f180141c = obj3;
    }

    public static Flow D(c cVar) {
        i loadingStrategy = i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        if (!((d) cVar.d).a()) {
            return new go.g(new Data(null, null, false, 7, null), 2);
        }
        s76.b bVar = (s76.b) cVar.f180140b;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return qe0.o.a(bVar.f, Unit.f186387a, 3L, loadingStrategy, false, null, 24);
    }

    public static l G(c cVar) {
        return q.Q(rd0.e.b(xv5.c.b((xv5.c) cVar.f180141c)), new q16.b(null, cVar, false, 0));
    }

    public static PigeonNode J(String str, List list) {
        Iterator it8 = list.iterator();
        PigeonNode pigeonNodeJ = null;
        while (it8.hasNext()) {
            PigeonNode pigeonNode = (PigeonNode) it8.next();
            if (Intrinsics.f(pigeonNode.f51434a, str)) {
                return pigeonNode;
            }
            pigeonNodeJ = J(str, pigeonNode.f51438h);
            if (pigeonNodeJ != null) {
                break;
            }
        }
        return pigeonNodeJ;
    }

    public static final PigeonNode b(String key, List list, boolean z) throws FaqHiddenException, FaqNotFoundException {
        PigeonNode pigeonNodeJ = J(key, list);
        if (pigeonNodeJ == null) {
            throw new FaqNotFoundException(key);
        }
        List list2 = pigeonNodeJ.f51438h;
        if (pigeonNodeJ.d && z) {
            Intrinsics.checkNotNullParameter(key, "key");
            throw new FaqHiddenException(p.a.p("FAQ with '", key, "' key is hidden"));
        }
        if (!z || list2.isEmpty()) {
            return pigeonNodeJ;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list2) {
            if (!((PigeonNode) obj2).d) {
                arrayList.add(obj2);
            }
        }
        return PigeonNode.a(pigeonNodeJ, arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(k18.c r5, java.util.List r6, java.lang.String r7, gim.c r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k18.c.c(k18.c, java.util.List, java.lang.String, gim.c):java.lang.Object");
    }

    public static List s(String str, List list) {
        Iterator it8 = list.iterator();
        List listF0 = null;
        while (it8.hasNext()) {
            PigeonNode pigeonNode = (PigeonNode) it8.next();
            if (Intrinsics.f(pigeonNode.f51434a, str)) {
                listF0 = u.c(pigeonNode);
            } else {
                List listS = m7d.a.f203389b[pigeonNode.f51436c.ordinal()] == 1 ? s(str, pigeonNode.f51438h) : null;
                listF0 = listS != null ? d0.F0(pigeonNode, listS) : null;
            }
            if (listF0 != null) {
                break;
            }
        }
        return listF0;
    }

    public l A(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int i = m7d.a.f203388a[k0.Pigeon.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return ((m) ((hg0.d) this.f180140b)).d(key);
            }
            throw new NoWhenBranchMatchedException();
        }
        fg0.e eVar = (fg0.e) this.f180141c;
        Intrinsics.checkNotNullParameter(key, "key");
        Continuation continuation = null;
        return q.Q(new v1(new etj.l(eVar, continuation, 16)), new j(continuation, eVar, key, 6));
    }

    @Override // l8.w
    public Bitmap B(BitmapFactory.Options options) {
        return BitmapFactory.decodeStream(new y8.a(y8.b.c((ByteBuffer) this.f180140b)), null, options);
    }

    public n C(boolean z, boolean z3) {
        k kVar = (k) this.d;
        r rVarX = kVar.f134878b.b().x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        return nim.a.v(q.Q(rd0.e.b(rVarX), new c0((Continuation) null, kVar, z, 2)), new lph.c(z3, 3));
    }

    @Override // l8.w
    public ImageHeaderParser$ImageType E() {
        return hb9.b.r((List) this.f180141c, y8.b.c((ByteBuffer) this.f180140b));
    }

    public l F() {
        return q.Q(rd0.e.b(xv5.c.b((xv5.c) this.f180141c)), new x(null, this, 18));
    }

    public void H() {
        Stack stack = (Stack) this.d;
        if (stack.isEmpty()) {
            return;
        }
        Object objPop = stack.pop();
        Intrinsics.checkNotNullExpressionValue(objPop, "pop(...)");
        Iterator it8 = ((Iterable) objPop).iterator();
        while (it8.hasNext()) {
            ((t) it8.next()).b((TextPaint) this.f180140b);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object I(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kk1.b
            if (r0 == 0) goto L13
            r0 = r6
            kk1.b r0 = (kk1.b) r0
            int r1 = r0.f184500w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f184500w = r1
            goto L18
        L13:
            kk1.b r0 = new kk1.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f184500w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L44
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            java.lang.Object r6 = r4.f180140b
            com.revolut.feature.alipay.impl.data.network.AlipayPlusQrCodeService r6 = (com.revolut.feature.alipay.impl.data.network.AlipayPlusQrCodeService) r6
            jk1.f r2 = new jk1.f
            r2.<init>(r5)
            r0.f184500w = r3
            java.lang.Object r6 = r6.scanQrCode(r2, r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            jk1.g r6 = (jk1.g) r6
            java.lang.String r5 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r5)
            java.lang.String r5 = r6.getAction()
            java.lang.String r0 = "AUTHORISATION"
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r5, r0)
            if (r0 == 0) goto L6b
            k02.e r0 = r6.getAuthorisation()
            if (r0 == 0) goto L6b
            ik1.a r5 = new ik1.a
            k02.e r6 = r6.getAuthorisation()
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary r6 = l02.c.a(r6)
            r5.<init>(r6)
            return r5
        L6b:
            java.lang.String r0 = "REDIRECTION"
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r0)
            if (r5 == 0) goto L8f
            java.lang.String r5 = r6.getRedirectUrl()
            if (r5 == 0) goto L8f
            ik1.c r5 = new ik1.c
            java.lang.String r0 = r6.getRedirectUrl()
            java.lang.String r1 = r6.getUserAgent()
            java.lang.String r2 = r6.getAcDecodeConfig()
            java.lang.String r6 = r6.getPaymentIntentId()
            r5.<init>(r0, r1, r2, r6)
            return r5
        L8f:
            ik1.b r5 = ik1.b.f161868a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: k18.c.I(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object K(gim.c r6, java.lang.String r7, boolean r8) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof m7d.h
            if (r0 == 0) goto L13
            r0 = r6
            m7d.h r0 = (m7d.h) r0
            int r1 = r0.f203398w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f203398w = r1
            goto L18
        L13:
            m7d.h r0 = new m7d.h
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f203398w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            yhm.o.b(r6)     // Catch: java.lang.Exception -> L28
            goto L7e
        L28:
            r6 = move-exception
            goto L81
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r6)
            wf0.k0 r6 = wf0.k0.Pigeon     // Catch: java.lang.Exception -> L28
            int[] r2 = m7d.a.f203388a     // Catch: java.lang.Exception -> L28
            int r6 = r6.ordinal()     // Catch: java.lang.Exception -> L28
            r6 = r2[r6]     // Catch: java.lang.Exception -> L28
            if (r6 == r4) goto L5c
            r2 = 2
            if (r6 != r2) goto L56
            java.lang.Object r6 = r5.f180140b     // Catch: java.lang.Exception -> L28
            hg0.d r6 = (hg0.d) r6     // Catch: java.lang.Exception -> L28
            hg0.m r6 = (hg0.m) r6     // Catch: java.lang.Exception -> L28
            vkm.y r6 = r6.b(r7, r8)     // Catch: java.lang.Exception -> L28
            ahe.m0 r7 = new ahe.m0     // Catch: java.lang.Exception -> L28
            r8 = 10
            r7.<init>(r6, r8)     // Catch: java.lang.Exception -> L28
            goto L6a
        L56:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Exception -> L28
            r6.<init>()     // Catch: java.lang.Exception -> L28
            throw r6     // Catch: java.lang.Exception -> L28
        L5c:
            wkm.l r6 = r5.A(r7)     // Catch: java.lang.Exception -> L28
            l3d.f r7 = new l3d.f     // Catch: java.lang.Exception -> L28
            r2 = 5
            r7.<init>(r5, r8, r2)     // Catch: java.lang.Exception -> L28
            kotlinx.coroutines.flow.Flow r7 = boh.f.e(r6, r7)     // Catch: java.lang.Exception -> L28
        L6a:
            m56.g r6 = new m56.g     // Catch: java.lang.Exception -> L28
            r8 = 11
            r6.<init>(r8)     // Catch: java.lang.Exception -> L28
            jhi.b r6 = mo3.a.g(r7, r3, r6, r4)     // Catch: java.lang.Exception -> L28
            r0.f203398w = r4     // Catch: java.lang.Exception -> L28
            java.lang.Object r6 = vkm.q.z(r6, r0)     // Catch: java.lang.Exception -> L28
            if (r6 != r1) goto L7e
            return r1
        L7e:
            com.revolut.core.model.faq.FaqNodeBase r6 = (com.revolut.core.model.faq.FaqNodeBase) r6     // Catch: java.lang.Exception -> L28
            return r6
        L81:
            zhm.h0 r7 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r8 = rd0.d.f253311a
            rd0.c r8 = rd0.c.ERROR
            rd0.d.a(r8, r3, r3, r6, r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: k18.c.K(gim.c, java.lang.String, boolean):java.lang.Object");
    }

    @Override // uc.e
    public void a(ZipFile zipFile, HashSet hashSet) {
        HashSet hashSet2 = (HashSet) this.f180140b;
        h hVar = (h) this.d;
        uc.b bVar = (uc.b) this.f180141c;
        HashSet hashSet3 = new HashSet();
        uc.d dVar = new uc.d();
        dVar.f278952a = hashSet3;
        dVar.f278953b = bVar;
        dVar.f278954c = zipFile;
        hVar.c(bVar, hashSet, dVar);
        hashSet2.addAll(hashSet3);
    }

    @Override // igm.o
    public Object apply(Object obj2) {
        Pair result = (Pair) obj2;
        Intrinsics.checkNotNullParameter(result, "result");
        return q0.a((q0) this.f180140b, (sl.q) this.f180141c, (Observable) this.d, result);
    }

    @Override // gsi.g
    public gsi.h build() {
        s.h((xoi.d) this.f180141c, fsi.g.class);
        s.h((KompotFlowContract$Configuration) this.d, KompotFlowContract$Configuration.class);
        return new uhi.b((uhi.a) this.f180140b, (xoi.d) this.f180141c, (KompotFlowContract$Configuration) this.d);
    }

    public void d(CharSequence spannable, int i, int i2) {
        Stack stack = (Stack) this.d;
        Intrinsics.checkNotNullParameter(spannable, "spannable");
        if (spannable instanceof Spanned) {
            stack.push(new Stack());
            Object[] spans = ((Spanned) spannable).getSpans(i, i2, ParcelableSpan.class);
            for (Object obj2 : spans) {
                ParcelableSpan parcelableSpan = (ParcelableSpan) obj2;
                t tVar = (t) ((HashMap) this.f180141c).get(o0.f186429a.b(parcelableSpan.getClass()));
                if (tVar != null) {
                    tVar.a(parcelableSpan, (TextPaint) this.f180140b);
                    if (!stack.isEmpty()) {
                        ((Stack) stack.peek()).push(tVar);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
    
        if (r1.d(r15, false, r2) == r3) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(java.util.List r14, java.lang.String r15, int r16, gim.c r17) {
        /*
            r13 = this;
            r0 = r17
            java.lang.Object r1 = r13.f180140b
            x4l.c r1 = (x4l.c) r1
            boolean r2 = r0 instanceof k18.b
            if (r2 == 0) goto L19
            r2 = r0
            k18.b r2 = (k18.b) r2
            int r3 = r2.f180138y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L19
            int r3 = r3 - r4
            r2.f180138y = r3
            goto L1e
        L19:
            k18.b r2 = new k18.b
            r2.<init>(r13, r0)
        L1e:
            java.lang.Object r0 = r2.f180136w
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f180138y
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L40
            if (r4 == r6) goto L38
            if (r4 != r5) goto L30
            yhm.o.b(r0)
            goto L91
        L30:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L38:
            int r14 = r2.v
            j18.o r15 = r2.u
            yhm.o.b(r0)
            goto L82
        L40:
            yhm.o.b(r0)
            zhm.f0 r8 = zhm.f0.f322471a
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.ArrayList r11 = new java.util.ArrayList
            r0 = 10
            int r0 = zhm.w.t(r14, r0)
            r11.<init>(r0)
            java.util.Iterator r14 = r14.iterator()
        L56:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L6a
            java.lang.Object r0 = r14.next()
            x08.c r0 = (x08.c) r0
            j18.a r0 = n14.k.E(r0)
            r11.add(r0)
            goto L56
        L6a:
            j18.o r7 = new j18.o
            r10 = 0
            r12 = r15
            r9 = r16
            r7.<init>(r8, r9, r10, r11, r12)
            r2.u = r7
            r2.v = r9
            r2.f180138y = r6
            java.lang.Object r14 = r1.e(r7, r2)
            if (r14 != r3) goto L80
            goto L90
        L80:
            r15 = r7
            r14 = r9
        L82:
            r0 = 0
            r2.u = r0
            r2.v = r14
            r2.f180138y = r5
            r14 = 0
            java.lang.Object r14 = r1.d(r15, r14, r2)
            if (r14 != r3) goto L91
        L90:
            return r3
        L91:
            kotlin.Unit r14 = kotlin.Unit.f186387a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: k18.c.e(java.util.List, java.lang.String, int, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b0, code lost:
    
        if (r1.d(r15, false, r2) == r3) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(java.util.List r14, java.util.Set r15, int r16, gim.c r17) {
        /*
            r13 = this;
            r0 = r17
            java.lang.Object r1 = r13.f180140b
            x4l.c r1 = (x4l.c) r1
            boolean r2 = r0 instanceof k18.a
            if (r2 == 0) goto L19
            r2 = r0
            k18.a r2 = (k18.a) r2
            int r3 = r2.f180135y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L19
            int r3 = r3 - r4
            r2.f180135y = r3
            goto L1e
        L19:
            k18.a r2 = new k18.a
            r2.<init>(r13, r0)
        L1e:
            java.lang.Object r0 = r2.f180133w
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f180135y
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L41
            if (r4 == r6) goto L39
            if (r4 != r5) goto L31
            yhm.o.b(r0)
            goto Lb3
        L31:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L39:
            int r14 = r2.v
            j18.o r15 = r2.u
            yhm.o.b(r0)
            goto La4
        L41:
            yhm.o.b(r0)
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.ArrayList r8 = new java.util.ArrayList
            r0 = 10
            int r4 = zhm.w.t(r15, r0)
            r8.<init>(r4)
            java.util.Iterator r15 = r15.iterator()
        L55:
            boolean r4 = r15.hasNext()
            if (r4 == 0) goto L69
            java.lang.Object r4 = r15.next()
            tdh.a r4 = (tdh.a) r4
            l2l.a r4 = oc.c.A(r4)
            r8.add(r4)
            goto L55
        L69:
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.ArrayList r11 = new java.util.ArrayList
            int r15 = zhm.w.t(r14, r0)
            r11.<init>(r15)
            java.util.Iterator r14 = r14.iterator()
        L78:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L8c
            java.lang.Object r15 = r14.next()
            x08.c r15 = (x08.c) r15
            j18.a r15 = n14.k.E(r15)
            r11.add(r15)
            goto L78
        L8c:
            j18.o r7 = new j18.o
            r10 = 0
            r12 = 0
            r9 = r16
            r7.<init>(r8, r9, r10, r11, r12)
            r2.u = r7
            r2.v = r9
            r2.f180135y = r6
            java.lang.Object r14 = r1.e(r7, r2)
            if (r14 != r3) goto La2
            goto Lb2
        La2:
            r15 = r7
            r14 = r9
        La4:
            r0 = 0
            r2.u = r0
            r2.v = r14
            r2.f180135y = r5
            r14 = 0
            java.lang.Object r14 = r1.d(r15, r14, r2)
            if (r14 != r3) goto Lb3
        Lb2:
            return r3
        Lb3:
            kotlin.Unit r14 = kotlin.Unit.f186387a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: k18.c.g(java.util.List, java.util.Set, int, gim.c):java.lang.Object");
    }

    @Override // com.onfido.javax.inject.Provider
    public Object get() {
        return new v0((Navigator) ((Provider) this.f180140b).get(), (f) ((Provider) this.f180141c).get(), (ThemeDataSource) ((Provider) this.d).get());
    }

    @Override // gsi.g
    public Object h(fsi.g gVar) {
        this.f180141c = (xoi.d) gVar;
        return this;
    }

    @Override // l8.w
    public void i() {
    }

    public void j(KompotFlowContract$Configuration kompotFlowContract$Configuration) {
        this.d = kompotFlowContract$Configuration;
    }

    @Override // zp0.c
    public void k(String extractedValue, String formattedValue, boolean z) {
        MarketOrderActivity marketOrderActivity = (MarketOrderActivity) this.d;
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        nqi.a aVar = new nqi.a(formattedValue, z, (i0) this.f180140b);
        int i = m1i.d.f201519a[((l0) this.f180141c).ordinal()];
        if (i == 1) {
            marketOrderActivity.C0.onNext(aVar);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            marketOrderActivity.D0.onNext(aVar);
        }
    }

    public rga.i l(aii.o eventsDispatcher, wn.a adsTrackingControllerModelExtension) {
        Intrinsics.checkNotNullParameter(eventsDispatcher, "eventsDispatcher");
        Intrinsics.checkNotNullParameter(adsTrackingControllerModelExtension, "adsTrackingControllerModelExtension");
        return new rga.i(new prl.e((p56.a) this.f180140b, eventsDispatcher, (gte.a) this.f180141c, (wli.x) this.d), adsTrackingControllerModelExtension);
    }

    public t5d.c m() {
        gte.a aVar = (gte.a) this.f180140b;
        ib7.j jVar = (ib7.j) this.d;
        jpc.e eVar = (jpc.e) this.f180141c;
        return new t5d.c(aVar, jVar, new t5d.e(r0.k(new Pair("instrument", new odh.c(((kbb.c) eVar.f177256b).s(), (kdh.b) eVar.d)), new Pair("commodity", new ndh.c((z5j.d) eVar.f177257c)))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
    
        if (skm.e0.G(r9, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(java.lang.String r8, gim.c r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof on8.b
            if (r0 == 0) goto L13
            r0 = r9
            on8.b r0 = (on8.b) r0
            int r1 = r0.f226917x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f226917x = r1
            goto L18
        L13:
            on8.b r0 = new on8.b
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f226917x
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r9)
            goto L6c
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            java.lang.String r8 = r0.u
            yhm.o.b(r9)
            goto L5a
        L39:
            yhm.o.b(r9)
            java.lang.Object r9 = r7.f180140b
            un8.k r9 = (un8.k) r9
            r0.u = r8
            r0.f226917x = r4
            skm.p0 r2 = skm.p0.f264001a
            elm.f r2 = elm.f.f127540b
            un8.j r4 = new un8.j
            r6 = 0
            r4.<init>(r9, r8, r5, r6)
            java.lang.Object r9 = skm.e0.J(r2, r4, r0)
            if (r9 != r1) goto L55
            goto L57
        L55:
            kotlin.Unit r9 = kotlin.Unit.f186387a
        L57:
            if (r9 != r1) goto L5a
            goto L6b
        L5a:
            o4a.b r9 = new o4a.b
            r2 = 9
            r9.<init>(r7, r8, r5, r2)
            r0.u = r5
            r0.f226917x = r3
            java.lang.Object r8 = skm.e0.G(r9, r0)
            if (r8 != r1) goto L6c
        L6b:
            return r1
        L6c:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: k18.c.n(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object o(gim.c r10) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k18.c.o(gim.c):java.lang.Object");
    }

    @Override // fgm.b
    public void onComplete() {
        if (((AtomicBoolean) this.f180141c).compareAndSet(false, true)) {
            ((CompositeDisposable) this.f180140b).dispose();
            ((fgm.b) this.d).onComplete();
        }
    }

    @Override // fgm.b, efm.f0
    public void onError(Throwable th10) {
        switch (this.f180139a) {
            case 13:
                if (!((AtomicBoolean) this.f180141c).compareAndSet(false, true)) {
                    jb3.l.v(th10);
                } else {
                    ((CompositeDisposable) this.f180140b).dispose();
                    ((fgm.b) this.d).onError(th10);
                }
                break;
            default:
                ggm.b bVar = (ggm.b) this.f180140b;
                tgm.c cVar = (tgm.c) this.d;
                jgm.b.c(bVar, cVar.d.d(new r8.d(this, th10, 10), 0L, cVar.f271205c));
                break;
        }
    }

    @Override // fgm.b
    public void onSubscribe(Disposable disposable) {
        switch (this.f180139a) {
            case 13:
                ((CompositeDisposable) this.f180140b).a(disposable);
                break;
            default:
                ggm.b bVar = (ggm.b) this.f180140b;
                bVar.getClass();
                jgm.b.c(bVar, disposable);
                break;
        }
    }

    @Override // fgm.p
    public void onSuccess(Object obj2) {
        ggm.b bVar = (ggm.b) this.f180140b;
        tgm.c cVar = (tgm.c) this.d;
        jgm.b.c(bVar, cVar.d.d(new r8.d(this, obj2, 11), cVar.f271204b, cVar.f271205c));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p(java.lang.String r9, gim.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof m7d.b
            if (r0 == 0) goto L13
            r0 = r10
            m7d.b r0 = (m7d.b) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            m7d.b r0 = new m7d.b
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f203391x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 2
            r4 = 1
            r5 = 3
            r6 = 0
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L44
            if (r2 == r3) goto L3c
            if (r2 != r5) goto L34
            java.util.List r9 = r0.f203390w
            java.util.List r9 = (java.util.List) r9
            aj0.a r0 = r0.v
            yhm.o.b(r10)
            goto L93
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            aj0.a r9 = r0.v
            java.lang.String r2 = r0.u
            yhm.o.b(r10)
            goto L7b
        L44:
            java.lang.String r9 = r0.u
            yhm.o.b(r10)
            goto L60
        L4a:
            yhm.o.b(r10)
            wkm.l r10 = r8.A(r9)
            jhi.b r10 = mo3.a.g(r10, r6, r6, r5)
            r0.u = r9
            r0.z = r4
            java.lang.Object r10 = vkm.q.z(r10, r0)
            if (r10 != r1) goto L60
            goto L8e
        L60:
            aj0.a r10 = (aj0.a) r10
            kotlinx.coroutines.flow.Flow r2 = r8.r(r9)
            jhi.b r2 = mo3.a.g(r2, r6, r6, r5)
            r0.u = r9
            r0.v = r10
            r0.z = r3
            java.lang.Object r2 = vkm.q.z(r2, r0)
            if (r2 != r1) goto L77
            goto L8e
        L77:
            r7 = r2
            r2 = r9
            r9 = r10
            r10 = r7
        L7b:
            java.util.List r10 = (java.util.List) r10
            r0.u = r6
            r0.v = r9
            r3 = r10
            java.util.List r3 = (java.util.List) r3
            r0.f203390w = r3
            r0.z = r5
            java.lang.Object r0 = r8.t(r2, r0)
            if (r0 != r1) goto L8f
        L8e:
            return r1
        L8f:
            r7 = r0
            r0 = r9
            r9 = r10
            r10 = r7
        L93:
            java.util.List r10 = (java.util.List) r10
            boolean r1 = r0 instanceof aj0.m0
            if (r1 == 0) goto La2
            aj0.m0 r0 = (aj0.m0) r0
            aj0.j r0 = r0.e
            if (r0 == 0) goto Lad
            java.lang.String r6 = r0.f5358a
            goto Lad
        La2:
            boolean r1 = r0 instanceof aj0.c
            if (r1 == 0) goto Lab
            aj0.c r0 = (aj0.c) r0
            java.lang.String r6 = r0.f5343g
            goto Lad
        Lab:
            if (r0 != 0) goto Lb3
        Lad:
            n7d.a r0 = new n7d.a
            r0.<init>(r6, r9, r10)
            return r0
        Lb3:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: k18.c.p(java.lang.String, gim.c):java.lang.Object");
    }

    @Override // l8.w
    public int q() {
        List list = (List) this.f180141c;
        ByteBuffer byteBufferC = y8.b.c((ByteBuffer) this.f180140b);
        f8.f fVar = (f8.f) this.d;
        if (byteBufferC != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                try {
                    int iC = ((c8.f) list.get(i)).c(byteBufferC, fVar);
                    if (iC != -1) {
                        return iC;
                    }
                } finally {
                }
            }
        }
        return -1;
    }

    public Flow r(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int i = m7d.a.f203388a[k0.Pigeon.ordinal()];
        if (i == 1) {
            return nim.a.v(C(false, false), new lu6.p(13, key, this));
        }
        if (i == 2) {
            return new m0(((m) ((hg0.d) this.f180140b)).c(key), 8);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object t(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof m7d.d
            if (r0 == 0) goto L13
            r0 = r7
            m7d.d r0 = (m7d.d) r0
            int r1 = r0.f203394w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f203394w = r1
            goto L18
        L13:
            m7d.d r0 = new m7d.d
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f203394w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r7)
            goto L5a
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            yhm.o.b(r7)
            wf0.k0 r7 = wf0.k0.Pigeon
            int[] r2 = m7d.a.f203388a
            int r7 = r7.ordinal()
            r7 = r2[r7]
            if (r7 == r3) goto L67
            r2 = 2
            if (r7 != r2) goto L61
            java.lang.Object r7 = r5.f180140b
            hg0.d r7 = (hg0.d) r7
            hg0.m r7 = (hg0.m) r7
            wkm.l r6 = r7.d(r6)
            r7 = 3
            jhi.b r6 = mo3.a.g(r6, r4, r4, r7)
            r0.f203394w = r3
            java.lang.Object r7 = vkm.q.z(r6, r0)
            if (r7 != r1) goto L5a
            return r1
        L5a:
            aj0.c r7 = (aj0.c) r7
            if (r7 == 0) goto L67
            java.util.List r6 = r7.f5344h
            return r6
        L61:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L67:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k18.c.t(java.lang.String, gim.c):java.lang.Object");
    }

    public l u(SavingsAccountDetails savingsAccountDetails) {
        cob.e eVar = (cob.e) this.f180140b;
        Intrinsics.checkNotNullParameter(savingsAccountDetails, "savingsAccountDetails");
        Intrinsics.checkNotNullParameter(savingsAccountDetails, "savingsAccountDetails");
        v vVar = (v) eVar.f25523a;
        n nVarF = vVar.f(savingsAccountDetails.f86460a.f234881a);
        pcd.s sVar = savingsAccountDetails.f86460a;
        Continuation continuation = null;
        return q.Q(nim.a.v(nim.a.u(new a2c.c(2, 24, continuation), u0.m(u0.i(nVarF, vVar.d(sVar.f234881a), sVar.f234889n == pcd.b.PERSONAL_JOINT ? new amh.w(k38.c.a(eVar.f25525c, null, null, 3), 2) : zi0.c.i(AccountId.Personal.f51414a)), zi0.c.i(new ProductAccountId(sVar.f234881a, null)))), new cob.a(eVar, 0)), new cob.c(continuation, eVar, 1));
    }

    public boolean v() {
        return ((jte.d) ((gte.a) this.f180140b)).c(TradeRevPointsApi$Toggles$TrainsPoints.f91106c) && ((jla.h) this.f180141c).d("TRAINS_POINTS", null) == bla.c.ENABLED && ((nyb.b) ((eub.a) this.d)).f();
    }

    public Flow w(boolean z) {
        int i = m7d.a.f203388a[k0.Pigeon.ordinal()];
        boolean z3 = true;
        if (i == 1) {
            return C(z, true);
        }
        if (i == 2) {
            return new f3d.g(((eg0.h) ((m) ((hg0.d) this.f180140b)).f152059a).d(z), z3, 1);
        }
        throw new NoWhenBranchMatchedException();
    }

    public l x(String accountId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return q.Q(rd0.e.b(xv5.c.b((xv5.c) this.f180141c)), new q16.a((Continuation) null, this, accountId, loadingStrategy));
    }

    public y y() {
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Continuation continuation = null;
        return new y(q.Q(bla.b.b((jla.h) this.f180141c, ne8.a.f214420c.a()), new mk0.f(continuation, this, 24)), new im2.b(3, 22, continuation));
    }

    public Flow z(String key, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        int i = m7d.a.f203388a[k0.Pigeon.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return new m0(((m) ((hg0.d) this.f180140b)).b(key, z), 9);
            }
            throw new NoWhenBranchMatchedException();
        }
        return rd0.e.e(new fxb.f(C(false, z), this, key, z, 1), h0.f322473a, new a9j.m(this, z, key, (Continuation) null));
    }

    public /* synthetic */ c(Object obj2, int i, Object obj3, Object obj4) {
        this.f180139a = i;
        this.f180140b = obj2;
        this.f180141c = obj3;
        this.d = obj4;
    }

    public c(gte.a featureToggleInteractor, jpc.e swipeAssetTradeActionsNavigationHandlersFactory, ib7.j swipeTradeActionsStateProvider) {
        this.f180139a = 23;
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(swipeAssetTradeActionsNavigationHandlersFactory, "swipeAssetTradeActionsNavigationHandlersFactory");
        Intrinsics.checkNotNullParameter(swipeTradeActionsStateProvider, "swipeTradeActionsStateProvider");
        this.f180140b = featureToggleInteractor;
        this.f180141c = swipeAssetTradeActionsNavigationHandlersFactory;
        this.d = swipeTradeActionsStateProvider;
    }

    public c(eub.a revPointsAvailabilityInteractor, gte.a featureToggleInteractor, jla.h productCatalogueInteractor) {
        this.f180139a = 27;
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(revPointsAvailabilityInteractor, "revPointsAvailabilityInteractor");
        this.f180140b = featureToggleInteractor;
        this.f180141c = productCatalogueInteractor;
        this.d = revPointsAvailabilityInteractor;
    }

    public c(AlipayPlusQrCodeService service, dm0.d deviceIdProvider, fkg.a countryProvider, l80.e dateProvider) {
        this.f180139a = 1;
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(deviceIdProvider, "deviceIdProvider");
        Intrinsics.checkNotNullParameter(countryProvider, "countryProvider");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f180140b = service;
        this.f180141c = deviceIdProvider;
        this.d = countryProvider;
    }

    public c(txh.b commonMapper, qva.e recurringBuyMapper, r10.d orderDetailsKompotMapper) {
        this.f180139a = 26;
        Intrinsics.checkNotNullParameter(commonMapper, "commonMapper");
        Intrinsics.checkNotNullParameter(recurringBuyMapper, "recurringBuyMapper");
        Intrinsics.checkNotNullParameter(orderDetailsKompotMapper, "orderDetailsKompotMapper");
        this.f180140b = commonMapper;
        this.f180141c = recurringBuyMapper;
        this.d = orderDetailsKompotMapper;
    }

    public c(TextPaint paint) {
        this.f180139a = 12;
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.f180140b = paint;
        this.f180141c = new HashMap();
        this.d = new Stack();
    }

    public c(p56.a naviCommandProvider, gte.a featureToggleInteractor, wli.x deeplinkHandler) {
        this.f180139a = 19;
        Intrinsics.checkNotNullParameter(naviCommandProvider, "naviCommandProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.f180140b = naviCommandProvider;
        this.f180141c = featureToggleInteractor;
        this.d = deeplinkHandler;
    }

    public c(un8.k juniorSettingsSignInRepository, kgm.c juniorDeviceInteractor, hj8.a juniorProfileInteractor) {
        this.f180139a = 14;
        Intrinsics.checkNotNullParameter(juniorSettingsSignInRepository, "juniorSettingsSignInRepository");
        Intrinsics.checkNotNullParameter(juniorDeviceInteractor, "juniorDeviceInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        this.f180140b = juniorSettingsSignInRepository;
        this.f180141c = juniorDeviceInteractor;
        this.d = juniorProfileInteractor;
    }

    public c(l61.a userCompanyInteractor, ang.f userInteractor, hc5.a cryptoAccountInteractor) {
        this.f180139a = 8;
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(cryptoAccountInteractor, "cryptoAccountInteractor");
        this.f180140b = userCompanyInteractor;
        this.f180141c = userInteractor;
        this.d = cryptoAccountInteractor;
    }

    public c(ugl.c screenerInteractor, d9h.a performanceProvider, ooh.d screenerInstrumentGroupMapper) {
        this.f180139a = 4;
        Intrinsics.checkNotNullParameter(screenerInteractor, "screenerInteractor");
        Intrinsics.checkNotNullParameter(performanceProvider, "performanceProvider");
        Intrinsics.checkNotNullParameter(screenerInstrumentGroupMapper, "screenerInstrumentGroupMapper");
        this.f180140b = screenerInteractor;
        this.f180141c = performanceProvider;
        this.d = screenerInstrumentGroupMapper;
    }

    public c(cob.e transactionsDataSource, lkb.d challengeStreakWidgetMapper, ugc.a savingsChallengeInteractor, gte.a featureToggleInteractor) {
        this.f180139a = 25;
        Intrinsics.checkNotNullParameter(transactionsDataSource, "transactionsDataSource");
        Intrinsics.checkNotNullParameter(challengeStreakWidgetMapper, "challengeStreakWidgetMapper");
        Intrinsics.checkNotNullParameter(savingsChallengeInteractor, "savingsChallengeInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f180140b = transactionsDataSource;
        this.f180141c = savingsChallengeInteractor;
        this.d = featureToggleInteractor;
    }

    public c(PerformanceParametersService service, ue0.c storageCache, ne0.d memoryCache) {
        this.f180139a = 22;
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storageCache, "storageCache");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f180140b = service;
        this.f180141c = storageCache;
        this.d = memoryCache;
    }

    public c(x4l.c investSmartNotificationsFeedDod, x4l.c investSmartNotificationsAirTipDod, l80.e dateProvider) {
        this.f180139a = 0;
        Intrinsics.checkNotNullParameter(investSmartNotificationsFeedDod, "investSmartNotificationsFeedDod");
        Intrinsics.checkNotNullParameter(investSmartNotificationsAirTipDod, "investSmartNotificationsAirTipDod");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f180140b = investSmartNotificationsFeedDod;
        this.f180141c = investSmartNotificationsAirTipDod;
        this.d = dateProvider;
    }

    public c(tj3.a commodityFeatureEnabledInteractor) {
        this.f180139a = 18;
        Intrinsics.checkNotNullParameter(commodityFeatureEnabledInteractor, "commodityFeatureEnabledInteractor");
        this.f180140b = commodityFeatureEnabledInteractor;
        j8l.a aVar = j8l.a.FIAT;
        j8l.a aVar2 = j8l.a.JOINT;
        j8l.a aVar3 = j8l.a.VAULT;
        j8l.a aVar4 = j8l.a.PRO;
        j8l.a aVar5 = j8l.a.CREDIT_CARD;
        j8l.a aVar6 = j8l.a.INVEST_CASH_HOLDING;
        j8l.a aVar7 = j8l.a.SAVINGS;
        j8l.a[] elements = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f180141c = kotlin.collections.d.y0(elements);
        j8l.a[] elements2 = {aVar, aVar2, aVar3, aVar4, aVar6, aVar7};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        this.d = kotlin.collections.d.y0(elements2);
    }

    public c(w4l.f accountInformationDod, x4l.c roboPortfolioDod, rlc.a changeTemplateRequestMapper, rlc.c roboAccountNetworkMapper, RoboAccountService service) {
        this.f180139a = 7;
        Intrinsics.checkNotNullParameter(accountInformationDod, "accountInformationDod");
        Intrinsics.checkNotNullParameter(roboPortfolioDod, "roboPortfolioDod");
        Intrinsics.checkNotNullParameter(changeTemplateRequestMapper, "changeTemplateRequestMapper");
        Intrinsics.checkNotNullParameter(roboAccountNetworkMapper, "roboAccountNetworkMapper");
        Intrinsics.checkNotNullParameter(service, "service");
        this.f180141c = accountInformationDod;
        this.f180140b = roboPortfolioDod;
        this.d = service;
    }

    public c(hj8.a juniorProfileInteractor, jla.h productCatalogueInteractor, wsg.n walletInteractor) {
        this.f180139a = 9;
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f180140b = juniorProfileInteractor;
        this.f180141c = productCatalogueInteractor;
        this.d = walletInteractor;
    }

    public c(o36.d secondaryCurrencyRepository, c accountsInteractor, g26.b assetDetailsInteractor) {
        this.f180139a = 21;
        Intrinsics.checkNotNullParameter(secondaryCurrencyRepository, "secondaryCurrencyRepository");
        Intrinsics.checkNotNullParameter(accountsInteractor, "accountsInteractor");
        Intrinsics.checkNotNullParameter(assetDetailsInteractor, "assetDetailsInteractor");
        this.f180140b = secondaryCurrencyRepository;
        this.f180141c = accountsInteractor;
        this.d = assetDetailsInteractor;
    }

    public c(s76.b derivativesBalanceRepository, ppk.f ratesInteractor, d derivativesEnabledStateChecker) {
        this.f180139a = 17;
        Intrinsics.checkNotNullParameter(derivativesBalanceRepository, "derivativesBalanceRepository");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(derivativesEnabledStateChecker, "derivativesEnabledStateChecker");
        this.f180140b = derivativesBalanceRepository;
        this.f180141c = ratesInteractor;
        this.d = derivativesEnabledStateChecker;
    }

    public c(hg0.d lightenedFaqInteractor, fg0.e pigeonNodeDetailRepository, k pigeonTreeRepository, lde.n sharedHelpWidgetsInteractor) {
        this.f180139a = 6;
        Intrinsics.checkNotNullParameter(lightenedFaqInteractor, "lightenedFaqInteractor");
        Intrinsics.checkNotNullParameter(pigeonNodeDetailRepository, "pigeonNodeDetailRepository");
        Intrinsics.checkNotNullParameter(pigeonTreeRepository, "pigeonTreeRepository");
        Intrinsics.checkNotNullParameter(sharedHelpWidgetsInteractor, "sharedHelpWidgetsInteractor");
        this.f180140b = lightenedFaqInteractor;
        this.f180141c = pigeonNodeDetailRepository;
        this.d = pigeonTreeRepository;
    }

    public c(f16.b accountsRepository, xv5.c baseCurrencyInteractor, t46.a ratesRepository) {
        this.f180139a = 16;
        Intrinsics.checkNotNullParameter(accountsRepository, "accountsRepository");
        Intrinsics.checkNotNullParameter(baseCurrencyInteractor, "baseCurrencyInteractor");
        Intrinsics.checkNotNullParameter(ratesRepository, "ratesRepository");
        this.f180140b = accountsRepository;
        this.f180141c = baseCurrencyInteractor;
        this.d = ratesRepository;
    }

    public c(x8h.g collectionsInteractor, nbh.a instrumentImageProvider, nbh.f instrumentRowProvider) {
        this.f180139a = 3;
        Intrinsics.checkNotNullParameter(collectionsInteractor, "collectionsInteractor");
        Intrinsics.checkNotNullParameter(instrumentImageProvider, "instrumentImageProvider");
        Intrinsics.checkNotNullParameter(instrumentRowProvider, "instrumentRowProvider");
        this.f180140b = collectionsInteractor;
        this.f180141c = instrumentImageProvider;
        this.d = instrumentRowProvider;
    }

    public c(uhi.a aVar) {
        this.f180139a = 29;
        this.f180140b = aVar;
    }

    public c(ryc.b bVar, ryc.c cVar) {
        this.f180139a = 20;
        this.f180140b = cVar;
        this.f180141c = e4m.b.b(new r7d.w(bVar, cVar, this, 1, 5));
        this.d = e4m.b.b(new r7d.w(bVar, cVar, this, 0, 5));
    }
}
