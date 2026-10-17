package byk;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0005\u0010\u0014R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001b\u0010\u0004¨\u0006\u001d"}, d2 = {"Lbyk/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "countryCode", "b", "f", "key", "g", "name", "d", "h", "subtitle", "", "e", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "canSkip", "i", "validation", "hint", "check", "infoLink", "j", "value", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("countryCode")
    @NotNull
    private final String countryCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("key")
    @NotNull
    private final String key;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("subtitle")
    private final String subtitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("canSkip")
    private final Boolean canSkip;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("validation")
    private final String validation;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("hint")
    private final String hint;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("check")
    private final String check;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("infoLink")
    private final String infoLink;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("value")
    private final String value;

    public a(Boolean bool, String countryCode, String key, String name, String str, String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(name, "name");
        this.countryCode = countryCode;
        this.key = key;
        this.name = name;
        this.subtitle = str;
        this.canSkip = bool;
        this.validation = str2;
        this.hint = str3;
        this.check = str4;
        this.infoLink = str5;
        this.value = str6;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getCanSkip() {
        return this.canSkip;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCheck() {
        return this.check;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getInfoLink() {
        return this.infoLink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.countryCode, aVar.countryCode) && Intrinsics.f(this.key, aVar.key) && Intrinsics.f(this.name, aVar.name) && Intrinsics.f(this.subtitle, aVar.subtitle) && Intrinsics.f(this.canSkip, aVar.canSkip) && Intrinsics.f(this.validation, aVar.validation) && Intrinsics.f(this.hint, aVar.hint) && Intrinsics.f(this.check, aVar.check) && Intrinsics.f(this.infoLink, aVar.infoLink) && Intrinsics.f(this.value, aVar.value);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.countryCode.hashCode() * 31, 31, this.key), 31, this.name);
        String str = this.subtitle;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.canSkip;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.validation;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.hint;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.check;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.infoLink;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.value;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getValidation() {
        return this.validation;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
