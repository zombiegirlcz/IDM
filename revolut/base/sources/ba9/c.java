package ba9;

import a08.g0;
import b9i.f;
import b9i.h;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.revolut.feature_fourthline_impl.R;
import efm.d0;
import efm.k;
import efm.r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rfm.j;
import rfm.u;
import t70.g;
import te0.w;
import ypi.i;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends fa9.d {
    public final n89.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n89.c f13996j;
    public final g k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f13997l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(n89.b presentationModel, n89.c router, g localization, d viewContentProvider, i nextButtonView) {
        super(nextButtonView);
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(localization, "localization");
        Intrinsics.checkNotNullParameter(viewContentProvider, "viewContentProvider");
        Intrinsics.checkNotNullParameter(nextButtonView, "nextButtonView");
        this.i = presentationModel;
        this.f13996j = router;
        this.k = localization;
        this.f13997l = viewContentProvider;
    }

    @Override // fa9.d
    public final String N() {
        return this.k.getString(R.string.missing_info_code_us_ssn_itin_input_field_error);
    }

    @Override // fa9.d
    public final String O() {
        return this.k.getString(R.string.missing_info_code_us_ssn_itin_input_field_hint);
    }

    @Override // fa9.d
    public final String P() {
        return "[000]-[00]-[0000]";
    }

    @Override // fa9.d
    public final String Q() {
        return this.k.getString(R.string.missing_info_code_us_ssn_itin_input_field_title);
    }

    @Override // fa9.d
    public final k R() {
        d dVar = this.f13997l;
        d0 d0VarI2 = dVar.f13998a.i2();
        b79.g gVar = new b79.g(new f(dVar, 2), 21);
        d0VarI2.getClass();
        j jVar = new j(d0VarI2, gVar, 2);
        Intrinsics.checkNotNullExpressionValue(jVar, "flatMapMaybe(...)");
        return jVar;
    }

    @Override // fa9.d
    public final u S() {
        return this.f13997l.d;
    }

    @Override // fa9.d
    public final u T() {
        return this.f13997l.f14000c;
    }

    @Override // fa9.d
    public final r U() {
        return this.i.D1();
    }

    @Override // fa9.d
    public final r V() {
        return this.i.A();
    }

    @Override // fa9.d
    public final void W() {
        d0 d0VarI2 = this.i.i2();
        b79.g gVar = new b79.g(new f(this, 1), 20);
        d0VarI2.getClass();
        pfm.a aVar = new pfm.a(d0VarI2, gVar, 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        Function1 function1K = K();
        pfm.a aVar2 = new pfm.a(aVar, new zjh.f(new h(new BreadcrumbException(), 5)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        b function = b.f13995a;
        Intrinsics.checkNotNullParameter(function, "function");
        ofm.h hVarW = aVar2.w(new g0(3, function1K), new a1l.c(2));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(this.f239031a, hVarW);
    }

    @Override // fa9.d
    public final void X(String text, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.i.y(text, z);
    }
}
