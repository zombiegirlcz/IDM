package v90;

import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.feature.backend_flow.domain.models.SummaryScreen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import q90.m4;
import q90.s3;
import u90.d0;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
public final class i extends f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(d0 itemsMapperProvider) {
        super(itemsMapperProvider);
        Intrinsics.checkNotNullParameter(itemsMapperProvider, "itemsMapperProvider");
    }

    @Override // v90.a
    public final BackendScreen a(m4 m4Var) {
        s3 screen = (s3) m4Var;
        Intrinsics.checkNotNullParameter(screen, "screen");
        return new SummaryScreen(screen.getId(), screen.getTitle(), screen.getSubtitle(), screen.getPreviousViewId(), d(screen.getItems()));
    }

    @Override // v90.a
    public final m4 b(BackendScreen backendScreen) {
        SummaryScreen screen = (SummaryScreen) backendScreen;
        Intrinsics.checkNotNullParameter(screen, "screen");
        String str = screen.f63667a;
        String str2 = screen.e;
        String str3 = screen.f63669c;
        String str4 = screen.d;
        List list = screen.f63668b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(e((BackendItem) it8.next()));
        }
        return new s3(str, str2, str3, str4, arrayList);
    }
}
