package u4e;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.jl0;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class n {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Custom f277340a = new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254);

    public static final class a {
        private a() {
        }
    }

    public static jl0 a(int i, Clause clause, String str) {
        return new jl0(str, new ResourceImage(i, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, new ImageTransformations(null, null, null, null, null, 16, 16, 31), (Clause) null, 182), clause);
    }
}
