package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.m80;
import com.fourthline.orca.internal.y20;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class d91 implements j20, fr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p20 f27670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w81 f27671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v10 f27672c;
    private final Lazy d;
    private final v81 e;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[za1.values().length];
            try {
                iArr[za1.f35552a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[za1.f35553b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[za1.f35554c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[za1.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d91(p20 analytics, w81 countryResources, v10 imageServiceLocator, boolean z, String str, ab1 tinValidator) {
        int i;
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(countryResources, "countryResources");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        Intrinsics.checkNotNullParameter(tinValidator, "tinValidator");
        this.f27670a = analytics;
        this.f27671b = countryResources;
        this.f27672c = imageServiceLocator;
        this.d = yhm.j.b(new gj1(this, 16));
        c81.a aVar = c81.f27404a;
        a9 a9Var = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        c81.d dVarA = c81.a.a(aVar, R.string.step_tin_details_header, 0, 2, null);
        c81.d dVarA2 = c81.a.a(aVar, R.string.shared_button_confirm, 0, 2, null);
        boolean z3 = true;
        if (str == null || tinValidator.a(str) != za1.f35552a) {
            i = 1;
            z3 = false;
        } else {
            i = 1;
        }
        m80.b bVar = new m80.b(new a9(dVarA2, z3, false, 4, null));
        m80.a bVar2 = z ? new m80.a.b(a9Var, i, objArr3 == true ? 1 : 0) : new m80.a.C0250a(objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0);
        s20 s20Var = new s20(r20.f32617b, "tax_info_number", false, l20.f30507a, str == null ? "" : str, c81.a.a(aVar, countryResources.f(), 0, 2, null), c81.a.a(aVar, R.string.shared_placeholder_add, 0, 2, null), (str == null || str.length() <= 0) ? c81.b.f27406b : c81.a.a(aVar, R.string.shared_validation_captured_from_scan, 0, 2, null), null, null, 0, 1796, null);
        analytics.a(s20Var);
        this.e = new v81(dVarA, s20Var, c81.a.a(aVar, countryResources.a(), 0, 2, null), bVar, bVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z10 a(d91 d91Var) {
        return d91Var.f27672c.a(r10.E0);
    }

    private final z10 s() {
        return (z10) this.d.getValue();
    }

    @Override // com.fourthline.orca.internal.fr0
    public Function1 d(boolean z) {
        return new rk1(z, 1);
    }

    @Override // com.fourthline.orca.internal.j20
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public v81 getInitialState() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v81 a(boolean z, v81 v81Var) {
        Intrinsics.checkNotNullParameter(v81Var, "<this>");
        boolean z3 = !z;
        return v81.a(v81Var, null, null, null, v81Var.p().a(z3, z), v81Var.q().a(z3), 7, null);
    }

    public final Function1 k() {
        return new bi1(16);
    }

    public final Function1 a(String value, boolean z) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new tk1(value, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v81 a(String str, boolean z, v81 v81Var) {
        Intrinsics.checkNotNullParameter(v81Var, "<this>");
        return v81.a(v81Var, null, s20.a(v81Var.o(), null, null, false, null, str, null, null, null, null, null, 0, 2031, null), null, v81Var.p().b(z), null, 21, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v81 a(v81 v81Var) {
        Intrinsics.checkNotNullParameter(v81Var, "<this>");
        return v81.a(v81Var, null, s20.a(v81Var.o(), null, null, false, l20.f30508b, null, null, null, c81.b.f27406b, null, null, 0, 1655, null), null, null, null, 29, null);
    }

    public final Function1 a(za1 validationError) {
        Intrinsics.checkNotNullParameter(validationError, "validationError");
        return new jn1(validationError, this, 6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v81 a(za1 za1Var, d91 d91Var, v81 v81Var) {
        c81 c81VarB;
        Intrinsics.checkNotNullParameter(v81Var, "<this>");
        int[] iArr = a.$EnumSwitchMapping$0;
        int i = iArr[za1Var.ordinal()];
        if (i == 1) {
            c81VarB = c81.b.f27406b;
        } else if (i == 2) {
            c81VarB = c81.f27404a.b(d91Var.f27671b.e());
        } else if (i == 3) {
            c81VarB = c81.f27404a.a(d91Var.f27671b.d(), d91Var.f27671b.c());
        } else if (i == 4) {
            c81VarB = c81.f27404a.a(d91Var.f27671b.b());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        c81 c81Var = c81VarB;
        s20 s20VarO = v81Var.o();
        za1 za1Var2 = za1.f35552a;
        s20 s20VarA = s20.a(s20VarO, null, null, false, za1Var == za1Var2 ? l20.f30507a : l20.f30509c, null, null, null, c81Var, za1Var == za1Var2 ? null : d91Var.s(), null, 0, 1655, null);
        d91Var.f27670a.b(s20VarA);
        int i2 = iArr[za1Var.ordinal()];
        if (i2 == 2) {
            d91Var.f27670a.a(s20VarA, new y20.c());
        } else if (i2 == 4) {
            d91Var.f27670a.a(s20VarA, new y20.d());
        }
        Unit unit = Unit.f186387a;
        return v81.a(v81Var, null, s20VarA, null, v81Var.p().b(za1Var == za1Var2), null, 21, null);
    }
}
