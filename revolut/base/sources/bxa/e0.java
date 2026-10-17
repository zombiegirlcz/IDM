package bxa;

import com.revolut.feature.referrals.common.data.api.domain.model.common.Upsell;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0006\u0010\u001aR\u001a\u0010\u001f\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\f\u0010\u001eR\u001a\u0010#\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b\u0013\u0010\"¨\u0006$"}, d2 = {"Lbxa/e0;", "", "", "toString", "()Ljava/lang/String;", "Lcom/revolut/feature/referrals/common/data/api/domain/model/common/Upsell$Type;", "a", "Lcom/revolut/feature/referrals/common/data/api/domain/model/common/Upsell$Type;", "e", "()Lcom/revolut/feature/referrals/common/data/api/domain/model/common/Upsell$Type;", "upsellType", "", "b", "Ljava/lang/Integer;", "f", "()Ljava/lang/Integer;", "urgencyDays", "", "Lbxa/b0;", "c", "Ljava/util/List;", "d", "()Ljava/util/List;", "steps", "Lbxa/c0;", "Lbxa/c0;", "()Lbxa/c0;", "banner", "Lbxa/d0;", "Lbxa/d0;", "()Lbxa/d0;", "modal", "Ldj0/d;", "Ldj0/d;", "()Ldj0/d;", "reward", "feature_shared_referrals_common_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("upsellType")
    @NotNull
    private final Upsell.Type upsellType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("urgencyDays")
    private final Integer urgencyDays;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("steps")
    @NotNull
    private final List<b0> steps;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("banner")
    @NotNull
    private final c0 banner;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("modal")
    @NotNull
    private final d0 modal;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("reward")
    @NotNull
    private final dj0.d reward;

    public e0(Upsell.Type upsellType, Integer num, ArrayList steps, c0 banner, d0 modal, dj0.d reward) {
        Intrinsics.checkNotNullParameter(upsellType, "upsellType");
        Intrinsics.checkNotNullParameter(steps, "steps");
        Intrinsics.checkNotNullParameter(banner, "banner");
        Intrinsics.checkNotNullParameter(modal, "modal");
        Intrinsics.checkNotNullParameter(reward, "reward");
        this.upsellType = upsellType;
        this.urgencyDays = num;
        this.steps = steps;
        this.banner = banner;
        this.modal = modal;
        this.reward = reward;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final c0 getBanner() {
        return this.banner;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final d0 getModal() {
        return this.modal;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final dj0.d getReward() {
        return this.reward;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getSteps() {
        return this.steps;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Upsell.Type getUpsellType() {
        return this.upsellType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return this.upsellType == e0Var.upsellType && Intrinsics.f(this.urgencyDays, e0Var.urgencyDays) && Intrinsics.f(this.steps, e0Var.steps) && Intrinsics.f(this.banner, e0Var.banner) && Intrinsics.f(this.modal, e0Var.modal) && Intrinsics.f(this.reward, e0Var.reward);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getUrgencyDays() {
        return this.urgencyDays;
    }

    public final int hashCode() {
        int iHashCode = this.upsellType.hashCode() * 31;
        Integer num = this.urgencyDays;
        return this.reward.hashCode() + ((this.modal.hashCode() + ((this.banner.hashCode() + p.a.d((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.steps)) * 31)) * 31);
    }
}
