package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.m80;
import com.fourthline.orca.internal.wb;
import com.fourthline.orca.internal.y20;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes23.dex */
public final class gb implements j20, fr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fb f28820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v10 f28821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p20 f28822c;
    private final Lazy d;
    private final Lazy e;

    public gb(fb repository, v10 imageServiceLocator, p20 analytics) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.f28820a = repository;
        this.f28821b = imageServiceLocator;
        this.f28822c = analytics;
        final int i = 0;
        this.d = yhm.j.b(new Function0(this) { // from class: com.fourthline.orca.internal.nm1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ gb f31457b;

            {
                this.f31457b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return gb.a(this.f31457b);
                    default:
                        return gb.b(this.f31457b);
                }
            }
        });
        final int i2 = 1;
        this.e = yhm.j.b(new Function0(this) { // from class: com.fourthline.orca.internal.nm1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ gb f31457b;

            {
                this.f31457b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return gb.a(this.f31457b);
                    default:
                        return gb.b(this.f31457b);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z10 a(gb gbVar) {
        return gbVar.f28821b.a(r10.E0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final wb b(gb gbVar) {
        String strG;
        String strE;
        c81.a aVar = c81.f27404a;
        c81.d dVarA = c81.a.a(aVar, R.string.step_contact_details_header, 0, 2, null);
        m80.b bVar = new m80.b(gbVar.f28820a.i());
        m80.a.b bVar2 = new m80.a.b(null, 1, 0 == true ? 1 : 0);
        c81.d dVarA2 = c81.a.a(aVar, R.string.step_contact_details_label_email, 0, 2, null);
        c81.d dVarA3 = c81.a.a(aVar, R.string.shared_placeholder_add, 0, 2, null);
        String strG2 = gbVar.f28820a.g();
        String str = strG2 == null ? "" : strG2;
        c81.b bVar3 = c81.b.f27406b;
        l20 l20Var = l20.f30507a;
        s20 s20Var = new s20(null, "contact_email", false, l20Var, str, dVarA2, dVarA3, bVar3, null, null, 0, 1797, null);
        gbVar.f28822c.a(s20Var);
        Unit unit = Unit.f186387a;
        r20 r20Var = r20.f32617b;
        String strF = gbVar.f28820a.f();
        s20 s20Var2 = new s20(r20Var, "contact_phone", false, l20Var, strF == null ? "" : strF, c81.a.a(aVar, R.string.step_contact_details_label_phone_number, 0, 2, null), c81.a.a(aVar, R.string.step_contact_details_placeholder_phone_number, 0, 2, null), bVar3, null, null, 0, 1796, null);
        gbVar.f28822c.a(s20Var2);
        fd fdVarD = gbVar.f28820a.d();
        String str2 = (fdVarD == null || (strE = fdVarD.e()) == null) ? "" : strE;
        fd fdVarD2 = gbVar.f28820a.d();
        wb.c cVar = new wb.c(s20Var2, str2, (fdVarD2 == null || (strG = fdVarD2.g()) == null) ? "" : strG, gbVar.f28821b.a(r10.N0), c81.a.a(aVar, R.string.shared_icon_country_code_accessibility, 0, 2, null));
        wb.a aVar2 = new wb.a(null, null, false, c81.a.a(aVar, R.string.step_contact_details_label_phone_number, 0, 2, null), null, c81.a.a(aVar, R.string.shared_placeholder_search, 0, 2, null), null, null, gbVar.f28821b.a(r10.O0), null, 727, null);
        gbVar.f28822c.a(aVar2);
        return new wb(dVarA, bVar, bVar2, s20Var, cVar, aVar2, null, 64, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wb c(String str, wb wbVar) {
        Intrinsics.checkNotNullParameter(wbVar, "<this>");
        return wb.a(wbVar, null, null, null, null, wb.c.a(wbVar.q(), s20.a(wbVar.q().b(), null, null, false, null, str, null, null, null, null, null, 0, 2031, null), null, null, null, null, 30, null), null, null, LDSFile.EF_DG15_TAG, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wb e(gb gbVar, wb wbVar) {
        Intrinsics.checkNotNullParameter(wbVar, "<this>");
        wb.c cVarQ = wbVar.q();
        s20 s20VarA = s20.a(wbVar.q().b(), null, null, false, l20.f30509c, null, null, null, c81.f27404a.b(R.string.shared_validation_required_phone_number_accessibility), gbVar.x(), null, 0, 1655, null);
        gbVar.f28822c.b(s20VarA);
        gbVar.f28822c.a(s20VarA, new y20.c());
        Unit unit = Unit.f186387a;
        return wb.a(wbVar, null, null, null, null, wb.c.a(cVarQ, s20VarA, null, null, null, null, 30, null), null, null, LDSFile.EF_DG15_TAG, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wb g(gb gbVar, wb wbVar) {
        Intrinsics.checkNotNullParameter(wbVar, "<this>");
        s20 s20VarA = s20.a(wbVar.o(), null, null, false, l20.f30507a, null, null, null, null, null, null, 0, 2039, null);
        gbVar.f28822c.b(s20VarA);
        Unit unit = Unit.f186387a;
        return wb.a(wbVar, null, null, null, s20VarA, null, null, null, LDSFile.EF_SOD_TAG, null);
    }

    public final Function1 B() {
        return new lm1(this, 4);
    }

    public final Function1 C() {
        return new lm1(this, 0);
    }

    public final Function1 D() {
        return new lm1(this, 3);
    }

    public final Function1 E() {
        return new lm1(this, 5);
    }

    public final Function1 F() {
        return new lm1(this, 7);
    }

    public final Function1 G() {
        return new lm1(this, 6);
    }

    @Override // com.fourthline.orca.internal.fr0
    public Function1 d(boolean z) {
        return new rk1(z, 6);
    }

    public final Function1 f(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new zi1(value, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wb a(boolean z, wb wbVar) {
        Intrinsics.checkNotNullParameter(wbVar, "<this>");
        boolean z3 = !z;
        return wb.a(wbVar, null, wbVar.r().a(z3, z), wbVar.s().a(z3), null, null, null, null, 121, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wb f(gb gbVar, wb wbVar) {
        Intrinsics.checkNotNullParameter(wbVar, "<this>");
        wb.a aVarA = wb.a.a(wbVar.n(), null, null, false, null, null, null, null, l20.f30507a, null, null, 895, null);
        gbVar.f28822c.b(aVarA);
        Unit unit = Unit.f186387a;
        return wb.a(wbVar, null, null, null, null, null, aVarA, wb.b.f34578a, 31, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wb h(gb gbVar, wb wbVar) {
        Intrinsics.checkNotNullParameter(wbVar, "<this>");
        wb.c cVarQ = wbVar.q();
        s20 s20VarA = s20.a(wbVar.q().b(), null, null, false, l20.f30507a, null, null, null, null, null, null, 0, 2039, null);
        gbVar.f28822c.b(s20VarA);
        Unit unit = Unit.f186387a;
        return wb.a(wbVar, null, null, null, null, wb.c.a(cVarQ, s20VarA, null, null, null, null, 30, null), null, null, LDSFile.EF_DG15_TAG, null);
    }

    private final z10 x() {
        return (z10) this.d.getValue();
    }

    public final Function1 A() {
        return new lm1(this, 1);
    }

    public final Function1 d(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new zi1(value, 6);
    }

    public final Function1 k() {
        return new jm1(1);
    }

    public final Function1 s() {
        return new jm1(4);
    }

    public final Function1 v() {
        return new jm1(2);
    }

    public final Function1 w() {
        return new jm1(3);
    }

    @Override // com.fourthline.orca.internal.j20
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public wb getInitialState() {
        return (wb) this.e.getValue();
    }

    public final Function1 z() {
        return new lm1(this, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wb d(wb wbVar) {
        Intrinsics.checkNotNullParameter(wbVar, "<this>");
        return wb.a(wbVar, null, null, null, null, wb.c.a(wbVar.q(), s20.a(wbVar.q().b(), null, null, false, l20.f30508b, null, null, null, c81.b.f27406b, null, null, 0, 1655, null), null, null, null, null, 30, null), null, null, LDSFile.EF_DG15_TAG, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wb a(gb gbVar, wb wbVar) {
        Intrinsics.checkNotNullParameter(wbVar, "<this>");
        return wb.a(wbVar, null, wbVar.r().b(gbVar.f28820a.i()), null, null, null, null, null, ISO781611.SMT_TAG, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wb c(wb wbVar) {
        Intrinsics.checkNotNullParameter(wbVar, "<this>");
        return wb.a(wbVar, null, null, null, s20.a(wbVar.o(), null, null, false, l20.f30508b, null, null, null, c81.b.f27406b, null, null, 0, 1655, null), null, null, null, LDSFile.EF_SOD_TAG, null);
    }

    public final Function1 a(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new zi1(value, 5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wb a(String str, wb wbVar) {
        Intrinsics.checkNotNullParameter(wbVar, "<this>");
        return wb.a(wbVar, null, null, null, null, null, wb.a.a(wbVar.n(), null, null, false, null, str, null, null, null, null, null, 1007, null), null, 95, null);
    }

    public final Function1 a(List value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new mm1(value, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wb a(List list, wb wbVar) {
        Intrinsics.checkNotNullParameter(wbVar, "<this>");
        return wb.a(wbVar, null, null, null, null, null, wb.a.a(wbVar.n(), null, null, false, null, null, null, null, null, null, list, 511, null), null, 95, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wb c(gb gbVar, wb wbVar) {
        Intrinsics.checkNotNullParameter(wbVar, "<this>");
        s20 s20VarA = s20.a(wbVar.o(), null, null, false, l20.f30509c, null, null, null, c81.f27404a.a(R.string.shared_validation_invalid_email_accessibility), gbVar.x(), null, 0, 1655, null);
        gbVar.f28822c.b(s20VarA);
        gbVar.f28822c.a(s20VarA, new y20.d());
        Unit unit = Unit.f186387a;
        return wb.a(wbVar, null, null, null, s20VarA, null, null, null, LDSFile.EF_SOD_TAG, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wb d(gb gbVar, wb wbVar) {
        Intrinsics.checkNotNullParameter(wbVar, "<this>");
        wb.c cVarQ = wbVar.q();
        s20 s20VarA = s20.a(wbVar.q().b(), null, null, false, l20.f30509c, null, null, null, c81.f27404a.a(R.string.shared_validation_invalid_phone_number_accessibility), gbVar.x(), null, 0, 1655, null);
        gbVar.f28822c.b(s20VarA);
        gbVar.f28822c.a(s20VarA, new y20.d());
        Unit unit = Unit.f186387a;
        return wb.a(wbVar, null, null, null, null, wb.c.a(cVarQ, s20VarA, null, null, null, null, 30, null), null, null, LDSFile.EF_DG15_TAG, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wb a(wb wbVar) {
        Intrinsics.checkNotNullParameter(wbVar, "<this>");
        return wb.a(wbVar, null, null, null, null, null, wb.a.a(wbVar.n(), null, null, false, null, "", null, null, l20.f30507a, null, zhm.f0.f322471a, 367, null), wb.b.f34579b, 31, null);
    }

    public final Function1 a(fd selectedCountry) {
        Intrinsics.checkNotNullParameter(selectedCountry, "selectedCountry");
        return new jn1(this, selectedCountry, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wb a(gb gbVar, fd fdVar, wb wbVar) {
        String strG;
        Intrinsics.checkNotNullParameter(wbVar, "<this>");
        wb.a aVarN = wbVar.n();
        l20 l20Var = l20.f30507a;
        wb.a aVarA = wb.a.a(aVarN, null, null, false, null, null, null, null, l20Var, null, zhm.f0.f322471a, 383, null);
        gbVar.f28822c.b(aVarA);
        wb.c cVarQ = wbVar.q();
        s20 s20VarB = wbVar.q().b();
        String strF = gbVar.f28820a.f();
        s20 s20VarA = s20.a(s20VarB, null, null, false, l20Var, strF == null ? "" : strF, null, null, c81.b.f27406b, null, null, 0, 1639, null);
        fd fdVarD = gbVar.f28820a.d();
        return wb.a(wbVar, null, null, null, null, wb.c.a(cVarQ, s20VarA, fdVar.e(), (fdVarD == null || (strG = fdVarD.g()) == null) ? "" : strG, null, null, 24, null), aVarA, wb.b.f34578a, 15, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wb b(String str, wb wbVar) {
        Intrinsics.checkNotNullParameter(wbVar, "<this>");
        return wb.a(wbVar, null, null, null, s20.a(wbVar.o(), null, null, false, null, str, null, null, null, null, null, 0, 2031, null), null, null, null, LDSFile.EF_SOD_TAG, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wb b(wb wbVar) {
        Intrinsics.checkNotNullParameter(wbVar, "<this>");
        return wb.a(wbVar, null, null, null, null, null, wb.a.a(wbVar.n(), null, null, false, null, null, null, null, l20.f30508b, null, null, 895, null), null, 95, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wb b(gb gbVar, wb wbVar) {
        Intrinsics.checkNotNullParameter(wbVar, "<this>");
        s20 s20VarA = s20.a(wbVar.o(), null, null, false, l20.f30509c, null, null, null, c81.f27404a.b(R.string.shared_validation_required_email_accessibility), gbVar.x(), null, 0, 1655, null);
        gbVar.f28822c.b(s20VarA);
        gbVar.f28822c.a(s20VarA, new y20.c());
        Unit unit = Unit.f186387a;
        return wb.a(wbVar, null, null, null, s20VarA, null, null, null, LDSFile.EF_SOD_TAG, null);
    }
}
