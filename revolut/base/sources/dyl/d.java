package dyl;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements e {

    @NotNull
    private static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f121140a;

    public d(int i) {
        this.f121140a = i;
    }

    @Override // dyl.e
    public final b a(ViewGroup transferScreen) {
        TextView textView;
        Intrinsics.checkNotNullParameter(transferScreen, "transferScreen");
        RecyclerView recyclerView = (RecyclerView) transferScreen.findViewById(this.f121140a);
        if (recyclerView != null) {
            int childCount = recyclerView.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    textView = null;
                    break;
                }
                View childAt = recyclerView.getChildAt(i);
                RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(childAt);
                koi.b bVar = childViewHolder instanceof koi.b ? (koi.b) childViewHolder : null;
                if (bVar != null) {
                    koi.j jVar = bVar.e;
                    if (Intrinsics.f(jVar != null ? jVar.getF53575a() : null, "id_transfer_header")) {
                        textView = (TextView) childAt.findViewById(R$id.counterText_valueSectionTitle);
                        break;
                    }
                }
                i++;
            }
            if (textView != null) {
                CharSequence text = textView.getText();
                String string = text != null ? text.toString() : null;
                if (string == null) {
                    string = "";
                }
                if (string.length() != 0) {
                    TextPaint paint = textView.getPaint();
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
                    return new b(bitmapCreateBitmap, textView);
                }
            }
        }
        return null;
    }
}
