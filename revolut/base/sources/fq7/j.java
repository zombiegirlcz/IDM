package fq7;

import com.revolut.core.ui_kit.dialogs.ToolboxDialogDisplayer$Configuration$Cell;
import com.revolut.feature.business.referrals.ui.screens.referral_invitee_details.a;
import fr8.o;
import ft4.l0;
import ft4.s;
import ft4.v;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f137208a;

    public /* synthetic */ j(int i) {
        this.f137208a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object data) {
        switch (this.f137208a) {
            case 0:
                Function1 getDefaultErrorItems = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(14, null, false, false, null));
            case 1:
                Throwable error = (Throwable) obj2;
                String str = (String) data;
                Intrinsics.checkNotNullParameter(error, "error");
                if (str == null) {
                    return error;
                }
                return null;
            case 2:
                Function1 defaultErrorItems = (Function1) data;
                Intrinsics.checkNotNullParameter(defaultErrorItems, "defaultErrorItems");
                return new o((List) defaultErrorItems.invoke(new iii.d(14, null, true, false, null)), null, null);
            case 3:
                Throwable error2 = (Throwable) obj2;
                fo3.c cVar = (fo3.c) data;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (cVar == null) {
                    return error2;
                }
                return null;
            case 4:
                Throwable error3 = (Throwable) obj2;
                List list = (List) data;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (list == null) {
                    return error3;
                }
                return null;
            case 5:
                Throwable error4 = (Throwable) obj2;
                List list2 = (List) data;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (list2 == null) {
                    return error4;
                }
                return null;
            case 6:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return f0.f322471a;
            case 7:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ft0.e);
            case 8:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ft0.g);
            case 9:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ft0.h);
            case 10:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ft0.j);
            case 11:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ft0.l);
            case 12:
                Function1 getDefaultErrorItems2 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return new ft2.h((List) getDefaultErrorItems2.invoke(new iii.d(14, null, true, false, null)), a.C0459a.f64364a);
            case 13:
                Function1 getDefaultErrorItems3 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return new v(l0.b(), (List) getDefaultErrorItems3.invoke(new iii.d(12, null, true, true, null)), s.f137926a, false);
            case 14:
                Throwable error5 = (Throwable) obj2;
                Boolean bool = (Boolean) data;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (bool == null) {
                    return error5;
                }
                return null;
            case 15:
                Throwable error6 = (Throwable) obj2;
                Boolean bool2 = (Boolean) data;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (bool2 == null) {
                    return error6;
                }
                return null;
            case 16:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return f0.f322471a;
            case 17:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return f0.f322471a;
            case 18:
                Function1 getDefaultErrorItems4 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return new fu6.l((List) getDefaultErrorItems4.invoke(new iii.d(4, fu6.s.f138105a, true, true, null)));
            case 19:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return iii.c.b(null, null, 6, true);
            case 20:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return null;
            case 21:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return f0.f322471a;
            case 22:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return f0.f322471a;
            case 23:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return null;
            case 24:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return null;
            case 25:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return null;
            case 26:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return null;
            case 27:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return null;
            case 28:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return null;
            default:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ToolboxDialogDisplayer$Configuration$Cell);
        }
    }
}
