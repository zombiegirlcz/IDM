package n0c;

import androidx.compose.foundation.text.TextFieldScrollerPosition;
import androidx.compose.runtime.saveable.SaverScope;
import aw0.m6;
import aw0.n6;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.retail.common.ui.R$string;
import ip0.zj;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n30.b0;
import v30.l0;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class v implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f211004a;

    public /* synthetic */ v(int i) {
        this.f211004a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f211004a) {
            case 0:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                f0 f0Var = f0.f322471a;
                FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("ERROR_STATE_LIST_ID", new TextLocalisedClause(R$string.error_generic, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), null, zj.REGULAR, false, null, null, null, 1988);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                return new n(l.f210988a, f0Var, null, zhm.u.c(model));
            case 1:
                return TextFieldScrollerPosition.Saver$lambda$0((SaverScope) obj2, (TextFieldScrollerPosition) obj3);
            case 2:
                ((Boolean) obj2).getClass();
                return null;
            case 3:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 4:
                Function1 items = (Function1) obj3;
                Intrinsics.checkNotNullParameter(items, "items");
                return new n1g.g(iii.c.b(null, null, 6, true));
            case 5:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 6:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 7:
                Data data = (Data) obj2;
                Data data2 = (Data) obj3;
                return Boolean.valueOf(Intrinsics.f(org.bouncycastle.jcajce.provider.digest.a.m(data, data2, "old", "new"), data2.getContent()) && Intrinsics.f(data.getError(), data2.getError()));
            case 8:
                Throwable error = (Throwable) obj2;
                Boolean bool = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (bool == null) {
                    return error;
                }
                return null;
            case 9:
                Throwable error2 = (Throwable) obj2;
                Boolean bool2 = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (bool2 == null) {
                    return error2;
                }
                return null;
            case 10:
                Throwable error3 = (Throwable) obj2;
                Boolean bool3 = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (bool3 == null) {
                    return error3;
                }
                return null;
            case 11:
                Throwable error4 = (Throwable) obj2;
                Boolean bool4 = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (bool4 == null) {
                    return error4;
                }
                return null;
            case 12:
                Throwable error5 = (Throwable) obj2;
                Boolean bool5 = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (bool5 == null) {
                    return error5;
                }
                return null;
            case 13:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new lw0.h(lw0.i.TITLE_SUBTITLE);
            case 14:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(12, null, false, true, null));
            case 15:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                n6.Companion.getClass();
                return new aw0.e(false, null, null, m6.a(), null, null, 55);
            case 16:
                Throwable error6 = (Throwable) obj2;
                dj0.d dVar = (dj0.d) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (dVar == null) {
                    return error6;
                }
                return null;
            case 17:
                ((Integer) obj3).intValue();
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return Boolean.TRUE;
            case 18:
                Throwable error7 = (Throwable) obj2;
                l0 l0Var = (l0) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (l0Var == null) {
                    return error7;
                }
                return null;
            case 19:
                Throwable error8 = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (list == null) {
                    return error8;
                }
                return null;
            case 20:
                if (((Boolean) obj2).booleanValue()) {
                    return null;
                }
                return b0.e;
            case 21:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "error");
                return null;
            case 22:
                Throwable error9 = (Throwable) obj2;
                hha.d dVar2 = (hha.d) obj3;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (dVar2 == null) {
                    return error9;
                }
                return null;
            case 23:
                Throwable error10 = (Throwable) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error10, "error");
                if (list2 == null) {
                    return error10;
                }
                return null;
            case 24:
                Throwable error11 = (Throwable) obj2;
                do3.n nVar = (do3.n) obj3;
                Intrinsics.checkNotNullParameter(error11, "error");
                if (nVar == null) {
                    return error11;
                }
                return null;
            case 25:
                Boolean isVirtualCardAvailable = (Boolean) obj2;
                Boolean isFreeDeliveryAvailable = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(isVirtualCardAvailable, "isVirtualCardAvailable");
                Intrinsics.checkNotNullParameter(isFreeDeliveryAvailable, "isFreeDeliveryAvailable");
                return new n33.q(isVirtualCardAvailable.booleanValue(), isFreeDeliveryAvailable.booleanValue());
            case 26:
                Throwable error12 = (Throwable) obj2;
                fo3.c cVar = (fo3.c) obj3;
                Intrinsics.checkNotNullParameter(error12, "error");
                if (cVar == null) {
                    return error12;
                }
                return null;
            case 27:
                Throwable error13 = (Throwable) obj2;
                od0.i iVar = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(error13, "error");
                if (iVar == null) {
                    return error13;
                }
                return null;
            case 28:
                Throwable error14 = (Throwable) obj2;
                Boolean bool6 = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error14, "error");
                if (bool6 == null) {
                    return error14;
                }
                return null;
            default:
                if (((Boolean) obj2).booleanValue()) {
                    return null;
                }
                od0.i.Companion.getClass();
                return od0.i.f224256b;
        }
    }

    public /* synthetic */ v(y yVar) {
        this.f211004a = 0;
    }
}
