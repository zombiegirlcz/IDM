package xmj;

import com.revolut.core.ui_kit.delegates.CircleActionButtonsBarDelegate;
import com.revolut.core.ui_kit.delegates.v3;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f307281a;

    public f(d imageMapper) {
        Intrinsics.checkNotNullParameter(imageMapper, "imageMapper");
        this.f307281a = imageMapper;
    }

    public static CircleActionButtonsBarDelegate.CircleActionButton a(String str, int i, int i2, vmj.g gVar) {
        return new CircleActionButtonsBarDelegate.CircleActionButton(str, new TextLocalisedClause(i, null, null, 14), new ResourceImage(i2, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), CircleActionButtonsBarDelegate.CircleActionButton.ButtonStyle.PrimaryNeutral.f52095a, (v3) null, (String) null, gVar != null, gVar, 304);
    }
}
