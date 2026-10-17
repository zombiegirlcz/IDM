package my3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f210318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f210319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f210320c;
    public final String d;

    public i(String id10, String label, a actionType, String actionSuccessMessage) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(actionSuccessMessage, "actionSuccessMessage");
        this.f210318a = id10;
        this.f210319b = label;
        this.f210320c = actionType;
        this.d = actionSuccessMessage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f210318a, iVar.f210318a) && Intrinsics.f(this.f210319b, iVar.f210319b) && this.f210320c == iVar.f210320c && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f210320c.hashCode() + p.a.c(this.f210318a.hashCode() * 31, 31, this.f210319b)) * 31);
    }
}
