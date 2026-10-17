package mf0;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u001b\u0010\u0004R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u0018\u0010\u0004R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0006\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u001d\u0010\u0004R\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u000b\u001a\u0004\b\u001a\u0010\u0004¨\u0006\""}, d2 = {"Lmf0/c;", "", "", "toString", "()Ljava/lang/String;", "Lmf0/a;", "a", "Lmf0/a;", "b", "()Lmf0/a;", "amountLacking", "Ljava/lang/String;", "e", "countryCode", "", "c", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "biometricDisabled", "d", "i", "maskedEmail", "j", "preorderId", "f", "cardId", "g", "k", "title", "h", "description", "action", "link", "image", "core_error_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("amountLacking")
    private final a amountLacking = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("countryCode")
    private final String countryCode = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("biometricDisabled")
    private final Boolean biometricDisabled = null;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("maskedEmail")
    private final String maskedEmail = null;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("preorderId")
    private final String preorderId = null;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("cardId")
    private final String cardId = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    private final String title = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    private final String description = null;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("action")
    private final String action = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("link")
    private final String link = null;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("image")
    private final String image = null;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getAmountLacking() {
        return this.amountLacking;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getBiometricDisabled() {
        return this.biometricDisabled;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCardId() {
        return this.cardId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.amountLacking, cVar.amountLacking) && Intrinsics.f(this.countryCode, cVar.countryCode) && Intrinsics.f(this.biometricDisabled, cVar.biometricDisabled) && Intrinsics.f(this.maskedEmail, cVar.maskedEmail) && Intrinsics.f(this.preorderId, cVar.preorderId) && Intrinsics.f(this.cardId, cVar.cardId) && Intrinsics.f(this.title, cVar.title) && Intrinsics.f(this.description, cVar.description) && Intrinsics.f(this.action, cVar.action) && Intrinsics.f(this.link, cVar.link) && Intrinsics.f(this.image, cVar.image);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    public final int hashCode() {
        a aVar = this.amountLacking;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        String str = this.countryCode;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.biometricDisabled;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.maskedEmail;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.preorderId;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cardId;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.title;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.description;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.action;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.link;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.image;
        return iHashCode10 + (str9 != null ? str9.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getMaskedEmail() {
        return this.maskedEmail;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getPreorderId() {
        return this.preorderId;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
