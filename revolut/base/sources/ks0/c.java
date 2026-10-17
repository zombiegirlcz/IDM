package ks0;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f189064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final koi.b f189065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f189066c;

    public c(String key, koi.b headerHolder, ArrayList contentHolders) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(headerHolder, "headerHolder");
        Intrinsics.checkNotNullParameter(contentHolders, "contentHolders");
        this.f189064a = key;
        this.f189065b = headerHolder;
        this.f189066c = contentHolders;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f189064a, cVar.f189064a) && this.f189065b.equals(cVar.f189065b) && this.f189066c.equals(cVar.f189066c);
    }

    public final int hashCode() {
        return this.f189066c.hashCode() + ((this.f189065b.hashCode() + (this.f189064a.hashCode() * 31)) * 31);
    }
}
