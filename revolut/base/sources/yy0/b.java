package yy0;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.R$id;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.youTransactor.uCube.rpc.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NotImplementedError;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f317745a = new ArrayList();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Image f317746a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public d f317747b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public d f317748c;
    }

    @Override // yy0.f
    public final void a(Image image, ImageView to6, Function1 function1, Function0 function0) {
        Object obj2;
        Intrinsics.checkNotNullParameter(to6, "to");
        Context context = to6.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Activity activityM = kli.a.m(context);
        if (activityM == null || !activityM.isDestroyed()) {
            Object tag2 = to6.getTag(R$id.internal_view_tag_image_display_delegate);
            CharSequence charSequenceA = null;
            a aVar = tag2 instanceof a ? (a) tag2 : null;
            if (aVar == null) {
                aVar = new a();
                to6.setTag(R$id.internal_view_tag_image_display_delegate, aVar);
            }
            d dVar = aVar.f317747b;
            Image image2 = aVar.f317746a;
            d dVar2 = aVar.f317748c;
            if (image != null) {
                List listG = g();
                int size = listG.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        obj2 = null;
                        break;
                    }
                    obj2 = listG.get(i);
                    if (((d) obj2).e(image)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (obj2 instanceof o) {
                    ((o) obj2).f317758a = this;
                } else if (obj2 == null) {
                    throw new NoSuchElementException("Delegates list doesn't contain delegate for image " + image);
                }
            } else {
                obj2 = null;
            }
            aVar.f317746a = image;
            aVar.f317747b = (d) obj2;
            if (obj2 == null || image == null) {
                aVar.f317748c = null;
                if (dVar != null) {
                    dVar.b(to6);
                }
                if (dVar2 != null) {
                    dVar2.b(to6);
                }
                to6.setImageDrawable(null);
                if (n14.k.d(to6)) {
                    to6.setContentDescription(null);
                    return;
                }
                return;
            }
            d dVar3 = (d) obj2;
            if (dVar3.d() && obj2 == dVar && image.equals(image2)) {
                return;
            }
            aVar.f317748c = null;
            if (dVar != null) {
                dVar.b(to6);
            }
            if (dVar2 != null) {
                dVar2.b(to6);
            }
            dVar3.a(image, to6, function1, function0);
            if (n14.k.d(to6)) {
                Clause clauseC = dVar3.c(image);
                if (clauseC != null) {
                    Context context2 = to6.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    ty0.c cVarB0 = jh.d.f(context2).b0();
                    Context context3 = to6.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    charSequenceA = ty0.c.a(cVarB0, clauseC, context3, null, null, null, null, Constants.TAG_FC_SPEED_MODE);
                }
                to6.setContentDescription(charSequenceA);
            }
        }
    }

    @Override // yy0.f
    public final void b(ImageView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Drawable drawable = view.getDrawable();
        Object tag2 = view.getTag(R$id.internal_view_tag_image_display_delegate);
        a aVar = tag2 instanceof a ? (a) tag2 : null;
        if (aVar == null) {
            aVar = new a();
            view.setTag(R$id.internal_view_tag_image_display_delegate, aVar);
        }
        d dVar = aVar.f317747b;
        d dVar2 = aVar.f317748c;
        aVar.f317746a = null;
        aVar.f317747b = null;
        aVar.f317748c = null;
        if (dVar != null) {
            dVar.b(view);
        }
        if (dVar2 != null) {
            dVar2.b(view);
        }
        view.setImageDrawable(drawable);
    }

    @Override // yy0.f
    public final void c(Image image, Context context, int i, int i2, Function1 function1, Function0 function0) {
        Intrinsics.checkNotNullParameter(context, "context");
        v1.m mVar = function1 != null ? new v1.m(14, function1) : null;
        a3l.b bVar = function0 != null ? new a3l.b(17, function0) : null;
        if (image == null) {
            if (mVar != null) {
                mVar.invoke(null);
                return;
            }
            return;
        }
        try {
            List listG = g();
            int size = listG.size();
            for (int i3 = 0; i3 < size; i3++) {
                Object obj2 = listG.get(i3);
                if (((d) obj2).e(image)) {
                    d dVar = (d) obj2;
                    if (dVar instanceof o) {
                        ((o) dVar).f317758a = this;
                    }
                    if (dVar instanceof zy0.a) {
                        throw new NotImplementedError("ImageDecoratorDisplayDelegate not supported yet for rendering");
                    }
                    dVar.f(image, context, i, i2, mVar, bVar);
                    return;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        } catch (NoSuchElementException unused) {
            throw new NoSuchElementException("Delegates list doesn't contain delegate for image " + image);
        }
    }

    @Override // yy0.f
    public final Image d(ImageView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Object tag2 = view.getTag(R$id.internal_view_tag_image_display_delegate);
        a aVar = tag2 instanceof a ? (a) tag2 : null;
        if (aVar == null) {
            return null;
        }
        return aVar.f317746a;
    }

    @Override // yy0.f
    public final void f(ImageView to6, boolean z) {
        Intrinsics.checkNotNullParameter(to6, "to");
        n14.k.f(to6, z);
    }

    public List g() {
        return this.f317745a;
    }
}
