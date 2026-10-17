package b9;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;

/* JADX INFO: loaded from: classes16.dex */
public final class u implements ix0.u, lki.x, fgm.p, KotlinTypeChecker.TypeConstructorEquality {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f13476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f13477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f13478c;

    public /* synthetic */ u(Object obj2, Object obj3) {
        this.f13477b = obj2;
        this.f13478c = obj3;
    }

    public static int a(ArrayList arrayList, int i, s1 s1Var) {
        int i2 = 0;
        if (i < 0) {
            return 0;
        }
        Object obj2 = arrayList.get(i);
        q1 q1Var = s1Var.f13480b;
        if (obj2 != q1Var) {
            return -1;
        }
        Iterator it8 = q1Var.getChildren().iterator();
        while (it8.hasNext()) {
            if (((u1) it8.next()) == s1Var) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static ArrayList j(f fVar) {
        ArrayList arrayList = new ArrayList();
        while (!fVar.j()) {
            String str = (String) fVar.f13490c;
            String strSubstring = null;
            if (!fVar.j()) {
                int i = fVar.f13488a;
                char cCharAt = str.charAt(i);
                if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
                    fVar.f13488a = i;
                } else {
                    int iD = fVar.d();
                    while (true) {
                        if ((iD < 65 || iD > 90) && (iD < 97 || iD > 122)) {
                            break;
                        }
                        iD = fVar.d();
                    }
                    strSubstring = str.substring(i, fVar.f13488a);
                }
            }
            if (strSubstring == null) {
                break;
            }
            try {
                arrayList.add(h.valueOf(strSubstring));
            } catch (IllegalArgumentException unused) {
            }
            if (!fVar.v()) {
                break;
            }
        }
        return arrayList;
    }

    public static boolean m(r rVar, int i, ArrayList arrayList, int i2, s1 s1Var) {
        s sVar = (s) rVar.f13454a.get(i);
        if (!p(sVar, s1Var)) {
            return false;
        }
        g gVar = sVar.f13460a;
        if (gVar == g.DESCENDANT) {
            if (i != 0) {
                while (i2 >= 0) {
                    if (!o(rVar, i - 1, arrayList, i2)) {
                        i2--;
                    }
                }
                return false;
            }
            return true;
        }
        if (gVar == g.CHILD) {
            return o(rVar, i - 1, arrayList, i2);
        }
        int iA = a(arrayList, i2, s1Var);
        if (iA <= 0) {
            return false;
        }
        return m(rVar, i - 1, arrayList, i2, (s1) s1Var.f13480b.getChildren().get(iA - 1));
    }

    public static boolean n(r rVar, s1 s1Var) {
        ArrayList arrayList = new ArrayList();
        Object obj2 = s1Var.f13480b;
        while (true) {
            if (obj2 == null) {
                break;
            }
            arrayList.add(0, obj2);
            obj2 = ((u1) obj2).f13480b;
        }
        int size = arrayList.size() - 1;
        ArrayList arrayList2 = rVar.f13454a;
        if ((arrayList2 == null ? 0 : arrayList2.size()) == 1) {
            return p((s) rVar.f13454a.get(0), s1Var);
        }
        ArrayList arrayList3 = rVar.f13454a;
        return m(rVar, (arrayList3 != null ? arrayList3.size() : 0) - 1, arrayList, size, s1Var);
    }

    public static boolean o(r rVar, int i, ArrayList arrayList, int i2) {
        s sVar = (s) rVar.f13454a.get(i);
        s1 s1Var = (s1) arrayList.get(i2);
        if (!p(sVar, s1Var)) {
            return false;
        }
        g gVar = sVar.f13460a;
        if (gVar == g.DESCENDANT) {
            if (i != 0) {
                while (i2 > 0) {
                    i2--;
                    if (o(rVar, i - 1, arrayList, i2)) {
                    }
                }
                return false;
            }
            return true;
        }
        if (gVar == g.CHILD) {
            return o(rVar, i - 1, arrayList, i2 - 1);
        }
        int iA = a(arrayList, i2, s1Var);
        if (iA <= 0) {
            return false;
        }
        return m(rVar, i - 1, arrayList, i2, (s1) s1Var.f13480b.getChildren().get(iA - 1));
    }

    public static boolean p(s sVar, s1 s1Var) {
        ArrayList arrayList;
        String str = sVar.f13461b;
        if (str != null && !str.equals(s1Var.m().toLowerCase(Locale.US))) {
            return false;
        }
        ArrayList<c> arrayList2 = sVar.f13462c;
        if (arrayList2 != null) {
            for (c cVar : arrayList2) {
                String str2 = cVar.f13314a;
                String str3 = cVar.f13316c;
                if (str2.equals("id")) {
                    if (!str3.equals(s1Var.f13463c)) {
                        return false;
                    }
                } else if (!str2.equals("class") || (arrayList = s1Var.f13464g) == null || !arrayList.contains(str3)) {
                    return false;
                }
            }
        }
        ArrayList arrayList3 = sVar.d;
        if (arrayList3 == null) {
            return true;
        }
        Iterator it8 = arrayList3.iterator();
        while (it8.hasNext()) {
            if (!((i) it8.next()).a(s1Var)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.q] */
    @Override // ix0.u
    public int B(bw0.h model) {
        Intrinsics.checkNotNullParameter(model, "model");
        String strY = ((ix0.m) this.f13477b).y();
        return strY != null ? kotlin.text.d0.W(strY) ^ true : false ? b(model) : ((Number) ((kotlin.jvm.internal.q) this.f13478c).invoke(Integer.valueOf(R$attr.uikit_colorGreyTone50))).intValue();
    }

    @Override // ix0.u
    public int E(bw0.h model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return b(model);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.q] */
    public int b(bw0.h hVar) {
        int i;
        ?? r06 = (kotlin.jvm.internal.q) this.f13478c;
        if (hVar.o.a()) {
            i = R$attr.uikit_colorGreyTone50_70;
        } else {
            String strZ = ((ix0.m) this.f13477b).z();
            i = ((strZ == null || strZ.length() == 0 || !this.f13476a) && hVar.d) ? R$attr.uikit_colorForeground : R$attr.uikit_colorGreyTone50;
        }
        return ((Number) r06.invoke(Integer.valueOf(i))).intValue();
    }

    public boolean c() {
        return this.f13476a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.q] */
    @Override // ix0.u
    public int d() {
        return ((Number) ((kotlin.jvm.internal.q) this.f13478c).invoke(Integer.valueOf(R$attr.uikit_colorForeground))).intValue();
    }

    @Override // lki.x
    public void e(View view, View view2, boolean z, lki.z transitionListener) {
        lki.q qVar = (lki.q) this.f13477b;
        Intrinsics.checkNotNullParameter(transitionListener, "transitionListener");
        lki.r rVar = null;
        if (z) {
            View view3 = view;
            while (true) {
                if (view3 == null) {
                    break;
                }
                lki.r rVarM = com.bumptech.glide.c.m(view3);
                if (rVarM != null) {
                    rVar = rVarM;
                    break;
                } else {
                    Object parent = view3.getParent();
                    view3 = parent instanceof View ? (View) parent : null;
                }
            }
            if (rVar != null) {
                transitionListener.o();
                transitionListener.p();
                rVar.h(new lki.s(transitionListener, 0));
                return;
            }
            transitionListener.o();
            transitionListener.p();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, BitmapDescriptorFactory.HUE_RED);
            objectAnimatorOfFloat.setInterpolator((AccelerateDecelerateInterpolator) this.f13478c);
            objectAnimatorOfFloat.setDuration(300L);
            objectAnimatorOfFloat.addListener(new fci.c0(view2, 2, view, transitionListener));
            objectAnimatorOfFloat.start();
            return;
        }
        if (!this.f13476a) {
            while (true) {
                if (view2 == null) {
                    break;
                }
                lki.r rVarM2 = com.bumptech.glide.c.m(view2);
                if (rVarM2 != null) {
                    rVar = rVarM2;
                    break;
                } else {
                    Object parent2 = view2.getParent();
                    view2 = parent2 instanceof View ? (View) parent2 : null;
                }
            }
            if (rVar == null) {
                throw new IllegalStateException("Required value was null.");
            }
            transitionListener.o();
            transitionListener.p();
            rVar.f(qVar);
            rVar.a(new lki.s(transitionListener, 1));
            return;
        }
        while (true) {
            if (view2 == null) {
                break;
            }
            lki.r rVarM3 = com.bumptech.glide.c.m(view2);
            if (rVarM3 != null) {
                rVar = rVarM3;
                break;
            } else {
                Object parent3 = view2.getParent();
                view2 = parent3 instanceof View ? (View) parent3 : null;
            }
        }
        if (rVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        transitionListener.o();
        transitionListener.p();
        rVar.f(qVar);
        rVar.b();
        transitionListener.r();
        transitionListener.q();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality
    public boolean equals(TypeConstructor c16, TypeConstructor c2) {
        boolean z = this.f13476a;
        CallableDescriptor callableDescriptor = (CallableDescriptor) this.f13477b;
        CallableDescriptor callableDescriptor2 = (CallableDescriptor) this.f13478c;
        Intrinsics.checkNotNullParameter(c16, "c1");
        Intrinsics.checkNotNullParameter(c2, "c2");
        if (Intrinsics.f(c16, c2)) {
            return true;
        }
        ClassifierDescriptor classifierDescriptorMo3795getDeclarationDescriptor = c16.mo3795getDeclarationDescriptor();
        ClassifierDescriptor classifierDescriptorMo3795getDeclarationDescriptor2 = c2.mo3795getDeclarationDescriptor();
        if ((classifierDescriptorMo3795getDeclarationDescriptor instanceof TypeParameterDescriptor) && (classifierDescriptorMo3795getDeclarationDescriptor2 instanceof TypeParameterDescriptor)) {
            return DescriptorEquivalenceForOverrides.INSTANCE.areTypeParametersEquivalent((TypeParameterDescriptor) classifierDescriptorMo3795getDeclarationDescriptor, (TypeParameterDescriptor) classifierDescriptorMo3795getDeclarationDescriptor2, z, new xjm.c(callableDescriptor, callableDescriptor2));
        }
        return false;
    }

    public Future f() {
        this.f13476a = true;
        return (Future) this.f13478c;
    }

    @Override // lki.x
    public void g() {
    }

    public void h(q qVar, f fVar) throws a {
        int iIntValue;
        char cCharAt;
        int iY;
        String strA = fVar.A();
        fVar.w();
        if (strA == null) {
            throw new a("Invalid '@' rule");
        }
        int i = 0;
        if (!this.f13476a && strA.equals("media")) {
            ArrayList<h> arrayListJ = j(fVar);
            if (!fVar.g(CoreConstants.CURLY_LEFT)) {
                throw new a("Invalid @media rule: missing rule set");
            }
            fVar.w();
            h hVar = (h) this.f13477b;
            for (h hVar2 : arrayListJ) {
                if (hVar2 == h.f13355all || hVar2 == hVar) {
                    this.f13476a = true;
                    qVar.b(l(fVar));
                    this.f13476a = false;
                    break;
                }
            }
            l(fVar);
            if (!fVar.j() && !fVar.g(CoreConstants.CURLY_RIGHT)) {
                throw new a("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (this.f13476a || !strA.equals("import")) {
            String str = "Ignoring @" + strA + " rule";
            while (!fVar.j() && ((iIntValue = fVar.n().intValue()) != 59 || i != 0)) {
                if (iIntValue != 123) {
                    if (iIntValue == 125 && i > 0 && i - 1 == 0) {
                        break;
                    }
                } else {
                    i++;
                }
            }
        } else {
            String strZ = null;
            if (!fVar.j()) {
                int i2 = fVar.f13488a;
                if (fVar.h("url(")) {
                    fVar.w();
                    String strZ2 = fVar.z();
                    if (strZ2 == null) {
                        String str2 = (String) fVar.f13490c;
                        StringBuilder sb6 = new StringBuilder();
                        while (!fVar.j() && (cCharAt = str2.charAt(fVar.f13488a)) != '\'' && cCharAt != '\"' && cCharAt != '(' && cCharAt != ')' && !v0.l(cCharAt) && !Character.isISOControl((int) cCharAt)) {
                            fVar.f13488a++;
                            if (cCharAt == '\\') {
                                if (!fVar.j()) {
                                    int i3 = fVar.f13488a;
                                    fVar.f13488a = i3 + 1;
                                    cCharAt = str2.charAt(i3);
                                    if (cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\f') {
                                        int iY2 = f.y(cCharAt);
                                        if (iY2 != -1) {
                                            for (int i5 = 1; i5 <= 5 && !fVar.j() && (iY = f.y(str2.charAt(fVar.f13488a))) != -1; i5++) {
                                                fVar.f13488a++;
                                                iY2 = (iY2 * 16) + iY;
                                            }
                                            sb6.append((char) iY2);
                                        }
                                    }
                                }
                            }
                            sb6.append(cCharAt);
                        }
                        strZ2 = sb6.length() == 0 ? null : sb6.toString();
                    }
                    if (strZ2 == null) {
                        fVar.f13488a = i2;
                    } else {
                        fVar.w();
                        if (fVar.j() || fVar.h(")")) {
                            strZ = strZ2;
                        } else {
                            fVar.f13488a = i2;
                        }
                    }
                }
            }
            if (strZ == null) {
                strZ = fVar.z();
            }
            if (strZ == null) {
                throw new a("Invalid @import rule: expected string or url()");
            }
            fVar.w();
            j(fVar);
            if (!fVar.j() && !fVar.g(';')) {
                throw new a("Invalid @media rule: expected '}' at end of rule set");
            }
        }
        fVar.w();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.q] */
    @Override // ix0.u
    public int i() {
        return ((Number) ((kotlin.jvm.internal.q) this.f13478c).invoke(Integer.valueOf(R$attr.uikit_colorGreyTone50))).intValue();
    }

    public boolean k(q qVar, f fVar) throws a {
        ArrayList<r> arrayListB = fVar.B();
        if (arrayListB == null || arrayListB.isEmpty()) {
            return false;
        }
        if (!fVar.g(CoreConstants.CURLY_LEFT)) {
            throw new a("Malformed rule block: expected '{'");
        }
        fVar.w();
        m1 m1Var = new m1();
        do {
            String strA = fVar.A();
            fVar.w();
            if (!fVar.g(CoreConstants.COLON_CHAR)) {
                throw new a("Expected ':'");
            }
            fVar.w();
            String str = (String) fVar.f13490c;
            String strSubstring = null;
            if (!fVar.j()) {
                int i = fVar.f13488a;
                int iCharAt = str.charAt(i);
                int i2 = i;
                while (iCharAt != -1 && iCharAt != 59 && iCharAt != 125 && iCharAt != 33 && iCharAt != 10 && iCharAt != 13) {
                    if (!v0.l(iCharAt)) {
                        i2 = fVar.f13488a + 1;
                    }
                    iCharAt = fVar.d();
                }
                if (fVar.f13488a > i) {
                    strSubstring = str.substring(i, i2);
                } else {
                    fVar.f13488a = i;
                }
            }
            if (strSubstring == null) {
                throw new a("Expected property value");
            }
            fVar.w();
            if (fVar.g('!')) {
                fVar.w();
                if (!fVar.h("important")) {
                    throw new a("Malformed rule set: found unexpected '!'");
                }
                fVar.w();
            }
            fVar.g(';');
            g3.E(m1Var, strA, strSubstring);
            fVar.w();
            if (fVar.j()) {
                break;
            }
        } while (!fVar.g(CoreConstants.CURLY_RIGHT));
        fVar.w();
        for (r rVar : arrayListB) {
            t tVar = (t) this.f13478c;
            p pVar = new p();
            pVar.f13432a = rVar;
            pVar.f13433b = m1Var;
            pVar.f13434c = tVar;
            qVar.a(pVar);
        }
        return true;
    }

    public q l(f fVar) {
        q qVar = new q(0);
        while (!fVar.j()) {
            try {
                if (!fVar.h("<!--") && !fVar.h("-->")) {
                    if (!fVar.g('@')) {
                        if (!k(qVar, fVar)) {
                            break;
                        }
                    } else {
                        h(qVar, fVar);
                    }
                }
            } catch (a e) {
                String str = "CSS parser terminated early due to error: " + e.getMessage();
                return qVar;
            }
        }
        return qVar;
    }

    @Override // fgm.p
    public void onError(Throwable th10) {
        if (this.f13476a) {
            jb3.l.v(th10);
        } else {
            ((fgm.p) this.f13477b).onError(th10);
        }
    }

    @Override // fgm.p
    public void onSubscribe(Disposable disposable) {
        fgm.p pVar = (fgm.p) this.f13477b;
        try {
            ((igm.g) this.f13478c).accept(disposable);
            pVar.onSubscribe(disposable);
        } catch (Throwable th10) {
            ce9.m.F(th10);
            this.f13476a = true;
            disposable.dispose();
            pVar.onSubscribe(jgm.c.INSTANCE);
            pVar.onError(th10);
        }
    }

    @Override // fgm.p
    public void onSuccess(Object obj2) {
        if (this.f13476a) {
            return;
        }
        ((fgm.p) this.f13477b).onSuccess(obj2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.q] */
    @Override // ix0.u
    public int q(bw0.h model) {
        ?? r06 = (kotlin.jvm.internal.q) this.f13478c;
        Intrinsics.checkNotNullParameter(model, "model");
        ix0.m mVar = (ix0.m) this.f13477b;
        String strY = mVar.y();
        return strY != null ? kotlin.text.d0.W(strY) ^ true : false ? (this.f13476a && mVar.f()) ? ((Number) r06.invoke(Integer.valueOf(R$attr.uikit_colorForeground))).intValue() : b(model) : ((Number) r06.invoke(Integer.valueOf(R$attr.uikit_colorGreyTone50))).intValue();
    }

    public void r(ScheduledFuture scheduledFuture) {
        boolean z;
        synchronized (this.f13477b) {
            try {
                z = this.f13476a;
                if (!z) {
                    this.f13478c = scheduledFuture;
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        if (z) {
            scheduledFuture.cancel(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u(boolean z, ix0.m callback, Function1 obtainColorFromAttr) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(obtainColorFromAttr, "obtainColorFromAttr");
        this.f13476a = z;
        this.f13477b = callback;
        this.f13478c = (kotlin.jvm.internal.q) obtainColorFromAttr;
    }

    public u(lki.q style, boolean z) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f13477b = style;
        this.f13476a = z;
        this.f13478c = new AccelerateDecelerateInterpolator();
    }

    public u(Object obj2) {
        this.f13477b = obj2;
    }
}
