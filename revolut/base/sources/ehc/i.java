package ehc;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\b\u0086\b\u0018\u0000 !2\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001a\u0010\u001c\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001a\u001a\u0004\b\u0005\u0010\u001bR\"\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u000f\u0010\u001f¨\u0006\""}, d2 = {"Lehc/i;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "subscriberAccountType", "", "b", "Z", "()Z", "available", "Lehc/j;", "c", "Lehc/j;", "e", "()Lehc/j;", "merchant", "Lehc/h;", "d", "Lehc/h;", "()Lehc/h;", "description", "Lehc/g;", "Lehc/g;", "()Lehc/g;", "action", "", "Ljava/util/List;", "()Ljava/util/List;", "categories", "Companion", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("subscriberAccountType")
    @NotNull
    private final String subscriberAccountType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("available")
    private final boolean available;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("merchant")
    @NotNull
    private final j merchant;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("description")
    @NotNull
    private final h description;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("action")
    @NotNull
    private final g action;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("categories")
    private final List<String> categories;

    public i(String subscriberAccountType, boolean z, j merchant, h description, g action, List list) {
        Intrinsics.checkNotNullParameter(subscriberAccountType, "subscriberAccountType");
        Intrinsics.checkNotNullParameter(merchant, "merchant");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(action, "action");
        this.subscriberAccountType = subscriberAccountType;
        this.available = z;
        this.merchant = merchant;
        this.description = description;
        this.action = action;
        this.categories = list;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final g getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getAvailable() {
        return this.available;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getCategories() {
        return this.categories;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final h getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final j getMerchant() {
        return this.merchant;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.subscriberAccountType, iVar.subscriberAccountType) && this.available == iVar.available && Intrinsics.f(this.merchant, iVar.merchant) && Intrinsics.f(this.description, iVar.description) && Intrinsics.f(this.action, iVar.action) && Intrinsics.f(this.categories, iVar.categories);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSubscriberAccountType() {
        return this.subscriberAccountType;
    }

    public final int hashCode() {
        int iHashCode = (this.action.hashCode() + ((this.description.hashCode() + ((this.merchant.hashCode() + j6.a.c(this.subscriberAccountType.hashCode() * 31, 31, this.available)) * 31)) * 31)) * 31;
        List<String> list = this.categories;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }
}
