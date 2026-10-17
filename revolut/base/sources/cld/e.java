package cld;

import bld.j;
import bld.m;
import cli.g;
import cli.y;
import com.revolut.feature.slot_manager.impl.ui.custom_rating.FeedbackBundle;
import com.revolut.feature.slot_manager.impl.ui.custom_rating.dialog.CustomRatingBottomSheetContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends h implements dli.b {
    public final CustomRatingBottomSheetContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j f24975p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f24976q;

    public e(CustomRatingBottomSheetContract$InputData inputData, j customerRatingMediator) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(customerRatingMediator, "customerRatingMediator");
        this.o = inputData;
        this.f24975p = customerRatingMediator;
        this.f24976q = mra.d.b(this, new a("", false), new d(), null, false, 12);
    }

    @Override // yji.l
    public final void K1() {
        if (((a) ((j2) this.f24976q.f22677a).getValue()).f24972b) {
            return;
        }
        FeedbackBundle feedbackBundle = this.o.f87356a;
        m mVar = (m) this.f24975p;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(feedbackBundle, "feedbackBundle");
        mVar.f.k(m.c());
    }

    @Override // cli.z
    public final g getState() {
        return this.f24976q;
    }
}
