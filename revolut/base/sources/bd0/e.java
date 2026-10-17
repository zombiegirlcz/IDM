package bd0;

import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.feature.backend_flow.domain.models.CurrencySelectionItem;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.backend_flow.domain.models.TransactionsSelectionItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xl2.b0;

/* JADX INFO: loaded from: classes19.dex */
public final class e implements d {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // bd0.d
    public final boolean a(BackendScreen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Boolean boolValueOf = null;
        FormScreen formScreen = screen instanceof FormScreen ? (FormScreen) screen : null;
        if (formScreen != null) {
            List list = formScreen.f63468b;
            ArrayList<b0> arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof b0) {
                    arrayList.add(obj2);
                }
            }
            Iterator it8 = arrayList.iterator();
            boolean z = false;
            int iJ = 0;
            while (it8.hasNext()) {
                iJ += ((b0) it8.next()).j();
            }
            if (iJ >= 10) {
                z = true;
                boolValueOf = Boolean.valueOf(z);
            } else {
                if (!arrayList.isEmpty()) {
                    for (b0 b0Var : arrayList) {
                        if ((b0Var instanceof CurrencySelectionItem) || (b0Var instanceof TransactionsSelectionItem)) {
                            z = true;
                            break;
                        }
                    }
                }
                boolValueOf = Boolean.valueOf(z);
            }
        }
        return pd.b.j(boolValueOf);
    }
}
