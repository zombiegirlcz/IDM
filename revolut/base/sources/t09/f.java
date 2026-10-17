package t09;

import aw0.o9;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.learn.shared.impl.R$string;
import com.revolut.feature.learn.shared.impl.ui.lesson.LessonScreenContract$InputData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LessonScreenContract$InputData f266962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h09.f f266963b;

    public f(LessonScreenContract$InputData inputData, h09.f rewardMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(rewardMapper, "rewardMapper");
        this.f266962a = inputData;
        this.f266963b = rewardMapper;
    }

    public static CompositeClause a() {
        int i = R$drawable.uikit_icn_24_share_ios;
        Integer numValueOf = Integer.valueOf(R$attr.uikit_colorAccent);
        Float fValueOf = Float.valueOf(24.0f);
        return new CompositeClause(v.k(new ImageClause(i, numValueOf, fValueOf, fValueOf, 16), new TextClause("  ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.investmentlearn_quiz_completed_share_button, null, null, 14)), null, null, null, 14);
    }
}
