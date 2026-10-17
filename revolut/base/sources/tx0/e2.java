package tx0;

import android.content.Context;
import com.revolut.core.ui_kit.R$dimen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public interface e2 {
    default int a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getResources().getDimensionPixelSize(R$dimen.internal_nav_bar_with_container_content_overlap);
    }

    int getOverlapMode();
}
