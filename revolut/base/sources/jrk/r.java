package jrk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class r {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f178073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f178074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m2l.o f178075c;

    public /* synthetic */ r(int i, String str, p pVar, m2l.o oVar) {
        if (7 != (i & 7)) {
            j1.f(j.f178061a.getDescriptor(), i, 7);
            throw null;
        }
        this.f178073a = str;
        this.f178074b = pVar;
        this.f178075c = oVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f178073a, rVar.f178073a) && Intrinsics.f(this.f178074b, rVar.f178074b) && Intrinsics.f(this.f178075c, rVar.f178075c);
    }

    public final int hashCode() {
        return this.f178075c.hashCode() + ((this.f178074b.hashCode() + (this.f178073a.hashCode() * 31)) * 31);
    }

    public r(String sentiment, p chart, m2l.o description) {
        Intrinsics.checkNotNullParameter(sentiment, "sentiment");
        Intrinsics.checkNotNullParameter(chart, "chart");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f178073a = sentiment;
        this.f178074b = chart;
        this.f178075c = description;
    }
}
