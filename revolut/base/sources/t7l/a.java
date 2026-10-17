package t7l;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004¨\u0006\t"}, d2 = {"Lt7l/a;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getId", "id", "feature_shared_event_appearance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("id")
    @NotNull
    private final String id;

    public a(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.id = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.id, ((a) obj2).id);
    }

    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        return this.id.hashCode();
    }
}
