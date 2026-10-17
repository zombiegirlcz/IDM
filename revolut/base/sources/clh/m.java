package clh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f25005b;

    public m(String listId, w widgetType) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        this.f25004a = listId;
        this.f25005b = widgetType;
    }

    @Override // clh.o
    public final w a() {
        return this.f25005b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f25004a, mVar.f25004a) && this.f25005b == mVar.f25005b;
    }

    public final int hashCode() {
        return this.f25005b.hashCode() + (this.f25004a.hashCode() * 31);
    }
}
