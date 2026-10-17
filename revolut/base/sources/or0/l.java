package or0;

import android.widget.TextView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f228021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TrackableItem f228022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Function1 f228023c;

    public l(TextView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f228021a = view;
    }

    public final void a() {
        this.f228022b = null;
        this.f228023c = null;
    }

    public final void b(TrackableItem trackableItem, Function1 function1) {
        Intrinsics.checkNotNullParameter(trackableItem, "trackableItem");
        this.f228022b = trackableItem;
        this.f228023c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ty0.a clickData = (ty0.a) obj2;
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        TrackableItem trackableItem = this.f228022b;
        if (trackableItem != null) {
            TextView textView = this.f228021a;
            py0.f fVarN0 = u.k(textView).n0();
            Clause clause = clickData.f275447c;
            fVarN0.a(textView, trackableItem, clause != null ? new py0.c(clause) : null);
            Function1 function1 = this.f228023c;
            if (function1 != null) {
                function1.invoke(clickData);
            }
        }
        return Unit.f186387a;
    }
}
