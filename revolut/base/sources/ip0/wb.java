package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class wb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mx0.y4 f166974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f166975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f166976c;

    public wb(mx0.y4 event, bv0.b model, String listId) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f166974a = event;
        this.f166975b = model;
        this.f166976c = listId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof wb)) {
            return false;
        }
        wb wbVar = (wb) obj2;
        return Intrinsics.f(this.f166974a, wbVar.f166974a) && Intrinsics.f(this.f166975b, wbVar.f166975b) && Intrinsics.f(this.f166976c, wbVar.f166976c);
    }

    public final int hashCode() {
        return this.f166976c.hashCode() + p.a.b(this.f166974a.hashCode() * 31, 31, this.f166975b);
    }
}
