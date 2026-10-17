package d8f;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class u implements cli.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f112257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f112258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f112259c;
    public final p d;

    public u(List tabs, String str, s nextButtonState, p pVar) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(nextButtonState, "nextButtonState");
        this.f112257a = tabs;
        this.f112258b = str;
        this.f112259c = nextButtonState;
        this.d = pVar;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (oldState instanceof u) {
            return new t(!Intrinsics.f(((u) oldState).f112258b, this.f112258b));
        }
        return null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f112257a, uVar.f112257a) && Intrinsics.f(this.f112258b, uVar.f112258b) && Intrinsics.f(this.f112259c, uVar.f112259c) && Intrinsics.f(this.d, uVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f112257a.hashCode() * 31;
        String str = this.f112258b;
        int iHashCode2 = (this.f112259c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        p pVar = this.d;
        return iHashCode2 + (pVar != null ? pVar.hashCode() : 0);
    }
}
