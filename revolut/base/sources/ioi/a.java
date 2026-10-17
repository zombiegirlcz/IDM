package ioi;

import androidx.recyclerview.widget.RecyclerView;
import hoi.e;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public interface a {
    void d(RecyclerView.ViewHolder viewHolder);

    default void e(RecyclerView.ViewHolder holder, int i, int i2, int i3, int i5) {
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    default boolean m(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        return false;
    }

    default boolean u(RecyclerView.ViewHolder oldHolder, RecyclerView.ViewHolder newHolder, e eVar, e eVar2, long j2) {
        Intrinsics.checkNotNullParameter(oldHolder, "oldHolder");
        Intrinsics.checkNotNullParameter(newHolder, "newHolder");
        return false;
    }

    default void w(RecyclerView.ViewHolder holder, long j2, e eVar) {
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    boolean x(List list);
}
