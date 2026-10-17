package x2l;

import ag.p;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.orhanobut.dialogplus.DialogPlus;
import com.orhanobut.dialogplus.DialogPlusBuilder;
import com.orhanobut.dialogplus.ListHolder;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import com.revolut.retail.legacy_ui.R$dimen;
import com.revolut.retail.legacy_ui.R$drawable;
import com.revolut.retail.legacy_ui.R$id;
import com.revolut.retail.legacy_ui.R$layout;
import com.revolut.revolut.feature_fourthline_impl.R;
import cwl.f;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import x0i.i;

/* JADX INFO: loaded from: classes12.dex */
public class c {
    public static DialogPlus a(BaseDelegatesActivity context, String str, String str2, boolean z, f fVar) {
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.dialog_title_and_message, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(R$id.dialog_title)).setText(str);
        ((TextView) viewInflate.findViewById(R$id.dialog_message)).setText(str2);
        ArrayList arrayList = new ArrayList();
        z2l.a aVar = z2l.a.f319097a;
        String string = aVar.getString(R.string.common_dialog_action_exchange);
        if (z) {
            arrayList.add(string);
        }
        String string2 = aVar.getString(R.string.common_dialog_action_top_up);
        arrayList.add(string2);
        arrayList.add(aVar.getString(R$string.common_action_cancel));
        int iApplyDimension = (int) TypedValue.applyDimension(1, context.getResources().getDimension(R$dimen.alert_dialog_padding), context.getResources().getDisplayMetrics());
        DialogPlusBuilder dialogPlusBuilder = new DialogPlusBuilder(context);
        dialogPlusBuilder.e = new y2l.a(context, arrayList);
        dialogPlusBuilder.f50226g = viewInflate;
        dialogPlusBuilder.f50229l = true;
        dialogPlusBuilder.i = 17;
        FrameLayout.LayoutParams layoutParams = dialogPlusBuilder.d;
        layoutParams.gravity = 17;
        dialogPlusBuilder.f50228j = new p(string, 22, fVar, string2);
        layoutParams.height = -2;
        int[] iArr = dialogPlusBuilder.f50224b;
        iArr[0] = 0;
        iArr[1] = iApplyDimension;
        iArr[2] = 0;
        iArr[3] = iApplyDimension;
        dialogPlusBuilder.k = new i(fVar, 12);
        Intrinsics.checkNotNullParameter(context, "context");
        dialogPlusBuilder.f50234r = kli.a.x(R$attr.uikit_colorBlack_70, context);
        dialogPlusBuilder.f50230m = R$drawable.corner_background;
        if (dialogPlusBuilder.f50227h == null) {
            dialogPlusBuilder.f50227h = new ListHolder();
        }
        dialogPlusBuilder.f50227h.f50248a = dialogPlusBuilder.f50230m;
        return new DialogPlus(dialogPlusBuilder);
    }
}
