package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.m80;
import com.fourthline.orca.internal.y20;
import com.fourthline.orca.internal.z20;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class im implements j20, fr0, v20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o40 f29628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e8 f29629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fm f29630c;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[dm.values().length];
            try {
                iArr[dm.f27818a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public im(o40 nationalityViewStateProvider, e8 birthPlaceInputViewStateHandler) {
        Intrinsics.checkNotNullParameter(nationalityViewStateProvider, "nationalityViewStateProvider");
        Intrinsics.checkNotNullParameter(birthPlaceInputViewStateHandler, "birthPlaceInputViewStateHandler");
        this.f29628a = nationalityViewStateProvider;
        this.f29629b = birthPlaceInputViewStateHandler;
        this.f29630c = new fm(c81.a.a(c81.f27404a, R.string.step_personal_details_header, 0, 2, null), nationalityViewStateProvider.getState(), a(dm.f27818a), new m80.b(a()), new m80.a.b(null, 1, null));
    }

    public s20 a(fm fmVar, dm type, boolean z) {
        Intrinsics.checkNotNullParameter(fmVar, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return this.f29629b.a((ie1) fmVar, (x20) type, z);
    }

    @Override // com.fourthline.orca.internal.v20
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public s20 a(fm fmVar, dm type) {
        Intrinsics.checkNotNullParameter(fmVar, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return this.f29629b.a(fmVar, type);
    }

    @Override // com.fourthline.orca.internal.fr0
    public Function1 d(boolean z) {
        return new un1(z, this, 0);
    }

    @Override // com.fourthline.orca.internal.v20
    public v10 s() {
        return this.f29629b.s();
    }

    @Override // com.fourthline.orca.internal.j20
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public fm getInitialState() {
        return this.f29630c;
    }

    public final Function1 w() {
        return new mp1(this, 13);
    }

    public s20 a(fm fmVar, dm type) {
        Intrinsics.checkNotNullParameter(fmVar, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return this.f29629b.b((ie1) fmVar, (x20) type);
    }

    @Override // com.fourthline.orca.internal.v20
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public z20 a(dm type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return this.f29629b.a(type);
    }

    @Override // com.fourthline.orca.internal.v20
    public p20 k() {
        return this.f29629b.k();
    }

    @Override // com.fourthline.orca.internal.v20
    public c81 a(dm type, y20 error) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(error, "error");
        return this.f29629b.a(type, error);
    }

    public s20 a(dm type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return this.f29629b.a(type);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fm a(boolean z, im imVar, fm fmVar) {
        Intrinsics.checkNotNullParameter(fmVar, "<this>");
        return fm.a(fmVar, null, null, null, fmVar.p().a(!z && imVar.a(), z), fmVar.q().a(!z), 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fm a(im imVar, fm fmVar) {
        Intrinsics.checkNotNullParameter(fmVar, "<this>");
        return fm.a(fmVar, null, imVar.a(imVar.f29628a.getState()), null, fmVar.p().b(imVar.a()), null, 21, null);
    }

    private final r2 a(r2 r2Var) {
        z20 z20VarA = this.f29628a.a();
        z20.a aVar = z20VarA instanceof z20.a ? (z20.a) z20VarA : null;
        y20 y20VarA = aVar != null ? aVar.a() : null;
        return ((y20VarA instanceof y20.b.C0314b) || (y20VarA instanceof y20.b.a)) ? r2.a(r2Var, null, null, false, null, null, null, l20.f30507a, c81.b.f27406b, null, null, null, null, 3647, null) : r2Var;
    }

    public final Function1 a(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return new jn1(input, this, 11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fm a(String str, im imVar, fm fmVar) {
        Intrinsics.checkNotNullParameter(fmVar, "<this>");
        s20 s20VarA = s20.a(fmVar.n(), null, null, false, null, str, null, null, null, null, null, 0, 2031, null);
        imVar.k().b(s20VarA);
        Unit unit = Unit.f186387a;
        return fm.a(fmVar, null, null, s20VarA, fmVar.p().b(imVar.a()), null, 19, null);
    }

    public final Function1 a(dm fieldType, boolean z) {
        Intrinsics.checkNotNullParameter(fieldType, "fieldType");
        return new em1(z, this, fieldType, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fm a(boolean z, im imVar, dm dmVar, fm fmVar) {
        s20 s20VarA;
        Intrinsics.checkNotNullParameter(fmVar, "<this>");
        if (z) {
            s20VarA = imVar.a(fmVar, dmVar);
        } else if (a.$EnumSwitchMapping$0[dmVar.ordinal()] == 1) {
            s20VarA = imVar.a(fmVar, dmVar, fmVar.n().getState() != l20.f30507a);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        s20 s20Var = s20VarA;
        if (a.$EnumSwitchMapping$0[dmVar.ordinal()] == 1) {
            return fm.a(fmVar, null, null, s20Var, null, null, 27, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final boolean a() {
        return this.f29628a.isValid() && (a(dm.f27818a) instanceof z20.b);
    }
}
