package b9k;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import b9.w2;
import b9k.f;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.revolut.chat.ChatApi$Toggles;
import com.revolut.chat.ui.messageslist.widgets.ChatWidgetException;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrder$Id;
import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderFilter;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.feature.stock_lending.impl.ui.onboarding.StockLendingOnboardingContract$Configuration;
import com.revolut.feature.wealth_discovery.api.ScreenerApi$Toggles$InvestTopMoversScreenerRedesign;
import cp4.y;
import cxe.u;
import dx4.e1;
import dx4.g2;
import dx4.r0;
import egk.e;
import et6.f1;
import et6.p1;
import g4k.a0;
import ggk.g0;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import md.d2;
import md.f2;
import md.h1;
import md.l2;
import md.w1;
import nr6.b0;
import od0.h;
import od0.i;
import om4.o0;
import om4.y3;
import q50.p0;
import q50.s0;
import r10.v;
import rp0.g1;
import vf0.k;
import vkm.j2;
import wik.t;
import wli.x;
import xzg.j0;
import xzg.l0;
import xzg.n0;
import yw4.p;
import zh9.u0;
import zhm.d0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements gsi.g, xpi.d, ypi.f, hqi.g, iqi.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f13816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f13817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f13818c;
    public Object d;
    public Object e;
    public Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f13819g;

    public f(ce5.b cryptoConvertDialogDisclaimerApi, ldd.a focusRequesterDelegateFactory, utk.f enablePocketExtensionFactory, w2 transferReasonLauncherExtensionFactory, twg.c aliasBeneficiaryCheckExtensionFactory, f2k.n legacyEgiroErrorDialogProvider, xg6.l linkExternalInstitutionsInteractor, com.revolut.feature.external_accounts.api.navigation.a externalPocketNavigationFactory, f80.a uriHelper) {
        Intrinsics.checkNotNullParameter(cryptoConvertDialogDisclaimerApi, "cryptoConvertDialogDisclaimerApi");
        Intrinsics.checkNotNullParameter(focusRequesterDelegateFactory, "focusRequesterDelegateFactory");
        Intrinsics.checkNotNullParameter(enablePocketExtensionFactory, "enablePocketExtensionFactory");
        Intrinsics.checkNotNullParameter(transferReasonLauncherExtensionFactory, "transferReasonLauncherExtensionFactory");
        Intrinsics.checkNotNullParameter(aliasBeneficiaryCheckExtensionFactory, "aliasBeneficiaryCheckExtensionFactory");
        Intrinsics.checkNotNullParameter(legacyEgiroErrorDialogProvider, "legacyEgiroErrorDialogProvider");
        Intrinsics.checkNotNullParameter(linkExternalInstitutionsInteractor, "linkExternalInstitutionsInteractor");
        Intrinsics.checkNotNullParameter(externalPocketNavigationFactory, "externalPocketNavigationFactory");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.e = enablePocketExtensionFactory;
        this.f13819g = transferReasonLauncherExtensionFactory;
        this.f13817b = aliasBeneficiaryCheckExtensionFactory;
        this.f13816a = legacyEgiroErrorDialogProvider;
        this.f13818c = linkExternalInstitutionsInteractor;
        this.d = externalPocketNavigationFactory;
        this.f = uriHelper;
    }

    public static j0 D(w0h.d dVar) {
        int i = x9h.e.f303738b[dVar.ordinal()];
        if (i == 1) {
            return j0.STOCK;
        }
        if (i == 2) {
            return j0.CRYPTO;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static ArrayList F(List list, hm3.b bVar) {
        List<Object> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (Object objA : list2) {
            if (objA instanceof r0) {
                objA = (e1) bVar.invoke(objA);
            } else if (objA instanceof g2) {
                g2 g2Var = (g2) objA;
                objA = g2.a(g2Var, F(g2Var.d, bVar));
            }
            arrayList.add(objA);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r2v0, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.LinkedHashMap, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable c(b9k.f r11, com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData r12, gim.c r13) {
        /*
            java.lang.Object r0 = r11.f13817b
            com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.review.BankTransferReviewScreenContract$InputData r0 = (com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.review.BankTransferReviewScreenContract$InputData) r0
            boolean r1 = r13 instanceof x4k.a
            if (r1 == 0) goto L17
            r1 = r13
            x4k.a r1 = (x4k.a) r1
            int r2 = r1.f302880w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f302880w = r2
            goto L1c
        L17:
            x4k.a r1 = new x4k.a
            r1.<init>(r11, r13)
        L1c:
            java.lang.Object r13 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f302880w
            r4 = 1
            if (r3 == 0) goto L33
            if (r3 != r4) goto L2b
            yhm.o.b(r13)
            goto L61
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L33:
            yhm.o.b(r13)
            f5j.a r13 = r0.f102122a
            java.lang.String r0 = f5j.c.b(r13)
            if (r0 != 0) goto L43
            java.util.Map r2 = zhm.r0.g()
            goto L92
        L43:
            java.lang.Object r11 = r11.d
            y1k.a r11 = (y1k.a) r11
            xi0.b r6 = r12.f101925b
            wi0.b r7 = f5j.c.e(r13)
            long r8 = r12.f101924a
            java.lang.String r10 = r13.f132329a
            r5 = r11
            q2k.e r5 = (q2k.e) r5
            efm.d0 r11 = r5.b(r6, r7, r8, r10)
            r1.f302880w = r4
            java.lang.Object r13 = nim.a.b(r11, r1)
            if (r13 != r2) goto L61
            goto L92
        L61:
            krf.a r13 = (krf.a) r13
            java.util.List r11 = r13.f188857b
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            r12 = 10
            int r12 = zhm.w.t(r11, r12)
            int r12 = zhm.q0.b(r12)
            r13 = 16
            if (r12 >= r13) goto L76
            r12 = r13
        L76:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>(r12)
            java.util.Iterator r11 = r11.iterator()
        L7f:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L92
            java.lang.Object r12 = r11.next()
            r13 = r12
            com.revolut.feature.transfer.models.config.AdditionalInformationInput r13 = (com.revolut.feature.transfer.models.config.AdditionalInformationInput) r13
            java.lang.String r13 = r13.f92266a
            r2.put(r13, r12)
            goto L7f
        L92:
            java.io.Serializable r2 = (java.io.Serializable) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b9k.f.c(b9k.f, com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData, gim.c):java.io.Serializable");
    }

    public static u q(Flow flow) {
        return n14.k.p(nim.a.v(flow, new hqk.a(4)), new hqk.a(5));
    }

    public static byte[] x(Context context, String str, String str2) throws CharConversionException {
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        Context applicationContext = context.getApplicationContext();
        try {
            String string = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
            if (string == null) {
                return null;
            }
            return hx7.l.e(string);
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(p.a.p("can't read keyset; the pref value ", str, " is not a valid hex string"));
        }
    }

    public static ad.g y(byte[] bArr) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            md.g2 g2VarC = md.g2.C(byteArrayInputStream, com.google.crypto.tink.shaded.protobuf.q.a());
            byteArrayInputStream.close();
            return new ad.g((d2) ((md.g2) v.n(g2VarC).f250863b).u(), 3);
        } catch (Throwable th10) {
            byteArrayInputStream.close();
            throw th10;
        }
    }

    public gd.b A() throws KeyStoreException {
        gd.c cVar = new gd.c();
        try {
            boolean zA = gd.c.a((String) this.d);
            try {
                return cVar.c((String) this.d);
            } catch (GeneralSecurityException | ProviderException e) {
                if (zA) {
                    return null;
                }
                throw new KeyStoreException(p.a.p("the master key ", (String) this.d, " exists but is unusable"), e);
            }
        } catch (GeneralSecurityException | ProviderException e2) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0076, code lost:
    
        if (r12 == r8) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object B(java.lang.String r12, java.lang.String r13, nr6.a0 r14, gim.c r15) throws java.lang.Throwable {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f
            r2 = r0
            au6.v r2 = (au6.v) r2
            boolean r0 = r15 instanceof et6.k
            if (r0 == 0) goto L18
            r0 = r15
            et6.k r0 = (et6.k) r0
            int r1 = r0.f129258x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r1 & r3
            if (r4 == 0) goto L18
            int r1 = r1 - r3
            r0.f129258x = r1
            goto L1d
        L18:
            et6.k r0 = new et6.k
            r0.<init>(r11, r15)
        L1d:
            java.lang.Object r15 = r0.v
            fim.a r8 = fim.a.COROUTINE_SUSPENDED
            int r1 = r0.f129258x
            r9 = 2
            r10 = 1
            if (r1 == 0) goto L3d
            if (r1 == r10) goto L37
            if (r1 != r9) goto L2f
            yhm.o.b(r15)
            goto L79
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            java.lang.String r12 = r0.u
            yhm.o.b(r15)
            goto L61
        L3d:
            yhm.o.b(r15)
            r0.u = r12
            r0.f129258x = r10
            r2.getClass()
            a1a.c r1 = new a1a.c
            r6 = 0
            r7 = 13
            r5 = r12
            r3 = r13
            r4 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7)
            kotlinx.coroutines.CoroutineDispatcher r12 = r2.f9636c
            java.lang.Object r12 = skm.e0.J(r12, r1, r0)
            if (r12 != r8) goto L5b
            goto L5d
        L5b:
            kotlin.Unit r12 = kotlin.Unit.f186387a
        L5d:
            if (r12 != r8) goto L60
            goto L78
        L60:
            r12 = r5
        L61:
            r13 = 0
            r0.u = r13
            r0.f129258x = r9
            x4l.c r13 = r2.f9642n
            com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrder$Id r14 = new com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrder$Id
            r14.<init>(r12)
            java.lang.Object r12 = r13.d(r14, r10, r0)
            if (r12 != r8) goto L74
            goto L76
        L74:
            kotlin.Unit r12 = kotlin.Unit.f186387a
        L76:
            if (r12 != r8) goto L79
        L78:
            return r8
        L79:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: b9k.f.B(java.lang.String, java.lang.String, nr6.a0, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
        if (nim.a.b(r8, r1) != r2) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object C(java.lang.String r8, gim.c r9) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f13817b
            lal.a r0 = (lal.a) r0
            boolean r1 = r9 instanceof hr4.c
            if (r1 == 0) goto L17
            r1 = r9
            hr4.c r1 = (hr4.c) r1
            int r2 = r1.f154767w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f154767w = r2
            goto L1c
        L17:
            hr4.c r1 = new hr4.c
            r1.<init>(r7, r9)
        L1c:
            java.lang.Object r9 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f154767w
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L41
            if (r3 == r6) goto L3d
            if (r3 == r5) goto L39
            if (r3 != r4) goto L31
            yhm.o.b(r9)
            goto L6d
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            yhm.o.b(r9)
            goto L5c
        L3d:
            yhm.o.b(r9)
            goto L53
        L41:
            yhm.o.b(r9)
            boolean r9 = r0.v()
            if (r9 == 0) goto L70
            r1.f154767w = r6
            java.lang.Object r8 = r0.B(r8, r1)
            if (r8 != r2) goto L53
            goto L6c
        L53:
            r1.f154767w = r5
            java.lang.Object r8 = r0.C(r1)
            if (r8 != r2) goto L5c
            goto L6c
        L5c:
            java.lang.Object r8 = r7.d
            ffk.t r8 = (ffk.t) r8
            rfm.f0 r8 = r8.y()
            r1.f154767w = r4
            java.lang.Object r8 = nim.a.b(r8, r1)
            if (r8 != r2) goto L6d
        L6c:
            return r2
        L6d:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L70:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b9k.f.C(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.jvm.functions.Function1] */
    public List E(boolean z, List list, n0 filter, Function0 function0, Function1 function1) {
        List listP0;
        ?? arrayList = (List) function0.invoke();
        Collection collection = (Collection) arrayList;
        if (collection == null || collection.isEmpty()) {
            adh.a calculator = (adh.a) this.f13818c;
            Object obj2 = adh.l.f3357a;
            Intrinsics.checkNotNullParameter(list, "<this>");
            Intrinsics.checkNotNullParameter(filter, "filter");
            Intrinsics.checkNotNullParameter(calculator, "calculator");
            int i = adh.j.f3355a[filter.ordinal()];
            if (i == 1) {
                listP0 = d0.P0(list, new adh.k(calculator, 1));
            } else if (i == 2) {
                listP0 = d0.P0(list, new adh.k(calculator, 2));
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                listP0 = d0.P0(list, new adh.k(calculator, 0));
            }
            List list2 = listP0;
            arrayList = new ArrayList(w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList.add(((vel.f) it8.next()).a());
            }
            if (!z) {
                function1.invoke(arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : list) {
            if (arrayList.contains(((vel.f) obj3).a())) {
                arrayList2.add(obj3);
            }
        }
        return d0.P0(arrayList2, new b83.a((List) arrayList, 12));
    }

    @Override // iqi.e
    public Object a(iqi.g gVar) {
        throw null;
    }

    @Override // ypi.f
    public Object b(ypi.h hVar) {
        throw null;
    }

    @Override // gsi.g
    public gsi.h build() {
        vc.s.h((xoi.d) this.f13816a, fsi.g.class);
        vc.s.h((xpi.f) this.f13818c, xpi.f.class);
        vc.s.h((ypi.h) this.d, ypi.h.class);
        vc.s.h((hqi.i) this.e, hqi.i.class);
        vc.s.h((iqi.g) this.f, iqi.g.class);
        vc.s.h((StockLendingOnboardingContract$Configuration) this.f13819g, StockLendingOnboardingContract$Configuration.class);
        return new h1e.b((h1e.c) this.f13817b, (xoi.d) this.f13816a, (xpi.f) this.f13818c, (ypi.h) this.d, (hqi.i) this.e, (iqi.g) this.f);
    }

    public synchronized gd.a d() {
        gd.a aVar;
        try {
            if (((String) this.f13816a) == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            synchronized (gd.a.f143014b) {
                try {
                    byte[] bArrX = x((Context) this.f13817b, (String) this.f13816a, (String) this.f13818c);
                    if (bArrX == null) {
                        if (((String) this.d) != null) {
                            this.e = A();
                        }
                        this.f13819g = m();
                    } else if (((String) this.d) != null) {
                        this.f13819g = z(bArrX);
                    } else {
                        this.f13819g = y(bArrX);
                    }
                    aVar = new gd.a(this);
                } finally {
                }
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        if (r8 == r2) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(java.lang.String r8, gim.c r9) throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f
            au6.v r0 = (au6.v) r0
            boolean r1 = r9 instanceof et6.i
            if (r1 == 0) goto L17
            r1 = r9
            et6.i r1 = (et6.i) r1
            int r2 = r1.f129244x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f129244x = r2
            goto L1c
        L17:
            et6.i r1 = new et6.i
            r1.<init>(r7, r9)
        L1c:
            java.lang.Object r9 = r1.v
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f129244x
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L3d
            if (r3 == r6) goto L37
            if (r3 != r5) goto L2f
            yhm.o.b(r9)
            goto L73
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            java.lang.String r8 = r1.u
            yhm.o.b(r9)
            goto L5c
        L3d:
            yhm.o.b(r9)
            r1.u = r8
            r1.f129244x = r6
            r0.getClass()
            ald.l r9 = new ald.l
            r3 = 15
            r9.<init>(r0, r8, r4, r3)
            kotlinx.coroutines.CoroutineDispatcher r3 = r0.f9636c
            java.lang.Object r9 = skm.e0.J(r3, r9, r1)
            if (r9 != r2) goto L57
            goto L59
        L57:
            kotlin.Unit r9 = kotlin.Unit.f186387a
        L59:
            if (r9 != r2) goto L5c
            goto L72
        L5c:
            r1.u = r4
            r1.f129244x = r5
            x4l.c r9 = r0.f9642n
            com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrder$Id r0 = new com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrder$Id
            r0.<init>(r8)
            java.lang.Object r8 = r9.d(r0, r6, r1)
            if (r8 != r2) goto L6e
            goto L70
        L6e:
            kotlin.Unit r8 = kotlin.Unit.f186387a
        L70:
            if (r8 != r2) goto L73
        L72:
            return r2
        L73:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b9k.f.e(java.lang.String, gim.c):java.lang.Object");
    }

    @Override // hqi.g
    public Object g(hqi.i iVar) {
        throw null;
    }

    @Override // gsi.g
    public Object h(fsi.g gVar) {
        throw null;
    }

    public n i(g1 shotDialogDisplayer, t reviewRequirementResolver) {
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Intrinsics.checkNotNullParameter(reviewRequirementResolver, "reviewRequirementResolver");
        t99.k kVar = (t99.k) this.f13817b;
        ang.f fVar = (ang.f) this.f13816a;
        zrc.d dVar = (zrc.d) this.f13818c;
        hsc.c cVar = (hsc.c) this.d;
        utk.f fVar2 = (utk.f) this.e;
        return new n(kVar, fVar, shotDialogDisplayer, dVar, cVar, reviewRequirementResolver, new xdk.g((xdk.a) fVar2.f283121a, (z71.a) fVar2.f283122b, (wsg.b) fVar2.f283123c), new i5k.d((l80.h) ((fkg.a) this.f).f135824b), ((w2) this.f13819g).m());
    }

    public a0 j(com.revolut.kompot.navigable.a controller, n60.a keyboardExtension) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(keyboardExtension, "keyboardExtension");
        ldd.b focusRequesterDelegate = new ldd.b();
        Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
        Intrinsics.checkNotNullParameter(keyboardExtension, "keyboardExtension");
        be5.a aVar = new be5.a();
        utk.f fVar = (utk.f) this.e;
        xdk.g gVar = new xdk.g((xdk.a) fVar.f283121a, (z71.a) fVar.f283122b, (wsg.b) fVar.f283123c);
        osf.g gVarM = ((w2) this.f13819g).m();
        twg.c cVar = (twg.c) this.f13817b;
        return new a0(aVar, gVar, gVarM, new ga2.d((uy1.o) cVar.f275017a, (o71.a) cVar.f275018b, (sri.m) cVar.f275019c, (ia2.a) cVar.d), (f2k.n) this.f13816a, (xg6.l) this.f13818c, (com.revolut.feature.external_accounts.api.navigation.a) this.d, (f80.a) this.f);
    }

    @Override // xpi.d
    public Object k() {
        throw null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public y50.d l(String type) {
        phm.a aVar;
        phm.a aVar2;
        Map map = (Map) this.f13817b;
        j30.c cVar = (j30.c) this.f13818c;
        Intrinsics.checkNotNullParameter(type, "type");
        q50.n nVar = (q50.n) ((q50.l) this.f);
        nVar.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        if (((Set) nVar.f242246b.getValue()).contains(type)) {
            return null;
        }
        switch (type.hashCode()) {
            case -1822289846:
                if (type.equals("lineChart")) {
                    if (((jte.d) ((rf3.d) cVar).f253679a).c(ChatApi$Toggles.ChatLineChartCard.f50976c)) {
                        return new q50.u();
                    }
                    return null;
                }
                break;
            case -1780940917:
                if (type.equals("barChart")) {
                    if (((jte.d) ((rf3.d) cVar).f253679a).c(ChatApi$Toggles.AirBarChartCard.f50960c)) {
                        return new q50.c();
                    }
                    return null;
                }
                break;
            case -1007593492:
                if (type.equals("segmentedChart")) {
                    return new p0();
                }
                break;
            case 3321850:
                if (type.equals("link")) {
                    return new q50.j((f01.a) this.d, (x) this.e);
                }
                break;
            case 110115790:
                if (type.equals("table")) {
                    return new s0((k50.x) this.f13816a);
                }
                break;
            case 2141246174:
                if (type.equals("transaction")) {
                    if (!((jte.d) ((rf3.d) cVar).f253679a).c(ChatApi$Toggles.ChatTransactionObject.f50980c) || (aVar2 = (phm.a) map.get(type)) == null) {
                        return null;
                    }
                    return (y50.d) aVar2.get();
                }
                break;
        }
        if (!((jte.d) ((rf3.d) cVar).f253679a).c(ChatApi$Toggles.ExternalDynamicWidgets.f50981c) || (aVar = (phm.a) map.get(type)) == null) {
            return null;
        }
        return (y50.d) aVar.get();
    }

    public ad.g m() throws GeneralSecurityException, IOException {
        if (((ad.j) this.f) == null) {
            throw new GeneralSecurityException("cannot read or generate keyset");
        }
        ad.g gVar = new ad.g(md.g2.B(), 3);
        ad.j jVar = (ad.j) this.f;
        synchronized (gVar) {
            gVar.a(jVar.f3199a);
        }
        int iZ = ad.s.a((md.g2) gVar.c().f250863b).x().z();
        synchronized (gVar) {
            for (int i = 0; i < ((md.g2) ((d2) gVar.f3196b).f49436b).y(); i++) {
                try {
                    f2 f2VarX = ((md.g2) ((d2) gVar.f3196b).f49436b).x(i);
                    if (f2VarX.A() == iZ) {
                        if (!f2VarX.C().equals(w1.ENABLED)) {
                            throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + iZ);
                        }
                        d2 d2Var = (d2) gVar.f3196b;
                        d2Var.e();
                        md.g2.v((md.g2) d2Var.f49436b, iZ);
                    }
                } catch (Throwable th10) {
                    throw th10;
                }
            }
            throw new GeneralSecurityException("key not found: " + iZ);
        }
        Context context = (Context) this.f13817b;
        String str = (String) this.f13816a;
        String str2 = (String) this.f13818c;
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        Context applicationContext = context.getApplicationContext();
        SharedPreferences.Editor editorEdit = str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext).edit() : applicationContext.getSharedPreferences(str2, 0).edit();
        if (((gd.b) this.e) != null) {
            v vVarC = gVar.c();
            gd.b bVar = (gd.b) this.e;
            byte[] bArr = new byte[0];
            md.g2 g2Var = (md.g2) vVarC.f250863b;
            byte[] bArrA = bVar.a(g2Var.d(), bArr);
            try {
                if (!md.g2.D(bVar.decrypt(bArrA, bArr), com.google.crypto.tink.shaded.protobuf.q.a()).equals(g2Var)) {
                    throw new GeneralSecurityException("cannot encrypt keyset");
                }
                md.g1 g1VarY = h1.y();
                com.google.crypto.tink.shaded.protobuf.i iVarC = com.google.crypto.tink.shaded.protobuf.j.c(0, bArrA.length, bArrA);
                g1VarY.e();
                h1.v((h1) g1VarY.f49436b, iVarC);
                l2 l2VarA = ad.s.a(g2Var);
                g1VarY.e();
                h1.w((h1) g1VarY.f49436b, l2VarA);
                if (!editorEdit.putString(str, hx7.l.g(((h1) g1VarY.a()).d())).commit()) {
                    throw new IOException("Failed to write to SharedPreferences");
                }
            } catch (InvalidProtocolBufferException unused) {
                throw new GeneralSecurityException("invalid keyset, corrupted key material");
            }
        } else if (!editorEdit.putString(str, hx7.l.g(((md.g2) gVar.c().f250863b).d())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
        return gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x01a2 -> B:50:0x01a8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(com.revolut.feature_move_money.api.model.AccountWrapper r18, x5i.d r19, wd6.c r20, k1j.a r21, gim.c r22) {
        /*
            Method dump skipped, instruction units count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b9k.f.n(com.revolut.feature_move_money.api.model.AccountWrapper, x5i.d, wd6.c, k1j.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable o(com.revolut.feature_move_money.api.model.AccountWrapper r8, x5i.d r9, gim.c r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof h6i.w0
            if (r0 == 0) goto L14
            r0 = r10
            h6i.w0 r0 = (h6i.w0) r0
            int r1 = r0.f149735w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f149735w = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            h6i.w0 r0 = new h6i.w0
            r0.<init>(r7, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f149735w
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r10)
            goto L44
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            yhm.o.b(r10)
            wd6.c r4 = wd6.c.FIAT_ONLY
            k1j.a r5 = k1j.a.NON_EXISTING_CURRENCY
            r6.f149735w = r2
            r1 = r7
            r2 = r8
            r3 = r9
            java.lang.Object r10 = r1.n(r2, r3, r4, r5, r6)
            if (r10 != r0) goto L44
            return r0
        L44:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = 10
            int r9 = zhm.w.t(r10, r9)
            r8.<init>(r9)
            java.util.Iterator r9 = r10.iterator()
        L55:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L67
            java.lang.Object r10 = r9.next()
            java.lang.String r10 = (java.lang.String) r10
            xi0.a r0 = xi0.b.Companion
            t61.a.A(r0, r10, r8)
            goto L55
        L67:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b9k.f.o(com.revolut.feature_move_money.api.model.AccountWrapper, x5i.d, gim.c):java.io.Serializable");
    }

    public efm.d0 p() {
        return ((ang.f) this.f13816a).f(false);
    }

    public Flow r(String facilityId, w4l.k loadingStrategy) {
        Flow flowP;
        al4.q qVar = (al4.q) this.e;
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        lal.a aVar = (lal.a) this.f13817b;
        boolean zV = aVar.v();
        od0.i iVar = od0.i.f224256b;
        if (!zV) {
            od0.i.Companion.getClass();
            return new go.g(new Data(iVar, null, false, 6, null), 2);
        }
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        if (aVar.v()) {
            dp4.w wVar = (dp4.w) aVar.f193426b;
            wVar.getClass();
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            flowP = n14.k.p(nim.a.v(wVar.e.b(new y(facilityId), loadingStrategy), new o0(5)), new o0(6));
        } else {
            od0.i.Companion.getClass();
            flowP = new go.g(new Data(iVar, null, false, 6, null), 2);
        }
        u uVarQ = q(aVar.A(facilityId));
        ffk.t tVar = (ffk.t) this.d;
        w4l.h hVar = w4l.h.f294642c;
        final int i = 1;
        y3 y3Var = (y3) qVar;
        Continuation continuation = null;
        jhi.k kVarU = nim.a.u(new d4f.m(2, 28, continuation), u0.m(u0.i(flowP, uVarQ, q(nim.a.v(boh.f.e(rd0.e.b(tVar.v(hVar)), new Function1(this) { // from class: hr4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f154764b;

            {
                this.f154764b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        k kVar = (k) obj2;
                        Intrinsics.checkNotNullParameter(kVar, "<destruct>");
                        i iVar2 = (i) kVar.f288454a;
                        i iVar3 = (i) kVar.f288455b;
                        i iVar4 = (i) kVar.f288456c;
                        i iVar5 = (i) kVar.d;
                        i iVar6 = (i) kVar.e;
                        vm4.b bVar = (vm4.b) iVar2.g();
                        vm4.b bVar2 = null;
                        if (bVar != null) {
                            List list = (List) iVar3.g();
                            gr4.b bVar3 = new gr4.b(list != null ? Integer.valueOf(list.size()) : null, (gr4.c) iVar4.g(), (Clause) iVar5.g(), (p) iVar6.g());
                            f fVar = this.f154764b;
                            fVar.getClass();
                            ArrayList items = f.F(bVar.f290531a, new hm3.b(fVar, bVar3, 20));
                            Intrinsics.checkNotNullParameter(items, "items");
                            bVar2 = new vm4.b(items);
                        }
                        i.Companion.getClass();
                        return h.a(bVar2);
                    default:
                        PricingPlanSubscription pricingPlan = (PricingPlanSubscription) obj2;
                        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
                        return ((t) ((e) this.f154764b.f13818c)).f(pricingPlan.f81129a.f152287a, g0.CREDIT_CARD, w4l.h.f294642c);
                }
            }
        }), new hqk.a(2)))), u0.m(q(nim.a.v(boh.f.e(vkm.q.R(y3Var.f(facilityId, w4l.j.f294644c), new hr4.b(3, 0, continuation)), new hm3.b(this, facilityId, 21)), new hqk.a(3))), q(y3Var.f(facilityId, hVar)))));
        final int i2 = 0;
        return n14.k.p(nim.a.v(kVarU, new Function1(this) { // from class: hr4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f154764b;

            {
                this.f154764b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        k kVar = (k) obj2;
                        Intrinsics.checkNotNullParameter(kVar, "<destruct>");
                        i iVar2 = (i) kVar.f288454a;
                        i iVar3 = (i) kVar.f288455b;
                        i iVar4 = (i) kVar.f288456c;
                        i iVar5 = (i) kVar.d;
                        i iVar6 = (i) kVar.e;
                        vm4.b bVar = (vm4.b) iVar2.g();
                        vm4.b bVar2 = null;
                        if (bVar != null) {
                            List list = (List) iVar3.g();
                            gr4.b bVar3 = new gr4.b(list != null ? Integer.valueOf(list.size()) : null, (gr4.c) iVar4.g(), (Clause) iVar5.g(), (p) iVar6.g());
                            f fVar = this.f154764b;
                            fVar.getClass();
                            ArrayList items = f.F(bVar.f290531a, new hm3.b(fVar, bVar3, 20));
                            Intrinsics.checkNotNullParameter(items, "items");
                            bVar2 = new vm4.b(items);
                        }
                        i.Companion.getClass();
                        return h.a(bVar2);
                    default:
                        PricingPlanSubscription pricingPlan = (PricingPlanSubscription) obj2;
                        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
                        return ((t) ((e) this.f154764b.f13818c)).f(pricingPlan.f81129a.f152287a, g0.CREDIT_CARD, w4l.h.f294642c);
                }
            }
        }), new hqk.a(1));
    }

    public vkm.d s(String str, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-freelancer-common-models-acquiring_order-AcquiringOrder-Id$-id$0");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        au6.v vVar = (au6.v) this.f;
        vVar.getClass();
        Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-freelancer-common-models-acquiring_order-AcquiringOrder-Id$-id$0");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return vVar.f9640l.b(new AcquiringOrder$Id(str), loadingStrategy);
    }

    public Flow t(AcquiringOrderFilter acquiringOrderFilter, b0 sorting, gr6.d loadingMode) {
        et6.l lVar;
        et6.m mVar = (et6.m) this.e;
        Intrinsics.checkNotNullParameter(sorting, "sorting");
        Intrinsics.checkNotNullParameter(loadingMode, "loadingMode");
        if (loadingMode instanceof gr6.b) {
            lVar = et6.l.HISTORICAL;
        } else {
            if (!(loadingMode instanceof gr6.c)) {
                throw new NoWhenBranchMatchedException();
            }
            lVar = et6.l.INCREMENTAL;
        }
        w4l.k kVarA = loadingMode.a();
        if (Intrinsics.f(kVarA, w4l.h.f294642c)) {
            et6.v vVar = (et6.v) mVar;
            if (!vVar.f129349c.f9569c.get()) {
                vVar.h(lVar);
            }
        } else if (Intrinsics.f(kVarA, w4l.i.f294643c)) {
            ((et6.v) mVar).h(lVar);
        } else {
            if (!Intrinsics.f(kVarA, w4l.j.f294644c)) {
                throw new NoWhenBranchMatchedException();
            }
            et6.v vVar2 = (et6.v) mVar;
            if (!vVar2.f129349c.a()) {
                vVar2.h(lVar);
            }
        }
        j2 j2Var = ((et6.v) mVar).f129349c.f9568b;
        au6.v vVar3 = (au6.v) this.f;
        vVar3.getClass();
        Intrinsics.checkNotNullParameter(sorting, "sorting");
        Continuation continuation = null;
        return vkm.q.q(new t38.e(j2Var, 24, nim.a.v(vVar3.k, new a5b.b(vVar3, acquiringOrderFilter, sorting, continuation, 5)), new et6.j(3, 0, continuation)));
    }

    public efm.r v(w0h.d dVar, n0 n0Var, Function0 function0, Function1 function1, Function1 function12) {
        zel.k kVar;
        efm.r rVarW;
        int i = x9h.e.f303737a[n0Var.ordinal()];
        if (i == 1) {
            kVar = zel.k.TOP_LOSERS;
        } else if (i == 2) {
            kVar = zel.k.TOP_GAINERS;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            kVar = null;
        }
        if (((jte.d) ((gte.a) this.e)).c(ScreenerApi$Toggles$InvestTopMoversScreenerRedesign.f96095c) && dVar == w0h.d.STOCK && kVar != null) {
            rul.e eVar = (rul.e) this.d;
            wgl.c params = new wgl.c(zel.f.STOCKS, kVar, zel.a.ONE_DAY);
            Intrinsics.checkNotNullParameter(params, "params");
            rVarW = nim.a.w(rd0.e.c(boh.f.e(((su9.c) eVar.f257629a).h(params), new y7k.g0((Object) eVar, (Object) 8, 28)), kotlin.coroutines.g.f186406a), new x8i.h(7));
        } else {
            rVarW = nim.a.w(nim.a.w(((tsk.t) this.f13817b).t(D(dVar), l0.ONE_DAY, true), function12), new x9h.b(this, 0));
        }
        efm.r rVarDoOnSubscribe = rVarW.doOnSubscribe(new x9h.d(1, new v1.m(11, function1)));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnSubscribe, "doOnSubscribe(...)");
        efm.r map = pd.b.r(rVarDoOnSubscribe, new x9h.c(this, dVar, 1)).map(new x8i.g(29, new wg9.p(this, n0Var, function0, function1, 7)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public Object w(String type, String rawData, UUID messageId) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(rawData, "rawData");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f13819g;
        y50.d dVarL = (y50.d) concurrentHashMap.get(type);
        if (dVarL == null) {
            dVarL = l(type);
            if (dVarL == null) {
                return null;
            }
            y50.d dVar = (y50.d) concurrentHashMap.putIfAbsent(type, dVarL);
            if (dVar != null) {
                dVarL = dVar;
            }
        }
        try {
            return dVarL.e3(rawData);
        } catch (Exception e) {
            ChatWidgetException chatWidgetException = new ChatWidgetException("Failed to parse widget input for type=" + type + ", msgId=" + messageId, e);
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, chatWidgetException, h0Var);
            return null;
        }
    }

    public ad.g z(byte[] bArr) {
        try {
            this.e = new gd.c().c((String) this.d);
            try {
                return new ad.g((d2) ((md.g2) v.x(new ad.g(new ByteArrayInputStream(bArr), 1), (gd.b) this.e).f250863b).u(), 3);
            } catch (IOException | GeneralSecurityException e) {
                try {
                    return y(bArr);
                } catch (IOException unused) {
                    throw e;
                }
            }
        } catch (GeneralSecurityException | ProviderException e2) {
            try {
                return y(bArr);
            } catch (IOException unused2) {
                throw e2;
            }
        }
    }

    public f(Map externalProviders, k50.x textMapper, j30.c featureToggles, f01.a uiKitResources, x deeplinkHandler, q50.l denylistProvider) {
        Intrinsics.checkNotNullParameter(externalProviders, "externalProviders");
        Intrinsics.checkNotNullParameter(textMapper, "textMapper");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(denylistProvider, "denylistProvider");
        this.f13817b = externalProviders;
        this.f13816a = textMapper;
        this.f13818c = featureToggles;
        this.d = uiKitResources;
        this.e = deeplinkHandler;
        this.f = denylistProvider;
        this.f13819g = new ConcurrentHashMap();
    }

    public f(t70.b currenciesLocalization, su9.c mostTradedAssetsInteractor, d9h.a mostTradedAssetsRateProvider, e9h.d performanceAssetsTransformer, sgh.a mostTradedNavigationProvider, nbh.f instrumentRowProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
        Intrinsics.checkNotNullParameter(mostTradedAssetsInteractor, "mostTradedAssetsInteractor");
        Intrinsics.checkNotNullParameter(mostTradedAssetsRateProvider, "mostTradedAssetsRateProvider");
        Intrinsics.checkNotNullParameter(performanceAssetsTransformer, "performanceAssetsTransformer");
        Intrinsics.checkNotNullParameter(mostTradedNavigationProvider, "mostTradedNavigationProvider");
        Intrinsics.checkNotNullParameter(instrumentRowProvider, "instrumentRowProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f13817b = currenciesLocalization;
        this.f13816a = mostTradedAssetsInteractor;
        this.f13818c = mostTradedAssetsRateProvider;
        this.d = performanceAssetsTransformer;
        this.e = mostTradedNavigationProvider;
        this.f = instrumentRowProvider;
        this.f13819g = featureToggleInteractor;
    }

    public f(w4l.f templatesDod, w4l.f templateDod, w4l.f projectionsDod, w4l.f templatesPerformanceDod, w4l.f templatesDrawdownDod, x4l.c riskMetricsDod, x4l.c statsDod, x4l.c benchmarksDod) {
        Intrinsics.checkNotNullParameter(templatesDod, "templatesDod");
        Intrinsics.checkNotNullParameter(templateDod, "templateDod");
        Intrinsics.checkNotNullParameter(projectionsDod, "projectionsDod");
        Intrinsics.checkNotNullParameter(templatesPerformanceDod, "templatesPerformanceDod");
        Intrinsics.checkNotNullParameter(templatesDrawdownDod, "templatesDrawdownDod");
        Intrinsics.checkNotNullParameter(riskMetricsDod, "riskMetricsDod");
        Intrinsics.checkNotNullParameter(statsDod, "statsDod");
        Intrinsics.checkNotNullParameter(benchmarksDod, "benchmarksDod");
        this.f13817b = templatesDod;
        this.f13816a = templateDod;
        this.f13818c = projectionsDod;
        this.d = templatesPerformanceDod;
        this.e = templatesDrawdownDod;
        this.f = riskMetricsDod;
        this.f13819g = benchmarksDod;
    }

    public f(f1 equivalentAmountInteractor, r10.w exchangeRatesProvider, p1 freelancerInvoiceInteractor, bbd.b orderInitiationPageInteractor, et6.m orderLoadingInteractor, au6.v orderRepository, wsg.n walletInteractor) {
        Intrinsics.checkNotNullParameter(equivalentAmountInteractor, "equivalentAmountInteractor");
        Intrinsics.checkNotNullParameter(exchangeRatesProvider, "exchangeRatesProvider");
        Intrinsics.checkNotNullParameter(freelancerInvoiceInteractor, "freelancerInvoiceInteractor");
        Intrinsics.checkNotNullParameter(orderInitiationPageInteractor, "orderInitiationPageInteractor");
        Intrinsics.checkNotNullParameter(orderLoadingInteractor, "orderLoadingInteractor");
        Intrinsics.checkNotNullParameter(orderRepository, "orderRepository");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f13817b = equivalentAmountInteractor;
        this.f13816a = exchangeRatesProvider;
        this.f13818c = freelancerInvoiceInteractor;
        this.d = orderInitiationPageInteractor;
        this.e = orderLoadingInteractor;
        this.f = orderRepository;
        this.f13819g = walletInteractor;
    }

    public f() {
        this.f13817b = null;
        this.f13816a = null;
        this.f13818c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }
}
