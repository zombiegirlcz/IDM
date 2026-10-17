package vxb;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m1c.p1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0016\u001a\u0004\b\t\u0010\u0017R\u001a\u0010\u001c\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u0010\u0010\u001bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\f\u0010\u001b¨\u0006\u001e"}, d2 = {"Lvxb/r;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "g", "title", "b", "f", "subtitle", "c", "assetUrl", "", "Lvxb/t;", "d", "Ljava/util/List;", "e", "()Ljava/util/List;", "steps", "Lm1c/p1;", "Lm1c/p1;", "()Lm1c/p1;", "disclaimer", "Lvxb/q;", "Lvxb/q;", "()Lvxb/q;", "personalisedOffersCta", "genericOffersCta", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("subtitle")
    @NotNull
    private final String subtitle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("assetUrl")
    @NotNull
    private final String assetUrl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("steps")
    @NotNull
    private final List<t> steps;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("disclaimer")
    @NotNull
    private final p1 disclaimer;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("personalisedOffersCta")
    @NotNull
    private final q personalisedOffersCta;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("genericOffersCta")
    private final q genericOffersCta;

    public r(String title, String subtitle, String assetUrl, ArrayList steps, p1 disclaimer, q personalisedOffersCta, q qVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(assetUrl, "assetUrl");
        Intrinsics.checkNotNullParameter(steps, "steps");
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        Intrinsics.checkNotNullParameter(personalisedOffersCta, "personalisedOffersCta");
        this.title = title;
        this.subtitle = subtitle;
        this.assetUrl = assetUrl;
        this.steps = steps;
        this.disclaimer = disclaimer;
        this.personalisedOffersCta = personalisedOffersCta;
        this.genericOffersCta = qVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAssetUrl() {
        return this.assetUrl;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final p1 getDisclaimer() {
        return this.disclaimer;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final q getGenericOffersCta() {
        return this.genericOffersCta;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final q getPersonalisedOffersCta() {
        return this.personalisedOffersCta;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getSteps() {
        return this.steps;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.title, rVar.title) && Intrinsics.f(this.subtitle, rVar.subtitle) && Intrinsics.f(this.assetUrl, rVar.assetUrl) && Intrinsics.f(this.steps, rVar.steps) && Intrinsics.f(this.disclaimer, rVar.disclaimer) && Intrinsics.f(this.personalisedOffersCta, rVar.personalisedOffersCta) && Intrinsics.f(this.genericOffersCta, rVar.genericOffersCta);
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
        int iHashCode = (this.personalisedOffersCta.hashCode() + ((this.disclaimer.hashCode() + p.a.d(p.a.c(p.a.c(this.title.hashCode() * 31, 31, this.subtitle), 31, this.assetUrl), 31, this.steps)) * 31)) * 31;
        q qVar = this.genericOffersCta;
        return iHashCode + (qVar == null ? 0 : qVar.hashCode());
    }
}
