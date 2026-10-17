package xue;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0005\u000bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0006\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0014\u0010\u001cR\u001c\u0010!\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001f\u001a\u0004\b\u001a\u0010 ¨\u0006\""}, d2 = {"Lxue/c;", "", "", "toString", "()Ljava/lang/String;", "Lxue/b;", "a", "Lxue/b;", "f", "()Lxue/b;", "paymentType", "Lxue/a;", "b", "Lxue/a;", "e", "()Lxue/a;", "methodType", "c", "Ljava/lang/String;", "id", "d", "h", "title", "currencyCode", "description", "Lro3/a;", "g", "Lro3/a;", "()Lro3/a;", "logo", "", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "steerDirectly", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentType")
    @NotNull
    private final b paymentType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("methodType")
    @NotNull
    private final a methodType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    private final String id;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currencyCode;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("logo")
    private final ro3.a logo;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("steerDirectly")
    private final Boolean steerDirectly;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ro3.a getLogo() {
        return this.logo;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final a getMethodType() {
        return this.methodType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.paymentType == cVar.paymentType && this.methodType == cVar.methodType && Intrinsics.f(this.id, cVar.id) && Intrinsics.f(this.title, cVar.title) && Intrinsics.f(this.currencyCode, cVar.currencyCode) && Intrinsics.f(this.description, cVar.description) && Intrinsics.f(this.logo, cVar.logo) && Intrinsics.f(this.steerDirectly, cVar.steerDirectly);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final b getPaymentType() {
        return this.paymentType;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Boolean getSteerDirectly() {
        return this.steerDirectly;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iHashCode = (this.methodType.hashCode() + (this.paymentType.hashCode() * 31)) * 31;
        String str = this.id;
        int iC = p.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.title), 31, this.currencyCode);
        String str2 = this.description;
        int iHashCode2 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        ro3.a aVar = this.logo;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Boolean bool = this.steerDirectly;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }
}
