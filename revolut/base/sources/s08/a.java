package s08;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.insurance_pet.impl.ui.profile.plan.PetPolicyDetailsActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f258877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PetPolicyDetailsActivity f258878b;

    public /* synthetic */ a(PetPolicyDetailsActivity petPolicyDetailsActivity, int i) {
        this.f258877a = i;
        this.f258878b = petPolicyDetailsActivity;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f258877a;
        PetPolicyDetailsActivity petPolicyDetailsActivity = this.f258878b;
        switch (i) {
            case 0:
                h08.d dVar = petPolicyDetailsActivity.f76410s0;
                if (dVar != null) {
                    return (opi.b) dVar.k.get();
                }
                Intrinsics.r("activityComponent");
                throw null;
            case 1:
                int i2 = PetPolicyDetailsActivity.B0;
                return new z4l.j(7, v.k((SmallActionButtonDelegate) petPolicyDetailsActivity.f76412v0.getValue(), new ListSubheaderDelegate(), new CellDetailsDelegate(), (CellDetailsActionDelegate) petPolicyDetailsActivity.f76413w0.getValue(), (RowDelegate) petPolicyDetailsActivity.f76414x0.getValue(), new TextDelegate(), (LargeActionButtonDelegate) petPolicyDetailsActivity.y0.getValue()), false);
            case 2:
                int i3 = PetPolicyDetailsActivity.B0;
                return new z4l.j(7, u.c((LargeActionButtonDelegate) petPolicyDetailsActivity.y0.getValue()), false);
            default:
                return (z4l.j) petPolicyDetailsActivity.A0.getValue();
        }
    }
}
