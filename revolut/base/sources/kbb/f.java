package kbb;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit_core.displayers.image.models.UserAvatarImage;
import com.revolut.feature.profile.api.R$string;
import k8d.s;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements itb.c {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yik.g f182553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r10.q f182554b;

    public f(yik.g pricingPlanAvatarMapper, r10.q userRegisteredIdentitiesInteractor) {
        Intrinsics.checkNotNullParameter(pricingPlanAvatarMapper, "pricingPlanAvatarMapper");
        Intrinsics.checkNotNullParameter(userRegisteredIdentitiesInteractor, "userRegisteredIdentitiesInteractor");
        this.f182553a = pricingPlanAvatarMapper;
        this.f182554b = userRegisteredIdentitiesInteractor;
    }

    public static itb.a a() {
        return new itb.a(new AvatarModel.Default(new UserAvatarImage(null, null, new TextLocalisedClause(R$string.profile_entryPoint_accessibility_title, null, null, 14), 2), null, null, null, null, null, 126));
    }

    public final itb.a b(itb.b params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return (itb.a) iii.c.f(params.f168358a, new k9h.d(this), new s(this, 12), new a4b.i(this, params.f168359b, params.f168360c, 11));
    }
}
