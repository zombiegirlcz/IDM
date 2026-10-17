package or0;

import android.os.Build;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.revolut.core.ui_kit.R$id;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;
import zhm.z;

/* JADX INFO: loaded from: classes19.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList f228024a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f228025b = new int[2];

    public static final void a(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object tag2 = view.getTag(R$id.internal_accessibility_companion);
        gq0.o oVar = tag2 instanceof gq0.o ? (gq0.o) tag2 : null;
        if (oVar == null || oVar.f145507a) {
            return;
        }
        try {
            m.Companion companion = yhm.m.INSTANCE;
            throw new IllegalStateException("ClickListener setting not allowed by ViewAccessibilityCompanion");
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            Throwable thA = yhm.m.a(yhm.o.a(th10));
            if (thA != null) {
                hx7.e.n(thA);
            }
        }
    }

    public static final CharSequence b(View view) {
        CharSequence text;
        View view2;
        Intrinsics.checkNotNullParameter(view, "<this>");
        ArrayList<View> arrayList = f228024a;
        arrayList.clear();
        view.addChildrenForAccessibility(arrayList);
        arrayList.add(view);
        if (arrayList.size() > 1) {
            z.w(arrayList, new k2j.d(f228025b, 26));
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            text = null;
            if (i >= size) {
                view2 = null;
                break;
            }
            view2 = arrayList.get(i);
            View view3 = view2;
            if (view3.getVisibility() == 0) {
                Intrinsics.checkNotNullParameter(view3, "<this>");
                CharSequence contentDescription = view3.getContentDescription();
                if (contentDescription == null) {
                    if (!(view3 instanceof TextView)) {
                        view3 = null;
                    }
                    TextView textView = (TextView) view3;
                    contentDescription = textView != null ? textView.getText() : null;
                }
                if (contentDescription != null) {
                    break;
                }
            }
            i++;
        }
        View view4 = view2;
        if (view4 != null) {
            Intrinsics.checkNotNullParameter(view4, "<this>");
            CharSequence contentDescription2 = view4.getContentDescription();
            if (contentDescription2 == null) {
                if (!(view4 instanceof TextView)) {
                    view4 = null;
                }
                TextView textView2 = (TextView) view4;
                if (textView2 != null) {
                    text = textView2.getText();
                }
            } else {
                text = contentDescription2;
            }
        }
        arrayList.clear();
        return text;
    }

    public static final void c(View view, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (Build.VERSION.SDK_INT >= 30) {
            view.setStateDescription(charSequence);
        } else {
            ViewCompat.setStateDescription(view, charSequence);
        }
    }
}
