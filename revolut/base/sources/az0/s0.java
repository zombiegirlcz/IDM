package az0;

import android.content.Context;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.drawables.MaskedLayerDrawable;
import com.revolut.core.ui_kit_core.displayers.image.models.PairedImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.HexagonalTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.image.transformation.MaskTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.MirrorTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.RoundedRectTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ShapeTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.SquareTransformation;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class s0 extends u {

    @NotNull
    private static final a Companion = new a(0);

    /* JADX INFO: loaded from: classes20.dex */
    public static final class a {
        private a() {
        }

        public a(int i) {
        }
    }

    public static final MaskedLayerDrawable.a h(s0 s0Var, Image image) {
        ImageTransformations f60016c;
        ShapeTransformation shapeTransformation = null;
        gz0.c cVar = image instanceof gz0.c ? (gz0.c) image : null;
        if (cVar != null && (f60016c = cVar.getF60016c()) != null) {
            shapeTransformation = f60016c.f60064b;
        }
        if (Intrinsics.f(shapeTransformation, HexagonalTransformation.f60062a)) {
            return MaskedLayerDrawable.a.b.f59828a;
        }
        if ((shapeTransformation instanceof CircleTransformation) || (shapeTransformation instanceof RoundedRectTransformation) || (shapeTransformation instanceof MaskTransformation) || Intrinsics.f(shapeTransformation, MirrorTransformation.f60070a) || Intrinsics.f(shapeTransformation, SquareTransformation.f60074a) || shapeTransformation == null) {
            return MaskedLayerDrawable.a.C0447a.f59827a;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // yy0.d
    public final boolean e(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return image instanceof PairedImage;
    }

    @Override // az0.u
    public final Object g(Context context, Image image, Continuation continuation) {
        return skm.e0.o(new u0(image, this, context, null), continuation);
    }
}
