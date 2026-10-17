package u04;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx4.u0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0005\u0010\rR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004¨\u0006\u001e"}, d2 = {"Lu04/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "g", "status", "", "b", "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", "maximumAttemptsNumber", "c", "attemptDelay", "d", "image", "i", "title", "f", "description", "primaryButtonTitle", "Lu04/b$a;", "h", "Lu04/b$a;", "()Lu04/b$a;", "timeoutPrompt", "fallbackPostActivation", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("status")
    @NotNull
    private final String status;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("maximumAttemptsNumber")
    private final Integer maximumAttemptsNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("attemptDelay")
    private final Integer attemptDelay;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("image")
    private final String image;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("title")
    private final String title;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("primaryButtonTitle")
    private final String primaryButtonTitle;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("timeOutPrompt")
    private final a timeoutPrompt;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("fallbackPostActivation")
    private final String fallbackPostActivation;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0005\u0010\r¨\u0006\u000f"}, d2 = {"Lu04/b$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "title", "b", "description", "Lnx4/u0;", "Lnx4/u0;", "()Lnx4/u0;", "actionFooter", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("description")
        @NotNull
        private final String description;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("actionFooter")
        @NotNull
        private final u0 actionFooter;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final u0 getActionFooter() {
            return this.actionFooter;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.title, aVar.title) && Intrinsics.f(this.description, aVar.description) && Intrinsics.f(this.actionFooter, aVar.actionFooter);
        }

        public final int hashCode() {
            return this.actionFooter.hashCode() + p.a.c(this.title.hashCode() * 31, 31, this.description);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getAttemptDelay() {
        return this.attemptDelay;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFallbackPostActivation() {
        return this.fallbackPostActivation;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Integer getMaximumAttemptsNumber() {
        return this.maximumAttemptsNumber;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.status, bVar.status) && Intrinsics.f(this.maximumAttemptsNumber, bVar.maximumAttemptsNumber) && Intrinsics.f(this.attemptDelay, bVar.attemptDelay) && Intrinsics.f(this.image, bVar.image) && Intrinsics.f(this.title, bVar.title) && Intrinsics.f(this.description, bVar.description) && Intrinsics.f(this.primaryButtonTitle, bVar.primaryButtonTitle) && Intrinsics.f(this.timeoutPrompt, bVar.timeoutPrompt) && Intrinsics.f(this.fallbackPostActivation, bVar.fallbackPostActivation);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPrimaryButtonTitle() {
        return this.primaryButtonTitle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final a getTimeoutPrompt() {
        return this.timeoutPrompt;
    }

    public final int hashCode() {
        int iHashCode = this.status.hashCode() * 31;
        Integer num = this.maximumAttemptsNumber;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.attemptDelay;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.image;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.primaryButtonTitle;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        a aVar = this.timeoutPrompt;
        int iHashCode8 = (iHashCode7 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str5 = this.fallbackPostActivation;
        return iHashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
