package j0a;

import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.ak0;
import koi.j;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import ru9.l0;
import ru9.o;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f169992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final du9.b f169993b;

    public d(o bubblePositionMapper, l0 transfersChatBubbleMapper, du9.b disclaimerProvider, a completelyBlockedItemMapper) {
        Intrinsics.checkNotNullParameter(bubblePositionMapper, "bubblePositionMapper");
        Intrinsics.checkNotNullParameter(transfersChatBubbleMapper, "transfersChatBubbleMapper");
        Intrinsics.checkNotNullParameter(disclaimerProvider, "disclaimerProvider");
        Intrinsics.checkNotNullParameter(completelyBlockedItemMapper, "completelyBlockedItemMapper");
        this.f169992a = transfersChatBubbleMapper;
        this.f169993b = disclaimerProvider;
    }

    public static j a(DateTime dateTime) {
        long millis = dateTime.getMillis();
        TextDelegate.Model model = new TextDelegate.Model(String.valueOf(millis), new TimeClause(millis, new TimeClause.Format.Pretty(q0.ONLY_DATE), null, null, 12), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036);
        int i = R$attr.uikit_dp4;
        yp0.b.r(model, i, i, 0, 0, 12);
        return model;
    }
}
