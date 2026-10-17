package mp;

import afj.g1;
import afj.x0;
import akl.e0;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.LinearLayout;
import aw.u;
import bw.t;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.navigable.vc.ViewController;
import dkk.h0;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.time.Clock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import kl.t1;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.n0;
import kotlinx.coroutines.flow.Flow;
import kotlinx.serialization.json.Json;
import okhttp3.RequestBody;
import r10.v;
import retrofit2.Converter;
import skm.p0;
import te8.z;
import ulm.b1;
import vc.s;
import vge.z2;
import vkm.q0;
import wtc.g0;
import xg6.x;
import yhm.m;
import zh9.u0;
import zhm.r0;

/* JADX INFO: loaded from: classes17.dex */
public final class p implements ut5.c, cij.a, Converter, flm.e, kkd.f, t1h.l, g4e.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f207708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f207709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f207710c;
    public Object d;

    public /* synthetic */ p(int i) {
        this.f207708a = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a5, code lost:
    
        if (r8 == r2) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(mp.p r7, gim.c r8) {
        /*
            java.lang.Object r0 = r7.f207709b
            w39.b r0 = (w39.b) r0
            boolean r1 = r8 instanceof j4e.d
            if (r1 == 0) goto L17
            r1 = r8
            j4e.d r1 = (j4e.d) r1
            int r2 = r1.f171376w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f171376w = r2
            goto L1c
        L17:
            j4e.d r1 = new j4e.d
            r1.<init>(r7, r8)
        L1c:
            java.lang.Object r8 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f171376w
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L3b
            if (r3 == r5) goto L37
            if (r3 != r4) goto L2f
            yhm.o.b(r8)
            goto La8
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            yhm.o.b(r8)
            goto L4e
        L3b:
            yhm.o.b(r8)
            r8 = r0
            z39.b r8 = (z39.b) r8
            ufm.c r8 = r8.b()
            r1.f171376w = r5
            java.lang.Object r8 = nim.a.b(r8, r1)
            if (r8 != r2) goto L4e
            goto La7
        L4e:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L58
            r7 = 0
            return r7
        L58:
            r5 = 10000(0x2710, double:4.9407E-320)
            java.lang.Long r8 = java.lang.Long.valueOf(r5)
            z39.b r0 = (z39.b) r0
            ufm.i r8 = r0.c(r8)
            j4e.b r0 = new j4e.b
            r3 = 0
            r0.<init>(r7, r3)
            ivb.i r3 = new ivb.i
            r5 = 29
            r3.<init>(r0, r5)
            ufm.f r0 = new ufm.f
            r5 = 2
            r0.<init>(r8, r3, r5)
            j4e.b r8 = new j4e.b
            r3 = 1
            r8.<init>(r7, r3)
            j4e.c r3 = new j4e.c
            r5 = 0
            r3.<init>(r5, r8)
            ufm.f r8 = new ufm.f
            r5 = 3
            r8.<init>(r0, r3, r5)
            j4e.b r0 = new j4e.b
            r3 = 2
            r0.<init>(r7, r3)
            j4e.c r7 = new j4e.c
            r3 = 1
            r7.<init>(r3, r0)
            ufm.f r0 = new ufm.f
            r0.<init>(r8, r7, r3)
            java.lang.String r7 = "doOnError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r7)
            r1.f171376w = r4
            java.lang.Object r8 = nim.a.b(r0, r1)
            if (r8 != r2) goto La8
        La7:
            return r2
        La8:
            od0.i r8 = (od0.i) r8
            java.lang.Object r7 = r8.g()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: mp.p.d(mp.p, gim.c):java.lang.Object");
    }

    @Override // cij.a
    public cij.a a(ViewController viewController) {
        switch (this.f207708a) {
            case 3:
                this.d = viewController;
                break;
            default:
                this.d = viewController;
                break;
        }
        return this;
    }

    @Override // kkd.f
    public Boolean b(kkd.c event) {
        hie.a aVar = (hie.a) this.f207710c;
        Intrinsics.checkNotNullParameter(event, "event");
        List list = aVar.f152599a;
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it8 = list.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                if (((Boolean) ((Function1) it8.next()).invoke(event)).booleanValue()) {
                    z = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // cij.a
    public g1 build() {
        switch (this.f207708a) {
            case 3:
                s.h((ViewController) this.d, ViewController.class);
                return new g1((afj.b) this.f207709b, (x0) this.f207710c);
            default:
                s.h((ViewController) this.d, ViewController.class);
                return new g1((afj.b) this.f207709b, (afj.l) this.f207710c);
        }
    }

    @Override // ut5.c
    public Flow c() {
        return vkm.q.Q(rd0.e.b(xv5.c.b((xv5.c) this.d)), new a0e.m((Continuation) null, this, 2));
    }

    @Override // retrofit2.Converter
    public Object convert(Object obj2) {
        a31.a aVar = (a31.a) this.d;
        b1 contentType = (b1) this.f207709b;
        mlm.h saver = (mlm.h) this.f207710c;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(saver, "saver");
        RequestBody requestBodyCreate = RequestBody.create(contentType, ((Json) ((mlm.j) aVar.f955b)).c(saver, obj2));
        Intrinsics.checkNotNullExpressionValue(requestBodyCreate, "create(contentType, string)");
        return requestBodyCreate;
    }

    @Override // t1h.l
    public t1h.o e(j60.a bottomExpandableDialogControllerExtension) {
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        return new i5f.j((v4f.a) this.f207709b, (i5f.a) this.f207710c, (gte.a) this.d, bottomExpandableDialogControllerExtension);
    }

    public bd.r f() throws GeneralSecurityException {
        t1 t1Var;
        bd.s sVar = (bd.s) this.f207709b;
        if (sVar == null || (t1Var = (t1) this.f207710c) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (sVar.f14499b != ((od.a) t1Var.f185240b).f224252a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        bd.j jVar = sVar.f14500c;
        bd.j jVar2 = bd.j.k;
        if (jVar != jVar2 && ((Integer) this.d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (jVar == jVar2 && ((Integer) this.d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (jVar == jVar2) {
            od.a.a(new byte[0]);
        } else if (jVar == bd.j.f14479j) {
            od.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.d).intValue()).array());
        } else {
            if (jVar != bd.j.i) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: " + ((bd.s) this.f207709b).f14500c);
            }
            od.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.d).intValue()).array());
        }
        return new bd.r();
    }

    public id.j g() throws GeneralSecurityException {
        t1 t1Var;
        od.a aVarA;
        id.l lVar = (id.l) this.f207709b;
        if (lVar == null || (t1Var = (t1) this.f207710c) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (lVar.f160365b != ((od.a) t1Var.f185240b).f224252a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        id.c cVar = lVar.d;
        id.c cVar2 = id.c.o;
        if (cVar != cVar2 && ((Integer) this.d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (cVar == cVar2 && ((Integer) this.d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (cVar == cVar2) {
            aVarA = od.a.a(new byte[0]);
        } else if (cVar == id.c.f160352n || cVar == id.c.f160351m) {
            aVarA = od.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.d).intValue()).array());
        } else {
            if (cVar != id.c.f160350l) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: " + ((id.l) this.f207709b).d);
            }
            aVarA = od.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.d).intValue()).array());
        }
        return new id.j((id.l) this.f207709b, aVarA);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        if (r2.a(r4, r5, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(java.lang.String r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof hie.c
            if (r0 == 0) goto L13
            r0 = r8
            hie.c r0 = (hie.c) r0
            int r1 = r0.f152601x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f152601x = r1
            goto L18
        L13:
            hie.c r0 = new hie.c
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f152601x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            goto L79
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            java.lang.String r7 = r0.u
            yhm.o.b(r8)
            goto L50
        L38:
            yhm.o.b(r8)
            java.lang.Object r8 = r6.d
            vge.z2 r8 = (vge.z2) r8
            vge.t3 r8 = (vge.t3) r8
            akg.n r8 = r8.g()
            r0.u = r7
            r0.f152601x = r4
            java.lang.Object r8 = vkm.q.z(r8, r0)
            if (r8 != r1) goto L50
            goto L78
        L50:
            com.revolut.data.model.Data r8 = (com.revolut.data.model.Data) r8
            if (r8 == 0) goto L79
            java.lang.Object r8 = r8.getContent()
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value r8 = (com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value) r8
            if (r8 == 0) goto L79
            java.lang.Object r2 = r6.f207709b
            the.a r2 = (the.a) r2
            com.revolut.feature.tab.accounts.models.ProductId r4 = r8.getF89727a()
            sfe.q r5 = new sfe.q
            com.revolut.feature.tab.accounts.models.ProductAccountId r8 = r8.getF89728b()
            r5.<init>(r8, r7)
            r7 = 0
            r0.u = r7
            r0.f152601x = r3
            java.lang.Object r7 = r2.a(r4, r5, r0)
            if (r7 != r1) goto L79
        L78:
            return r1
        L79:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: mp.p.h(java.lang.String, gim.c):java.lang.Object");
    }

    public Intent i(String deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Context context = ((z70.a) this.f207709b).getContext();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter("com.bankid.bus", "packageName");
        Uri uri2 = Uri.parse(deeplink);
        Intrinsics.checkNotNullExpressionValue(uri2, "parse(...)");
        Intent intent = new Intent("android.intent.action.VIEW", uri2);
        Intrinsics.checkNotNullParameter(intent, "<this>");
        intent.setPackage("com.bankid.bus");
        if (!xam.a.f(context, intent)) {
            intent = null;
        }
        if (intent != null) {
            return intent;
        }
        if (z) {
            return ((cpi.g) this.f207710c).u(new ui0.b("com.bankid.bus", null));
        }
        return null;
    }

    public nj0.a j() {
        phm.a aVar = (phm.a) j6.a.i((Context) this.f207710c, nj0.a.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 != null) {
            return (nj0.a) aVar2.b();
        }
        throw new IllegalStateException(a0.d.q("Api ", nj0.a.class, " is not found"));
    }

    public Object k(int i, long j2, int i2, gim.c cVar) {
        ArrayList arrayList = new ArrayList();
        n0 n0Var = new n0();
        long jMillis = ((Clock) this.d).millis();
        n0Var.f186428a = jMillis;
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        u uVar = (u) this.f207709b;
        return vkm.q.x(new gw.i(new q0(((bw.q) uVar.f10210a).e, new e0(uVar, null, 22), 1), this, arrayList, n0Var, jMillis, ref$IntRef, i2, i, j2), cVar);
    }

    public List l(byte[] bArr) {
        List list = (List) ((ConcurrentMap) this.f207709b).get(new ad.p(bArr));
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public cm.a m() {
        if (((cm.a) this.f207709b) == null) {
            this.f207709b = new cm.a();
        }
        return (cm.a) this.f207709b;
    }

    public boolean n() {
        Object objA;
        n80.e eVar = (n80.e) this.d;
        Intrinsics.checkNotNullParameter("com.bankid.bus", "packageName");
        try {
            m.Companion aVar = yhm.m.INSTANCE;
            objA = eVar.c("com.bankid.bus", 0);
        } catch (Throwable th10) {
            m.Companion aVar2 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        return !(objA instanceof yhm.n);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object o(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof c9k.m
            if (r0 == 0) goto L13
            r0 = r6
            c9k.m r0 = (c9k.m) r0
            int r1 = r0.f22506x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22506x = r1
            goto L18
        L13:
            c9k.m r0 = new c9k.m
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f22506x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.u
            yhm.o.b(r6)
            goto L48
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            java.lang.Object r6 = r4.d
            ang.f r6 = (ang.f) r6
            r2 = 0
            efm.d0 r6 = r6.f(r2)
            r0.u = r5
            r0.f22506x = r3
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            do3.n r6 = (do3.n) r6
            wi0.b r6 = do3.q.y(r6)
            java.lang.Object r0 = r4.f207710c
            z80.b r0 = (z80.b) r0
            java.lang.String r6 = r6.f297794a
            boolean r5 = r0.k(r5, r6)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mp.p.o(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0797  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x07ff  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0959  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0983  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x09e1  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0aac  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0b2b  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x0b65  */
    /* JADX WARN: Removed duplicated region for block: B:611:0x02d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:623:0x0846 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0171  */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v43, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v46, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r30v0, types: [ks3.c] */
    /* JADX WARN: Type inference failed for: r35v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v154, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v156, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v158, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v162, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v164, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v168, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v170, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v95, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public it3.d p(tt3.a r41) {
        /*
            Method dump skipped, instruction units count: 3486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mp.p.p(tt3.a):it3.d");
    }

    public jhi.k q() {
        yud.g gVar = (yud.g) this.f207709b;
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        yvd.c cVar = gVar.d;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Flow flowE = boh.f.e(cVar.f317167h.b(Unit.f186387a, loadingStrategy), new yuc.p(gVar, 1));
        Flow flowE2 = gVar.e(loadingStrategy);
        wsg.b bVar = (wsg.b) this.f207710c;
        w4l.h hVar = w4l.h.f294642c;
        Flow flowE3 = bVar.e(hVar);
        v vVar = (v) this.d;
        Continuation continuation = null;
        return nim.a.u(new d4f.m(2, 1, continuation), u0.m(u0.i(flowE, flowE2, flowE3), vkm.q.Q(new t38.e(((yud.g) vVar.d).e(hVar), 24, rd0.e.b(xv5.c.b((xv5.c) vVar.f250863b)), new awd.b(3, 28, continuation)), new cvi.i(continuation, vVar, 18))));
    }

    public pfm.a r(wj0.b bVar) {
        return ue0.e.v(pd.b.n(p0.f264003c, new iz1.p(this, bVar, null, 11)));
    }

    public /* synthetic */ p(afj.b bVar, Object obj2, int i) {
        this.f207708a = i;
        this.f207709b = bVar;
        this.f207710c = obj2;
    }

    public /* synthetic */ p(Object obj2, int i, Object obj3, Object obj4) {
        this.f207708a = i;
        this.f207709b = obj2;
        this.f207710c = obj3;
        this.d = obj4;
    }

    public p(b1 contentType, mlm.h saver, a31.a serializer) {
        this.f207708a = 15;
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(saver, "saver");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f207709b = contentType;
        this.f207710c = saver;
        this.d = serializer;
    }

    public p(v4f.a stockWithdrawInfoDialogFactory, i5f.a mapper, gte.a featureToggleInteractor) {
        this.f207708a = 25;
        Intrinsics.checkNotNullParameter(stockWithdrawInfoDialogFactory, "stockWithdrawInfoDialogFactory");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f207709b = stockWithdrawInfoDialogFactory;
        this.f207710c = mapper;
        this.d = featureToggleInteractor;
    }

    public p(u imageAnalysis, t openCvProxy, Clock clock) {
        this.f207708a = 22;
        Intrinsics.checkNotNullParameter(imageAnalysis, "imageAnalysis");
        Intrinsics.checkNotNullParameter(openCvProxy, "openCvProxy");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f207709b = imageAnalysis;
        this.f207710c = openCvProxy;
        this.d = clock;
    }

    public p(z70.a contextProvider, cpi.g storeIntentProvider, s70.a intentProvider, n80.e packageManagerWrapper) {
        this.f207708a = 27;
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(storeIntentProvider, "storeIntentProvider");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        Intrinsics.checkNotNullParameter(packageManagerWrapper, "packageManagerWrapper");
        this.f207709b = contextProvider;
        this.f207710c = storeIntentProvider;
        this.d = packageManagerWrapper;
    }

    public p(ang.f userInteractor, hzl.e pinCodeValidator, zm0.c sessionProvider) {
        this.f207708a = 24;
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(pinCodeValidator, "pinCodeValidator");
        Intrinsics.checkNotNullParameter(sessionProvider, "sessionProvider");
        this.f207709b = userInteractor;
        this.f207710c = pinCodeValidator;
        this.d = sessionProvider;
    }

    public p(b0a.k peerToPeerChatInteractor, v peerToPeerChatBottomActionBarStateProvider, n8b.a countryInteractor) {
        this.f207708a = 7;
        Intrinsics.checkNotNullParameter(peerToPeerChatInteractor, "peerToPeerChatInteractor");
        Intrinsics.checkNotNullParameter(peerToPeerChatBottomActionBarStateProvider, "peerToPeerChatBottomActionBarStateProvider");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        this.f207709b = peerToPeerChatInteractor;
        this.f207710c = peerToPeerChatBottomActionBarStateProvider;
        this.d = countryInteractor;
    }

    public p(r10.d creditApplicationMetadataDtoMapper, cr3.f creditApplicationLegacyMetadataDtoMapper) {
        this.f207708a = 10;
        Intrinsics.checkNotNullParameter(creditApplicationMetadataDtoMapper, "creditApplicationMetadataDtoMapper");
        Intrinsics.checkNotNullParameter(creditApplicationLegacyMetadataDtoMapper, "creditApplicationLegacyMetadataDtoMapper");
        this.f207709b = creditApplicationMetadataDtoMapper;
        this.f207710c = creditApplicationLegacyMetadataDtoMapper;
        this.d = r0.k(new Pair("STARTED", it3.f.STARTED), new Pair("ANSWERS_RECEIVED", it3.f.ANSWERS_RECEIVED), new Pair("INCOME_FETCH_READY", it3.f.INCOME_FETCH_READY), new Pair("INCOME_FETCH_STARTED", it3.f.INCOME_FETCH_STARTED), new Pair("INCOME_FETCH_FINISHED", it3.f.INCOME_FETCH_FINISHED), new Pair("INCOME_FETCH_FAILED", it3.f.INCOME_FETCH_FAILED), new Pair("INCOME_FETCH_BLOCKED", it3.f.INCOME_FETCH_BLOCKED), new Pair("INCOME_CHECK_PASSED", it3.f.INCOME_CHECK_PASSED), new Pair("INCOME_CHECK_FAILED", it3.f.INCOME_CHECK_FAILED), new Pair("INCOME_CHECK_SKIPPED", it3.f.INCOME_CHECK_SKIPPED), new Pair("RISK_B_PASSED", it3.f.RISK_B_PASSED), new Pair("AGREEMENT_SIGNED", it3.f.AGREEMENT_SIGNED), new Pair("READY_TO_SIGN_AGREEMENT", it3.f.READY_TO_SIGN_AGREEMENT), new Pair("EXPIRED", it3.f.EXPIRED), new Pair("APPLICATION_REJECTED", it3.f.APPLICATION_REJECTED), new Pair("LOAN_CREATED", it3.f.LOAN_CREATED), new Pair("VALIDATION_PASSED", it3.f.VALIDATION_PASSED), new Pair("PASSED_TO_SUPPORT", it3.f.PASSED_TO_SUPPORT));
    }

    public p(the.a eventDispatcher, hie.a eventsEligibilityValidator, z2 productAccountsInteractor) {
        this.f207708a = 23;
        Intrinsics.checkNotNullParameter(eventDispatcher, "eventDispatcher");
        Intrinsics.checkNotNullParameter(eventsEligibilityValidator, "eventsEligibilityValidator");
        Intrinsics.checkNotNullParameter(productAccountsInteractor, "productAccountsInteractor");
        this.f207709b = eventDispatcher;
        this.f207710c = eventsEligibilityValidator;
        this.d = productAccountsInteractor;
    }

    public p(yud.g stakingInteractor, wsg.b walletsInteractor, v ratesProvider) {
        this.f207708a = 11;
        Intrinsics.checkNotNullParameter(stakingInteractor, "stakingInteractor");
        Intrinsics.checkNotNullParameter(walletsInteractor, "walletsInteractor");
        Intrinsics.checkNotNullParameter(ratesProvider, "ratesProvider");
        this.f207709b = stakingInteractor;
        this.f207710c = walletsInteractor;
        this.d = ratesProvider;
    }

    public p(ang.f userInteractor, wwe.a checkoutSelectedTopUpMethodRelay, fxe.e checkoutTopUpMethodFeeRelay) {
        this.f207708a = 16;
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(checkoutSelectedTopUpMethodRelay, "checkoutSelectedTopUpMethodRelay");
        Intrinsics.checkNotNullParameter(checkoutTopUpMethodFeeRelay, "checkoutTopUpMethodFeeRelay");
        this.f207709b = userInteractor;
        this.f207710c = checkoutSelectedTopUpMethodRelay;
        this.d = checkoutTopUpMethodFeeRelay;
    }

    public p(gte.a featureToggleInteractor, z80.b phoneToolsProvider, ang.f userInteractor) {
        this.f207708a = 9;
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f207709b = featureToggleInteractor;
        this.f207710c = phoneToolsProvider;
        this.d = userInteractor;
    }

    public p(gte.a featureToggleInteractor, wsg.b newWalletInteractor, z juniorProductsInteractor) {
        this.f207708a = 21;
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(newWalletInteractor, "newWalletInteractor");
        Intrinsics.checkNotNullParameter(juniorProductsInteractor, "juniorProductsInteractor");
        this.f207709b = featureToggleInteractor;
        this.f207710c = newWalletInteractor;
        this.d = juniorProductsInteractor;
    }

    public p(ur5.c revolutXFiatBalanceInteractor, xv5.c cryptoCommodityBaseCurrencyInteractor, ppk.f ratesInteractor) {
        this.f207708a = 19;
        Intrinsics.checkNotNullParameter(revolutXFiatBalanceInteractor, "revolutXFiatBalanceInteractor");
        Intrinsics.checkNotNullParameter(cryptoCommodityBaseCurrencyInteractor, "cryptoCommodityBaseCurrencyInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        this.f207709b = revolutXFiatBalanceInteractor;
        this.f207710c = cryptoCommodityBaseCurrencyInteractor;
        this.d = ratesInteractor;
    }

    public p(x mandateInteractor, oe6.a externalInstitutionsInteractor, f80.a uriHelper) {
        this.f207708a = 20;
        Intrinsics.checkNotNullParameter(mandateInteractor, "mandateInteractor");
        Intrinsics.checkNotNullParameter(externalInstitutionsInteractor, "externalInstitutionsInteractor");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.f207709b = mandateInteractor;
        this.f207710c = externalInstitutionsInteractor;
        this.d = uriHelper;
    }

    public p(ap5.b cryptoWithdrawInteractor, wsg.n walletInteractor, ppk.f ratesInteractor) {
        this.f207708a = 29;
        Intrinsics.checkNotNullParameter(cryptoWithdrawInteractor, "cryptoWithdrawInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        this.f207709b = cryptoWithdrawInteractor;
        this.f207710c = walletInteractor;
        this.d = ratesInteractor;
    }

    public p(sri.m navigator, om8.c juniorPartnershipsAvailabilityInteractor, q78.e juniorAccountDestinationResolver) {
        this.f207708a = 17;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(juniorPartnershipsAvailabilityInteractor, "juniorPartnershipsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(juniorAccountDestinationResolver, "juniorAccountDestinationResolver");
        this.f207709b = navigator;
        this.f207710c = juniorPartnershipsAvailabilityInteractor;
        this.d = juniorAccountDestinationResolver;
    }

    public p(w39.b locationInteractor, g0 streetModeInteractor, j4e.a streetModeLocationCollectionEventInteractor) {
        this.f207708a = 28;
        Intrinsics.checkNotNullParameter(locationInteractor, "locationInteractor");
        Intrinsics.checkNotNullParameter(streetModeInteractor, "streetModeInteractor");
        Intrinsics.checkNotNullParameter(streetModeLocationCollectionEventInteractor, "streetModeLocationCollectionEventInteractor");
        this.f207709b = locationInteractor;
        this.f207710c = streetModeInteractor;
        this.d = streetModeLocationCollectionEventInteractor;
    }

    public p(f16.b deFiAccountsRepository, i26.k deFiAssetDetailsRepository, xv5.c cryptoCommodityBaseCurrencyInteractor) {
        this.f207708a = 1;
        Intrinsics.checkNotNullParameter(deFiAccountsRepository, "deFiAccountsRepository");
        Intrinsics.checkNotNullParameter(deFiAssetDetailsRepository, "deFiAssetDetailsRepository");
        Intrinsics.checkNotNullParameter(cryptoCommodityBaseCurrencyInteractor, "cryptoCommodityBaseCurrencyInteractor");
        this.f207709b = deFiAccountsRepository;
        this.f207710c = deFiAssetDetailsRepository;
        this.d = cryptoCommodityBaseCurrencyInteractor;
    }

    public p(ang.f userInteractor, h0 savingsInterestRateProvider, dcd.b savingsInterestRateFormatter) {
        this.f207708a = 12;
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(savingsInterestRateProvider, "savingsInterestRateProvider");
        Intrinsics.checkNotNullParameter(savingsInterestRateFormatter, "savingsInterestRateFormatter");
        this.f207709b = userInteractor;
        this.f207710c = savingsInterestRateProvider;
        this.d = savingsInterestRateFormatter;
    }

    public p(voi.h appConfiguration, Context context, List appScopedInitables) {
        this.f207708a = 0;
        Intrinsics.checkNotNullParameter(appConfiguration, "appConfiguration");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appScopedInitables, "appScopedInitables");
        this.f207709b = appConfiguration;
        this.f207710c = context;
        this.d = appScopedInitables;
    }

    public p(String id10, TextLocalisedClause title, Object obj2) {
        this.f207708a = 13;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f207709b = id10;
        this.f207710c = title;
        this.d = obj2;
    }

    public p(LinearLayout container, ImageView icon, ImageView chevron) {
        this.f207708a = 6;
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(chevron, "chevron");
        this.f207709b = container;
        this.f207710c = icon;
        this.d = chevron;
    }

    public p(ConcurrentMap concurrentMap, ad.o oVar, kd.a aVar, Class cls) {
        this.f207708a = 2;
        this.f207709b = concurrentMap;
        this.f207710c = oVar;
        this.d = aVar;
    }
}
