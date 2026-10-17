package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.m80;
import com.fourthline.orca.internal.y20;
import com.fourthline.orca.internal.z20;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes23.dex */
public final class g0 implements v20, j20, fr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w20 f28701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h0 f28702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v10 f28703c;
    private final p20 d;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[b0.values().length];
            try {
                iArr[b0.f26948a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b0.f26949b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b0.f26950c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b0.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b0.e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public g0(w20 residencyViewStateProvider, h0 repository, v10 imageServiceLocator, p20 analytics) {
        Intrinsics.checkNotNullParameter(residencyViewStateProvider, "residencyViewStateProvider");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.f28701a = residencyViewStateProvider;
        this.f28702b = repository;
        this.f28703c = imageServiceLocator;
        this.d = analytics;
    }

    @Override // com.fourthline.orca.internal.v20
    public /* bridge */ s20 a(f0 f0Var, b0 b0Var, boolean z) {
        return super.a((ie1) f0Var, (x20) b0Var, z);
    }

    @Override // com.fourthline.orca.internal.v20
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public z20 a(b0 type) {
        Intrinsics.checkNotNullParameter(type, "type");
        h0 h0Var = this.f28702b;
        int i = a.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            return a(h0Var.f(), h0Var.l());
        }
        if (i == 2) {
            return a(h0Var.e(), h0Var.m());
        }
        if (i == 3) {
            return h0Var.g() ? z20.b.f35505a : new z20.a(new y20.d());
        }
        if (i == 4) {
            return a(h0Var.h(), h0Var.n());
        }
        if (i == 5) {
            return a(h0Var.i(), h0Var.o());
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.fourthline.orca.internal.fr0
    public Function1 d(boolean z) {
        return new rk1(z, 5);
    }

    @Override // com.fourthline.orca.internal.v20
    public v10 s() {
        return this.f28703c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fourthline.orca.internal.j20
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public f0 getInitialState() {
        return new f0(c81.a.a(c81.f27404a, R.string.step_address_details_header, 0, 2, null), this.f28701a.getState(), a(b0.f26948a), a(b0.f26949b), a(b0.f26950c), a(b0.d), a(b0.e), new m80.b(a()), new m80.a.b(null, 1, 0 == true ? 1 : 0));
    }

    public final Function1 w() {
        return new mp1(this, 7);
    }

    @Override // com.fourthline.orca.internal.v20
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public s20 a(f0 f0Var, b0 type) {
        Intrinsics.checkNotNullParameter(f0Var, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        int i = a.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            return f0Var.q();
        }
        if (i == 2) {
            return f0Var.t();
        }
        if (i == 3) {
            return f0Var.u();
        }
        if (i == 4) {
            return f0Var.s();
        }
        if (i == 5) {
            return f0Var.o();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.fourthline.orca.internal.v20
    public p20 k() {
        return this.d;
    }

    @Override // com.fourthline.orca.internal.v20
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public /* bridge */ s20 b(f0 f0Var, b0 b0Var) {
        return super.b((ie1) f0Var, (x20) b0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 a(boolean z, f0 f0Var) {
        Intrinsics.checkNotNullParameter(f0Var, "<this>");
        boolean z3 = !z;
        return f0.a(f0Var, null, null, null, null, null, null, null, f0Var.p().a(z3, z), f0Var.n().a(z3), CertificateBody.profileType, null);
    }

    public String b(b0 type) {
        String strValueOf;
        Intrinsics.checkNotNullParameter(type, "type");
        h0 h0Var = this.f28702b;
        int i = a.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            return h0Var.f();
        }
        if (i == 2) {
            Integer numE = h0Var.e();
            return (numE == null || (strValueOf = String.valueOf(numE.intValue())) == null) ? "" : strValueOf;
        }
        if (i == 3) {
            return h0Var.j();
        }
        if (i == 4) {
            return h0Var.h();
        }
        if (i == 5) {
            return h0Var.i();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.fourthline.orca.internal.s20 a(com.fourthline.orca.internal.b0 r35) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.g0.a(com.fourthline.orca.internal.b0):com.fourthline.orca.internal.s20");
    }

    private final z20 a(Object obj2, boolean z) {
        if ((obj2 instanceof String) && ((CharSequence) obj2).length() == 0) {
            return new z20.a(new y20.c());
        }
        if (obj2 == null) {
            Objects.toString(obj2);
            return new z20.a(new y20.c());
        }
        if (!z) {
            obj2.toString();
            return new z20.a(new y20.d());
        }
        obj2.toString();
        return z20.b.f35505a;
    }

    @Override // com.fourthline.orca.internal.v20
    public c81 a(b0 type, y20 error) {
        int i;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(error, "error");
        if (error instanceof y20.c) {
            c81.a aVar = c81.f27404a;
            int i2 = a.$EnumSwitchMapping$0[type.ordinal()];
            if (i2 == 1) {
                i = R.string.shared_validation_required_postal_code_accessibility;
            } else if (i2 == 2) {
                i = R.string.shared_validation_required_house_number_accessibility;
            } else if (i2 == 3) {
                i = R.string.shared_validation_required;
            } else if (i2 == 4) {
                i = R.string.shared_validation_required_street_accessibility;
            } else {
                if (i2 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R.string.shared_validation_required_city_accessibility;
            }
            return aVar.b(i);
        }
        return c81.a.a(c81.f27404a, 0, 1, null);
    }

    public final Function1 a(b0 fieldType, String value) {
        Intrinsics.checkNotNullParameter(fieldType, "fieldType");
        Intrinsics.checkNotNullParameter(value, "value");
        return new com.fourthline.core.location.internal.b(this, 1, fieldType, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 a(g0 g0Var, b0 b0Var, String str, f0 f0Var) {
        Intrinsics.checkNotNullParameter(f0Var, "<this>");
        s20 s20VarA = s20.a(g0Var.a(f0Var, b0Var), null, null, false, null, str, null, null, null, null, null, 0, 2031, null);
        int i = a.$EnumSwitchMapping$0[b0Var.ordinal()];
        if (i == 1) {
            return f0.a(f0Var, null, null, s20VarA, null, null, null, null, f0Var.p().b(g0Var.a()), null, 379, null);
        }
        if (i == 2) {
            return f0.a(f0Var, null, null, null, s20VarA, null, null, null, f0Var.p().b(g0Var.a()), null, 375, null);
        }
        if (i == 3) {
            return f0.a(f0Var, null, null, null, null, s20VarA, null, null, f0Var.p().b(g0Var.a()), null, 367, null);
        }
        if (i == 4) {
            return f0.a(f0Var, null, null, null, null, null, s20VarA, null, f0Var.p().b(g0Var.a()), null, 351, null);
        }
        if (i == 5) {
            return f0.a(f0Var, null, null, null, null, null, null, s20VarA, f0Var.p().b(g0Var.a()), null, 319, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Function1 a(b0 fieldType, boolean z) {
        Intrinsics.checkNotNullParameter(fieldType, "fieldType");
        return new em1(z, this, fieldType, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.fourthline.orca.internal.f0 a(boolean r12, com.fourthline.orca.internal.g0 r13, com.fourthline.orca.internal.b0 r14, com.fourthline.orca.internal.f0 r15) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.g0.a(boolean, com.fourthline.orca.internal.g0, com.fourthline.orca.internal.b0, com.fourthline.orca.internal.f0):com.fourthline.orca.internal.f0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 a(g0 g0Var, f0 f0Var) {
        Intrinsics.checkNotNullParameter(f0Var, "<this>");
        return f0.a(f0Var, null, g0Var.f28701a.getState(), null, null, null, null, null, f0Var.p().b(g0Var.a()), null, 381, null);
    }

    private final boolean a() {
        return this.f28701a.isValid() && this.f28702b.a();
    }
}
