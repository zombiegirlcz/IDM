package nx4;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\u000b"}, d2 = {"Lnx4/r2;", "Lnx4/m0;", "", "toString", "()Ljava/lang/String;", "", "Lnx4/r2$a;", "a", "Ljava/util/List;", "()Ljava/util/List;", "steps", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class r2 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("steps")
    @NotNull
    private final List<a> steps;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0005\u0010\u0012¨\u0006\u0014"}, d2 = {"Lnx4/r2$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "title", "b", "description", "Lnx4/r2$a$a;", "c", "Lnx4/r2$a$a;", "()Lnx4/r2$a$a;", "status", "Lnx4/n;", "Lnx4/n;", "()Lnx4/n;", "action", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        @lg.b("status")
        @NotNull
        private final AbstractC1223a status;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("action")
        private final n action;

        /* JADX INFO: renamed from: nx4.r2$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC1223a {

            /* JADX INFO: renamed from: nx4.r2$a$a$a, reason: collision with other inner class name */
            public static final class C1224a extends AbstractC1223a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C1224a f220332a = new C1224a();

                private C1224a() {
                }

                public final boolean equals(Object obj2) {
                    return this == obj2 || (obj2 instanceof C1224a);
                }

                public final int hashCode() {
                    return 373603128;
                }
            }

            /* JADX INFO: renamed from: nx4.r2$a$a$b */
            public static final class b extends AbstractC1223a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final b f220333a = new b();

                private b() {
                }

                public final boolean equals(Object obj2) {
                    return this == obj2 || (obj2 instanceof b);
                }

                public final int hashCode() {
                    return -2118755292;
                }
            }

            /* JADX INFO: renamed from: nx4.r2$a$a$c */
            public static final class c extends AbstractC1223a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final c f220334a = new c();

                private c() {
                }

                public final boolean equals(Object obj2) {
                    return this == obj2 || (obj2 instanceof c);
                }

                public final int hashCode() {
                    return 2116507315;
                }
            }

            private AbstractC1223a() {
            }
        }

        public a(String title, String description, AbstractC1223a status, n nVar) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(status, "status");
            this.title = title;
            this.description = description;
            this.status = status;
            this.action = nVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final n getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final AbstractC1223a getStatus() {
            return this.status;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
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
            return Intrinsics.f(this.title, aVar.title) && Intrinsics.f(this.description, aVar.description) && Intrinsics.f(this.status, aVar.status) && Intrinsics.f(this.action, aVar.action);
        }

        public final int hashCode() {
            int iHashCode = (this.status.hashCode() + p.a.c(this.title.hashCode() * 31, 31, this.description)) * 31;
            n nVar = this.action;
            return iHashCode + (nVar == null ? 0 : nVar.hashCode());
        }
    }

    public r2(ArrayList steps) {
        Intrinsics.checkNotNullParameter(steps, "steps");
        this.steps = steps;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getSteps() {
        return this.steps;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r2) && Intrinsics.f(this.steps, ((r2) obj2).steps);
    }

    public final int hashCode() {
        return this.steps.hashCode();
    }
}
