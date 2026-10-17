package a8h;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0007\u000bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\f"}, d2 = {"La8h/b;", "", "", "toString", "()Ljava/lang/String;", "", "La8h/b$a;", "a", "Ljava/util/List;", "()Ljava/util/List;", "collections", "b", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("collections")
    private final List<a> collections;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\b\u0010\u000e¨\u0006\u0010"}, d2 = {"La8h/b$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "id", "b", "c", "name", "", "La8h/b$b;", "Ljava/util/List;", "()Ljava/util/List;", "instruments", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("instruments")
        @NotNull
        private final List<C0008b> instruments;

        public a(String id10, String name, ArrayList instruments) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(instruments, "instruments");
            this.id = id10;
            this.name = name;
            this.instruments = instruments;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final List getInstruments() {
            return this.instruments;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.id, aVar.id) && Intrinsics.f(this.name, aVar.name) && Intrinsics.f(this.instruments, aVar.instruments);
        }

        public final int hashCode() {
            return this.instruments.hashCode() + p.a.c(this.id.hashCode() * 31, 31, this.name);
        }
    }

    /* JADX INFO: renamed from: a8h.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004¨\u0006\u0012"}, d2 = {"La8h/b$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "ref", "b", "description", "c", "e", "symbol", "f", "title", "annualReturn", "instrumentType", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C0008b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("ref")
        @NotNull
        private final String ref;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("description")
        private final String description;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("symbol")
        private final String symbol;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("title")
        private final String title;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("annualReturn")
        @NotNull
        private final String annualReturn;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("instrumentType")
        @NotNull
        private final String instrumentType;

        public C0008b(String ref2, String str, String str2, String str3, String annualReturn, String instrumentType) {
            Intrinsics.checkNotNullParameter(ref2, "ref");
            Intrinsics.checkNotNullParameter(annualReturn, "annualReturn");
            Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
            this.ref = ref2;
            this.description = str;
            this.symbol = str2;
            this.title = str3;
            this.annualReturn = annualReturn;
            this.instrumentType = instrumentType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAnnualReturn() {
            return this.annualReturn;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getInstrumentType() {
            return this.instrumentType;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getRef() {
            return this.ref;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C0008b)) {
                return false;
            }
            C0008b c0008b = (C0008b) obj2;
            return Intrinsics.f(this.ref, c0008b.ref) && Intrinsics.f(this.description, c0008b.description) && Intrinsics.f(this.symbol, c0008b.symbol) && Intrinsics.f(this.title, c0008b.title) && Intrinsics.f(this.annualReturn, c0008b.annualReturn) && Intrinsics.f(this.instrumentType, c0008b.instrumentType);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int iHashCode = this.ref.hashCode() * 31;
            String str = this.description;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.symbol;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.title;
            return this.instrumentType.hashCode() + p.a.c((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.annualReturn);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getCollections() {
        return this.collections;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.collections, ((b) obj2).collections);
    }

    public final int hashCode() {
        List<a> list = this.collections;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }
}
