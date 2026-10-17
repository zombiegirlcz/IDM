package h09;

import aw0.o9;
import aw0.y4;
import com.revolut.core.ui_kit.delegates.SmallCardDelegate;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.gu;
import ip0.kf0;
import ip0.nf0;
import ip0.of0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f148333a;

    public d(f rewardMapper) {
        Intrinsics.checkNotNullParameter(rewardMapper, "rewardMapper");
        gu guVar = new gu("CourseRedesignedMapper_LOADING_ITEM_ID0", 0, 0, 30);
        ArrayList arrayList = new ArrayList(2);
        for (int i = 0; i < 2; i++) {
            arrayList.add(new nf0(a0.d.n("CourseRedesignedMapper_LOADING_ITEM_ID_", i), of0.PURPLE));
        }
        gg.b bVar = new gg.b(true, 2);
        SmallCardDelegate.INSTANCE.getClass();
        this.f148333a = v.k(guVar, new hg("CourseRedesignedMapper_LOADING_ITEM_ID1", arrayList, 2, new y4(SmallCardDelegate.f53351j), null, bVar, false, false, null, null, 0, 0, 0, 0, 32720));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final SmallCardDelegate.Model a(u09.f course, boolean z) {
        CompositeClause compositeClauseM;
        Intrinsics.checkNotNullParameter(course, "course");
        e eVarC = f.c(course.f276111c, course.b(), course.f276115l, course.f276119q, false);
        Clause clause = eVarC.f148334a;
        Integer num = eVarC.f148335b;
        Integer num2 = eVarC.f148336c;
        SmallCardDelegate.Model.Companion companion = SmallCardDelegate.Model.INSTANCE;
        String strQ = j6.a.q("CourseRedesignedMapper_SMALL_COURSE_ITEM_ID", course.f276109a);
        UrlImage urlImage = new UrlImage(course.d, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286);
        TextClause textClause = new TextClause(course.f276110b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        int i = 2;
        Object[] objArr = 0;
        if (clause != null) {
            Clause[] elements = {num != null ? new ImageClause(num.intValue(), num2, (Float) null, (Float) null, 28) : null, clause};
            Intrinsics.checkNotNullParameter(elements, "elements");
            compositeClauseM = yoj.b.m(new TextClause("  ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), kotlin.collections.d.L(elements));
        } else {
            compositeClauseM = null;
        }
        SmallCardDelegate.b.C0425b c0425b = new SmallCardDelegate.b.C0425b(compositeClauseM, objArr == true ? 1 : 0, kf0.SMALL, i);
        int iA = course.a();
        Integer numValueOf = Integer.valueOf(iA);
        if (iA >= 100) {
            numValueOf = null;
        }
        SmallCardDelegate.Model modelA = SmallCardDelegate.Model.Companion.a(companion, strQ, textClause, c0425b, urlImage, null, numValueOf != null ? Float.valueOf(course.a() / 100.0f) : null, course, 16);
        yp0.b.l(modelA, z ? R$attr.uikit_dp8 : R$attr.uikit_dp4, z ? R$attr.uikit_dp8 : R$attr.uikit_dp4, z ? R$attr.uikit_dp16 : R$attr.uikit_dp4, z ? R$attr.uikit_dp16 : R$attr.uikit_dp4, null, false, 48);
        return modelA;
    }
}
