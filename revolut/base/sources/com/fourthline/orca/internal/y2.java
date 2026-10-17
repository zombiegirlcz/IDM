package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class y2 implements x2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ce1 f35141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v10 f35142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p20 f35143c;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[k20.values().length];
            try {
                iArr[k20.f30106a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k20.f30107b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public y2(ce1 stringExtractor, v10 imageServiceLocator, p20 analytics) {
        Intrinsics.checkNotNullParameter(stringExtractor, "stringExtractor");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.f35141a = stringExtractor;
        this.f35142b = imageServiceLocator;
        this.f35143c = analytics;
    }

    @Override // com.fourthline.orca.internal.x2
    public Function1 a(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return new zi1(input, 15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s2 a(String str, s2 s2Var) {
        Intrinsics.checkNotNullParameter(s2Var, "<this>");
        return s2.a(s2Var, null, null, null, null, r2.a(s2Var.n(), null, null, false, null, null, str, null, null, null, null, null, null, 4063, null), 15, null);
    }

    @Override // com.fourthline.orca.internal.x2
    public Function1 b(a01 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return new pt1(this, item, 0);
    }

    @Override // com.fourthline.orca.internal.x2
    public Function1 d(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return new zi1(input, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s2 b(y2 y2Var, a01 a01Var, s2 s2Var) {
        Intrinsics.checkNotNullParameter(s2Var, "<this>");
        r2 r2VarA = r2.a(s2Var.n(), null, null, false, null, null, y2Var.f35141a.a(a01Var.getName()), l20.f30507a, c81.b.f27406b, null, null, zhm.f0.f322471a, null, 2079, null);
        y2Var.f35143c.b(r2VarA);
        return s2.a(s2Var, null, s2Var.p().b(false), null, null, r2VarA, 13, null);
    }

    @Override // com.fourthline.orca.internal.x2
    public Function1 a(List suggestions) {
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        return new mm1(suggestions, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s2 a(List list, s2 s2Var) {
        Intrinsics.checkNotNullParameter(s2Var, "<this>");
        return s2.a(s2Var, null, null, null, null, r2.a(s2Var.n(), null, null, false, null, null, null, null, null, null, null, list, null, 3071, null), 15, null);
    }

    @Override // com.fourthline.orca.internal.x2
    public Function1 a(a01 a01Var, boolean z) {
        return new em1(a01Var, this, z, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s2 a(a01 a01Var, y2 y2Var, boolean z, s2 s2Var) {
        String strA;
        c81 name;
        Intrinsics.checkNotNullParameter(s2Var, "<this>");
        r2 r2VarN = s2Var.n();
        l20 l20Var = l20.f30507a;
        c81.b bVar = c81.b.f27406b;
        if (a01Var == null || (name = a01Var.getName()) == null || (strA = y2Var.f35141a.a(name)) == null) {
            strA = "";
        }
        r2 r2VarA = r2.a(r2VarN, null, null, false, null, null, strA, l20Var, bVar, null, bVar, null, null, 3359, null);
        y2Var.f35143c.a(r2VarA);
        return s2.a(s2Var, null, s2Var.p().b(z), null, null, r2VarA, 13, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s2 b(String str, s2 s2Var) {
        Intrinsics.checkNotNullParameter(s2Var, "<this>");
        return s2.a(s2Var, null, s2Var.p().b(false), null, null, r2.a(s2Var.n(), null, null, false, null, null, str, l20.f30508b, c81.b.f27406b, null, null, null, null, 3103, null), 13, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s2 a(y2 y2Var, a01 a01Var, s2 s2Var) {
        Intrinsics.checkNotNullParameter(s2Var, "<this>");
        r2 r2VarA = r2.a(s2Var.n(), null, null, false, null, null, y2Var.f35141a.a(a01Var.getName()), l20.f30507a, c81.b.f27406b, null, null, zhm.f0.f322471a, null, 2591, null);
        y2Var.f35143c.b(r2VarA);
        return s2.a(s2Var, null, s2Var.p().b(true), null, null, r2VarA, 13, null);
    }

    private final c81.d b(k20 k20Var) {
        int i = a.$EnumSwitchMapping$0[k20Var.ordinal()];
        if (i == 1) {
            return c81.f27404a.b(R.string.shared_validation_required_issuing_country_accessibility);
        }
        if (i == 2) {
            return c81.f27404a.a(R.string.shared_validation_invalid_issuing_country_accessibility);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.fourthline.orca.internal.x2
    public Function1 a(a01 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return new pt1(this, item, 1);
    }

    @Override // com.fourthline.orca.internal.x2
    public Function1 a(k20 k20Var) {
        return new jn1(k20Var, this, 25);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s2 a(k20 k20Var, y2 y2Var, s2 s2Var) {
        Intrinsics.checkNotNullParameter(s2Var, "<this>");
        if (k20Var == null) {
            r2 r2VarA = r2.a(s2Var.n(), null, null, false, null, null, null, l20.f30507a, c81.b.f27406b, null, null, zhm.f0.f322471a, null, 2623, null);
            y2Var.f35143c.b(r2VarA);
            Unit unit = Unit.f186387a;
            return s2.a(s2Var, null, null, null, null, r2VarA, 15, null);
        }
        r2 r2VarA2 = r2.a(s2Var.n(), null, null, false, null, null, null, l20.f30509c, y2Var.b(k20Var), y2Var.f35142b.a(r10.E0), null, zhm.f0.f322471a, null, 2623, null);
        y2Var.f35143c.b(r2VarA2);
        return s2.a(s2Var, null, s2Var.p().b(false), null, null, r2VarA2, 13, null);
    }
}
