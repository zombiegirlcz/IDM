package p14;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import st3.u;

/* JADX INFO: loaded from: classes22.dex */
public abstract class b {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lp14/b$a;", "Lp14/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a extends b {
        private a() {
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof a);
        }

        public final int hashCode() {
            return -583050835;
        }
    }

    /* JADX INFO: renamed from: p14.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Lp14/b$b;", "Lp14/b;", "", "toString", "()Ljava/lang/String;", "Lp14/b$c;", "a", "Lp14/b$c;", "()Lp14/b$c;", "step", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1272b extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("step")
        @NotNull
        private final c step;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final c getStep() {
            return this.step;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof C1272b) && Intrinsics.f(this.step, ((C1272b) obj2).step);
        }

        public final int hashCode() {
            return this.step.hashCode();
        }
    }

    public static abstract class c {

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\n\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001a\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0005\u0010\u0010¨\u0006\u0012"}, d2 = {"Lp14/b$c$a;", "Lp14/b$c;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "Lp14/b$c$a$b;", "b", "Lp14/b$c$a$b;", "()Lp14/b$c$a$b;", "confirmation", "Lp14/b$c$a$a;", "Lp14/b$c$a$a;", "()Lp14/b$c$a$a;", "change", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("id")
            @NotNull
            private final String id;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("confirmation")
            @NotNull
            private final C1274b confirmation;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("change")
            @NotNull
            private final C1273a change;

            /* JADX INFO: renamed from: p14.b$c$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\f"}, d2 = {"Lp14/b$c$a$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "title", "b", "secondDescription", "primaryButtonText", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class C1273a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                @lg.b("title")
                @NotNull
                private final String title;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                @lg.b("secondDescription")
                @NotNull
                private final String secondDescription;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                @lg.b("primaryButtonText")
                @NotNull
                private final String primaryButtonText;

                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getPrimaryButtonText() {
                    return this.primaryButtonText;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final String getSecondDescription() {
                    return this.secondDescription;
                }

                /* JADX INFO: renamed from: c, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof C1273a)) {
                        return false;
                    }
                    C1273a c1273a = (C1273a) obj2;
                    return Intrinsics.f(this.title, c1273a.title) && Intrinsics.f(this.secondDescription, c1273a.secondDescription) && Intrinsics.f(this.primaryButtonText, c1273a.primaryButtonText);
                }

                public final int hashCode() {
                    return this.primaryButtonText.hashCode() + p.a.c(this.title.hashCode() * 31, 31, this.secondDescription);
                }
            }

            /* JADX INFO: renamed from: p14.b$c$a$b, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004¨\u0006\f"}, d2 = {"Lp14/b$c$a$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "title", "b", "primaryButtonText", "secondaryButtonText", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class C1274b {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                @lg.b("title")
                @NotNull
                private final String title;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                @lg.b("primaryButtonText")
                @NotNull
                private final String primaryButtonText;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                @lg.b("secondaryButtonText")
                @NotNull
                private final String secondaryButtonText;

                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getPrimaryButtonText() {
                    return this.primaryButtonText;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final String getSecondaryButtonText() {
                    return this.secondaryButtonText;
                }

                /* JADX INFO: renamed from: c, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof C1274b)) {
                        return false;
                    }
                    C1274b c1274b = (C1274b) obj2;
                    return Intrinsics.f(this.title, c1274b.title) && Intrinsics.f(this.primaryButtonText, c1274b.primaryButtonText) && Intrinsics.f(this.secondaryButtonText, c1274b.secondaryButtonText);
                }

                public final int hashCode() {
                    return this.secondaryButtonText.hashCode() + p.a.c(this.title.hashCode() * 31, 31, this.primaryButtonText);
                }
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final C1273a getChange() {
                return this.change;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final C1274b getConfirmation() {
                return this.confirmation;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getId() {
                return this.id;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof a)) {
                    return false;
                }
                a aVar = (a) obj2;
                return Intrinsics.f(this.id, aVar.id) && Intrinsics.f(this.confirmation, aVar.confirmation) && Intrinsics.f(this.change, aVar.change);
            }

            public final int hashCode() {
                return this.change.hashCode() + ((this.confirmation.hashCode() + (this.id.hashCode() * 31)) * 31);
            }
        }

        /* JADX INFO: renamed from: p14.b$c$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u0019\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u001b"}, d2 = {"Lp14/b$c$b;", "Lp14/b$c;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "e", "title", "c", "d", "secondDescription", "", "Lp14/b$c$b$a;", "Ljava/util/List;", "()Ljava/util/List;", "loans", "f", "totalToRefinanceLabel", "", "Z", "g", "()Z", "valueRequired", "buttonText", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C1275b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("id")
            @NotNull
            private final String id;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("title")
            @NotNull
            private final String title;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("secondDescription")
            @NotNull
            private final String secondDescription;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @lg.b("loans")
            @NotNull
            private final List<a> loans;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            @lg.b("totalToRefinanceLabel")
            private final String totalToRefinanceLabel;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            @lg.b("valueRequired")
            private final boolean valueRequired;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
            @lg.b("buttonText")
            @NotNull
            private final String buttonText;

            /* JADX INFO: renamed from: p14.b$c$b$a */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\r\u0010\u0011¨\u0006\u0013"}, d2 = {"Lp14/b$c$b$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "b", "icon", "e", "title", "d", "description", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "leftToRepay", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                @lg.b("id")
                @NotNull
                private final String id;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                @lg.b("icon")
                @NotNull
                private final String icon;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                @lg.b("title")
                @NotNull
                private final String title;

                /* JADX INFO: renamed from: d, reason: from kotlin metadata */
                @lg.b("description")
                @NotNull
                private final String description;

                /* JADX INFO: renamed from: e, reason: from kotlin metadata */
                @lg.b("leftToRepay")
                @NotNull
                private final jo3.a leftToRepay;

                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getDescription() {
                    return this.description;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final String getIcon() {
                    return this.icon;
                }

                /* JADX INFO: renamed from: c, reason: from getter */
                public final String getId() {
                    return this.id;
                }

                /* JADX INFO: renamed from: d, reason: from getter */
                public final jo3.a getLeftToRepay() {
                    return this.leftToRepay;
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
                    return Intrinsics.f(this.id, aVar.id) && Intrinsics.f(this.icon, aVar.icon) && Intrinsics.f(this.title, aVar.title) && Intrinsics.f(this.description, aVar.description) && Intrinsics.f(this.leftToRepay, aVar.leftToRepay);
                }

                public final int hashCode() {
                    return this.leftToRepay.hashCode() + p.a.c(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.icon), 31, this.title), 31, this.description);
                }
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getButtonText() {
                return this.buttonText;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getId() {
                return this.id;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final List getLoans() {
                return this.loans;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getSecondDescription() {
                return this.secondDescription;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C1275b)) {
                    return false;
                }
                C1275b c1275b = (C1275b) obj2;
                return Intrinsics.f(this.id, c1275b.id) && Intrinsics.f(this.title, c1275b.title) && Intrinsics.f(this.secondDescription, c1275b.secondDescription) && Intrinsics.f(this.loans, c1275b.loans) && Intrinsics.f(this.totalToRefinanceLabel, c1275b.totalToRefinanceLabel) && this.valueRequired == c1275b.valueRequired && Intrinsics.f(this.buttonText, c1275b.buttonText);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final String getTotalToRefinanceLabel() {
                return this.totalToRefinanceLabel;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final boolean getValueRequired() {
                return this.valueRequired;
            }

            public final int hashCode() {
                int iD = p.a.d(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.title), 31, this.secondDescription), 31, this.loans);
                String str = this.totalToRefinanceLabel;
                return this.buttonText.hashCode() + j6.a.c((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.valueRequired);
            }
        }

        /* JADX INFO: renamed from: p14.b$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u0012"}, d2 = {"Lp14/b$c$c;", "Lp14/b$c;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "b", "f", "title", "e", "secondDescription", "d", "inputLabel", "currency", "buttonText", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C1276c extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("id")
            @NotNull
            private final String id;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("title")
            @NotNull
            private final String title;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("secondDescription")
            @NotNull
            private final String secondDescription;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @lg.b("inputLabel")
            @NotNull
            private final String inputLabel;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            @lg.b("currency")
            @NotNull
            private final String currency;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            @lg.b("buttonText")
            @NotNull
            private final String buttonText;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getButtonText() {
                return this.buttonText;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getCurrency() {
                return this.currency;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getId() {
                return this.id;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getInputLabel() {
                return this.inputLabel;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final String getSecondDescription() {
                return this.secondDescription;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C1276c)) {
                    return false;
                }
                C1276c c1276c = (C1276c) obj2;
                return Intrinsics.f(this.id, c1276c.id) && Intrinsics.f(this.title, c1276c.title) && Intrinsics.f(this.secondDescription, c1276c.secondDescription) && Intrinsics.f(this.inputLabel, c1276c.inputLabel) && Intrinsics.f(this.currency, c1276c.currency) && Intrinsics.f(this.buttonText, c1276c.buttonText);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final int hashCode() {
                return this.buttonText.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.title), 31, this.secondDescription), 31, this.inputLabel), 31, this.currency);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u000fJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR&\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0005\u0010\u0011¨\u0006\u0013"}, d2 = {"Lp14/b$c$d;", "Lp14/b$c;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "Lst3/u;", "b", "Lst3/u;", "()Lst3/u;", "content", "", "Lp14/e;", "Ljava/util/Map;", "()Ljava/util/Map;", "actions", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class d extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("id")
            @NotNull
            private final String id;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("content")
            @NotNull
            private final u content;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("actions")
            @NotNull
            private final Map<String, p14.e> actions;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Map getActions() {
                return this.actions;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final u getContent() {
                return this.content;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getId() {
                return this.id;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof d)) {
                    return false;
                }
                d dVar = (d) obj2;
                return Intrinsics.f(this.id, dVar.id) && Intrinsics.f(this.content, dVar.content) && Intrinsics.f(this.actions, dVar.actions);
            }

            public final int hashCode() {
                return this.actions.hashCode() + ((this.content.hashCode() + (this.id.hashCode() * 31)) * 31);
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0010J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\r\u0010\u0004R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012¨\u0006\u0014"}, d2 = {"Lp14/b$c$e;", "Lp14/b$c;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "e", "title", "c", "description", "d", "secondDescription", "", "Lp14/h;", "Ljava/util/List;", "()Ljava/util/List;", "items", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class e extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("id")
            @NotNull
            private final String id;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("title")
            @NotNull
            private final String title;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("description")
            private final String description;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @lg.b("secondDescription")
            private final String secondDescription;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            @lg.b("items")
            @NotNull
            private final List<h> items;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getId() {
                return this.id;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final List getItems() {
                return this.items;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getSecondDescription() {
                return this.secondDescription;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof e)) {
                    return false;
                }
                e eVar = (e) obj2;
                return Intrinsics.f(this.id, eVar.id) && Intrinsics.f(this.title, eVar.title) && Intrinsics.f(this.description, eVar.description) && Intrinsics.f(this.secondDescription, eVar.secondDescription) && Intrinsics.f(this.items, eVar.items);
            }

            public final int hashCode() {
                int iC = p.a.c(this.id.hashCode() * 31, 31, this.title);
                String str = this.description;
                int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.secondDescription;
                return this.items.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
            }
        }

        private c() {
        }
    }

    private b() {
    }
}
