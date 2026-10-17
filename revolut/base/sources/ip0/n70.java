package ip0;

import android.view.View;
import android.widget.ImageView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.views.QrCodePlainView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class n70 extends koi.b {
    public final ImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final QrCodePlainView f165463g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n70(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = (ImageView) itemView.findViewById(R$id.qrCodePlain_image);
        this.f165463g = (QrCodePlainView) itemView.findViewById(R$id.qrCodePlain_qrCode);
    }
}
