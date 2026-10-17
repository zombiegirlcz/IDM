package ot3;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u000e\u0010\u0014R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0010\u0010\u0018¨\u0006\u001a"}, d2 = {"Lot3/w;", "Lot3/y;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "g", "title", "b", "f", "subtitle", "c", "image", "d", "buttonTitle", "e", "congratulationType", "Lot3/v;", "Lot3/v;", "()Lot3/v;", "info", "", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "newDesignEnabled", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class w extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("subtitle")
    private final String subtitle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("image")
    private final String image;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("buttonTitle")
    private final String buttonTitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("congratulationType")
    @NotNull
    private final String congratulationType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("info")
    private final v info;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("newDesignEnabled")
    private final Boolean newDesignEnabled;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCongratulationType() {
        return this.congratulationType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final v getInfo() {
        return this.info;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Boolean getNewDesignEnabled() {
        return this.newDesignEnabled;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.title, wVar.title) && Intrinsics.f(this.subtitle, wVar.subtitle) && Intrinsics.f(this.image, wVar.image) && Intrinsics.f(this.buttonTitle, wVar.buttonTitle) && Intrinsics.f(this.congratulationType, wVar.congratulationType) && Intrinsics.f(this.info, wVar.info) && Intrinsics.f(this.newDesignEnabled, wVar.newDesignEnabled);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.image;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.buttonTitle;
        int iC = p.a.c((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.congratulationType);
        v vVar = this.info;
        int iHashCode4 = (iC + (vVar == null ? 0 : vVar.hashCode())) * 31;
        Boolean bool = this.newDesignEnabled;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }
}
