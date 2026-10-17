package com.onfido.android.sdk.capture.audio;

import android.content.Context;
import android.graphics.Paint;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.utils.ContextUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Paint;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class ExpandablePillView$audioPillPaint$2 extends u implements Function0<Paint> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandablePillView$audioPillPaint$2(Context context) {
        super(0);
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Paint invoke() {
        Paint paint = new Paint();
        Context context = this.$context;
        paint.setAntiAlias(true);
        paint.setColor(ContextUtilsKt.colorFromAttr(context, R.attr.onfidoColorActionMain));
        return paint;
    }
}
