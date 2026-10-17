package qq0;

import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.RecyclerView;
import byl.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {
    private a() {
    }

    public static void a(View iconView, RecyclerView.ViewHolder innerViewHolder, View rootView) {
        Intrinsics.checkNotNullParameter(iconView, "iconView");
        Intrinsics.checkNotNullParameter(innerViewHolder, "innerViewHolder");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        View itemView = innerViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        OneShotPreDrawListener.add(itemView, new g(itemView, innerViewHolder, rootView, iconView, 3));
    }
}
