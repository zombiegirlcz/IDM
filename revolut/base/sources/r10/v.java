package r10;

import afj.g1;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.HandlerThread;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.crypto.tink.internal.TinkBugException;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.revolut.chat.data.db.ChatDatabase;
import com.revolut.core.ui_kit.delegates.CellDetailsTextProgressDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.shared.feature.user_declarations.api.R$string;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.Redirect;
import et6.b3;
import et6.c1;
import et6.h3;
import et6.l0;
import ff.f;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kl.t1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kotlinx.coroutines.flow.Flow;
import md.f2;
import md.g2;
import md.h1;
import md.w2;
import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.Retrofit;
import skm.e0;
import skm.r1;
import zh9.u0;
import zhm.a0;
import zhm.h0;

/* JADX INFO: loaded from: classes19.dex */
public final class v implements cij.a, flm.c, CallAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f250862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f250863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f250864c;
    public Object d;

    public /* synthetic */ v(int i) {
        this.f250862a = i;
    }

    public static String D(String str) {
        String string = d0.F0(str).toString();
        return (d0.W(string) || Character.isUpperCase(string.charAt(0))) ? string : jli.g.b(string);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(r10.v r4, java.util.ArrayList r5, xi0.b r6, java.util.List r7, gim.c r8) {
        /*
            boolean r0 = r8 instanceof fqe.d
            if (r0 == 0) goto L13
            r0 = r8
            fqe.d r0 = (fqe.d) r0
            int r1 = r0.f137256x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f137256x = r1
            goto L18
        L13:
            fqe.d r0 = new fqe.d
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f137256x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            xi0.b r6 = r0.u
            yhm.o.b(r8)
            goto L48
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r8)
            java.lang.Object r4 = r4.f250864c
            wsg.n r4 = (wsg.n) r4
            r8 = 0
            efm.d0 r4 = r4.B(r5, r6, r7, r8)
            r0.u = r6
            r0.f137256x = r3
            java.lang.Object r8 = nim.a.b(r4, r0)
            if (r8 != r1) goto L48
            return r1
        L48:
            java.util.List r8 = (java.util.List) r8
            kotlin.jvm.internal.Intrinsics.h(r8)
            dj0.d r4 = yoj.b.x(r8, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: r10.v.b(r10.v, java.util.ArrayList, xi0.b, java.util.List, gim.c):java.lang.Object");
    }

    public static String e(Uri uri2) {
        return j6.a.r(uri2.getScheme(), "://", uri2.getAuthority(), uri2.getPath());
    }

    public static final v n(g2 g2Var) throws GeneralSecurityException {
        if (g2Var.y() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        ArrayList arrayList = new ArrayList(g2Var.y());
        for (f2 f2Var : g2Var.z()) {
            f2Var.getClass();
            try {
                try {
                    ad.c cVarA = hd.l.f151354b.a(hd.r.r(f2Var.z().A(), f2Var.z().B(), f2Var.z().z(), f2Var.B(), f2Var.B() == w2.RAW ? null : Integer.valueOf(f2Var.A())));
                    int i = ad.k.f3200a[f2Var.C().ordinal()];
                    if (i != 1 && i != 2 && i != 3) {
                        throw new GeneralSecurityException("Unknown key status");
                    }
                    arrayList.add(new ad.l(cVarA));
                } catch (GeneralSecurityException unused) {
                    arrayList.add(null);
                }
            } catch (GeneralSecurityException e) {
                throw new TinkBugException("Creating a protokey serialization failed", e);
            }
        }
        return new v(g2Var, Collections.unmodifiableList(arrayList));
    }

    public static final v x(ad.g gVar, gd.b bVar) throws GeneralSecurityException, IOException {
        byte[] bArr = new byte[0];
        ByteArrayInputStream byteArrayInputStream = (ByteArrayInputStream) gVar.f3196b;
        try {
            h1 h1VarZ = h1.z(byteArrayInputStream, com.google.crypto.tink.shaded.protobuf.q.a());
            byteArrayInputStream.close();
            if (h1VarZ.x().size() == 0) {
                throw new GeneralSecurityException("empty keyset");
            }
            try {
                g2 g2VarD = g2.D(bVar.decrypt(h1VarZ.x().e(), bArr), com.google.crypto.tink.shaded.protobuf.q.a());
                if (g2VarD.y() > 0) {
                    return n(g2VarD);
                }
                throw new GeneralSecurityException("empty keyset");
            } catch (InvalidProtocolBufferException unused) {
                throw new GeneralSecurityException("invalid keyset, corrupted key material");
            }
        } catch (Throwable th10) {
            byteArrayInputStream.close();
            throw th10;
        }
    }

    public void A(f fVar) {
        this.d = fVar;
    }

    public void B(String str) {
        this.f250863b = str;
    }

    public void C(long j2) {
        this.f250864c = Long.valueOf(j2);
    }

    public j01.c E(CellDetailsTextProgressDelegate.Model data) {
        Intrinsics.checkNotNullParameter(data, "data");
        j01.c cVar = (j01.c) this.d;
        if (cVar == null) {
            j01.c cVar2 = new j01.c((View[]) Arrays.copyOf((View[]) this.f250863b, 2), data, (ihm.f) this.f250864c, null);
            this.d = cVar2;
            cVar = cVar2;
        }
        Intrinsics.checkNotNullParameter(data, "data");
        cVar.d = data;
        return cVar;
    }

    @Override // cij.a
    public cij.a a(ViewController viewController) {
        switch (this.f250862a) {
            case 2:
                this.d = viewController;
                break;
            default:
                this.d = viewController;
                break;
        }
        return this;
    }

    @Override // retrofit2.CallAdapter
    public Object adapt(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        return new i2m.e(call, this);
    }

    @Override // cij.a
    public g1 build() {
        switch (this.f250862a) {
            case 2:
                vc.s.h((ViewController) this.d, ViewController.class);
                return new g1((afj.b) this.f250863b, (afj.j) this.f250864c);
            default:
                vc.s.h((ViewController) this.d, ViewController.class);
                return new g1((afj.b) this.f250863b, (afj.p) this.f250864c);
        }
    }

    public void c() {
        ViewGroup viewGroup = (ViewGroup) this.f250864c;
        if (viewGroup.getParent() != null) {
            return;
        }
        ViewParent parent = ((au0.o) this.f250863b).getParent();
        CoordinatorLayout coordinatorLayout = parent instanceof CoordinatorLayout ? (CoordinatorLayout) parent : null;
        if (coordinatorLayout == null) {
            return;
        }
        coordinatorLayout.addView(viewGroup);
        ((Function1) this.d).invoke(viewGroup);
    }

    public bog.h d(bog.h hVar, String str, boolean z, TextLocalisedClause textLocalisedClause) {
        if (z) {
            textLocalisedClause = (TextLocalisedClause) this.d;
        }
        TextLocalisedClause textLocalisedClause2 = textLocalisedClause;
        Integer numValueOf = z ? Integer.valueOf(((cog.e) this.f250864c).f25547a) : null;
        Clause label = hVar.d;
        Intrinsics.checkNotNullParameter(label, "label");
        return new bog.h(str, label, textLocalisedClause2, z, z, numValueOf);
    }

    public bd.n f() throws GeneralSecurityException {
        t1 t1Var;
        bd.o oVar = (bd.o) this.f250863b;
        if (oVar == null || (t1Var = (t1) this.f250864c) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (oVar.f14493b != ((od.a) t1Var.f185240b).f224252a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        bd.j jVar = oVar.e;
        bd.j jVar2 = bd.j.f14478h;
        if (jVar != jVar2 && ((Integer) this.d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (jVar == jVar2 && ((Integer) this.d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (jVar == jVar2) {
            od.a.a(new byte[0]);
        } else if (jVar == bd.j.f14477g) {
            od.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.d).intValue()).array());
        } else {
            if (jVar != bd.j.f) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: " + ((bd.o) this.f250863b).e);
            }
            od.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.d).intValue()).array());
        }
        return new bd.n();
    }

    public ff.b g() {
        if ("".isEmpty()) {
            return new ff.b((String) this.f250863b, ((Long) this.f250864c).longValue(), (f) this.d);
        }
        throw new IllegalStateException("Missing required properties:".concat(""));
    }

    public id.d h() throws GeneralSecurityException {
        Integer num = (Integer) this.f250863b;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (((Integer) this.f250864c) == null) {
            throw new GeneralSecurityException("tag size not set");
        }
        if (((id.c) this.d) != null) {
            return new id.d(num.intValue(), ((Integer) this.f250864c).intValue(), (id.c) this.d);
        }
        throw new GeneralSecurityException("variant not set");
    }

    public bog.d i(bog.r rVar, String str, boolean z, boolean z3, wi0.b bVar) {
        return bog.d.e(rVar.f17450a, str, z ? (TextLocalisedClause) this.d : com.bumptech.glide.d.w(bVar) ? new TextLocalisedClause(R$string.signup_main_form_first_name_footer_ukraine, null, null, 14) : com.bumptech.glide.d.r(bVar) ? new TextLocalisedClause(com.revolut.feature.user_declarations.shared.R$string.signup_main_form_first_name_footer_israel, null, null, 14) : new TextLocalisedClause(com.revolut.feature.user_declarations.shared.R$string.signup_main_form_first_name_footer, null, null, 14), z || z3, z, z ? Integer.valueOf(((cog.e) this.f250864c).f25547a) : null);
    }

    public bog.f j(bog.t tVar, String str, boolean z, boolean z3) {
        bog.f fVar = tVar.f17457b;
        boolean z4 = z || z3;
        TextLocalisedClause textLocalisedClause = z ? (TextLocalisedClause) this.d : null;
        Integer numValueOf = z ? Integer.valueOf(((cog.e) this.f250864c).f25547a) : null;
        Clause label = fVar.d;
        Intrinsics.checkNotNullParameter(label, "label");
        return new bog.f(str, label, textLocalisedClause, z4, z, numValueOf);
    }

    public bog.j k(bog.j jVar, String str, boolean z, boolean z3, String str2) {
        cog.e eVar = (cog.e) this.f250864c;
        if (jVar == null) {
            return null;
        }
        boolean z4 = z || z3;
        TextLocalisedClause helperText = z4 ? (TextLocalisedClause) this.d : new TextLocalisedClause(com.revolut.feature.user_declarations.shared.R$string.signup_main_form_middle_name_footer, null, null, 14);
        Integer numValueOf = z4 ? Integer.valueOf(eVar.f25547a) : null;
        Integer numB = z3 ? eVar.b(str2, str) : null;
        Clause label = jVar.d;
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(helperText, "helperText");
        return new bog.j(str, label, helperText, z4, z4, numValueOf, numB);
    }

    public bog.p l(bog.p pVar, String str, boolean z, boolean z3, String str2) {
        cog.e eVar = (cog.e) this.f250864c;
        boolean z4 = z || z3;
        TextLocalisedClause helperText = z4 ? (TextLocalisedClause) this.d : new TextLocalisedClause(com.revolut.feature.user_declarations.shared.R$string.signup_main_form_second_surname_helper, null, null, 14);
        Integer numValueOf = z4 ? Integer.valueOf(eVar.f25547a) : null;
        Integer numB = z3 ? eVar.b(str2, str) : null;
        Clause label = pVar.d;
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(helperText, "helperText");
        return new bog.p(str, label, helperText, z4, z4, numValueOf, numB);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    public Redirect m(String url2) {
        Object next;
        Intrinsics.checkNotNullParameter(url2, "url");
        Uri uriF = ((f80.b) ((f80.a) this.f250864c)).f(url2);
        String strE = e(uriF);
        Set<String> queryParameterNames = uriF.getQueryParameterNames();
        Intrinsics.checkNotNullExpressionValue(queryParameterNames, "getQueryParameterNames(...)");
        Set setI1 = zhm.d0.i1(queryParameterNames);
        Iterator it8 = ((List) this.d.getValue()).iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            gv8.a aVar = (gv8.a) next;
            if (Intrinsics.f(aVar.f147075b, strE) && setI1.containsAll(aVar.f147076c)) {
                break;
            }
        }
        gv8.a aVar2 = (gv8.a) next;
        if (aVar2 != null) {
            return aVar2.f147074a;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object o(zm3.e r7, gim.c r8) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.d
            f01.a r0 = (f01.a) r0
            boolean r1 = r8 instanceof ee8.f
            if (r1 == 0) goto L17
            r1 = r8
            ee8.f r1 = (ee8.f) r1
            int r2 = r1.f125150x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f125150x = r2
            goto L1c
        L17:
            ee8.f r1 = new ee8.f
            r1.<init>(r6, r8)
        L1c:
            java.lang.Object r8 = r1.v
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f125150x
            r4 = 1
            if (r3 == 0) goto L35
            if (r3 != r4) goto L2d
            zm3.e r7 = r1.u
            yhm.o.b(r8)
            goto L4b
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            yhm.o.b(r8)
            java.lang.Object r8 = r6.f250863b
            jx0.a r8 = (jx0.a) r8
            efm.d0 r8 = r8.l()
            r1.u = r7
            r1.f125150x = r4
            java.lang.Object r8 = nim.a.b(r8, r1)
            if (r8 != r2) goto L4b
            return r2
        L4b:
            java.lang.String r8 = (java.lang.String) r8
            com.revolut.core.ui_kit.models.TextLocalisedClause r1 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r2 = com.revolut.feature.junior_coparent.impl.R$string.junior_co_parent_invitation_email_subject
            r3 = 14
            r4 = 0
            r1.<init>(r2, r4, r4, r3)
            com.revolut.core.ui_kit.models.TextLocalisedClause r2 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r3 = com.revolut.feature.junior_coparent.impl.R$string.rev_u18_co_parent_invitation_email_message
            java.util.List r8 = zhm.u.c(r8)
            r5 = 12
            r2.<init>(r3, r8, r4, r5)
            java.lang.Object r8 = r6.f250864c
            s70.a r8 = (s70.a) r8
            java.lang.CharSequence r1 = r0.b(r1)
            java.lang.String r1 = r1.toString()
            java.lang.CharSequence r0 = r0.b(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r7 = r7.f323340a
            java.lang.String[] r7 = new java.lang.String[]{r7}
            s70.b r8 = (s70.b) r8
            android.content.Intent r7 = r8.d(r1, r0, r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: r10.v.o(zm3.e, gim.c):java.lang.Object");
    }

    public ArrayList p() {
        return (ArrayList) this.f250863b;
    }

    public List q() {
        return (List) this.d;
    }

    public ArrayList r() {
        return (ArrayList) this.f250864c;
    }

    @Override // retrofit2.CallAdapter
    public Type responseType() {
        return (Type) this.f250864c;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object s(java.lang.Class r17) throws java.security.GeneralSecurityException {
        /*
            Method dump skipped, instruction units count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r10.v.s(java.lang.Class):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object t(zm3.f r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ee8.g
            if (r0 == 0) goto L13
            r0 = r6
            ee8.g r0 = (ee8.g) r0
            int r1 = r0.f125152x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f125152x = r1
            goto L18
        L13:
            ee8.g r0 = new ee8.g
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f125152x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            zm3.f r5 = r0.u
            yhm.o.b(r6)
            goto L47
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            java.lang.Object r6 = r4.f250863b
            jx0.a r6 = (jx0.a) r6
            efm.d0 r6 = r6.l()
            r0.u = r5
            r0.f125152x = r3
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            java.lang.String r6 = (java.lang.String) r6
            com.revolut.core.ui_kit.models.TextLocalisedClause r0 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.feature.junior_coparent.impl.R$string.rev_u18_co_parent_invitation_sms_message
            java.util.List r6 = zhm.u.c(r6)
            r2 = 0
            r3 = 12
            r0.<init>(r1, r6, r2, r3)
            java.lang.Object r6 = r4.f250864c
            s70.a r6 = (s70.a) r6
            java.lang.String r5 = r5.f323345a
            java.lang.Object r1 = r4.d
            f01.a r1 = (f01.a) r1
            java.lang.CharSequence r0 = r1.b(r0)
            java.lang.String r0 = r0.toString()
            s70.b r6 = (s70.b) r6
            android.content.Intent r5 = r6.e(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r10.v.t(zm3.f, gim.c):java.lang.Object");
    }

    public String toString() {
        switch (this.f250862a) {
            case 1:
                return ad.s.a((g2) this.f250863b).toString();
            default:
                return super.toString();
        }
    }

    public Object u(cs6.a aVar, gim.c cVar) {
        int i = b3.f129197a[aVar.ordinal()];
        if (i == 1) {
            return v(cVar);
        }
        if (i != 2) {
            if (i == 3) {
                return ((l0) ((gr6.e) this.f250863b)).i(cVar);
            }
            throw new NoWhenBranchMatchedException();
        }
        h3 h3Var = (h3) this.d;
        h3Var.getClass();
        return e0.o(new dp4.p(h3Var, null, 20), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object v(gim.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof et6.c3
            if (r0 == 0) goto L13
            r0 = r9
            et6.c3 r0 = (et6.c3) r0
            int r1 = r0.f129208w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129208w = r1
            goto L18
        L13:
            et6.c3 r0 = new et6.c3
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f129208w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r9)
            goto L79
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L2f:
            yhm.o.b(r9)
            java.lang.Object r9 = r8.f250864c
            et6.c1 r9 = (et6.c1) r9
            r9.getClass()
            w4l.h r2 = w4l.h.f294642c
            java.lang.String r4 = "loadingStrategy"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            jf1.a r9 = r9.f129204a
            zfc.d r9 = (zfc.d) r9
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            o7.b r2 = r9.f321922a
            zhm.h0 r4 = zhm.h0.f322473a
            zfc.a r5 = new zfc.a
            r6 = 0
            r5.<init>(r9, r6)
            kotlinx.coroutines.flow.Flow r9 = r2.r(r4, r5)
            et6.w r2 = new et6.w
            r5 = 20
            r2.<init>(r5)
            akg.n r9 = nim.a.v(r9, r2)
            r2 = 0
            r5 = 3
            jhi.b r9 = mo3.a.g(r9, r2, r2, r5)
            eob.e r6 = new eob.e
            r7 = 5
            r6.<init>(r5, r7, r2)
            vkm.y r9 = rd0.e.e(r9, r4, r6)
            r0.f129208w = r3
            java.lang.Object r9 = vkm.q.z(r9, r0)
            if (r9 != r1) goto L79
            return r1
        L79:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = pd.b.j(r9)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: r10.v.v(gim.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public jhi.k w(List walletsWithPockets, Map teenProfiles, xi0.b baseCurrency) {
        Flow flowI;
        Object[] objArr;
        Intrinsics.checkNotNullParameter(walletsWithPockets, "walletsWithPockets");
        Intrinsics.checkNotNullParameter(teenProfiles, "teenProfiles");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = walletsWithPockets.iterator();
        while (it8.hasNext()) {
            a0.x((List) ((Pair) it8.next()).f186386b, arrayList);
        }
        if (arrayList.isEmpty()) {
            flowI = zi0.c.i(zhm.u.c(new n9l.a(1.0d, baseCurrency, baseCurrency)));
        } else {
            Iterator it9 = arrayList.iterator();
            while (it9.hasNext()) {
                if (!Intrinsics.f(((io3.d) it9.next()).f163147c, baseCurrency.f306286a)) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it10 = arrayList.iterator();
                    while (true) {
                        Pair pair = null;
                        objArr = 0;
                        if (!it10.hasNext()) {
                            break;
                        }
                        io3.d dVar = (io3.d) it10.next();
                        if (!Intrinsics.f(dVar.f163147c, baseCurrency.f306286a)) {
                            xi0.a aVar = xi0.b.Companion;
                            String str = dVar.f163147c;
                            aVar.getClass();
                            pair = new Pair(xi0.a.a(str), baseCurrency);
                        }
                        if (pair != null) {
                            arrayList2.add(pair);
                        }
                    }
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : arrayList2) {
                        if (hashSet.add(((xi0.b) ((Pair) obj2).f186385a).f306286a)) {
                            arrayList3.add(obj2);
                        }
                    }
                    flowI = rd0.e.e(rd0.e.b(((ppk.f) this.f250863b).d(arrayList3, age.c.f4818a)), h0.f322473a, new eob.e(3, 22, objArr == true ? 1 : 0));
                }
            }
            flowI = zi0.c.i(zhm.u.c(new n9l.a(1.0d, baseCurrency, baseCurrency)));
        }
        return nim.a.u(new fqe.f(walletsWithPockets, teenProfiles, this, baseCurrency, null), u0.m(flowI, new ahe.l(((wa7.m) this.d).k(), 3)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008f, code lost:
    
        if (r9 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object y(java.lang.String r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof hea.o0
            if (r0 == 0) goto L13
            r0 = r9
            hea.o0 r0 = (hea.o0) r0
            int r1 = r0.f151656x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f151656x = r1
            goto L18
        L13:
            hea.o0 r0 = new hea.o0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f151656x
            w4l.h r3 = w4l.h.f294642c
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            java.lang.String r8 = r0.u
            yhm.o.b(r9)
            goto L92
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            yhm.o.b(r9)
            goto L67
        L3b:
            yhm.o.b(r9)
            java.lang.Object r9 = r7.f250863b
            gte.a r9 = (gte.a) r9
            com.revolut.feature.teen.accounts.api.TeenAccountsApi$Toggles$TeenGuardianHub r2 = com.revolut.feature.teen.accounts.api.TeenAccountsApi$Toggles$TeenGuardianHub.f90321c
            boolean r9 = r9.a(r2)
            if (r9 == 0) goto L4b
            goto Lab
        L4b:
            java.lang.Object r9 = r7.f250864c
            wsg.b r9 = (wsg.b) r9
            kotlinx.coroutines.flow.Flow r8 = r9.d(r8, r3)
            hb6.g r9 = new hb6.g
            r2 = 16
            r9.<init>(r2)
            jhi.b r8 = mo3.a.g(r8, r6, r9, r5)
            r0.f151656x = r5
            java.lang.Object r9 = vkm.q.x(r8, r0)
            if (r9 != r1) goto L67
            goto L91
        L67:
            kotlin.Pair r9 = (kotlin.Pair) r9
            java.lang.Object r8 = r9.f186385a
            fo3.c r8 = (fo3.c) r8
            java.lang.String r8 = r8.f136805h
            java.lang.String r9 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r9)
            java.lang.Object r9 = r7.d
            xqe.b r9 = (xqe.b) r9
            akg.n r9 = r9.b(r3)
            hb6.g r2 = new hb6.g
            r3 = 17
            r2.<init>(r3)
            jhi.b r9 = mo3.a.g(r9, r6, r2, r5)
            r0.u = r8
            r0.f151656x = r4
            java.lang.Object r9 = vkm.q.x(r9, r0)
            if (r9 != r1) goto L92
        L91:
            return r1
        L92:
            java.util.Map r9 = (java.util.Map) r9
            com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId r0 = new com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId
            r0.<init>(r8)
            com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId r1 = new com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId
            r1.<init>(r8)
            boolean r8 = r9.containsKey(r1)
            if (r8 == 0) goto La5
            goto La6
        La5:
            r0 = r6
        La6:
            if (r0 == 0) goto Lab
            java.lang.String r8 = r0.f74764a
            return r8
        Lab:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r10.v.y(java.lang.String, gim.c):java.lang.Object");
    }

    public void z(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
        this.f250863b = Integer.valueOf(i);
    }

    public /* synthetic */ v(afj.b bVar, Object obj2, int i) {
        this.f250862a = i;
        this.f250863b = bVar;
        this.f250864c = obj2;
    }

    public v(View[] viewsToHighlight, ihm.f onClickSubject) {
        this.f250862a = 26;
        Intrinsics.checkNotNullParameter(viewsToHighlight, "viewsToHighlight");
        Intrinsics.checkNotNullParameter(onClickSubject, "onClickSubject");
        this.f250863b = viewsToHighlight;
        this.f250864c = onClickSubject;
    }

    public v(i2m.g gVar, Retrofit retrofit, Type responseType) {
        this.f250862a = 23;
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(responseType, "responseType");
        this.d = gVar;
        this.f250863b = retrofit;
        this.f250864c = responseType;
    }

    public v(au0.o navBarView, ViewGroup headerView, Function1 onHeaderAddedToParent) {
        this.f250862a = 5;
        Intrinsics.checkNotNullParameter(navBarView, "navBarView");
        Intrinsics.checkNotNullParameter(headerView, "headerView");
        Intrinsics.checkNotNullParameter(onHeaderAddedToParent, "onHeaderAddedToParent");
        this.f250863b = navBarView;
        this.f250864c = headerView;
        this.d = onHeaderAddedToParent;
    }

    public v(List redirects, f80.a uriHelper) {
        this.f250862a = 20;
        Intrinsics.checkNotNullParameter(redirects, "redirects");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.f250863b = redirects;
        this.f250864c = uriHelper;
        this.d = te0.w.y0(new g8i.h(this, 27));
    }

    public v(zt2.c callSecurityInfoInteractor, cu2.c callDetectionRepository, du2.j callStatusInfoHolder) {
        this.f250862a = 12;
        Intrinsics.checkNotNullParameter(callSecurityInfoInteractor, "callSecurityInfoInteractor");
        Intrinsics.checkNotNullParameter(callDetectionRepository, "callDetectionRepository");
        Intrinsics.checkNotNullParameter(callStatusInfoHolder, "callStatusInfoHolder");
        this.f250863b = callSecurityInfoInteractor;
        this.f250864c = callDetectionRepository;
        this.d = callStatusInfoHolder;
    }

    public v(gr6.e freelancerAvailabilityInteractor, c1 freelancerEcommerceInteractor, h3 freelancerSaleTypeAvailabilityInteractor) {
        this.f250862a = 15;
        Intrinsics.checkNotNullParameter(freelancerAvailabilityInteractor, "freelancerAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(freelancerEcommerceInteractor, "freelancerEcommerceInteractor");
        Intrinsics.checkNotNullParameter(freelancerSaleTypeAvailabilityInteractor, "freelancerSaleTypeAvailabilityInteractor");
        this.f250863b = freelancerAvailabilityInteractor;
        this.f250864c = freelancerEcommerceInteractor;
        this.d = freelancerSaleTypeAvailabilityInteractor;
    }

    public v(nmc.d roboPortfolioUiMapper, boc.m actionsWidget, spc.h rebalanceStatusMapper) {
        this.f250862a = 22;
        Intrinsics.checkNotNullParameter(roboPortfolioUiMapper, "roboPortfolioUiMapper");
        Intrinsics.checkNotNullParameter(actionsWidget, "actionsWidget");
        Intrinsics.checkNotNullParameter(rebalanceStatusMapper, "rebalanceStatusMapper");
        this.f250863b = roboPortfolioUiMapper;
        this.f250864c = actionsWidget;
        this.d = rebalanceStatusMapper;
    }

    public v(jx0.a inviteContactInteractor, s70.a intentProvider, f01.a uiKitResources) {
        this.f250862a = 14;
        Intrinsics.checkNotNullParameter(inviteContactInteractor, "inviteContactInteractor");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f250863b = inviteContactInteractor;
        this.f250864c = intentProvider;
        this.d = uiKitResources;
    }

    public v(m2j.j balancesInteractor, wa7.m hiddenAccountsInteractor, za7.c hiddenBalancesIdProvider) {
        this.f250862a = 27;
        Intrinsics.checkNotNullParameter(balancesInteractor, "balancesInteractor");
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        Intrinsics.checkNotNullParameter(hiddenBalancesIdProvider, "hiddenBalancesIdProvider");
        this.f250863b = balancesInteractor;
        this.f250864c = hiddenAccountsInteractor;
        this.d = hiddenBalancesIdProvider;
    }

    public v(m30.g activeTicketsInteractor, e40.w ticketTilesFactory, j30.c chatFeatureToggles) {
        this.f250862a = 13;
        Intrinsics.checkNotNullParameter(activeTicketsInteractor, "activeTicketsInteractor");
        Intrinsics.checkNotNullParameter(ticketTilesFactory, "ticketTilesFactory");
        Intrinsics.checkNotNullParameter(chatFeatureToggles, "chatFeatureToggles");
        this.f250863b = activeTicketsInteractor;
        this.f250864c = ticketTilesFactory;
        this.d = chatFeatureToggles;
    }

    public v(q4g.g headerMapper, q4g.i bookingStatusMapper, q4g.k boundsSectionMapper, q4g.r travellersSectionMapper, q4g.e additionalDetailsMapper) {
        this.f250862a = 8;
        Intrinsics.checkNotNullParameter(headerMapper, "headerMapper");
        Intrinsics.checkNotNullParameter(bookingStatusMapper, "bookingStatusMapper");
        Intrinsics.checkNotNullParameter(boundsSectionMapper, "boundsSectionMapper");
        Intrinsics.checkNotNullParameter(travellersSectionMapper, "travellersSectionMapper");
        Intrinsics.checkNotNullParameter(additionalDetailsMapper, "additionalDetailsMapper");
        this.f250863b = boundsSectionMapper;
        this.f250864c = travellersSectionMapper;
        this.d = additionalDetailsMapper;
    }

    public v(b0a.k peerToPeerChatInteractor, qz9.t suggestionsInteractor, a61.a peerToPeerChatTinyActionButtonStateProvider) {
        this.f250862a = 6;
        Intrinsics.checkNotNullParameter(peerToPeerChatInteractor, "peerToPeerChatInteractor");
        Intrinsics.checkNotNullParameter(suggestionsInteractor, "suggestionsInteractor");
        Intrinsics.checkNotNullParameter(peerToPeerChatTinyActionButtonStateProvider, "peerToPeerChatTinyActionButtonStateProvider");
        this.f250863b = peerToPeerChatInteractor;
        this.f250864c = suggestionsInteractor;
        this.d = peerToPeerChatTinyActionButtonStateProvider;
    }

    public v(gte.a featureToggleInteractor, wsg.b newWalletsInteractor, xqe.b teenProfileInteractor) {
        this.f250862a = 21;
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(newWalletsInteractor, "newWalletsInteractor");
        Intrinsics.checkNotNullParameter(teenProfileInteractor, "teenProfileInteractor");
        this.f250863b = featureToggleInteractor;
        this.f250864c = newWalletsInteractor;
        this.d = teenProfileInteractor;
    }

    public v(List list) {
        this.f250862a = 19;
        this.d = list;
        this.f250863b = new ArrayList(list.size());
        this.f250864c = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            ((ArrayList) this.f250863b).add(new g7.o((List) ((m7.j) list.get(i)).f203241b.f22248b));
            ((ArrayList) this.f250864c).add(((m7.j) list.get(i)).f203242c.a());
        }
    }

    public v(rla.c appearanceSettingsInteractor, ffk.t pricingPlanInteractor, sfk.a pricingPlanChangeObservable) {
        this.f250862a = 25;
        Intrinsics.checkNotNullParameter(appearanceSettingsInteractor, "appearanceSettingsInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanChangeObservable, "pricingPlanChangeObservable");
        this.f250863b = appearanceSettingsInteractor;
        this.f250864c = pricingPlanInteractor;
        this.d = pricingPlanChangeObservable;
    }

    public v(zzl.b regexMatcher, cog.e maxLengthValidator) {
        this.f250862a = 9;
        Intrinsics.checkNotNullParameter(regexMatcher, "regexMatcher");
        Intrinsics.checkNotNullParameter(maxLengthValidator, "maxLengthValidator");
        this.f250863b = regexMatcher;
        this.f250864c = maxLengthValidator;
        this.d = new TextLocalisedClause(com.revolut.feature.user_declarations.shared.R$string.signup_main_form_name_error_too_long, null, null, 14);
    }

    public v(xv5.c cryptoCommodityBaseCurrencyInteractor, ppk.f ratesInteractor, yud.g stakingInteractor) {
        this.f250862a = 10;
        Intrinsics.checkNotNullParameter(cryptoCommodityBaseCurrencyInteractor, "cryptoCommodityBaseCurrencyInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(stakingInteractor, "stakingInteractor");
        this.f250863b = cryptoCommodityBaseCurrencyInteractor;
        this.f250864c = ratesInteractor;
        this.d = stakingInteractor;
    }

    public v(ffk.t pricingPlanInteractor, ang.f userInteractor, al2.e mapper) {
        this.f250862a = 4;
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f250863b = pricingPlanInteractor;
        this.f250864c = userInteractor;
        this.d = mapper;
    }

    public v(gej.a esimBytesFormatter, bej.f esimPlanOffersInteractor, cej.a esimFeatureAvailabilityInteractor) {
        this.f250862a = 11;
        Intrinsics.checkNotNullParameter(esimBytesFormatter, "esimBytesFormatter");
        Intrinsics.checkNotNullParameter(esimPlanOffersInteractor, "esimPlanOffersInteractor");
        Intrinsics.checkNotNullParameter(esimFeatureAvailabilityInteractor, "esimFeatureAvailabilityInteractor");
        this.f250863b = esimBytesFormatter;
        this.f250864c = esimPlanOffersInteractor;
        this.d = esimFeatureAvailabilityInteractor;
    }

    public v(ael.q pnlInteractor, k9l.a ratesInteractor, ybl.b instrumentTickerInteractor, jpc.a minimalInfoHoldingMapper) {
        this.f250862a = 28;
        Intrinsics.checkNotNullParameter(pnlInteractor, "pnlInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(minimalInfoHoldingMapper, "minimalInfoHoldingMapper");
        this.f250863b = pnlInteractor;
        this.f250864c = ratesInteractor;
        this.d = instrumentTickerInteractor;
    }

    public v(ppk.f ratesInteractor, wsg.n walletInteractor, wa7.m hiddenAccountsInteractor) {
        this.f250862a = 18;
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        this.f250863b = ratesInteractor;
        this.f250864c = walletInteractor;
        this.d = hiddenAccountsInteractor;
    }

    public v(ChatDatabase chatDatabase) {
        this.f250862a = 0;
        this.f250863b = chatDatabase;
        this.f250864c = new ofg.i(this, 20);
        this.d = new ofg.i(21);
    }

    public v(SensorManager sensorManager, jw.d listener, HandlerThread thread) {
        this.f250862a = 29;
        Intrinsics.checkNotNullParameter(sensorManager, "sensorManager");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(thread, "thread");
        this.f250863b = sensorManager;
        this.f250864c = listener;
        this.d = thread;
    }

    public v(r1 r1Var, Function3 function3) {
        this.f250862a = 17;
        this.f250863b = r1Var;
        this.f250864c = function3;
        this.d = flm.j.f136014a;
    }

    public v(g2 g2Var, List list) {
        this.f250862a = 1;
        this.f250863b = g2Var;
        this.f250864c = list;
        this.d = kd.a.f182756b;
    }
}
