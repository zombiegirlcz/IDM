package q86;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0017\u0010\u0004R\u001a\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\u0004R\u001a\u0010\u001d\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u001c\u0010\u0004R\u001a\u0010\u001f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u001e\u0010\u0004R\u001a\u0010$\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010'\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010#R\u001a\u0010)\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u0006\u001a\u0004\b%\u0010\u0004R\u001a\u0010*\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001a\u0010+\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004R\u001a\u0010/\u001a\u00020,8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010-\u001a\u0004\b\u0005\u0010.R\u001a\u00100\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b(\u0010#R \u00105\u001a\b\u0012\u0004\u0012\u000202018\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u00103\u001a\u0004\b\f\u00104¨\u00066"}, d2 = {"Lq86/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "g", "id", "b", "d", "brand", "c", "r", "type", "l", "os", "e", "k", "model", "f", "browserModel", "appVersion", "h", "lastIpAddress", "i", "j", "locale", "o", "systemVersion", "p", "timeZoneId", "", "Z", "q", "()Z", "trusted", "m", "s", "isCurrent", "n", "osVersion", "lastUsed", "createdAt", "Lq86/b;", "Lq86/b;", "()Lq86/b;", "address", "primary", "", "Lq86/a;", "Ljava/util/List;", "()Ljava/util/List;", "apps", "feature_device_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    @NotNull
    private final String model;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("browserModel")
    @NotNull
    private final String browserModel;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("appVersion")
    @NotNull
    private final String appVersion;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("lastIpAddress")
    @NotNull
    private final String lastIpAddress;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("locale")
    @NotNull
    private final String locale;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("systemVersion")
    @NotNull
    private final String systemVersion;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("timeZoneId")
    @NotNull
    private final String timeZoneId;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("trusted")
    private final boolean trusted;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("isCurrent")
    private final boolean isCurrent;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("osVersion")
    @NotNull
    private final String osVersion;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("lastUsed")
    @NotNull
    private final String lastUsed;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("createdAt")
    @NotNull
    private final String createdAt;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("address")
    @NotNull
    private final b address;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("primary")
    private final boolean primary;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("apps")
    @NotNull
    private final List<a> apps;

    public c(String id10, String brand, String type, String os4, String model, String browserModel, String appVersion, String lastIpAddress, String locale, String systemVersion, String timeZoneId, boolean z, boolean z3, String osVersion, String lastUsed, String createdAt, b address, boolean z4, ArrayList apps) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(os4, "os");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(browserModel, "browserModel");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(lastIpAddress, "lastIpAddress");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(systemVersion, "systemVersion");
        Intrinsics.checkNotNullParameter(timeZoneId, "timeZoneId");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(lastUsed, "lastUsed");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(apps, "apps");
        this.id = id10;
        this.brand = brand;
        this.type = type;
        this.os = os4;
        this.model = model;
        this.browserModel = browserModel;
        this.appVersion = appVersion;
        this.lastIpAddress = lastIpAddress;
        this.locale = locale;
        this.systemVersion = systemVersion;
        this.timeZoneId = timeZoneId;
        this.trusted = z;
        this.isCurrent = z3;
        this.osVersion = osVersion;
        this.lastUsed = lastUsed;
        this.createdAt = createdAt;
        this.address = address;
        this.primary = z4;
        this.apps = apps;
    }

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
        return Intrinsics.f(this.id, cVar.id) && Intrinsics.f(this.brand, cVar.brand) && Intrinsics.f(this.type, cVar.type) && Intrinsics.f(this.os, cVar.os) && Intrinsics.f(this.model, cVar.model) && Intrinsics.f(this.browserModel, cVar.browserModel) && Intrinsics.f(this.appVersion, cVar.appVersion) && Intrinsics.f(this.lastIpAddress, cVar.lastIpAddress) && Intrinsics.f(this.locale, cVar.locale) && Intrinsics.f(this.systemVersion, cVar.systemVersion) && Intrinsics.f(this.timeZoneId, cVar.timeZoneId) && this.trusted == cVar.trusted && this.isCurrent == cVar.isCurrent && Intrinsics.f(this.osVersion, cVar.osVersion) && Intrinsics.f(this.lastUsed, cVar.lastUsed) && Intrinsics.f(this.createdAt, cVar.createdAt) && Intrinsics.f(this.address, cVar.address) && this.primary == cVar.primary && Intrinsics.f(this.apps, cVar.apps);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getCreatedAt() {
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
        return this.apps.hashCode() + j6.a.c((this.address.hashCode() + p.a.c(p.a.c(p.a.c(j6.a.c(j6.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.brand), 31, this.type), 31, this.os), 31, this.model), 31, this.browserModel), 31, this.appVersion), 31, this.lastIpAddress), 31, this.locale), 31, this.systemVersion), 31, this.timeZoneId), 31, this.trusted), 31, this.isCurrent), 31, this.osVersion), 31, this.lastUsed), 31, this.createdAt)) * 31, 31, this.primary);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getLastUsed() {
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
