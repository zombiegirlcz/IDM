package q90;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u0005\u0010\u0011¨\u0006\u0013"}, d2 = {"Lq90/u;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "headerTitle", "", "Lq90/u$a;", "Ljava/util/List;", "c", "()Ljava/util/List;", "steps", "", "I", "()I", "currentStepIndex", "core_backend_flow_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("headerTitle")
    @NotNull
    private final String headerTitle;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("steps")
    @NotNull
    private final List<a> steps;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("currentStepIndex")
    private final int currentStepIndex;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\u0005\u0010\u0019R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004¨\u0006\u001c"}, d2 = {"Lq90/u$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "h", "title", "b", "e", "description", "", "c", "Ljava/lang/Long;", "d", "()Ljava/lang/Long;", "date", "g", "stepColor", "f", "lineStyle", "actionTitle", "Lq90/u$a$a;", "Lq90/u$a$a;", "()Lq90/u$a$a;", "action", "actionStyle", "core_backend_flow_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("description")
        private final String description;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("date")
        private final Long date;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("stepColor")
        private final String stepColor;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("lineStyle")
        private final String lineStyle;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("actionTitle")
        private final String actionTitle;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("action")
        private final C1335a action;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @lg.b("actionStyle")
        private final String actionStyle;

        /* JADX INFO: renamed from: q90.u$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lq90/u$a$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "deeplink", "core_backend_flow_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C1335a {

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
                return (obj2 instanceof C1335a) && Intrinsics.f(this.deeplink, ((C1335a) obj2).deeplink);
            }

            public final int hashCode() {
                return this.deeplink.hashCode();
            }
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C1335a getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getActionStyle() {
            return this.actionStyle;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getActionTitle() {
            return this.actionTitle;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Long getDate() {
            return this.date;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.title, aVar.title) && Intrinsics.f(this.description, aVar.description) && Intrinsics.f(this.date, aVar.date) && Intrinsics.f(this.stepColor, aVar.stepColor) && Intrinsics.f(this.lineStyle, aVar.lineStyle) && Intrinsics.f(this.actionTitle, aVar.actionTitle) && Intrinsics.f(this.action, aVar.action) && Intrinsics.f(this.actionStyle, aVar.actionStyle);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getLineStyle() {
            return this.lineStyle;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getStepColor() {
            return this.stepColor;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.description;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Long l2 = this.date;
            int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
            String str2 = this.stepColor;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.lineStyle;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.actionTitle;
            int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            C1335a c1335a = this.action;
            int iHashCode7 = (iHashCode6 + (c1335a == null ? 0 : c1335a.hashCode())) * 31;
            String str5 = this.actionStyle;
            return iHashCode7 + (str5 != null ? str5.hashCode() : 0);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getCurrentStepIndex() {
        return this.currentStepIndex;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getHeaderTitle() {
        return this.headerTitle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getSteps() {
        return this.steps;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.headerTitle, uVar.headerTitle) && Intrinsics.f(this.steps, uVar.steps) && this.currentStepIndex == uVar.currentStepIndex;
    }

    public final int hashCode() {
        return Integer.hashCode(this.currentStepIndex) + p.a.d(this.headerTitle.hashCode() * 31, 31, this.steps);
    }
}
