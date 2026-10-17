package fji;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ColorImage;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ f f135640a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f135641b;

    static {
        TextClause textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextClause textClause2 = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        ColorImage.INSTANCE.getClass();
        f135641b = new h(new PromptMarketingContentDelegate.Model("PROMPT_CONTENT_LIST_ID", textClause, textClause2, new PromptMarketingContentDelegate.Model.Content.MediaContent(ColorImage.Companion.a(), null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097072));
    }

    private f() {
    }
}
