package mw0;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f209284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fu9.g f209285b;

    public c(ArrayList emojis, fu9.g gVar) {
        Intrinsics.checkNotNullParameter(emojis, "emojis");
        this.f209284a = emojis;
        this.f209285b = gVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f209284a.equals(cVar.f209284a) && this.f209285b.equals(cVar.f209285b);
    }

    public final int hashCode() {
        return this.f209285b.f138154a.hashCode() + j6.a.c(this.f209284a.hashCode() * 31, 31, true);
    }
}
