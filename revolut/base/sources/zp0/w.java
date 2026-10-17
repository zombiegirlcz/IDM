package zp0;

import android.content.Context;
import android.view.ViewParent;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import java.util.Date;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class w extends p {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Function1 f324149r;

    public w(final v vVar, final MaskedTextInputEditText field, final u errorType, final Function1 onDobChanging, int i) {
        boolean z = (i & 8) != 0;
        Context context = field.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Locale locale = jh.d.e(context);
        o digitsKeyListenerProvider = new o();
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        Intrinsics.checkNotNullParameter(onDobChanging, "onDobChanging");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(digitsKeyListenerProvider, "digitsKeyListenerProvider");
        super(locale, field, new oim.n() { // from class: zp0.r
            @Override // oim.n
            public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                Pair pair;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                Date date = (Date) obj3;
                Throwable th10 = (Throwable) obj4;
                String rawValue = (String) obj5;
                Intrinsics.checkNotNullParameter(rawValue, "rawValue");
                if (zBooleanValue) {
                    v vVar2 = vVar;
                    if (th10 != null) {
                        pair = new Pair(null, vVar2 != null ? vVar2.f324148a : null);
                    } else {
                        pair = errorType.a(vVar2, date, s.f324142a);
                    }
                } else {
                    pair = new Pair(null, null);
                }
                Date date2 = (Date) pair.f186385a;
                String str = (String) pair.f186386b;
                ViewParent parent = field.getParent();
                InputText inputText = parent instanceof InputText ? (InputText) parent : null;
                if (inputText != null) {
                    inputText.setError(str != null);
                    inputText.setHelperText(str);
                }
                onDobChanging.invoke(new t(date2, rawValue, zBooleanValue));
                return Unit.f186387a;
            }
        }, null, false, z, digitsKeyListenerProvider, false, 24);
        this.f324149r = onDobChanging;
    }
}
