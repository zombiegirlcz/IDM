package com.fourthline.orca.internal;

import com.fourthline.orca.internal.b;
import com.fourthline.orca.internal.b7;
import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.i5;
import com.fourthline.orca.internal.m80;
import com.fourthline.orca.internal.p3;
import com.fourthline.orca.internal.q3;
import com.fourthline.orca.internal.y20;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes23.dex */
public final class t3 implements j20, fr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r3 f33183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j5 f33184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p20 f33185c;
    private final v10 d;
    private final l70 e;
    private final Lazy f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private q3 f33186g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p3 f33187h;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[b7.a.values().length];
            try {
                iArr[b7.a.f27011c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t3(r3 repository, j5 validator, p20 analytics, v10 imageServiceLocator, l70 lottieServiceLocator) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(validator, "validator");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        Intrinsics.checkNotNullParameter(lottieServiceLocator, "lottieServiceLocator");
        this.f33183a = repository;
        this.f33184b = validator;
        this.f33185c = analytics;
        this.d = imageServiceLocator;
        this.e = lottieServiceLocator;
        this.f = yhm.j.b(new xr1(this, 7));
        this.f33186g = q3.c.f32185a;
        c81.a aVar = c81.f27404a;
        c81.d dVarA = c81.a.a(aVar, R.string.step_bav_capture_header_sepa, 0, 2, null);
        s20 s20Var = new s20(r20.f32617b, "bav_sepa_iban", false, l20.f30507a, "", c81.a.a(aVar, R.string.step_bav_capture_label_iban, 0, 2, null), k(), c81.b.f27406b, null, null, 0, 1796, null);
        analytics.a(s20Var);
        Unit unit = Unit.f186387a;
        String str = String.format(Locale.ROOT, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(((double) repository.b()) / 100.0d)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        this.f33187h = new p3(dVarA, s20Var, aVar.a(R.string.step_bav_capture_hint_sepa, str, str), new p3.a(c81.a.a(aVar, R.string.shared_footer_sepa, 0, 2, null), c81.a.a(aVar, R.string.shared_button_read_more, 0, 2, null)), new m80.b(new a9(c81.a.a(aVar, R.string.shared_button_confirm, 0, 2, null), a(), false, 4, 0 == true ? 1 : 0)), new m80.a.C0250a(null, 1, 0 == true ? 1 : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z10 a(t3 t3Var) {
        return t3Var.d.a(r10.E0);
    }

    private final z10 s() {
        return (z10) this.f.getValue();
    }

    public final Function1 b(q3 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new jn1(this, state, 20);
    }

    @Override // com.fourthline.orca.internal.fr0
    public Function1 d(boolean z) {
        return new un1(z, this, 1);
    }

    public final Function1 e(boolean z) {
        return new rk1(z, 9);
    }

    @Override // com.fourthline.orca.internal.j20
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public p3 getInitialState() {
        return this.f33187h;
    }

    public final Function1 w() {
        return new mp1(this, 27);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p3 a(boolean z, t3 t3Var, p3 p3Var) {
        Intrinsics.checkNotNullParameter(p3Var, "<this>");
        return p3.a(p3Var, null, null, null, null, p3Var.q().a(!z && t3Var.a(), z), p3Var.r().a(!z), 15, null);
    }

    private final c81 k() {
        Object next;
        Iterator it8 = this.f33183a.c().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((f5) next).getCountryCode(), this.f33183a.a())) {
                break;
            }
        }
        f5 f5Var = (f5) next;
        if (f5Var == null) {
            return c81.a.a(c81.f27404a, R.string.shared_placeholder_add, 0, 2, null);
        }
        String strSubstring = f5Var.getCountryCode().substring(0, 2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return new c81.e(zhm.d0.k0(kotlin.text.f0.M0(4, strSubstring + kotlin.text.a0.C("0", f5Var.getLength() - 2)), " ", null, null, 0, null, 62));
    }

    public final Function1 a(String value, i5 validationResult) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(validationResult, "validationResult");
        return new com.fourthline.core.location.internal.b(this, 6, value, validationResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p3 a(t3 t3Var, String str, i5 i5Var, p3 p3Var) {
        Intrinsics.checkNotNullParameter(p3Var, "<this>");
        t3Var.f33186g = q3.c.f32185a;
        s20 s20VarO = p3Var.o();
        c81 c81VarB = Intrinsics.f(i5Var, i5.f.f29504a) ? c81.b.f27406b : i5Var.b();
        f5 f5VarA = i5Var.a();
        return p3.a(p3Var, null, s20.a(s20VarO, null, null, false, null, str, null, null, c81VarB, null, null, f5VarA != null ? f5VarA.getLength() : Integer.MAX_VALUE, LDSFile.EF_DG15_TAG, null), null, null, p3Var.q().b(t3Var.a()), null, 45, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p3 a(t3 t3Var, q3 q3Var, p3 p3Var) {
        c81 c81VarA;
        b aVar;
        Intrinsics.checkNotNullParameter(p3Var, "<this>");
        t3Var.f33186g = q3Var;
        boolean zA = t3Var.a(q3Var);
        s20 s20VarO = p3Var.o();
        boolean z = q3Var instanceof q3.a;
        if (z) {
            b7.a aVarC = ((q3.a) q3Var).a().getError();
            if ((aVarC == null ? -1 : a.$EnumSwitchMapping$0[aVarC.ordinal()]) == 1) {
                c81VarA = c81.f27404a.a(R.string.shared_validation_invalid, R.string.shared_validation_invalid_iban_accessibility);
            } else {
                c81VarA = c81.b.f27406b;
            }
        } else {
            c81VarA = c81.b.f27406b;
        }
        c81 c81Var = c81VarA;
        if (q3Var instanceof q3.d) {
            aVar = new b.C0166b(t3Var.e.a(k70.f30152g));
        } else if (!z) {
            aVar = null;
        } else if (zA) {
            aVar = new b.a(t3Var.d.a(r10.J0));
        } else {
            aVar = new b.a(t3Var.d.a(r10.E0));
        }
        return p3.a(p3Var, null, s20.a(s20VarO, null, null, false, null, null, null, null, c81Var, null, aVar, 0, 1407, null), null, null, p3Var.q().b(t3Var.a()), null, 45, null);
    }

    public static /* synthetic */ Function1 a(t3 t3Var, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            z = false;
        }
        return t3Var.e(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p3 a(boolean z, p3 p3Var) {
        c81 c81VarB;
        Intrinsics.checkNotNullParameter(p3Var, "<this>");
        s20 s20VarO = p3Var.o();
        String text = z ? "" : p3Var.o().getText();
        l20 l20Var = l20.f30508b;
        if (p3Var.o().getText().length() == 0) {
            c81VarB = c81.b.f27406b;
        } else {
            c81VarB = p3Var.o().b();
        }
        return p3.a(p3Var, null, s20.a(s20VarO, null, null, false, l20Var, text, null, null, c81VarB, null, null, 0, 1127, null), null, null, null, null, 61, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p3 a(t3 t3Var, p3 p3Var) {
        boolean zA;
        Intrinsics.checkNotNullParameter(p3Var, "<this>");
        i5 i5VarA = t3Var.f33184b.a(p3Var.o().getText());
        c81 c81VarB = i5VarA.b();
        q3 q3Var = t3Var.f33186g;
        if (q3Var instanceof q3.a) {
            zA = t3Var.a(q3Var);
        } else {
            zA = i5VarA instanceof i5.g;
        }
        s20 s20VarO = p3Var.o();
        b aVar = null;
        z10 z10VarS = zA ? null : t3Var.s();
        q3 q3Var2 = t3Var.f33186g;
        if (q3Var2 instanceof q3.d) {
            aVar = new b.C0166b(t3Var.e.a(k70.f30152g));
        } else if (q3Var2 instanceof q3.a) {
            if (t3Var.a(q3Var2)) {
                aVar = new b.a(t3Var.d.a(r10.J0));
            } else {
                aVar = new b.a(t3Var.d.a(r10.E0));
            }
        }
        s20 s20VarA = s20.a(s20VarO, null, null, false, zA ? l20.f30507a : l20.f30509c, null, null, null, c81VarB, z10VarS, aVar, 0, 1143, null);
        t3Var.f33185c.b(s20VarA);
        if (i5VarA instanceof i5.f) {
            t3Var.f33185c.a(s20VarA, new y20.c());
        } else if (i5VarA instanceof i5.c) {
            t3Var.f33185c.a(s20VarA, new y20.d());
        }
        Unit unit = Unit.f186387a;
        return p3.a(p3Var, null, s20VarA, null, null, p3Var.q().b(t3Var.a()), null, 45, null);
    }

    private final boolean a() {
        return a(this.f33186g);
    }

    private final boolean a(q3 q3Var) {
        if (q3Var instanceof q3.a) {
            return ((q3.a) q3Var).a().getMatch();
        }
        return false;
    }
}
