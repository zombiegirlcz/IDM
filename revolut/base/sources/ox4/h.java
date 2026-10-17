package ox4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0005\rJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000b¨\u0006\u000e"}, d2 = {"Lox4/h;", "Lox4/a;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "title", "Lox4/h$a;", "Lox4/h$a;", "()Lox4/h$a;", "pocketLookupParams", "ox4/g", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h implements ox4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("pocketLookupParams")
    private final a pocketLookupParams;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\r¨\u0006\u000f"}, d2 = {"Lox4/h$a;", "", "", "toString", "()Ljava/lang/String;", "Lox4/g;", "a", "Lox4/g;", "b", "()Lox4/g;", "type", "Luo3/d;", "Luo3/d;", "()Luo3/d;", "pocket", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final g type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("pocket")
        @NotNull
        private final uo3.d pocket;

        public a(g type, uo3.d pocket) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(pocket, "pocket");
            this.type = type;
            this.pocket = pocket;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final uo3.d getPocket() {
            return this.pocket;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final g getType() {
            return this.type;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return this.type == aVar.type && Intrinsics.f(this.pocket, aVar.pocket);
        }

        public final int hashCode() {
            return this.pocket.hashCode() + (this.type.hashCode() * 31);
        }
    }

    public h(String title, a aVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.pocketLookupParams = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getPocketLookupParams() {
        return this.pocketLookupParams;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
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
        return Intrinsics.f(this.title, hVar.title) && Intrinsics.f(this.pocketLookupParams, hVar.pocketLookupParams);
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        a aVar = this.pocketLookupParams;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }
}
