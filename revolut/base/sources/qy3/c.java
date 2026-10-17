package qy3;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f250141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f250142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f250143c;

    public c(ArrayList actions, g parameters, e content) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f250141a = actions;
        this.f250142b = parameters;
        this.f250143c = content;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f250141a.equals(cVar.f250141a) && this.f250142b.equals(cVar.f250142b) && this.f250143c.equals(cVar.f250143c);
    }

    public final int hashCode() {
        return this.f250143c.hashCode() + ((this.f250142b.hashCode() + (this.f250141a.hashCode() * 31)) * 31);
    }
}
