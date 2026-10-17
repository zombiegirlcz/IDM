package ac5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR(\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\b\u001a\u0004\b\f\u0010\t¨\u0006\u0013"}, d2 = {"Lac5/a;", "", "", "toString", "()Ljava/lang/String;", "", "Lac5/w;", "a", "Ljava/util/List;", "()Ljava/util/List;", "availableTypes", "", "b", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "content", "Lac5/b;", "confirmations", "feature_credit_card_autopay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("availableTypes")
    @NotNull
    private final List<w> availableTypes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("content")
    private final Map<String, String> content;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("confirmations")
    private final List<b> confirmations;

    public a(ArrayList availableTypes, aim.f fVar, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(availableTypes, "availableTypes");
        this.availableTypes = availableTypes;
        this.content = fVar;
        this.confirmations = arrayList;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAvailableTypes() {
        return this.availableTypes;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getConfirmations() {
        return this.confirmations;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Map getContent() {
        return this.content;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.availableTypes, aVar.availableTypes) && Intrinsics.f(this.content, aVar.content) && Intrinsics.f(this.confirmations, aVar.confirmations);
    }

    public final int hashCode() {
        int iHashCode = this.availableTypes.hashCode() * 31;
        Map<String, String> map = this.content;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        List<b> list = this.confirmations;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }
}
