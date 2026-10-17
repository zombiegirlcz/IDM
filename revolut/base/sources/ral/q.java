package ral;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class q {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\t\u0010\u0004R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0017\u001a\u0004\b\u0005\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001a\u0010\u001f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010 \u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004¨\u0006!"}, d2 = {"Lral/q$a;", "Lral/q;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "h", "title", "b", "i", "titleIcon", "", "c", "Z", "j", "()Z", "isFinalDialog", "d", "g", "guideTitle", "", "e", "Ljava/util/List;", "f", "()Ljava/util/List;", "guideSteps", "actionsTitle", "Lral/r;", "actionsLinks", "disclaimer", "cancelButtonTitle", "confirmButtonTitle", "feature_suspicious_transaction_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a extends q {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("titleIcon")
        private final String titleIcon;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("isFinalDialog")
        private final boolean isFinalDialog;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("guideTitle")
        @NotNull
        private final String guideTitle;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("guideSteps")
        @NotNull
        private final List<String> guideSteps;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("actionsTitle")
        @NotNull
        private final String actionsTitle;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("actionLinks")
        @NotNull
        private final List<r> actionsLinks;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @lg.b("disclaimer")
        @NotNull
        private final String disclaimer;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @lg.b("cancelButtonTitle")
        @NotNull
        private final String cancelButtonTitle;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @lg.b("confirmButtonTitle")
        @NotNull
        private final String confirmButtonTitle;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getActionsLinks() {
            return this.actionsLinks;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getActionsTitle() {
            return this.actionsTitle;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getCancelButtonTitle() {
            return this.cancelButtonTitle;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getConfirmButtonTitle() {
            return this.confirmButtonTitle;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getDisclaimer() {
            return this.disclaimer;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.title, aVar.title) && Intrinsics.f(this.titleIcon, aVar.titleIcon) && this.isFinalDialog == aVar.isFinalDialog && Intrinsics.f(this.guideTitle, aVar.guideTitle) && Intrinsics.f(this.guideSteps, aVar.guideSteps) && Intrinsics.f(this.actionsTitle, aVar.actionsTitle) && Intrinsics.f(this.actionsLinks, aVar.actionsLinks) && Intrinsics.f(this.disclaimer, aVar.disclaimer) && Intrinsics.f(this.cancelButtonTitle, aVar.cancelButtonTitle) && Intrinsics.f(this.confirmButtonTitle, aVar.confirmButtonTitle);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final List getGuideSteps() {
            return this.guideSteps;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getGuideTitle() {
            return this.guideTitle;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.titleIcon;
            return this.confirmButtonTitle.hashCode() + p.a.c(p.a.c(p.a.d(p.a.c(p.a.d(p.a.c(j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.isFinalDialog), 31, this.guideTitle), 31, this.guideSteps), 31, this.actionsTitle), 31, this.actionsLinks), 31, this.disclaimer), 31, this.cancelButtonTitle);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getTitleIcon() {
            return this.titleIcon;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final boolean getIsFinalDialog() {
            return this.isFinalDialog;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lral/q$b;", "Lral/q;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "deeplink", "feature_suspicious_transaction_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b extends q {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b(alternate = {"deepLink"}, value = "deeplink")
        @NotNull
        private final String deeplink;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.deeplink, ((b) obj2).deeplink);
        }

        public final int hashCode() {
            return this.deeplink.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\r\u0010\u0004R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0005\u0010\u0018R&\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\t\u0010\u001c¨\u0006\u001e"}, d2 = {"Lral/q$c;", "Lral/q;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "title", "b", "f", "titleIcon", "", "c", "Z", "g", "()Z", "isFinalDialog", "d", "questionType", "questionTitle", "", "Lral/p;", "Ljava/util/List;", "()Ljava/util/List;", "answers", "", "Ljava/util/Map;", "()Ljava/util/Map;", "nextDialog", "feature_suspicious_transaction_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c extends q {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("titleIcon")
        private final String titleIcon;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("isFinalDialog")
        private final boolean isFinalDialog;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("questionType")
        @NotNull
        private final String questionType;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("questionTitle")
        @NotNull
        private final String questionTitle;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("answers")
        @NotNull
        private final List<p> answers;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("nextDialog")
        @NotNull
        private final Map<String, q> nextDialog;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getAnswers() {
            return this.answers;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Map getNextDialog() {
            return this.nextDialog;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getQuestionTitle() {
            return this.questionTitle;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getQuestionType() {
            return this.questionType;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
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
            return Intrinsics.f(this.title, cVar.title) && Intrinsics.f(this.titleIcon, cVar.titleIcon) && this.isFinalDialog == cVar.isFinalDialog && Intrinsics.f(this.questionType, cVar.questionType) && Intrinsics.f(this.questionTitle, cVar.questionTitle) && Intrinsics.f(this.answers, cVar.answers) && Intrinsics.f(this.nextDialog, cVar.nextDialog);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getTitleIcon() {
            return this.titleIcon;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getIsFinalDialog() {
            return this.isFinalDialog;
        }

        public final int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.titleIcon;
            return this.nextDialog.hashCode() + p.a.d(p.a.c(p.a.c(j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.isFinalDialog), 31, this.questionType), 31, this.questionTitle), 31, this.answers);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0006\u0010\u0004¨\u0006\r"}, d2 = {"Lral/q$d;", "Lral/q;", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "b", "()Z", "isFinalDialog", "Ljava/lang/String;", "deeplink", "feature_suspicious_transaction_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d extends q {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("isFinalDialog")
        private final boolean isFinalDialog;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("deepLink")
        private final String deeplink;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsFinalDialog() {
            return this.isFinalDialog;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof d)) {
                return false;
            }
            d dVar = (d) obj2;
            return this.isFinalDialog == dVar.isFinalDialog && Intrinsics.f(this.deeplink, dVar.deeplink);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.isFinalDialog) * 31;
            String str = this.deeplink;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lral/q$e;", "Lral/q;", "<init>", "()V", "e", "b", "d", "c", "a", "Lral/q$e$a;", "Lral/q$e$b;", "Lral/q$e$c;", "Lral/q$e$d;", "Lral/q$e$e;", "feature_suspicious_transaction_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class e extends q {

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\t\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001a\u0010\u001a\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\"\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0005\u0010\u0010¨\u0006\u001e"}, d2 = {"Lral/q$e$a;", "Lral/q$e;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "title", "b", "f", "titleIcon", "", "Lral/a;", "c", "Ljava/util/List;", "()Ljava/util/List;", "buttons", "d", "g", "trackingId", "subtitle", "Lral/s;", "Lral/s;", "h", "()Lral/s;", "transaction", "questionType", "Lral/d;", "answers", "feature_suspicious_transaction_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a extends e {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("title")
            @NotNull
            private final String title;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("titleIcon")
            private final String titleIcon;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("buttons")
            @NotNull
            private final List<ral.a> buttons;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @lg.b("trackingId")
            @NotNull
            private final String trackingId;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            @lg.b("subtitle")
            private final String subtitle;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            @lg.b("transaction")
            @NotNull
            private final s transaction;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
            @lg.b("questionType")
            private final String questionType;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
            @lg.b("answers")
            private final List<ral.d> answers;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final List getAnswers() {
                return this.answers;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final List getButtons() {
                return this.buttons;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getQuestionType() {
                return this.questionType;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getSubtitle() {
                return this.subtitle;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
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
                return Intrinsics.f(this.title, aVar.title) && Intrinsics.f(this.titleIcon, aVar.titleIcon) && Intrinsics.f(this.buttons, aVar.buttons) && Intrinsics.f(this.trackingId, aVar.trackingId) && Intrinsics.f(this.subtitle, aVar.subtitle) && Intrinsics.f(this.transaction, aVar.transaction) && Intrinsics.f(this.questionType, aVar.questionType) && Intrinsics.f(this.answers, aVar.answers);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final String getTitleIcon() {
                return this.titleIcon;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final String getTrackingId() {
                return this.trackingId;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final s getTransaction() {
                return this.transaction;
            }

            public final int hashCode() {
                int iHashCode = this.title.hashCode() * 31;
                String str = this.titleIcon;
                int iC = p.a.c(p.a.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.buttons), 31, this.trackingId);
                String str2 = this.subtitle;
                int iHashCode2 = (this.transaction.hashCode() + ((iC + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
                String str3 = this.questionType;
                int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                List<ral.d> list = this.answers;
                return iHashCode3 + (list != null ? list.hashCode() : 0);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0005\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u001b\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u0012\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004¨\u0006\u001d"}, d2 = {"Lral/q$e$b;", "Lral/q$e;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "title", "b", "g", "titleIcon", "", "Lral/a;", "c", "Ljava/util/List;", "()Ljava/util/List;", "buttons", "d", "h", "trackingId", "e", "subtitle", "riskHeader", "Ljava/math/BigDecimal;", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "riskValue", "riskSubtitle", "feature_suspicious_transaction_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b extends e {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("title")
            @NotNull
            private final String title;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("titleIcon")
            private final String titleIcon;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("buttons")
            @NotNull
            private final List<ral.a> buttons;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @lg.b("trackingId")
            @NotNull
            private final String trackingId;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            @lg.b("subtitle")
            @NotNull
            private final String subtitle;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            @lg.b("riskHeader")
            @NotNull
            private final String riskHeader;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
            @lg.b("riskValue")
            @NotNull
            private final BigDecimal riskValue;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
            @lg.b("riskSubtitle")
            @NotNull
            private final String riskSubtitle;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final List getButtons() {
                return this.buttons;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getRiskHeader() {
                return this.riskHeader;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getRiskSubtitle() {
                return this.riskSubtitle;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final BigDecimal getRiskValue() {
                return this.riskValue;
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
                return Intrinsics.f(this.title, bVar.title) && Intrinsics.f(this.titleIcon, bVar.titleIcon) && Intrinsics.f(this.buttons, bVar.buttons) && Intrinsics.f(this.trackingId, bVar.trackingId) && Intrinsics.f(this.subtitle, bVar.subtitle) && Intrinsics.f(this.riskHeader, bVar.riskHeader) && Intrinsics.f(this.riskValue, bVar.riskValue) && Intrinsics.f(this.riskSubtitle, bVar.riskSubtitle);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final String getTitleIcon() {
                return this.titleIcon;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final String getTrackingId() {
                return this.trackingId;
            }

            public final int hashCode() {
                int iHashCode = this.title.hashCode() * 31;
                String str = this.titleIcon;
                return this.riskSubtitle.hashCode() + t61.a.d(this.riskValue, p.a.c(p.a.c(p.a.c(p.a.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.buttons), 31, this.trackingId), 31, this.subtitle), 31, this.riskHeader), 31);
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\t\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0005\u0010\u001a¨\u0006\u001c"}, d2 = {"Lral/q$e$c;", "Lral/q$e;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "title", "b", "d", "titleIcon", "", "Lral/a;", "Ljava/util/List;", "()Ljava/util/List;", "buttons", "e", "trackingId", "Lral/s;", "Lral/s;", "f", "()Lral/s;", "transaction", "Lral/c;", "Lral/c;", "()Lral/c;", "agreement", "feature_suspicious_transaction_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c extends e {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("title")
            @NotNull
            private final String title;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("titleIcon")
            private final String titleIcon;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("buttons")
            @NotNull
            private final List<ral.a> buttons;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @lg.b("trackingId")
            @NotNull
            private final String trackingId;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            @lg.b("transaction")
            @NotNull
            private final s transaction;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            @lg.b("agreement")
            @NotNull
            private final ral.c agreement;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final ral.c getAgreement() {
                return this.agreement;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final List getButtons() {
                return this.buttons;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getTitleIcon() {
                return this.titleIcon;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final String getTrackingId() {
                return this.trackingId;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof c)) {
                    return false;
                }
                c cVar = (c) obj2;
                return Intrinsics.f(this.title, cVar.title) && Intrinsics.f(this.titleIcon, cVar.titleIcon) && Intrinsics.f(this.buttons, cVar.buttons) && Intrinsics.f(this.trackingId, cVar.trackingId) && Intrinsics.f(this.transaction, cVar.transaction) && Intrinsics.f(this.agreement, cVar.agreement);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final s getTransaction() {
                return this.transaction;
            }

            public final int hashCode() {
                int iHashCode = this.title.hashCode() * 31;
                String str = this.titleIcon;
                return this.agreement.hashCode() + ((this.transaction.hashCode() + p.a.c(p.a.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.buttons), 31, this.trackingId)) * 31);
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0005\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\t\u0010\u0004¨\u0006\u0016"}, d2 = {"Lral/q$e$d;", "Lral/q$e;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "title", "b", "e", "titleIcon", "", "Lral/a;", "c", "Ljava/util/List;", "()Ljava/util/List;", "buttons", "f", "trackingId", "tips", "guide", "feature_suspicious_transaction_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class d extends e {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("title")
            @NotNull
            private final String title;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("titleIcon")
            private final String titleIcon;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("buttons")
            @NotNull
            private final List<ral.a> buttons;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @lg.b("trackingId")
            @NotNull
            private final String trackingId;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            @lg.b("tips")
            private final List<String> tips;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            @lg.b("guide")
            private final String guide;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final List getButtons() {
                return this.buttons;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getGuide() {
                return this.guide;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final List getTips() {
                return this.tips;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final String getTitleIcon() {
                return this.titleIcon;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof d)) {
                    return false;
                }
                d dVar = (d) obj2;
                return Intrinsics.f(this.title, dVar.title) && Intrinsics.f(this.titleIcon, dVar.titleIcon) && Intrinsics.f(this.buttons, dVar.buttons) && Intrinsics.f(this.trackingId, dVar.trackingId) && Intrinsics.f(this.tips, dVar.tips) && Intrinsics.f(this.guide, dVar.guide);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final String getTrackingId() {
                return this.trackingId;
            }

            public final int hashCode() {
                int iHashCode = this.title.hashCode() * 31;
                String str = this.titleIcon;
                int iC = p.a.c(p.a.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.buttons), 31, this.trackingId);
                List<String> list = this.tips;
                int iHashCode2 = (iC + (list == null ? 0 : list.hashCode())) * 31;
                String str2 = this.guide;
                return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            }
        }

        /* JADX INFO: renamed from: ral.q$e$e, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0005\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\t\u0010\u0004¨\u0006\u0016"}, d2 = {"Lral/q$e$e;", "Lral/q$e;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "title", "b", "e", "titleIcon", "", "Lral/a;", "c", "Ljava/util/List;", "()Ljava/util/List;", "buttons", "f", "trackingId", "subtitle", "image", "feature_suspicious_transaction_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C1395e extends e {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("title")
            @NotNull
            private final String title;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("titleIcon")
            private final String titleIcon;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("buttons")
            @NotNull
            private final List<ral.a> buttons;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @lg.b("trackingId")
            @NotNull
            private final String trackingId;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            @lg.b("subtitle")
            @NotNull
            private final String subtitle;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            @lg.b("image")
            private final String image;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final List getButtons() {
                return this.buttons;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getImage() {
                return this.image;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getSubtitle() {
                return this.subtitle;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final String getTitleIcon() {
                return this.titleIcon;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C1395e)) {
                    return false;
                }
                C1395e c1395e = (C1395e) obj2;
                return Intrinsics.f(this.title, c1395e.title) && Intrinsics.f(this.titleIcon, c1395e.titleIcon) && Intrinsics.f(this.buttons, c1395e.buttons) && Intrinsics.f(this.trackingId, c1395e.trackingId) && Intrinsics.f(this.subtitle, c1395e.subtitle) && Intrinsics.f(this.image, c1395e.image);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final String getTrackingId() {
                return this.trackingId;
            }

            public final int hashCode() {
                int iHashCode = this.title.hashCode() * 31;
                String str = this.titleIcon;
                int iC = p.a.c(p.a.c(p.a.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.buttons), 31, this.trackingId), 31, this.subtitle);
                String str2 = this.image;
                return iC + (str2 != null ? str2.hashCode() : 0);
            }
        }

        private e() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0017\u0010\u0004R\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u001e\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b\u0012\u0010\u001d¨\u0006\u001f"}, d2 = {"Lral/q$f;", "Lral/q;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "h", "title", "b", "i", "titleIcon", "", "c", "Z", "j", "()Z", "isFinalDialog", "d", "description", "e", "f", "riskBoxTopLine", "g", "riskPercentage", "riskBoxBottomLine", "cancelButtonTitle", "confirmButtonTitle", "Lral/q;", "()Lral/q;", "nextDialog", "feature_suspicious_transaction_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class f extends q {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("titleIcon")
        private final String titleIcon;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("isFinalDialog")
        private final boolean isFinalDialog;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("description")
        @NotNull
        private final String description;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("riskBoxTopLine")
        @NotNull
        private final String riskBoxTopLine;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("riskPercentage")
        @NotNull
        private final String riskPercentage;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("riskBoxBottomLine")
        @NotNull
        private final String riskBoxBottomLine;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @lg.b("cancelButtonTitle")
        @NotNull
        private final String cancelButtonTitle;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @lg.b("confirmButtonTitle")
        @NotNull
        private final String confirmButtonTitle;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @lg.b("nextDialog")
        @NotNull
        private final q nextDialog;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCancelButtonTitle() {
            return this.cancelButtonTitle;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getConfirmButtonTitle() {
            return this.confirmButtonTitle;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final q getNextDialog() {
            return this.nextDialog;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getRiskBoxBottomLine() {
            return this.riskBoxBottomLine;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof f)) {
                return false;
            }
            f fVar = (f) obj2;
            return Intrinsics.f(this.title, fVar.title) && Intrinsics.f(this.titleIcon, fVar.titleIcon) && this.isFinalDialog == fVar.isFinalDialog && Intrinsics.f(this.description, fVar.description) && Intrinsics.f(this.riskBoxTopLine, fVar.riskBoxTopLine) && Intrinsics.f(this.riskPercentage, fVar.riskPercentage) && Intrinsics.f(this.riskBoxBottomLine, fVar.riskBoxBottomLine) && Intrinsics.f(this.cancelButtonTitle, fVar.cancelButtonTitle) && Intrinsics.f(this.confirmButtonTitle, fVar.confirmButtonTitle) && Intrinsics.f(this.nextDialog, fVar.nextDialog);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getRiskBoxTopLine() {
            return this.riskBoxTopLine;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getRiskPercentage() {
            return this.riskPercentage;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.titleIcon;
            return this.nextDialog.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.isFinalDialog), 31, this.description), 31, this.riskBoxTopLine), 31, this.riskPercentage), 31, this.riskBoxBottomLine), 31, this.cancelButtonTitle), 31, this.confirmButtonTitle);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getTitleIcon() {
            return this.titleIcon;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final boolean getIsFinalDialog() {
            return this.isFinalDialog;
        }
    }

    private q() {
    }
}
