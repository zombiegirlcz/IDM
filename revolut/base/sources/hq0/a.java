package hq0;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.models.Clause;
import com.youTransactor.uCube.rpc.Constants;
import gq0.n;
import java.util.ArrayList;
import java.util.List;
import jh.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import or0.u;
import ty0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends View.AccessibilityDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f154578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f154579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f154580c;
    public final ArrayList d;

    public a(Clause clause, ArrayList arrayList, List list, boolean z) {
        this.f154578a = clause;
        this.f154579b = z;
        this.f154580c = list;
        this.d = arrayList;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfo info) {
        String string;
        String string2;
        SpannableStringBuilder spannableStringBuilderA;
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        if (this.f154578a != null) {
            c cVarB0 = u.k(host).b0();
            Context context = host.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            string = c.a(cVarB0, this.f154578a, context, null, null, null, null, Constants.TAG_FC_SPEED_MODE).toString();
        } else {
            string = null;
        }
        Context context2 = host.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        boolean z = this.f154579b;
        if (z && string != null) {
            string2 = context2.getString(R$string.chat_bubble_incoming_message_from_label, string);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        } else if (z) {
            string2 = context2.getString(R$string.chat_bubble_incoming_message_received_message);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        } else {
            string2 = context2.getString(R$string.chat_bubble_outgoing_message_your_message);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        }
        StringBuilder sb6 = new StringBuilder();
        List<CharSequence> list = this.f154580c;
        if (list != null) {
            for (CharSequence charSequence : list) {
                if (!d0.W(charSequence) && !TextUtils.equals(charSequence, string)) {
                    if (sb6.length() > 0) {
                        sb6.append(", ");
                    }
                    sb6.append(charSequence);
                }
            }
        }
        String string3 = sb6.toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        if (string3.length() != 0) {
            string2 = com.google.android.gms.internal.mlkit_vision_face.a.o(string2, ", ", string3);
        }
        info.setContentDescription(string2);
        ArrayList arrayList = this.d;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                gq0.a aVar = (gq0.a) arrayList.get(i);
                int i2 = aVar.f145488a;
                Clause clause = aVar.f145489b;
                if (clause != null) {
                    Context context3 = host.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    c cVarB02 = d.f(context3).b0();
                    Context context4 = host.getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                    spannableStringBuilderA = c.a(cVarB02, clause, context4, null, null, null, null, Constants.TAG_FC_SPEED_MODE);
                } else {
                    spannableStringBuilderA = null;
                }
                info.addAction(new AccessibilityNodeInfo.AccessibilityAction(i2, spannableStringBuilderA));
            }
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View host, int i, Bundle bundle) {
        Intrinsics.checkNotNullParameter(host, "host");
        ArrayList arrayList = this.d;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                gq0.a aVar = (gq0.a) arrayList.get(i2);
                if (aVar.f145488a == i) {
                    n nVar = aVar.f145490c;
                    if (nVar != null) {
                        u.k(host).n0().a(host, nVar.f145505a, nVar.f145506b);
                    }
                    aVar.d.invoke();
                    return true;
                }
            }
        }
        return super.performAccessibilityAction(host, i, bundle);
    }
}
