package androidx.core.widget;

import android.os.Parcel;
import androidx.core.widget.RemoteViewsCompat;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/core/widget/RemoteViewsCompat$RemoteCollectionItems;", "it", "Landroid/os/Parcel;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class RemoteViewsCompatService$RemoteViewsCompatServiceData$Companion$load$1 extends u implements Function1<Parcel, RemoteViewsCompat.RemoteCollectionItems> {
    public static final RemoteViewsCompatService$RemoteViewsCompatServiceData$Companion$load$1 INSTANCE = new RemoteViewsCompatService$RemoteViewsCompatServiceData$Companion$load$1();

    public RemoteViewsCompatService$RemoteViewsCompatServiceData$Companion$load$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final RemoteViewsCompat.RemoteCollectionItems invoke(@NotNull Parcel it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return new RemoteViewsCompat.RemoteCollectionItems(it8);
    }
}
