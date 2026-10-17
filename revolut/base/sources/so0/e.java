package so0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import yc.g;

/* JADX INFO: loaded from: classes19.dex */
public final class e implements b, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f264667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f264668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f264669c;
    public final Object d;
    public final Object e;
    public Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f264670g;

    public /* synthetic */ e(Integer num, int i, int i2, Long l2, Long l3, List list, List list2) {
        this.f264669c = num;
        this.f264667a = i;
        this.f264668b = i2;
        this.d = l2;
        this.e = l3;
        this.f = list;
        this.f264670g = list2;
    }

    @Override // so0.b
    public void a(int i) {
        ((Paint) this.f264669c).setAlpha(i);
    }

    @Override // so0.b
    public void b(View view) {
        RenderScript renderScript = (RenderScript) this.d;
        ScriptIntrinsicBlur scriptIntrinsicBlur = (ScriptIntrinsicBlur) this.e;
        c cVar = (c) this.f264670g;
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getHeight() == 0 || view.getWidth() == 0) {
            Bitmap bitmap = cVar.f264662a;
            if (bitmap != null) {
                bitmap.recycle();
            }
            cVar.f264662a = null;
            return;
        }
        Bitmap bitmapA = cVar.a(view.getWidth(), view.getHeight());
        Canvas canvas = new Canvas(bitmapA);
        int iSave = canvas.save();
        try {
            canvas.scale(1.0f / cVar.f264663b, 1.0f / cVar.f264664c);
            view.draw(canvas);
            canvas.restoreToCount(iSave);
            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScript, bitmapA);
            if (bitmapA.getHeight() != this.f264668b || bitmapA.getWidth() != this.f264667a) {
                Allocation allocation = (Allocation) this.f;
                if (allocation != null) {
                    allocation.destroy();
                }
                this.f = Allocation.createTyped(renderScript, allocationCreateFromBitmap.getType());
                this.f264667a = bitmapA.getWidth();
                this.f264668b = bitmapA.getHeight();
            }
            scriptIntrinsicBlur.setRadius(Math.min(25.0f, 25.0f));
            scriptIntrinsicBlur.setInput(allocationCreateFromBitmap);
            scriptIntrinsicBlur.forEach((Allocation) this.f);
            Allocation allocation2 = (Allocation) this.f;
            if (allocation2 != null) {
                allocation2.copyTo(bitmapA);
            }
            allocationCreateFromBitmap.destroy();
        } catch (Throwable th10) {
            canvas.restoreToCount(iSave);
            throw th10;
        }
    }

    @Override // so0.b
    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        c cVar = (c) this.f264670g;
        Bitmap bitmap = (cVar.f264663b == BitmapDescriptorFactory.HUE_RED || cVar.f264664c == BitmapDescriptorFactory.HUE_RED) ? null : cVar.f264662a;
        if (bitmap == null) {
            return;
        }
        int iSave = canvas.save();
        try {
            canvas.scale(cVar.f264663b, cVar.f264664c);
            canvas.drawBitmap(bitmap, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) this.f264669c);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // yc.g
    public vc.c e(vc.c cVar) {
        Integer num = (Integer) this.f264669c;
        int i = this.f264667a;
        int i2 = this.f264668b;
        Long l2 = (Long) this.d;
        Long l3 = (Long) this.e;
        List arrayList = (List) this.f;
        List arrayList2 = (List) this.f264670g;
        int i3 = yc.a.f312389p;
        vc.c cVarA = cVar == null ? vc.c.a(0, 0, 0, 0L, 0L, new ArrayList(), new ArrayList()) : cVar;
        int iIntValue = num == null ? cVarA.f287571a : num.intValue();
        long jLongValue = l2 == null ? cVarA.d : l2.longValue();
        long jLongValue2 = l3 == null ? cVarA.e : l3.longValue();
        if (arrayList == null) {
            List list = cVarA.f;
            arrayList = list != null ? new ArrayList(list) : new ArrayList();
        }
        if (arrayList2 == null) {
            List list2 = cVarA.f287574g;
            arrayList2 = list2 != null ? new ArrayList(list2) : new ArrayList();
        }
        return vc.c.a(iIntValue, i, i2, jLongValue, jLongValue2, arrayList, arrayList2);
    }

    public e(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f264669c = new Paint(2);
        RenderScript renderScriptCreate = RenderScript.create(context);
        Intrinsics.checkNotNullExpressionValue(renderScriptCreate, "create(...)");
        this.d = renderScriptCreate;
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
        Intrinsics.checkNotNullExpressionValue(scriptIntrinsicBlurCreate, "create(...)");
        this.e = scriptIntrinsicBlurCreate;
        this.f264667a = -1;
        this.f264668b = -1;
        this.f264670g = new c();
    }
}
