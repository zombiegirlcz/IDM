package zc0;

import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.feature.backend_flow.domain.models.Filter;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g3 extends zp0.p {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Function1 f321056r;

    public g3(Locale locale, final InputText inputText, final Function1 onDateChanged, Filter filter) {
        final c3 dateFilterValidator = new c3(filter);
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(inputText, "inputText");
        Intrinsics.checkNotNullParameter(onDateChanged, "onDateChanged");
        Intrinsics.checkNotNullParameter(dateFilterValidator, "dateFilterValidator");
        super(locale, inputText.getInnerEditText(), new oim.n() { // from class: zc0.f3
            /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
            /* JADX WARN: Removed duplicated region for block: B:55:0x00ed  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
            @Override // oim.n
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11) {
                /*
                    Method dump skipped, instruction units count: 291
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: zc0.f3.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, null, false, false, null, false, 472);
        this.f321056r = onDateChanged;
    }
}
