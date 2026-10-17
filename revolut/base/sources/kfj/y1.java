package kfj;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\t\u0010\u0012R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016¨\u0006\u0018"}, d2 = {"Lkfj/y1;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "type", "b", "e", "text", "c", "d", "subtitle", "minPermittedOffsetDate", "", "Ljava/lang/Long;", "()Ljava/lang/Long;", "maxPermittedOffsetDays", "", "Ljava/util/List;", "()Ljava/util/List;", "excludedDates", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("text")
    @NotNull
    private final String text;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("subtitle")
    private final String subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("minPermittedOffsetDate")
    private final String minPermittedOffsetDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("maxPermittedOffsetDays")
    private final Long maxPermittedOffsetDays;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("excludedDates")
    private final List<String> excludedDates;

    public y1(String type, String text, String str, String str2, Long l2, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(text, "text");
        this.type = type;
        this.text = text;
        this.subtitle = str;
        this.minPermittedOffsetDate = str2;
        this.maxPermittedOffsetDays = l2;
        this.excludedDates = arrayList;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getExcludedDates() {
        return this.excludedDates;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getMaxPermittedOffsetDays() {
        return this.maxPermittedOffsetDays;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getMinPermittedOffsetDate() {
        return this.minPermittedOffsetDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj2;
        return Intrinsics.f(this.type, y1Var.type) && Intrinsics.f(this.text, y1Var.text) && Intrinsics.f(this.subtitle, y1Var.subtitle) && Intrinsics.f(this.minPermittedOffsetDate, y1Var.minPermittedOffsetDate) && Intrinsics.f(this.maxPermittedOffsetDays, y1Var.maxPermittedOffsetDays) && Intrinsics.f(this.excludedDates, y1Var.excludedDates);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        int iC = p.a.c(this.type.hashCode() * 31, 31, this.text);
        String str = this.subtitle;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.minPermittedOffsetDate;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.maxPermittedOffsetDays;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        List<String> list = this.excludedDates;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }
}
