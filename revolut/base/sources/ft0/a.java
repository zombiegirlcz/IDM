package ft0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends koi.b {
    public final st0.a f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(st0.a itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "actionChipView");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = itemView;
    }
}
