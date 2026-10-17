package rd3;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.junior_core.models.configuration.JuniorPlanConfiguration;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import tof.i7;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f253327a;

    public /* synthetic */ k(int i) {
        this.f253327a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) throws Throwable {
        switch (this.f253327a) {
            case 0:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 1:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 2:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                d.Companion.getClass();
                return d.f253322b;
            case 3:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 4:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 5:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                d.Companion.getClass();
                return d.f253322b;
            case 6:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 7:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                m70.a.c(t0.f186434a);
                return "";
            case 8:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 9:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 10:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 11:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                m70.a.c(t0.f186434a);
                return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            case 12:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                m70.a.c(t0.f186434a);
                return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            case 13:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                m70.a.c(t0.f186434a);
                return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            case 14:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 15:
                Throwable error = (Throwable) obj2;
                dda.a aVar = (dda.a) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (aVar == null) {
                    return error;
                }
                return null;
            case 16:
                Throwable error2 = (Throwable) obj2;
                eda.a aVar2 = (eda.a) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (aVar2 == null) {
                    return error2;
                }
                return null;
            case 17:
                Throwable error3 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error3, "error");
                return error3;
            case 18:
                ((Boolean) obj2).booleanValue();
                return f0.f322471a;
            case 19:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 20:
                return null;
            case 21:
                Throwable th10 = (Throwable) obj3;
                if (((Boolean) obj2).booleanValue()) {
                    return null;
                }
                if (th10 == null) {
                    throw new IllegalStateException("Wallet profile not found after polling");
                }
                throw th10;
            case 22:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 23:
                Throwable error4 = (Throwable) obj2;
                mf8.e eVar = (mf8.e) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (eVar == null) {
                    return error4;
                }
                return null;
            case 24:
                Throwable error5 = (Throwable) obj2;
                rh8.q qVar = (rh8.q) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (qVar == null) {
                    return error5;
                }
                return null;
            case 25:
                Throwable error6 = (Throwable) obj2;
                th8.a aVar3 = (th8.a) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (aVar3 == null) {
                    return error6;
                }
                return null;
            case 26:
                Throwable error7 = (Throwable) obj2;
                JuniorPlanConfiguration juniorPlanConfiguration = (JuniorPlanConfiguration) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (juniorPlanConfiguration == null) {
                    return error7;
                }
                return null;
            case 27:
                Throwable th11 = (Throwable) obj2;
                if (((List) obj3) == null) {
                    return th11;
                }
                return null;
            case 28:
                Throwable error8 = (Throwable) obj2;
                i7 i7Var = (i7) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (i7Var == null) {
                    return error8;
                }
                return null;
            default:
                Function1 errorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(errorItems, "errorItems");
                return (List) errorItems.invoke(new iii.d(12, null, true, true, null));
        }
    }
}
