package w2;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.Savers_androidKt;
import androidx.compose.ui.text.style.TextMotion;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import v38.c;
import w2a.k;
import w2a.l;
import w2e.j;
import w4l.h;
import zhm.f0;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f293904a;

    public /* synthetic */ d(int i) {
        this.f293904a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f293904a) {
            case 0:
                return Savers_androidKt.TextMotionLinearitySaver$lambda$0((SaverScope) obj2, (TextMotion.Linearity) obj3);
            case 1:
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return Boolean.valueOf(iIntValue < 3);
            case 2:
                int iIntValue2 = ((Integer) obj3).intValue();
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return Boolean.valueOf(iIntValue2 < 3);
            case 3:
                Throwable error = (Throwable) obj2;
                Boolean bool = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (bool == null) {
                    return error;
                }
                return null;
            case 4:
                Throwable error2 = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (list == null) {
                    return error2;
                }
                return null;
            case 5:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new l((List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null)), k.VERTICAL_LIST);
            case 6:
                Function1 defaultItems = (Function1) obj3;
                List list2 = j.f294037a;
                Intrinsics.checkNotNullParameter(defaultItems, "defaultItems");
                return (List) defaultItems.invoke(new iii.d(10, null, true, false, "ERROR_STATE_ITEM_ID"));
            case 7:
                ((Boolean) obj2).booleanValue();
                return new Pair(h.f294642c, c.a.f285856a);
            case 8:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 9:
                Throwable error3 = (Throwable) obj2;
                i iVar = (i) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (iVar == null) {
                    return error3;
                }
                return null;
            case 10:
                Throwable error4 = (Throwable) obj2;
                i iVar2 = (i) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (iVar2 == null) {
                    return error4;
                }
                return null;
            case 11:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return new cii.b(null, (List) getDefaultErrorItems2.invoke(new iii.d(14, null, false, false, null)), new lw0.a(new TextLocalisedClause(R$string.wealth_invest_cfd_input_margin, null, null, 14), null, null, null, false, 30));
            case 12:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return new w3c.k((List) getDefaultErrorItems3.invoke(new iii.d(12, null, true, false, null)), 62);
            case 13:
                ((Boolean) obj2).booleanValue();
                return f0.f322471a;
            case 14:
                Throwable error5 = (Throwable) obj2;
                List list3 = (List) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (list3 == null) {
                    return error5;
                }
                return null;
            case 15:
                Throwable error6 = (Throwable) obj2;
                List list4 = (List) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (list4 == null) {
                    return error6;
                }
                return null;
            case 16:
                Throwable error7 = (Throwable) obj2;
                i iVar3 = (i) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (iVar3 == null) {
                    return error7;
                }
                return null;
            case 17:
                Throwable error8 = (Throwable) obj2;
                i iVar4 = (i) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (iVar4 == null) {
                    return error8;
                }
                return null;
            case 18:
                Throwable error9 = (Throwable) obj2;
                i iVar5 = (i) obj3;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (iVar5 == null) {
                    return error9;
                }
                return null;
            case 19:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 20:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return Boolean.FALSE;
            case 21:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return Boolean.FALSE;
            case 22:
                Function1 defaultErrorItemsAccessor = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItemsAccessor, "defaultErrorItemsAccessor");
                return (List) defaultErrorItemsAccessor.invoke(new iii.d(14, null, false, false, null));
            case 23:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 24:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 25:
                Throwable error10 = (Throwable) obj2;
                List list5 = (List) obj3;
                Intrinsics.checkNotNullParameter(error10, "error");
                if (list5 == null) {
                    return error10;
                }
                return null;
            case 26:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                List list6 = (List) w54.b.i().getContent();
                return list6 == null ? f0.f322471a : list6;
            case 27:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return (List) getDefaultErrorItems4.invoke(new iii.d(14, null, true, false, null));
            case 28:
                Throwable error11 = (Throwable) obj2;
                BaseDraggableWidgetDelegate.Model model = (BaseDraggableWidgetDelegate.Model) obj3;
                Intrinsics.checkNotNullParameter(error11, "error");
                if (model == null) {
                    return error11;
                }
                return null;
            default:
                Throwable error12 = (Throwable) obj2;
                BaseDraggableWidgetDelegate.Model model2 = (BaseDraggableWidgetDelegate.Model) obj3;
                Intrinsics.checkNotNullParameter(error12, "error");
                if (model2 == null) {
                    return error12;
                }
                return null;
        }
    }
}
