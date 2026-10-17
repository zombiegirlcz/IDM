package rzf;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u0005\u0010\f¨\u0006\u000e"}, d2 = {"Lrzf/z;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "next", "", "Lrzf/y;", "Ljava/util/List;", "()Ljava/util/List;", "experiences", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("next")
    private final String next;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("experiences")
    @NotNull
    private final List<y> experiences;

    public z(String str, ArrayList experiences) {
        Intrinsics.checkNotNullParameter(experiences, "experiences");
        this.next = str;
        this.experiences = experiences;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getExperiences() {
        return this.experiences;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getNext() {
        return this.next;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.next, zVar.next) && Intrinsics.f(this.experiences, zVar.experiences);
    }

    public final int hashCode() {
        String str = this.next;
        return this.experiences.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
