package q2j;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class n extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f241689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f241690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f241691c;

    public n(List recent, List other, List creditCards) {
        Intrinsics.checkNotNullParameter(recent, "recent");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(creditCards, "creditCards");
        this.f241689a = recent;
        this.f241690b = other;
        this.f241691c = creditCards;
    }

    @Override // q2j.o
    public final List a() {
        return this.f241691c;
    }
}
