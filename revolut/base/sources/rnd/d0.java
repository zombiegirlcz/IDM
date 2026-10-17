package rnd;

import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewCompat;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.contacts.core.platform.model.DeviceContact;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.data.model.DrivingStatisticNotExistsException;
import com.revolut.feature.statements.api.models.StatementUrlState;
import com.revolut.retail.feature.api.AnalyticsAccount;
import java.io.EOFException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f255603a;

    public /* synthetic */ d0(int i) {
        this.f255603a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object data) {
        boolean z = false;
        switch (this.f255603a) {
            case 0:
                Throwable error = (Throwable) obj2;
                AnalyticsAccount analyticsAccount = (AnalyticsAccount) data;
                Intrinsics.checkNotNullParameter(error, "error");
                if (analyticsAccount == null) {
                }
                break;
            case 1:
                Throwable error2 = (Throwable) obj2;
                StatementUrlState statementUrlState = (StatementUrlState) data;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (statementUrlState == null) {
                }
                break;
            case 2:
                View view = (View) obj2;
                Function0 action = (Function0) data;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(action, "action");
                if (!ViewCompat.isLaidOut(view) || view.isLayoutRequested()) {
                    OneShotPreDrawListener.add(view, new r8.d(1, view, z, action));
                } else {
                    action.invoke();
                }
                break;
            case 3:
                Function1 getDefaultErrorItems = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                break;
            case 4:
                Throwable error3 = (Throwable) obj2;
                Boolean bool = (Boolean) data;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (bool == null) {
                }
                break;
            case 5:
                Throwable error4 = (Throwable) obj2;
                Boolean bool2 = (Boolean) data;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (bool2 == null) {
                }
                break;
            case 6:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                break;
            case 7:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                break;
            case 8:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                break;
            case 9:
                Function1 getDefaultErrorItems2 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                break;
            case 10:
                Function1 getDefaultErrorItems3 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                List list = (List) getDefaultErrorItems3.invoke(new iii.d(14, null, false, false, null));
                zhm.f0 f0Var = zhm.f0.f322471a;
                break;
            case 11:
                Throwable th10 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                if ((th10 instanceof EOFException) || (th10 instanceof DrivingStatisticNotExistsException)) {
                    RowDelegate.Model model = new RowDelegate.Model("SMART_DRIVING_WILL_BE_AVAILABLE_SOON", sr7.e.b(nr7.b.DRIVING_LICENCE, false, LayeredImage.Companion.f(LayeredImage.INSTANCE, R$drawable.uikit_icn_16_check, R$attr.uikit_colorLightGreen, R$attr.uikit_colorBackground, null, 2.0f, 2.0f, Float.valueOf(12.0f), 8), 11), new TextLocalisedClause(R$string.car_insurance_policy_summary_sections_smart_driving_row_is_on_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.car_insurance_policy_summary_sections_smart_driving_row_is_on_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
                    yp0.b.l(model, R$attr.uikit_dp0, R$attr.uikit_dp16, 0, 0, null, false, 60);
                }
                break;
            case 12:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                break;
            case 13:
                Throwable error5 = (Throwable) obj2;
                List list2 = (List) data;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (list2 == null) {
                }
                break;
            case 14:
                Throwable error6 = (Throwable) obj2;
                dda.a aVar = (dda.a) data;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (aVar == null) {
                }
                break;
            case 15:
                Throwable error7 = (Throwable) obj2;
                List list3 = (List) data;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (list3 == null) {
                }
                break;
            case 16:
                Throwable error8 = (Throwable) obj2;
                qzi.a aVar2 = (qzi.a) data;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (aVar2 == null) {
                }
                break;
            case 17:
                Throwable error9 = (Throwable) obj2;
                Set set = (Set) data;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (set == null) {
                }
                break;
            case 18:
                Function1 getDefaultErrorItems4 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                break;
            case 19:
                Map map = (Map) obj2;
                DeviceContact deviceContact = (DeviceContact) data;
                String str = deviceContact.f65992c;
                if (map.containsKey(str)) {
                    DeviceContact deviceContact2 = (DeviceContact) map.get(str);
                    if (deviceContact2 != null && deviceContact2.f65990a > deviceContact.f65990a) {
                        map.put(str, deviceContact);
                    }
                } else {
                    map.put(str, deviceContact);
                }
                break;
            case 20:
                Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter((List) data, "<unused var>");
                int i = jli.h.f175850a;
                break;
            case 21:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                break;
            case 22:
                Throwable error10 = (Throwable) obj2;
                tsl.f fVar = (tsl.f) data;
                Intrinsics.checkNotNullParameter(error10, "error");
                if (fVar == null) {
                }
                break;
            case 23:
                Throwable th11 = (Throwable) obj2;
                if (((nel.n) data) == null) {
                }
                break;
            case 24:
                Throwable th12 = (Throwable) obj2;
                if (((tsl.d) data) == null) {
                }
                break;
            case 25:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                break;
            case 26:
                Function1 getDefaultErrorItems5 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                break;
            case 27:
                Function1 getDefaultErrorItems6 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems6, "getDefaultErrorItems");
                break;
            case 28:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                break;
            default:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                break;
        }
        return zhm.f0.f322471a;
    }

    public /* synthetic */ d0(rq7.v vVar) {
        this.f255603a = 10;
    }
}
