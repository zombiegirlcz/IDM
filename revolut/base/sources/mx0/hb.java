package mx0;

import com.revolut.core.ui_kit.models.ProfileCardModel;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.ProfileCardView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class hb implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f209737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProfileCardView f209738b;

    public /* synthetic */ hb(ProfileCardView profileCardView, int i) {
        this.f209737a = i;
        this.f209738b = profileCardView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f209737a;
        ProfileCardView profileCardView = this.f209738b;
        switch (i) {
            case 0:
                aw0.w2 it8 = (aw0.w2) obj2;
                ProfileCardView.Companion companion = ProfileCardView.INSTANCE;
                Intrinsics.checkNotNullParameter(it8, "it");
                profileCardView.f58839w.onNext(it8);
                return Unit.f186387a;
            case 1:
                aw0.w2 it9 = (aw0.w2) obj2;
                ProfileCardView.Companion companion2 = ProfileCardView.INSTANCE;
                Intrinsics.checkNotNullParameter(it9, "it");
                profileCardView.f58839w.onNext(it9);
                return Unit.f186387a;
            case 2:
                aw0.w2 it10 = (aw0.w2) obj2;
                ProfileCardView.Companion companion3 = ProfileCardView.INSTANCE;
                Intrinsics.checkNotNullParameter(it10, "it");
                profileCardView.f58839w.onNext(it10);
                return Unit.f186387a;
            case 3:
                ProfileCardView.Companion companion4 = ProfileCardView.INSTANCE;
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return Boolean.valueOf(profileCardView.u instanceof ProfileCardModel.Error);
            default:
                ProfileCardView.Companion companion5 = ProfileCardView.INSTANCE;
                Intrinsics.checkNotNullParameter((ActionsView.Item) obj2, "it");
                return Boolean.valueOf(!(profileCardView.u instanceof ProfileCardModel.Error));
        }
    }
}
