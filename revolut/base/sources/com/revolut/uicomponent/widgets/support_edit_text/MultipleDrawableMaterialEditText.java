package com.revolut.uicomponent.widgets.support_edit_text;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.R$attr;
import ce9.m;
import ch.qos.logback.core.util.a;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import gom.e;
import gzl.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nkm.y;
import org.jetbrains.annotations.NotNull;
import yhm.d;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/revolut/uicomponent/widgets/support_edit_text/MultipleDrawableMaterialEditText;", "Lgzl/c;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "rightDrawables", "", "setCompoundRightDrawablesWithIntrinsicBounds", "(Ljava/util/List;)V", "Companion", "a", "core_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public class MultipleDrawableMaterialEditText extends c {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public final int f;

    /* JADX INFO: renamed from: com.revolut.uicomponent.widgets.support_edit_text.MultipleDrawableMaterialEditText$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MultipleDrawableMaterialEditText(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // gzl.c
    public final int d(Drawable drawable, MotionEvent event) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        Intrinsics.checkNotNullParameter(event, "event");
        if (!(drawable instanceof SegmentedBitmapDrawable)) {
            return 0;
        }
        return ((int) (r3.getIntrinsicWidth() - (getRight() - event.getRawX()))) / (((SegmentedBitmapDrawable) drawable).f107330a + this.f);
    }

    public final void setCompoundRightDrawablesWithIntrinsicBounds(@NotNull List<Integer> rightDrawables) {
        Intrinsics.checkNotNullParameter(rightDrawables, "rightDrawables");
        if (rightDrawables.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it8 = rightDrawables.iterator();
        while (true) {
            Bitmap bitmapH = null;
            if (!it8.hasNext()) {
                break;
            }
            int iIntValue = ((Number) it8.next()).intValue();
            try {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                bitmapH = m.h(iIntValue, context);
            } catch (Throwable th10) {
                e.f145194a.v(th10);
            }
            if (bitmapH != null) {
                arrayList.add(bitmapH);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Bitmap bitmap = (Bitmap) arrayList.get(0);
        int width = bitmap.getWidth();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(arrayList.size() * (this.f + width), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvasE = a.e(bitmapCreateBitmap, "createBitmap(...)", bitmapCreateBitmap);
        nkm.c cVarY = y.y(d0.Q(arrayList), new d1.a(width, this));
        Iterator it9 = cVarY.f216828b.iterator();
        int i = 0;
        while (it9.hasNext()) {
            Function2 function2 = (Function2) cVarY.f216829c;
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            canvasE.drawBitmap((Bitmap) ((Pair) function2.invoke(Integer.valueOf(i), it9.next())).f186386b, ((Number) r6.f186385a).intValue(), BitmapDescriptorFactory.HUE_RED, (Paint) null);
            i = i2;
        }
        Drawable drawable = getCompoundDrawables()[0];
        Drawable drawable2 = getCompoundDrawables()[1];
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, new SegmentedBitmapDrawable(resources, bitmapCreateBitmap, width), getCompoundDrawables()[3]);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MultipleDrawableMaterialEditText(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultipleDrawableMaterialEditText(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f = kli.a.k(context, 8.0f);
    }

    public /* synthetic */ MultipleDrawableMaterialEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, R$attr.editTextStyle);
    }
}
