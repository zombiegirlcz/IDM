package ecm;

import com.google.common.base.Preconditions;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class z {
    public static final a d = new a("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f124900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f124901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f124902c;

    public z(List list, b bVar) {
        Preconditions.checkArgument(!list.isEmpty(), "addrs is empty");
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f124900a = listUnmodifiableList;
        this.f124901b = (b) Preconditions.checkNotNull(bVar, "attrs");
        this.f124902c = listUnmodifiableList.hashCode();
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        List list = zVar.f124900a;
        List list2 = this.f124900a;
        if (list2.size() != list.size()) {
            return false;
        }
        for (int i = 0; i < list2.size(); i++) {
            if (!((SocketAddress) list2.get(i)).equals(list.get(i))) {
                return false;
            }
        }
        return this.f124901b.equals(zVar.f124901b);
    }

    public final int hashCode() {
        return this.f124902c;
    }

    public final String toString() {
        return "[" + this.f124900a + "/" + this.f124901b + "]";
    }

    public z(SocketAddress socketAddress) {
        this(socketAddress, b.f124779b);
    }

    public z(SocketAddress socketAddress, b bVar) {
        this(Collections.singletonList(socketAddress), bVar);
    }
}
