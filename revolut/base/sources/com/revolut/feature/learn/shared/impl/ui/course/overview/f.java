package com.revolut.feature.learn.shared.impl.ui.course.overview;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.R$string;
import i09.g;
import ip0.sy;
import ip0.zj;
import java.util.ArrayList;
import java.util.List;
import jki.i;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements p {

    @NotNull
    public static final i09.p Companion = new i09.p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f78008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f78009b;

    public f(h09.f rewardMapper, l09.d lessonMapper, l09.b headerMapper) {
        Intrinsics.checkNotNullParameter(rewardMapper, "rewardMapper");
        Intrinsics.checkNotNullParameter(lessonMapper, "lessonMapper");
        Intrinsics.checkNotNullParameter(headerMapper, "headerMapper");
        IntRange intRangeO = kotlin.ranges.f.o(0, 4);
        ArrayList arrayList = new ArrayList(w.t(intRangeO, 10));
        vim.f it8 = intRangeO.iterator();
        while (it8.f289625c) {
            sy syVar = new sy(a0.d.n("LOADING_ITEM_", it8.nextInt()), null, 62);
            yp0.b.l(syVar, 0, 0, 0, 0, null, false, 63);
            arrayList.add(syVar);
        }
        this.f78008a = arrayList;
        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("ERROR_STATE_ID", new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), new TextLocalisedClause(R$string.common_error_state_description, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(R$string.common_error_state_action, null, null, 14), false, null, null, false, 0, 0, 31680);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        this.f78009b = u.c(model);
    }

    @Override // jki.p
    public final m a(i iVar) {
        g domainState = (g) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (i09.m) iii.c.f(domainState.f157324b, new hw9.a(this, 21), new hw9.b(this, 13), new hnc.a(this, 8));
    }
}
