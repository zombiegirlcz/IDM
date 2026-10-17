package mhb;

import aii.r;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f205473a;

    public c(ArrayList contacts) {
        Intrinsics.checkNotNullParameter(contacts, "contacts");
        this.f205473a = contacts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f205473a.equals(((c) obj2).f205473a);
    }

    public final int hashCode() {
        return this.f205473a.hashCode();
    }
}
