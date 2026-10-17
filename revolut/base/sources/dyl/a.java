package dyl;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.views.AmountInputView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements e {
    @Override // dyl.e
    public final b a(ViewGroup transferScreen) {
        Intrinsics.checkNotNullParameter(transferScreen, "transferScreen");
        View viewI = s.i(transferScreen, new Class[]{AmountInputView.class}, null);
        AmountInputView amountInputView = viewI instanceof AmountInputView ? (AmountInputView) viewI : null;
        if (amountInputView != null) {
            CharSequence contentDescription = amountInputView.getContentDescription();
            String string = contentDescription != null ? contentDescription.toString() : null;
            if (string == null) {
                string = "";
            }
            if (string.length() != 0) {
                TextPaint paint = amountInputView.getEditText().getPaint();
                float fMeasureText = paint.measureText(string);
                Rect rect = new Rect();
                paint.getTextBounds(string, 0, string.length(), rect);
                int iC = rim.d.c(fMeasureText);
                if (iC < 1) {
                    iC = 1;
                }
                int iHeight = rect.height();
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iC, iHeight >= 1 ? iHeight : 1, Bitmap.Config.ARGB_8888);
                ch.qos.logback.core.util.a.e(bitmapCreateBitmap, "createBitmap(...)", bitmapCreateBitmap).drawText(string, BitmapDescriptorFactory.HUE_RED, -rect.top, paint);
                return new b(bitmapCreateBitmap, amountInputView);
            }
        }
        return null;
    }
}
