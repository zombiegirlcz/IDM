package pde;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u0005\u0010\fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0010\u0010\fR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001c"}, d2 = {"Lpde/f;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "stage", "", "b", "Ljava/lang/Long;", "()Ljava/lang/Long;", "createdDate", "c", "completedDate", "d", "estimatedArrivalDate", "e", "inTransitDate", "matchingTransactionId", "g", "statusDescription", "Lpde/f$a;", "h", "Lpde/f$a;", "()Lpde/f$a;", "userActions", "feature_support_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("stage")
    @NotNull
    private final String stage;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("createdDate")
    private final Long createdDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("completedDate")
    private final Long completedDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("estimatedArrivalDate")
    private final Long estimatedArrivalDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("inTransitDate")
    private final Long inTransitDate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("matchingTransactionId")
    private final String matchingTransactionId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("statusDescription")
    private final String statusDescription;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("userActions")
    private final a userActions;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u0005\u0010\f¨\u0006\u000e"}, d2 = {"Lpde/f$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "title", "", "Lpde/f$a$a;", "Ljava/util/List;", "()Ljava/util/List;", "messages", "feature_support_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("messages")
        @NotNull
        private final List<C1302a> messages;

        /* JADX INFO: renamed from: pde.f$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0005\u0010\r¨\u0006\u000f"}, d2 = {"Lpde/f$a$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "title", "b", "body", "Lpde/f$a$a$a;", "Lpde/f$a$a$a;", "()Lpde/f$a$a$a;", "action", "feature_support_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C1302a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("title")
            @NotNull
            private final String title;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("body")
            @NotNull
            private final String body;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("action")
            private final C1303a action;

            /* JADX INFO: renamed from: pde.f$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\n"}, d2 = {"Lpde/f$a$a$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "title", "deeplink", "feature_support_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class C1303a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                @lg.b("title")
                @NotNull
                private final String title;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                @lg.b("deeplink")
                @NotNull
                private final String deeplink;

                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getDeeplink() {
                    return this.deeplink;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof C1303a)) {
                        return false;
                    }
                    C1303a c1303a = (C1303a) obj2;
                    return Intrinsics.f(this.title, c1303a.title) && Intrinsics.f(this.deeplink, c1303a.deeplink);
                }

                public final int hashCode() {
                    return this.deeplink.hashCode() + (this.title.hashCode() * 31);
                }
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final C1303a getAction() {
                return this.action;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getBody() {
                return this.body;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C1302a)) {
                    return false;
                }
                C1302a c1302a = (C1302a) obj2;
                return Intrinsics.f(this.title, c1302a.title) && Intrinsics.f(this.body, c1302a.body) && Intrinsics.f(this.action, c1302a.action);
            }

            public final int hashCode() {
                int iC = p.a.c(this.title.hashCode() * 31, 31, this.body);
                C1303a c1303a = this.action;
                return iC + (c1303a == null ? 0 : c1303a.hashCode());
            }
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getMessages() {
            return this.messages;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
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
            return Intrinsics.f(this.title, aVar.title) && Intrinsics.f(this.messages, aVar.messages);
        }

        public final int hashCode() {
            return this.messages.hashCode() + (this.title.hashCode() * 31);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getCompletedDate() {
        return this.completedDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getCreatedDate() {
        return this.createdDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getEstimatedArrivalDate() {
        return this.estimatedArrivalDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getInTransitDate() {
        return this.inTransitDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getMatchingTransactionId() {
        return this.matchingTransactionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.stage, fVar.stage) && Intrinsics.f(this.createdDate, fVar.createdDate) && Intrinsics.f(this.completedDate, fVar.completedDate) && Intrinsics.f(this.estimatedArrivalDate, fVar.estimatedArrivalDate) && Intrinsics.f(this.inTransitDate, fVar.inTransitDate) && Intrinsics.f(this.matchingTransactionId, fVar.matchingTransactionId) && Intrinsics.f(this.statusDescription, fVar.statusDescription) && Intrinsics.f(this.userActions, fVar.userActions);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getStage() {
        return this.stage;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getStatusDescription() {
        return this.statusDescription;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final a getUserActions() {
        return this.userActions;
    }

    public final int hashCode() {
        int iHashCode = this.stage.hashCode() * 31;
        Long l2 = this.createdDate;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.completedDate;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.estimatedArrivalDate;
        int iHashCode4 = (iHashCode3 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.inTransitDate;
        int iHashCode5 = (iHashCode4 + (l5 == null ? 0 : l5.hashCode())) * 31;
        String str = this.matchingTransactionId;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.statusDescription;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        a aVar = this.userActions;
        return iHashCode7 + (aVar != null ? aVar.hashCode() : 0);
    }
}
