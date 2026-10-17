package s4d;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\b\u0003\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Ls4d/i;", "", "", "a", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "type", "b", "c", "Ls4d/i$a;", "Ls4d/i$b;", "Ls4d/i$c;", "feature_separate_favourites_item_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004¨\u0006\t"}, d2 = {"Ls4d/i$a;", "Ls4d/i;", "", "toString", "()Ljava/lang/String;", "b", "Ljava/lang/String;", "getId", "id", "feature_separate_favourites_item_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a extends i {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String id10) {
            super("REMOVE");
            Intrinsics.checkNotNullParameter(id10, "id");
            this.id = id10;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.id, ((a) obj2).id);
        }

        public final int hashCode() {
            return this.id.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004¨\u0006\f"}, d2 = {"Ls4d/i$b;", "Ls4d/i;", "", "toString", "()Ljava/lang/String;", "b", "Ljava/lang/String;", "getId", "id", "c", "getName", "name", "feature_separate_favourites_item_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b extends i {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        @NotNull
        private final String name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String id10, String name) {
            super("RENAME");
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            this.id = id10;
            this.name = name;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.id, bVar.id) && Intrinsics.f(this.name, bVar.name);
        }

        public final int hashCode() {
            return this.name.hashCode() + (this.id.hashCode() * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Ls4d/i$c;", "Ls4d/i;", "", "toString", "()Ljava/lang/String;", "", "b", "Ljava/util/List;", "getIds", "()Ljava/util/List;", "ids", "feature_separate_favourites_item_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c extends i {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("ids")
        @NotNull
        private final List<String> ids;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List ids) {
            super("REORDER");
            Intrinsics.checkNotNullParameter(ids, "ids");
            this.ids = ids;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof c) && Intrinsics.f(this.ids, ((c) obj2).ids);
        }

        public final int hashCode() {
            return this.ids.hashCode();
        }
    }

    public i(String str) {
        this.type = str;
    }
}
