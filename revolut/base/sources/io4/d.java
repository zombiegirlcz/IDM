package io4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\t\u0010\u0004¨\u0006\u000e"}, d2 = {"Lio4/d;", "Lio4/e;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "topValue", "b", "d", "topValueTextStyle", "bottomValue", "bottomValueStyle", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("topValue")
    @NotNull
    private final String topValue;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("topValueTextStyle")
    private final String topValueTextStyle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("bottomValue")
    private final String bottomValue;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("bottomValueStyle")
    private final String bottomValueStyle;

    public d(String topValue, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(topValue, "topValue");
        this.topValue = topValue;
        this.topValueTextStyle = str;
        this.bottomValue = str2;
        this.bottomValueStyle = str3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBottomValue() {
        return this.bottomValue;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBottomValueStyle() {
        return this.bottomValueStyle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTopValue() {
        return this.topValue;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTopValueTextStyle() {
        return this.topValueTextStyle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.topValue, dVar.topValue) && Intrinsics.f(this.topValueTextStyle, dVar.topValueTextStyle) && Intrinsics.f(this.bottomValue, dVar.bottomValue) && Intrinsics.f(this.bottomValueStyle, dVar.bottomValueStyle);
    }

    public final int hashCode() {
        int iHashCode = this.topValue.hashCode() * 31;
        String str = this.topValueTextStyle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bottomValue;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bottomValueStyle;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
