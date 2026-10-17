package ehc;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0080\b\u0018\u00002\u00020\u0001:\f\f\u0006\r\u000e\u000f\u0010\u0011\n\u0012\u0013\u0014\u0015J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lehc/s;", "", "", "toString", "()Ljava/lang/String;", "Lehc/s$g;", "a", "Lehc/s$g;", "()Lehc/s$g;", "primaryButton", "b", "secondaryButton", "g", "c", "f", "e", "d", "j", "i", "l", "k", "h", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("primaryButton")
    private final g primaryButton;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("secondaryButton")
    private final g secondaryButton;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0016\u001a\u0004\b\u0005\u0010\u0017R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\u0004R\"\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b\u0010\u0010 R\u001c\u0010%\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b$\u0010\u0004R\u001c\u0010'\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010+\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b\t\u0010*¨\u0006,"}, d2 = {"Lehc/s$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "k", "type", "b", "l", "url", "c", "g", "merchantAvatar", "Lehc/s$j;", "d", "Lehc/s$j;", "e", "()Lehc/s$j;", "existingSubscriptionCheck", "Lehc/s$b;", "Lehc/s$b;", "()Lehc/s$b;", "activationNotice", "f", "j", "title", "", "Lehc/b;", "Ljava/util/List;", "h", "()Ljava/util/List;", "subtitleParts", "Lehc/s$i;", "detailsRows", "i", "keepButtonText", "successfulCancellationText", "copyable", "Lehc/s$c;", "Lehc/s$c;", "()Lehc/s$c;", "bottomSheet", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("url")
        private final String url;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("merchantAvatar")
        private final String merchantAvatar;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("existingSubscriptionCheck")
        private final j existingSubscriptionCheck;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("activationNotice")
        private final b activationNotice;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("title")
        private final String title;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("subtitleParts")
        private final List<ehc.b> subtitleParts;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @lg.b("detailsRows")
        private final List<i> detailsRows;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @lg.b("keepButtonText")
        private final String keepButtonText;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @lg.b("successfulCancellationText")
        private final String successfulCancellationText;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @lg.b("copyable")
        private final String copyable;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        @lg.b("bottomSheet")
        private final c bottomSheet;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b getActivationNotice() {
            return this.activationNotice;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final c getBottomSheet() {
            return this.bottomSheet;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getCopyable() {
            return this.copyable;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final List getDetailsRows() {
            return this.detailsRows;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final j getExistingSubscriptionCheck() {
            return this.existingSubscriptionCheck;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.type, aVar.type) && Intrinsics.f(this.url, aVar.url) && Intrinsics.f(this.merchantAvatar, aVar.merchantAvatar) && Intrinsics.f(this.existingSubscriptionCheck, aVar.existingSubscriptionCheck) && Intrinsics.f(this.activationNotice, aVar.activationNotice) && Intrinsics.f(this.title, aVar.title) && Intrinsics.f(this.subtitleParts, aVar.subtitleParts) && Intrinsics.f(this.detailsRows, aVar.detailsRows) && Intrinsics.f(this.keepButtonText, aVar.keepButtonText) && Intrinsics.f(this.successfulCancellationText, aVar.successfulCancellationText) && Intrinsics.f(this.copyable, aVar.copyable) && Intrinsics.f(this.bottomSheet, aVar.bottomSheet);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getKeepButtonText() {
            return this.keepButtonText;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getMerchantAvatar() {
            return this.merchantAvatar;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final List getSubtitleParts() {
            return this.subtitleParts;
        }

        public final int hashCode() {
            int iHashCode = this.type.hashCode() * 31;
            String str = this.url;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.merchantAvatar;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            j jVar = this.existingSubscriptionCheck;
            int iHashCode4 = (iHashCode3 + (jVar == null ? 0 : jVar.hashCode())) * 31;
            b bVar = this.activationNotice;
            int iHashCode5 = (iHashCode4 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            String str3 = this.title;
            int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            List<ehc.b> list = this.subtitleParts;
            int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
            List<i> list2 = this.detailsRows;
            int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
            String str4 = this.keepButtonText;
            int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.successfulCancellationText;
            int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.copyable;
            int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
            c cVar = this.bottomSheet;
            return iHashCode11 + (cVar != null ? cVar.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getSuccessfulCancellationText() {
            return this.successfulCancellationText;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final String getUrl() {
            return this.url;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0005\u0010\u0014R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004¨\u0006\u001b"}, d2 = {"Lehc/s$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "title", "b", "e", "subtitle", "Lehc/s$i;", "c", "Lehc/s$i;", "()Lehc/s$i;", "mainRow", "", "d", "Ljava/util/List;", "()Ljava/util/List;", "detailRows", "Lehc/s$l;", "Lehc/s$l;", "()Lehc/s$l;", "primaryButton", "footerText", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("subtitle")
        private final String subtitle;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("mainRow")
        private final i mainRow;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("detailRows")
        private final List<i> detailRows;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("primaryButton")
        private final l primaryButton;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("footerText")
        private final String footerText;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getDetailRows() {
            return this.detailRows;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getFooterText() {
            return this.footerText;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final i getMainRow() {
            return this.mainRow;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final l getPrimaryButton() {
            return this.primaryButton;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.title, bVar.title) && Intrinsics.f(this.subtitle, bVar.subtitle) && Intrinsics.f(this.mainRow, bVar.mainRow) && Intrinsics.f(this.detailRows, bVar.detailRows) && Intrinsics.f(this.primaryButton, bVar.primaryButton) && Intrinsics.f(this.footerText, bVar.footerText);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.subtitle;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            i iVar = this.mainRow;
            int iHashCode3 = (iHashCode2 + (iVar == null ? 0 : iVar.hashCode())) * 31;
            List<i> list = this.detailRows;
            int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            l lVar = this.primaryButton;
            int iHashCode5 = (iHashCode4 + (lVar == null ? 0 : lVar.hashCode())) * 31;
            String str3 = this.footerText;
            return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\n\u0010\u0012¨\u0006\u0014"}, d2 = {"Lehc/s$c;", "", "", "toString", "()Ljava/lang/String;", "Lehc/c;", "a", "Lehc/c;", "()Lehc/c;", "avatar", "b", "Ljava/lang/String;", "d", "title", "c", "subtitle", "Lehc/s$f;", "Lehc/s$f;", "()Lehc/s$f;", "footer", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("avatar")
        private final ehc.c avatar;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        private final String title;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("subtitle")
        private final String subtitle;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("footer")
        private final f footer;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ehc.c getAvatar() {
            return this.avatar;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final f getFooter() {
            return this.footer;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.avatar, cVar.avatar) && Intrinsics.f(this.title, cVar.title) && Intrinsics.f(this.subtitle, cVar.subtitle) && Intrinsics.f(this.footer, cVar.footer);
        }

        public final int hashCode() {
            ehc.c cVar = this.avatar;
            int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
            String str = this.title;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.subtitle;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            f fVar = this.footer;
            return iHashCode3 + (fVar != null ? fVar.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\f"}, d2 = {"Lehc/s$d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "type", "c", "url", "copyable", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("url")
        private final String url;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("copyable")
        private final String copyable;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCopyable() {
            return this.copyable;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof d)) {
                return false;
            }
            d dVar = (d) obj2;
            return Intrinsics.f(this.type, dVar.type) && Intrinsics.f(this.url, dVar.url) && Intrinsics.f(this.copyable, dVar.copyable);
        }

        public final int hashCode() {
            int iHashCode = this.type.hashCode() * 31;
            String str = this.url;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.copyable;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\u0005\u0010\r¨\u0006\u000f"}, d2 = {"Lehc/s$e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "icon", "c", "text", "Lehc/s$d;", "Lehc/s$d;", "()Lehc/s$d;", "action", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("icon")
        private final String icon;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("text")
        private final String text;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("action")
        private final d action;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final d getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof e)) {
                return false;
            }
            e eVar = (e) obj2;
            return Intrinsics.f(this.icon, eVar.icon) && Intrinsics.f(this.text, eVar.text) && Intrinsics.f(this.action, eVar.action);
        }

        public final int hashCode() {
            String str = this.icon;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.text;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            d dVar = this.action;
            return iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\n\u0010\b¨\u0006\f"}, d2 = {"Lehc/s$f;", "", "", "toString", "()Ljava/lang/String;", "Lehc/s$e;", "a", "Lehc/s$e;", "()Lehc/s$e;", "primaryButton", "b", "secondaryButton", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("primaryButton")
        private final e primaryButton;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("secondaryButton")
        private final e secondaryButton;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final e getPrimaryButton() {
            return this.primaryButton;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final e getSecondaryButton() {
            return this.secondaryButton;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof f)) {
                return false;
            }
            f fVar = (f) obj2;
            return Intrinsics.f(this.primaryButton, fVar.primaryButton) && Intrinsics.f(this.secondaryButton, fVar.secondaryButton);
        }

        public final int hashCode() {
            e eVar = this.primaryButton;
            int iHashCode = (eVar == null ? 0 : eVar.hashCode()) * 31;
            e eVar2 = this.secondaryButton;
            return iHashCode + (eVar2 != null ? eVar2.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0005\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\f\u0010\u0004¨\u0006\u0011"}, d2 = {"Lehc/s$g;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "icon", "d", "text", "Lehc/s$a;", "c", "Lehc/s$a;", "()Lehc/s$a;", "action", "state", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("icon")
        private final String icon;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("text")
        @NotNull
        private final String text;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("action")
        @NotNull
        private final a action;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("state")
        private final String state;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final a getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getState() {
            return this.state;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof g)) {
                return false;
            }
            g gVar = (g) obj2;
            return Intrinsics.f(this.icon, gVar.icon) && Intrinsics.f(this.text, gVar.text) && Intrinsics.f(this.action, gVar.action) && Intrinsics.f(this.state, gVar.state);
        }

        public final int hashCode() {
            String str = this.icon;
            int iHashCode = (this.action.hashCode() + p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.text)) * 31;
            String str2 = this.state;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0006\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0013\u001a\u0004\b\u000b\u0010\u0014¨\u0006\u0016"}, d2 = {"Lehc/s$h;", "", "", "toString", "()Ljava/lang/String;", "Lehc/c;", "a", "Lehc/c;", "c", "()Lehc/c;", "avatar", "b", "Ljava/lang/String;", "e", "title", "d", "description", "accessoryText", "Lehc/s$k;", "Lehc/s$k;", "()Lehc/s$k;", "action", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("avatar")
        private final ehc.c avatar;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("description")
        private final String description;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("accessoryText")
        private final String accessoryText;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("action")
        private final k action;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAccessoryText() {
            return this.accessoryText;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final k getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ehc.c getAvatar() {
            return this.avatar;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof h)) {
                return false;
            }
            h hVar = (h) obj2;
            return Intrinsics.f(this.avatar, hVar.avatar) && Intrinsics.f(this.title, hVar.title) && Intrinsics.f(this.description, hVar.description) && Intrinsics.f(this.accessoryText, hVar.accessoryText) && Intrinsics.f(this.action, hVar.action);
        }

        public final int hashCode() {
            ehc.c cVar = this.avatar;
            int iC = p.a.c((cVar == null ? 0 : cVar.hashCode()) * 31, 31, this.title);
            String str = this.description;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.accessoryText;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            k kVar = this.action;
            return iHashCode2 + (kVar != null ? kVar.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u0005\u0010\f¨\u0006\u000e"}, d2 = {"Lehc/s$i;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "title", "", "Lehc/b;", "Ljava/util/List;", "()Ljava/util/List;", "description", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("description")
        private final List<ehc.b> description;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof i)) {
                return false;
            }
            i iVar = (i) obj2;
            return Intrinsics.f(this.title, iVar.title) && Intrinsics.f(this.description, iVar.description);
        }

        public final int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            List<ehc.b> list = this.description;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0005\u0010\u000fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\r\u0010\u0004¨\u0006\u0014"}, d2 = {"Lehc/s$j;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "subscriptionCheckTitle", "b", "cancellationInstructionsTitle", "", "Lehc/s$h;", "c", "Ljava/util/List;", "()Ljava/util/List;", "cancellationInstructions", "d", "helpUrl", "cancellationUrl", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("subscriptionCheckTitle")
        private final String subscriptionCheckTitle;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("cancellationInstructionsTitle")
        private final String cancellationInstructionsTitle;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("cancellationInstructions")
        private final List<h> cancellationInstructions;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("helpUrl")
        private final String helpUrl;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("cancellationUrl")
        private final String cancellationUrl;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getCancellationInstructions() {
            return this.cancellationInstructions;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCancellationInstructionsTitle() {
            return this.cancellationInstructionsTitle;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getCancellationUrl() {
            return this.cancellationUrl;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getHelpUrl() {
            return this.helpUrl;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getSubscriptionCheckTitle() {
            return this.subscriptionCheckTitle;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof j)) {
                return false;
            }
            j jVar = (j) obj2;
            return Intrinsics.f(this.subscriptionCheckTitle, jVar.subscriptionCheckTitle) && Intrinsics.f(this.cancellationInstructionsTitle, jVar.cancellationInstructionsTitle) && Intrinsics.f(this.cancellationInstructions, jVar.cancellationInstructions) && Intrinsics.f(this.helpUrl, jVar.helpUrl) && Intrinsics.f(this.cancellationUrl, jVar.cancellationUrl);
        }

        public final int hashCode() {
            String str = this.subscriptionCheckTitle;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.cancellationInstructionsTitle;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<h> list = this.cancellationInstructions;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            String str3 = this.helpUrl;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.cancellationUrl;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lehc/s$k;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "url", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("url")
        private final String url;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof k) && Intrinsics.f(this.url, ((k) obj2).url);
        }

        public final int hashCode() {
            String str = this.url;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\u0005\u0010\r¨\u0006\u000f"}, d2 = {"Lehc/s$l;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "icon", "c", "text", "Lehc/s$k;", "Lehc/s$k;", "()Lehc/s$k;", "action", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("icon")
        private final String icon;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("text")
        private final String text;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("action")
        private final k action;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final k getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof l)) {
                return false;
            }
            l lVar = (l) obj2;
            return Intrinsics.f(this.icon, lVar.icon) && Intrinsics.f(this.text, lVar.text) && Intrinsics.f(this.action, lVar.action);
        }

        public final int hashCode() {
            String str = this.icon;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.text;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            k kVar = this.action;
            return iHashCode2 + (kVar != null ? kVar.hashCode() : 0);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final g getPrimaryButton() {
        return this.primaryButton;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final g getSecondaryButton() {
        return this.secondaryButton;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.primaryButton, sVar.primaryButton) && Intrinsics.f(this.secondaryButton, sVar.secondaryButton);
    }

    public final int hashCode() {
        g gVar = this.primaryButton;
        int iHashCode = (gVar == null ? 0 : gVar.hashCode()) * 31;
        g gVar2 = this.secondaryButton;
        return iHashCode + (gVar2 != null ? gVar2.hashCode() : 0);
    }
}
