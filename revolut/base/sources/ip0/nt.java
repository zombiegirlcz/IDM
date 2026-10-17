package ip0;

import android.R;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.processing.SurfaceEdge;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode;
import androidx.compose.foundation.text.BasicText_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.LinearProgressWithAmountDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class nt implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f165567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f165568c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f165569g;

    public /* synthetic */ nt(LinearProgressWithAmountDelegate linearProgressWithAmountDelegate, ProgressBar progressBar, LinearLayout linearLayout, LinearProgressWithAmountDelegate.Model.b.a aVar, ie7.a aVar2, mt mtVar, com.revolut.core.ui_kit.delegates.h8 h8Var) {
        this.f165566a = 0;
        this.f165567b = progressBar;
        this.f165568c = linearLayout;
        this.d = aVar;
        this.e = aVar2;
        this.f = mtVar;
        this.f165569g = h8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float[] fArr;
        int i = this.f165566a;
        Object obj2 = this.f165569g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.f165568c;
        Object obj7 = this.f165567b;
        switch (i) {
            case 0:
                ProgressBar progressBar = (ProgressBar) obj7;
                mt mtVar = (mt) obj3;
                com.revolut.core.ui_kit.delegates.h8 h8Var = (com.revolut.core.ui_kit.delegates.h8) obj2;
                Context context = ((LinearLayout) obj6).getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                float fFloatValue = ((Number) ((ie7.a) obj4).invoke()).floatValue();
                List list = ((LinearProgressWithAmountDelegate.Model.b.a) obj5).f52687a;
                List list2 = list;
                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList.add(Integer.valueOf(kli.a.s(((Number) it8.next()).intValue(), context)));
                }
                int[] iArrC1 = zhm.d0.c1(arrayList);
                int size = list.size();
                if (size <= 1) {
                    fArr = new float[]{BitmapDescriptorFactory.HUE_RED};
                } else {
                    float[] fArr2 = new float[size];
                    for (int i2 = 0; i2 < size; i2++) {
                        fArr2[i2] = i2 / (size - 1.0f);
                    }
                    fArr = fArr2;
                }
                LinearGradient linearGradient = new LinearGradient(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, fFloatValue, BitmapDescriptorFactory.HUE_RED, iArrC1, fArr, Shader.TileMode.CLAMP);
                float fFloatValue2 = ((Number) mtVar.invoke()).floatValue();
                int width = progressBar.getWidth();
                int i3 = h8Var.f54235a;
                float[] fArr3 = new float[8];
                for (int i5 = 0; i5 < 8; i5++) {
                    fArr3[i5] = 100.0f;
                }
                float f = i3;
                float[] fArr4 = f < 100.0f ? new float[]{100.0f, 100.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 100.0f, 100.0f} : fArr3;
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr3, null, null));
                Paint paint = shapeDrawable.getPaint();
                Context context2 = progressBar.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                paint.setColor(kli.a.s(R$attr.uikit_colorGreyTone20_50, context2));
                Matrix matrix = new Matrix();
                matrix.setTranslate(-fFloatValue2, BitmapDescriptorFactory.HUE_RED);
                ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RoundRectShape(fArr4, null, null));
                shapeDrawable2.getPaint().setShader(linearGradient);
                shapeDrawable2.getPaint().getShader().setLocalMatrix(matrix);
                LayerDrawable layerDrawable = new LayerDrawable(new ShapeDrawable[]{shapeDrawable, shapeDrawable2});
                layerDrawable.setId(0, R.id.background);
                layerDrawable.setId(1, R.id.progress);
                layerDrawable.setLayerWidth(1, (int) ((f / 100.0f) * width));
                progressBar.setProgressDrawable(layerDrawable);
                break;
            case 1:
                ((DualSurfaceProcessorNode) obj7).lambda$sendSurfaceOutputs$0((CameraInternal) obj6, (CameraInternal) obj5, (SurfaceEdge) obj4, (SurfaceEdge) obj3, (Map.Entry) obj2);
                break;
            default:
                BasicText_androidKt.BackgroundTextMeasurement$lambda$1$0((TextStyle) obj7, (LayoutDirection) obj6, (List) obj5, (AnnotatedString) obj4, (Density) obj3, (FontFamily.Resolver) obj2);
                break;
        }
    }

    public /* synthetic */ nt(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.f165566a = i;
        this.f165567b = obj2;
        this.f165568c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
        this.f165569g = obj7;
    }
}
