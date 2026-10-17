package tu;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0017"}, d2 = {"Ltu/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "businessId", "b", "name", "c", "pictureUrl", "Ltu/b;", "d", "Ltu/b;", "()Ltu/b;", "state", "", "Ltu/e;", "e", "Ljava/util/List;", "()Ljava/util/List;", "steps", "feature_business_referrals_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("businessId")
    @NotNull
    private final String businessId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("pictureUrl")
    private final String pictureUrl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final b state;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("steps")
    private final List<e> steps;

    public a(String businessId, String name, String str, b state, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(businessId, "businessId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(state, "state");
        this.businessId = businessId;
        this.name = name;
        this.pictureUrl = str;
        this.state = state;
        this.steps = arrayList;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBusinessId() {
        return this.businessId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPictureUrl() {
        return this.pictureUrl;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getSteps() {
        return this.steps;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.businessId, aVar.businessId) && Intrinsics.f(this.name, aVar.name) && Intrinsics.f(this.pictureUrl, aVar.pictureUrl) && Intrinsics.f(this.state, aVar.state) && Intrinsics.f(this.steps, aVar.steps);
    }

    public final int hashCode() {
        int iC = p.a.c(this.businessId.hashCode() * 31, 31, this.name);
        String str = this.pictureUrl;
        int iHashCode = (this.state.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        List<e> list = this.steps;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }
}
