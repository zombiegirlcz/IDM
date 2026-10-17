package cpi;

import android.content.Context;
import com.revolut.core.android.di.LocalizationToggles$ShowStringResourcesNames;
import com.revolut.core.android.di.LocalizationToggles$ValidateDynamicResourceUsages;
import ecm.q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import no.h1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f107948b;

    public /* synthetic */ a(q qVar, int i) {
        this.f107947a = i;
        this.f107948b = qVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f107947a) {
            case 0:
                q qVar = this.f107948b;
                return new l70.o(new a(qVar, 2), new a(qVar, 3));
            case 1:
                return new t70.e(new a(this.f107948b, 4));
            case 2:
                phm.a aVar = (phm.a) j6.a.i((Context) ((Function0) this.f107948b.f124861b).invoke(), ite.a.class);
                b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                if (aVar2 != null) {
                    return Boolean.valueOf(((jte.d) ((ite.a) aVar2.b()).b()).c(LocalizationToggles$ValidateDynamicResourceUsages.f51203a));
                }
                throw new IllegalStateException(a0.d.q("Api ", ite.a.class, " is not found"));
            case 3:
                phm.a aVar3 = (phm.a) j6.a.i((Context) ((Function0) this.f107948b.f124861b).invoke(), ite.a.class);
                b60.a aVar4 = aVar3 != null ? (b60.a) aVar3.get() : null;
                if (aVar4 != null) {
                    return Boolean.valueOf(((jte.d) ((ite.a) aVar4.b()).b()).c(LocalizationToggles$ShowStringResourcesNames.f51202a));
                }
                throw new IllegalStateException(a0.d.q("Api ", ite.a.class, " is not found"));
            case 4:
                phm.a aVar5 = (phm.a) j6.a.i((Context) ((Function0) this.f107948b.f124861b).invoke(), poi.b.class);
                b60.a aVar6 = aVar5 != null ? (b60.a) aVar5.get() : null;
                if (aVar6 != null) {
                    return (h1) ((poi.b) aVar6.b()).f238035s0.get();
                }
                throw new IllegalStateException(a0.d.q("Api ", poi.b.class, " is not found"));
            default:
                ui0.a aVar7 = ui0.b.Companion;
                String value = ((Context) ((Function0) this.f107948b.f124861b).invoke()).getPackageName();
                Intrinsics.checkNotNullExpressionValue(value, "getPackageName(...)");
                Intrinsics.checkNotNullParameter(aVar7, "<this>");
                Intrinsics.checkNotNullParameter(value, "value");
                if (Intrinsics.f(value, "com.revolut.business") || a0.H(value, "com.revolut.business.", false)) {
                    return cj9.c.g(aVar7);
                }
                if (value.equals("com.revolut.invest") || a0.H(value, "com.revolut.invest.", false)) {
                    Intrinsics.checkNotNullParameter(aVar7, "<this>");
                    return new ui0.b("com.revolut.invest", null);
                }
                if (value.equals("com.revolut.junior.india") || a0.H(value, "com.revolut.junior.india.", false)) {
                    Intrinsics.checkNotNullParameter(aVar7, "<this>");
                    return new ui0.b("com.revolut.junior.india", null);
                }
                if (value.equals("com.revolut.junior") || a0.H(value, "com.revolut.junior.", false)) {
                    Intrinsics.checkNotNullParameter(aVar7, "<this>");
                    return new ui0.b("com.revolut.junior", null);
                }
                if (value.equals("com.revolut.pos") || a0.H(value, "com.revolut.pos.", false)) {
                    Intrinsics.checkNotNullParameter(aVar7, "<this>");
                    return new ui0.b("com.revolut.pos", null);
                }
                if (value.equals("com.revolut.terminal") || a0.H(value, "com.revolut.terminal.", false)) {
                    Intrinsics.checkNotNullParameter(aVar7, "<this>");
                    return new ui0.b("com.revolut.terminal", null);
                }
                if (value.equals("com.revolut.revolutx") || a0.H(value, "com.revolut.revolutx.", false)) {
                    return cj9.c.k(aVar7);
                }
                if (value.equals("com.revolut.revolut") || a0.H(value, "com.revolut.revolut.", false)) {
                    return cj9.c.j(aVar7);
                }
                if (!value.equals("com.revolut.retail.india") && !a0.H(value, "com.revolut.retail.india.", false)) {
                    throw new IllegalStateException(value.concat(" package name is not handled here").toString());
                }
                Intrinsics.checkNotNullParameter(aVar7, "<this>");
                return new ui0.b("com.revolut.retail.india", null);
        }
    }
}
