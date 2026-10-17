package p86;

import a0.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0017\u0010\u0004R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u001c\u0010\u0004R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u001e\u0010\u0004R\u001a\u0010$\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010'\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010#R\u001c\u0010)\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u0006\u001a\u0004\b%\u0010\u0004R\u001a\u0010-\u001a\u00020*8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010+\u001a\u0004\b\u0019\u0010,R\u001a\u0010.\u001a\u00020*8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010+\u001a\u0004\b\u0014\u0010,R\u001c\u00102\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u00100\u001a\u0004\b\u0005\u00101R\u001a\u00103\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b(\u0010#R\"\u00108\u001a\n\u0012\u0004\u0012\u000205\u0018\u0001048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u00106\u001a\u0004\b\f\u00107¨\u00069"}, d2 = {"Lp86/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "g", "id", "b", "d", "brand", "c", "r", "type", "l", "os", "e", "k", "model", "f", "browserModel", "appVersion", "h", "lastIpAddress", "i", "j", "locale", "o", "systemVersion", "p", "timeZoneId", "", "Z", "q", "()Z", "trusted", "m", "s", "isCurrent", "n", "osVersion", "", "J", "()J", "lastUsed", "createdAt", "Lp86/b;", "Lp86/b;", "()Lp86/b;", "address", "primary", "", "Lp86/a;", "Ljava/util/List;", "()Ljava/util/List;", "apps", "feature_device_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("brand")
    @NotNull
    private final String brand;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("os")
    @NotNull
    private final String os;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("model")
    private final String model;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("browserModel")
    private final String browserModel;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("appVersion")
    private final String appVersion;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("lastIpAddress")
    @NotNull
    private final String lastIpAddress;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("locale")
    private final String locale;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("systemVersion")
    private final String systemVersion;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("timeZoneId")
    private final String timeZoneId;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("trusted")
    private final boolean trusted;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("isCurrent")
    private final boolean isCurrent;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("osVersion")
    private final String osVersion;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("lastUsed")
    private final long lastUsed;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("createdAt")
    private final long createdAt;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("address")
    private final b address;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("primary")
    private final boolean primary;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("apps")
    private final List<a> apps;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAppVersion() {
        return this.appVersion;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getApps() {
        return this.apps;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getBrowserModel() {
        return this.browserModel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.id, cVar.id) && Intrinsics.f(this.brand, cVar.brand) && Intrinsics.f(this.type, cVar.type) && Intrinsics.f(this.os, cVar.os) && Intrinsics.f(this.model, cVar.model) && Intrinsics.f(this.browserModel, cVar.browserModel) && Intrinsics.f(this.appVersion, cVar.appVersion) && Intrinsics.f(this.lastIpAddress, cVar.lastIpAddress) && Intrinsics.f(this.locale, cVar.locale) && Intrinsics.f(this.systemVersion, cVar.systemVersion) && Intrinsics.f(this.timeZoneId, cVar.timeZoneId) && this.trusted == cVar.trusted && this.isCurrent == cVar.isCurrent && Intrinsics.f(this.osVersion, cVar.osVersion) && this.lastUsed == cVar.lastUsed && this.createdAt == cVar.createdAt && Intrinsics.f(this.address, cVar.address) && this.primary == cVar.primary && Intrinsics.f(this.apps, cVar.apps);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getLastIpAddress() {
        return this.lastIpAddress;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.brand), 31, this.type), 31, this.os);
        String str = this.model;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.browserModel;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.appVersion;
        int iC2 = p.a.c((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.lastIpAddress);
        String str4 = this.locale;
        int iHashCode3 = (iC2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.systemVersion;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.timeZoneId;
        int iC3 = j6.a.c(j6.a.c((iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.trusted), 31, this.isCurrent);
        String str7 = this.osVersion;
        int iC4 = d.c(d.c((iC3 + (str7 == null ? 0 : str7.hashCode())) * 31, 31, this.lastUsed), 31, this.createdAt);
        b bVar = this.address;
        int iC5 = j6.a.c((iC4 + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.primary);
        List<a> list = this.apps;
        return iC5 + (list != null ? list.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getLastUsed() {
        return this.lastUsed;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getOs() {
        return this.os;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getOsVersion() {
        return this.osVersion;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getPrimary() {
        return this.primary;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getSystemVersion() {
        return this.systemVersion;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getTimeZoneId() {
        return this.timeZoneId;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getTrusted() {
        return this.trusted;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final boolean getIsCurrent() {
        return this.isCurrent;
    }
}
