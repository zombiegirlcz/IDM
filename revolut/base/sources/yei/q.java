package yei;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u000b\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u0015"}, d2 = {"Lyei/q;", "", "", "toString", "()Ljava/lang/String;", "", "a", "D", "d", "()D", "value", "b", "Ljava/lang/Double;", "e", "()Ljava/lang/Double;", "value10Scale", "c", "Ljava/lang/String;", "title", "name", "category", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("value")
    private final double value;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("value10Scale")
    private final Double value10Scale;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    private final String title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("category")
    @NotNull
    private final String category;

    public q(double d, Double d5, String str, String name, String category) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(category, "category");
        this.value = d;
        this.value10Scale = d5;
        this.title = str;
        this.name = name;
        this.category = category;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final double getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Double getValue10Scale() {
        return this.value10Scale;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Double.compare(this.value, qVar.value) == 0 && Intrinsics.f(this.value10Scale, qVar.value10Scale) && Intrinsics.f(this.title, qVar.title) && Intrinsics.f(this.name, qVar.name) && Intrinsics.f(this.category, qVar.category);
    }

    public final int hashCode() {
        int iHashCode = Double.hashCode(this.value) * 31;
        Double d = this.value10Scale;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.title;
        return this.category.hashCode() + p.a.c((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.name);
    }
}
