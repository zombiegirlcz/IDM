package com.fourthline.orca.internal;

import com.fourthline.core.Gender;
import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.m80;
import com.fourthline.orca.internal.sl0;
import com.fourthline.orca.internal.y20;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes23.dex */
public final class wl0 implements j20, fr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p20 f34733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final tl0 f34734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v10 f34735c;
    private final pe d;
    private final Function0 e;
    private final Lazy f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f34736g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final sl0 f34737h;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Gender.values().length];
            try {
                iArr[Gender.MALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Gender.FEMALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Gender.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj2, Object obj3) {
            return cim.b.b(Integer.valueOf(((Gender) obj2).name().length()), Integer.valueOf(((Gender) obj3).name().length()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public wl0(p20 analytics, tl0 repository, v10 imageServiceLocator, boolean z, pe dateFormatter, Function0 minPersonAgeFactory) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        Intrinsics.checkNotNullParameter(dateFormatter, "dateFormatter");
        Intrinsics.checkNotNullParameter(minPersonAgeFactory, "minPersonAgeFactory");
        this.f34733a = analytics;
        this.f34734b = repository;
        this.f34735c = imageServiceLocator;
        this.d = dateFormatter;
        this.e = minPersonAgeFactory;
        this.f = yhm.j.b(new xr1(this, 25));
        List listN0 = kotlin.collections.d.n0(new b(), Gender.values());
        int iB = zhm.q0.b(zhm.w.t(listN0, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        for (Object obj2 : listN0) {
            linkedHashMap.put(obj2, a((Gender) obj2));
        }
        this.f34736g = linkedHashMap;
        c81.a aVar = c81.f27404a;
        int i = 1;
        this.f34737h = new sl0(c81.a.a(aVar, R.string.step_personal_details_header, 0, 2, null), f(true), h(true), e(true), g(true), null, (!a() || this.f34734b.h()) ? null : c81.a.a(aVar, R.string.shared_hint_confirm_fields, 0, 2, null), new m80.b(a()), z ? new m80.a.b(null, i, 0 == true ? 1 : 0) : new m80.a.C0250a(0 == true ? 1 : 0, i, 0 == true ? 1 : 0), this.f34735c.a(r10.N0), this.f34735c.a(r10.Q0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z10 a(wl0 wl0Var) {
        return wl0Var.f34735c.a(r10.E0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sl0 b(sl0 sl0Var) {
        Intrinsics.checkNotNullParameter(sl0Var, "<this>");
        return sl0.a(sl0Var, null, s20.a(sl0Var.r(), null, null, false, l20.f30508b, null, null, null, c81.b.f27406b, null, null, 0, 1655, null), null, null, null, null, null, sl0Var.w().b(false), null, null, null, 1853, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sl0 c(sl0 sl0Var) {
        Intrinsics.checkNotNullParameter(sl0Var, "<this>");
        return sl0.a(sl0Var, null, null, s20.a(sl0Var.v(), null, null, false, l20.f30508b, null, null, null, c81.b.f27406b, null, null, 0, 1655, null), null, null, null, null, sl0Var.w().b(false), null, null, null, 1851, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.fourthline.orca.internal.p20] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [com.fourthline.orca.internal.y20] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final s20 e(boolean z) {
        ?? cVar;
        z10 z10Var;
        Object obj2;
        z10 z10Var2;
        c81 c81VarA;
        s20 s20VarA;
        Object dVar;
        r20 r20Var = r20.f32618c;
        boolean z3 = !this.f34734b.k();
        l20 l20Var = l20.f30507a;
        c81.a aVar = c81.f27404a;
        c81.d dVarA = c81.a.a(aVar, R.string.step_document_details_label_birth, 0, 2, null);
        c81.d dVarA2 = c81.a.a(aVar, R.string.shared_placeholder_date, 0, 2, null);
        c81.b bVar = c81.b.f27406b;
        s20 s20Var = new s20(r20Var, "person_birth_date", z3, l20Var, "", dVarA, dVarA2, bVar, null, null, 0, 1792, null);
        if (s20Var.g()) {
            Date dateD = this.f34734b.d();
            if (dateD != null) {
                if (this.f34734b.e()) {
                    String strA = this.d.a(dateD);
                    if (!z || this.f34734b.h()) {
                        z10Var2 = null;
                        c81VarA = bVar;
                    } else {
                        z10Var2 = null;
                        c81VarA = c81.a.a(aVar, R.string.shared_validation_captured_from_scan, 0, 2, null);
                    }
                    z10Var = z10Var2;
                    s20VarA = s20.a(s20Var, null, null, false, null, strA, null, null, c81VarA, k(), null, 0, 1647, null);
                    dVar = z10Var;
                } else {
                    s20VarA = s20.a(s20Var, null, null, false, l20.f30509c, this.d.a(dateD), null, null, aVar.a(R.string.shared_validation_date_underage, String.valueOf(((Number) this.e.invoke()).intValue())), k(), null, 0, 1639, null);
                    z10Var = null;
                    dVar = new y20.d();
                }
                if (s20VarA == null) {
                    obj2 = dVar;
                } else {
                    s20Var = s20VarA;
                    cVar = dVar;
                }
            } else {
                z10Var = null;
                obj2 = null;
            }
            s20Var = s20.a(s20Var, null, null, false, z ? l20Var : l20.f30509c, null, null, null, z ? bVar : aVar.b(R.string.shared_validation_required_date_of_birth_accessibility), z ? z10Var : k(), null, 0, 1655, null);
            cVar = !z ? new y20.c() : obj2;
        } else {
            cVar = 0;
        }
        if (z) {
            this.f34733a.a(s20Var);
            return s20Var;
        }
        this.f34733a.b(s20Var);
        if (cVar != 0) {
            this.f34733a.a(s20Var, cVar);
        }
        return s20Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0129  */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.fourthline.orca.internal.p20] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v5, types: [com.fourthline.orca.internal.y20$c] */
    /* JADX WARN: Type inference failed for: r6v6, types: [com.fourthline.orca.internal.y20] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.fourthline.orca.internal.s20 f(boolean r20) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.wl0.f(boolean):com.fourthline.orca.internal.s20");
    }

    private final sl0.a g(boolean z) {
        r20 r20Var = r20.d;
        l20 l20Var = l20.f30507a;
        c81 c81VarA = c81.b.f27406b;
        c81.a aVar = c81.f27404a;
        sl0.a aVar2 = new sl0.a(r20Var, c81VarA, l20Var, c81.a.a(aVar, R.string.step_personal_details_label_gender, 0, 2, null), c81.a.a(aVar, R.string.step_personal_details_placeholder_gender, 0, 2, null), c81VarA, null, 64, null);
        Gender genderF = this.f34734b.f();
        if (genderF == null) {
            if (!z) {
                l20Var = l20.f30509c;
            }
            l20 l20Var2 = l20Var;
            if (!z) {
                c81VarA = aVar.b(R.string.shared_validation_required_sex_accessibility);
            }
            return sl0.a.a(aVar2, null, null, l20Var2, null, null, c81VarA, z ? null : k(), 27, null);
        }
        if (!this.f34734b.b()) {
            return sl0.a.a(aVar2, null, a(genderF), l20.f30509c, null, null, c81.a.a(aVar, 0, 1, null), k(), 25, null);
        }
        c81 c81VarA2 = a(genderF);
        if (z && !this.f34734b.h()) {
            c81VarA = c81.a.a(aVar, R.string.shared_validation_captured_from_scan, 0, 2, null);
        }
        return sl0.a.a(aVar2, null, c81VarA2, null, null, null, c81VarA, null, 93, null);
    }

    public final Function1 A() {
        return new dt1(this, 2);
    }

    @Override // com.fourthline.orca.internal.fr0
    public Function1 d(boolean z) {
        return new rk1(z, 11);
    }

    public final Function1 v() {
        return new nq1(24);
    }

    public final Function1 w() {
        return new dt1(this, 0);
    }

    public final Function1 x() {
        return new dt1(this, 4);
    }

    public final Function1 y() {
        return new dt1(this, 1);
    }

    public final Function1 z() {
        return new nq1(22);
    }

    private final c81 a(Gender gender) {
        int i = a.$EnumSwitchMapping$0[gender.ordinal()];
        if (i == 1) {
            return c81.a.a(c81.f27404a, R.string.step_personal_details_gender_male, 0, 2, null);
        }
        if (i == 2) {
            return c81.a.a(c81.f27404a, R.string.step_personal_details_gender_female, 0, 2, null);
        }
        if (i == 3) {
            return c81.a.a(c81.f27404a, R.string.step_personal_details_gender_unspecified, 0, 2, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0126  */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.fourthline.orca.internal.p20] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v5, types: [com.fourthline.orca.internal.y20$c] */
    /* JADX WARN: Type inference failed for: r6v6, types: [com.fourthline.orca.internal.y20] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.fourthline.orca.internal.s20 h(boolean r20) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.wl0.h(boolean):com.fourthline.orca.internal.s20");
    }

    private final z10 k() {
        return (z10) this.f.getValue();
    }

    public final Function1 d(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new zi1(value, 10);
    }

    public final Function1 l() {
        return new dt1(this, 3);
    }

    @Override // com.fourthline.orca.internal.j20
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public sl0 getInitialState() {
        return this.f34737h;
    }

    public final Function1 t() {
        return new nq1(23);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sl0 d(wl0 wl0Var, sl0 sl0Var) {
        Intrinsics.checkNotNullParameter(sl0Var, "<this>");
        return sl0.a(sl0Var, null, null, null, null, wl0Var.g(false), null, null, sl0Var.w().b(wl0Var.a()), null, null, null, 1871, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sl0 a(boolean z, sl0 sl0Var) {
        Intrinsics.checkNotNullParameter(sl0Var, "<this>");
        boolean z3 = !z;
        return sl0.a(sl0Var, null, null, null, null, null, null, null, sl0Var.w().a(z3, z), sl0Var.o().a(z3), null, null, 1663, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sl0 b(wl0 wl0Var, sl0 sl0Var) {
        Intrinsics.checkNotNullParameter(sl0Var, "<this>");
        return sl0.a(sl0Var, null, wl0Var.f(false), null, null, null, null, null, sl0Var.w().b(wl0Var.a()), null, null, null, 1917, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sl0 c(String str, sl0 sl0Var) {
        Intrinsics.checkNotNullParameter(sl0Var, "<this>");
        return sl0.a(sl0Var, null, null, s20.a(sl0Var.v(), null, null, false, null, str, null, null, null, null, null, 0, 2031, null), null, null, null, null, null, null, null, null, 2043, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sl0 c(wl0 wl0Var, sl0 sl0Var) {
        Intrinsics.checkNotNullParameter(sl0Var, "<this>");
        return sl0.a(sl0Var, null, null, null, null, sl0.a.a(sl0Var.s(), null, null, l20.f30508b, null, null, c81.b.f27406b, null, 27, null), wl0Var.f34736g, null, sl0Var.w().b(false), null, null, null, 1807, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sl0 b(String str, sl0 sl0Var) {
        Intrinsics.checkNotNullParameter(sl0Var, "<this>");
        return sl0.a(sl0Var, null, s20.a(sl0Var.r(), null, null, false, null, str, null, null, null, null, null, 0, 2031, null), null, null, null, null, null, null, null, null, null, 2045, null);
    }

    public final Function1 a(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new zi1(value, 9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sl0 a(sl0 sl0Var) {
        Intrinsics.checkNotNullParameter(sl0Var, "<this>");
        return sl0.a(sl0Var, null, null, null, s20.a(sl0Var.p(), null, null, false, l20.f30508b, null, null, null, c81.b.f27406b, null, null, 0, 1655, null), null, null, null, sl0Var.w().b(false), null, null, null, 1911, null);
    }

    public final Function1 b(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new zi1(value, 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.fourthline.orca.internal.sl0 a(com.fourthline.orca.internal.wl0 r18, com.fourthline.orca.internal.sl0 r19) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.wl0.a(com.fourthline.orca.internal.wl0, com.fourthline.orca.internal.sl0):com.fourthline.orca.internal.sl0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sl0 e(wl0 wl0Var, sl0 sl0Var) {
        Intrinsics.checkNotNullParameter(sl0Var, "<this>");
        return sl0.a(sl0Var, null, null, wl0Var.h(false), null, null, null, null, sl0Var.w().b(wl0Var.a()), null, null, null, 1915, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sl0 a(String str, sl0 sl0Var) {
        Intrinsics.checkNotNullParameter(sl0Var, "<this>");
        return sl0.a(sl0Var, null, null, null, s20.a(sl0Var.p(), null, null, false, null, str, null, null, null, null, null, 0, 2031, null), null, null, null, null, null, null, null, 2039, null);
    }

    public final Function1 a(c81 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new ss1(value, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sl0 a(c81 c81Var, sl0 sl0Var) {
        Intrinsics.checkNotNullParameter(sl0Var, "<this>");
        return sl0.a(sl0Var, null, null, null, null, sl0.a.a(sl0Var.s(), null, c81Var, null, null, null, null, null, ISO781611.SMT_TAG, null), null, null, null, null, null, null, 2031, null);
    }

    private final boolean a() {
        return this.f34734b.i() && this.f34734b.l() && this.f34734b.e() && this.f34734b.b();
    }
}
