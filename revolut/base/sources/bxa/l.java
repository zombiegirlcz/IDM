package bxa;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0005\u0010\u0018R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001e"}, d2 = {"Lbxa/l;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "status", "b", "g", "title", "c", "description", "", "Lcxa/a;", "d", "Ljava/util/List;", "()Ljava/util/List;", "eligibilityCriteria", "e", "badge", "Lbxa/e;", "Lbxa/e;", "()Lbxa/e;", "additionalInfo", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "reward", "feature_shared_referrals_common_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("status")
    @NotNull
    private final String status;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("eligibilityCriteria")
    private final List<cxa.a> eligibilityCriteria;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("badge")
    private final String badge;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("additionalInfo")
    private final e additionalInfo;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("reward")
    private final jo3.a reward;

    public l(e eVar, String status, String title, String str, String str2, ArrayList arrayList, jo3.a aVar) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(title, "title");
        this.status = status;
        this.title = title;
        this.description = str;
        this.eligibilityCriteria = arrayList;
        this.badge = str2;
        this.additionalInfo = eVar;
        this.reward = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final e getAdditionalInfo() {
        return this.additionalInfo;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBadge() {
        return this.badge;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getEligibilityCriteria() {
        return this.eligibilityCriteria;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final jo3.a getReward() {
        return this.reward;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.status, lVar.status) && Intrinsics.f(this.title, lVar.title) && Intrinsics.f(this.description, lVar.description) && Intrinsics.f(this.eligibilityCriteria, lVar.eligibilityCriteria) && Intrinsics.f(this.badge, lVar.badge) && Intrinsics.f(this.additionalInfo, lVar.additionalInfo) && Intrinsics.f(this.reward, lVar.reward);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iC = p.a.c(this.status.hashCode() * 31, 31, this.title);
        String str = this.description;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        List<cxa.a> list = this.eligibilityCriteria;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.badge;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        e eVar = this.additionalInfo;
        int iHashCode4 = (iHashCode3 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        jo3.a aVar = this.reward;
        return iHashCode4 + (aVar != null ? aVar.hashCode() : 0);
    }
}
