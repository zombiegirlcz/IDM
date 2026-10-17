package bxa;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004¨\u0006\u001e"}, d2 = {"Lbxa/b0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "code", "c", "description", "g", "title", "", "Lcxa/a;", "d", "Ljava/util/List;", "()Ljava/util/List;", "eligibilityCriteria", "Lbxa/e;", "e", "Lbxa/e;", "()Lbxa/e;", "additionalInfo", "Ljo3/a;", "f", "Ljo3/a;", "()Ljo3/a;", "reward", "icon", "feature_shared_referrals_common_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("code")
    @NotNull
    private final String code;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("eligibilityCriteria")
    private final List<cxa.a> eligibilityCriteria;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("additionalInfo")
    private final e additionalInfo;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("reward")
    private final jo3.a reward;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("icon")
    private final String icon;

    public b0(e eVar, String code, String str, String title, String str2, ArrayList arrayList, jo3.a aVar) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(title, "title");
        this.code = code;
        this.description = str;
        this.title = title;
        this.eligibilityCriteria = arrayList;
        this.additionalInfo = eVar;
        this.reward = aVar;
        this.icon = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final e getAdditionalInfo() {
        return this.additionalInfo;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCode() {
        return this.code;
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
    public final String getIcon() {
        return this.icon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.code, b0Var.code) && Intrinsics.f(this.description, b0Var.description) && Intrinsics.f(this.title, b0Var.title) && Intrinsics.f(this.eligibilityCriteria, b0Var.eligibilityCriteria) && Intrinsics.f(this.additionalInfo, b0Var.additionalInfo) && Intrinsics.f(this.reward, b0Var.reward) && Intrinsics.f(this.icon, b0Var.icon);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final jo3.a getReward() {
        return this.reward;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iHashCode = this.code.hashCode() * 31;
        String str = this.description;
        int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.title);
        List<cxa.a> list = this.eligibilityCriteria;
        int iHashCode2 = (iC + (list == null ? 0 : list.hashCode())) * 31;
        e eVar = this.additionalInfo;
        int iHashCode3 = (iHashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        jo3.a aVar = this.reward;
        int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str2 = this.icon;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }
}
