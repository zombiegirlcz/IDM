package d2g;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class w implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f110824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f110825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f110826c;

    public w(List items, o header, j button) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(button, "button");
        this.f110824a = items;
        this.f110825b = header;
        this.f110826c = button;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (!(oldState instanceof w)) {
            return null;
        }
        w wVar = (w) oldState;
        return new u(!wVar.f110825b.equals(this.f110825b), !wVar.f110826c.equals(this.f110826c));
    }

    @Override // cli.p
    public final List c() {
        return this.f110824a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f110824a, wVar.f110824a) && Intrinsics.f(this.f110825b, wVar.f110825b) && Intrinsics.f(this.f110826c, wVar.f110826c);
    }

    public final int hashCode() {
        return this.f110826c.hashCode() + ((this.f110825b.hashCode() + (this.f110824a.hashCode() * 31)) * 31);
    }
}
