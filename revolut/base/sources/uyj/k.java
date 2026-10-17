package uyj;

import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import androidx.core.graphics.drawable.DrawableKt;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.BitmapImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.learn.impl.ui.share_rewards.ShareRewardsScreenContract$InputData;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements p {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShareRewardsScreenContract$InputData f284439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oc.f f284440b;

    public k(ShareRewardsScreenContract$InputData inputData, oc.f shareImageBytesMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(shareImageBytesMapper, "shareImageBytesMapper");
        this.f284439a = inputData;
        this.f284440b = shareImageBytesMapper;
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        PromptContentDelegate.Model.BackgroundType image;
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextClause textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextClause textClause2 = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        byte[] bytes = domainState.f284427a;
        if (bytes != null) {
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            image = new PromptContentDelegate.Model.BackgroundType.Image(new BitmapImage(DrawableKt.toBitmap$default(new BitmapDrawable(this.f284440b.f224008a.getResources(), BitmapFactory.decodeByteArray(bytes, 0, bytes.length)), 0, 0, null, 7, null), false, (ImageTransformations) null, 14), false);
        } else {
            image = PromptContentDelegate.Model.BackgroundType.Dialog.f53074a;
        }
        PromptContentDelegate.Model.BackgroundType backgroundType = image;
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.d;
        return new e(u.c(new PromptContentDelegate.Model("PROMPT_LIST_ID", textClause, textClause2, null, PromptContentDelegate.Model.b.a.f53077a, resourceImage, null, null, false, new TextClause(this.f284439a.f101773a.f78033c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, defaultFilledButton, null, null, false, null, false, null, null, null, backgroundType, null, null, null, null, null, 532667848)));
    }
}
