package f04;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import nx4.m0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\r\u0010\u0017R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u001c\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\"\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u001f"}, d2 = {"Lf04/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "i", "title", "b", "h", "subtitle", "", "c", "I", "g", "()I", "selectedDay", "d", "e", "maxDay", "", "Ljava/util/List;", "()Ljava/util/List;", "disabledDays", "f", "approximationCaveat", "buttonTitle", "parameterKey", "Lnx4/m0;", "items", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("subtitle")
    @NotNull
    private final String subtitle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @b("selectedDay")
    private final int selectedDay;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @b("maxDay")
    private final int maxDay;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @b("disabledDays")
    @NotNull
    private final List<Integer> disabledDays;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @b("approximationCaveat")
    @NotNull
    private final String approximationCaveat;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @b("buttonTitle")
    @NotNull
    private final String buttonTitle;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @b("parameterKey")
    @NotNull
    private final String parameterKey;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @b("items")
    @NotNull
    private final List<m0> items;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getApproximationCaveat() {
        return this.approximationCaveat;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getDisabledDays() {
        return this.disabledDays;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getItems() {
        return this.items;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getMaxDay() {
        return this.maxDay;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.title, aVar.title) && Intrinsics.f(this.subtitle, aVar.subtitle) && this.selectedDay == aVar.selectedDay && this.maxDay == aVar.maxDay && Intrinsics.f(this.disabledDays, aVar.disabledDays) && Intrinsics.f(this.approximationCaveat, aVar.approximationCaveat) && Intrinsics.f(this.buttonTitle, aVar.buttonTitle) && Intrinsics.f(this.parameterKey, aVar.parameterKey) && Intrinsics.f(this.items, aVar.items);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getParameterKey() {
        return this.parameterKey;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getSelectedDay() {
        return this.selectedDay;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final int hashCode() {
        return this.items.hashCode() + p.a.c(p.a.c(p.a.c(p.a.d(j6.a.b(this.maxDay, j6.a.b(this.selectedDay, p.a.c(this.title.hashCode() * 31, 31, this.subtitle), 31), 31), 31, this.disabledDays), 31, this.approximationCaveat), 31, this.buttonTitle), 31, this.parameterKey);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
