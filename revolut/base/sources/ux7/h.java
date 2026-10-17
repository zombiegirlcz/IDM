package ux7;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import zw7.z;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f283897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f283898b;

    public /* synthetic */ h(n nVar, int i) {
        this.f283897a = i;
        this.f283898b = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f283897a) {
            case 0:
                return ((nx7.n) this.f283898b.f283904l).r(d0.F0(((InputTextDelegate.TextData) obj2).f52598b).toString());
            case 1:
                z gender = (z) obj2;
                Intrinsics.checkNotNullParameter(gender, "gender");
                return ((nx7.n) this.f283898b.f283904l).M1(gender);
            default:
                vx7.b model = (vx7.b) obj2;
                Intrinsics.checkNotNullParameter(model, "model");
                return this.f283898b.f283905m.a(model);
        }
    }
}
