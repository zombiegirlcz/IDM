package ah4;

import dx4.p4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p4 f4899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lv3.a f4900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ax4.b f4901c;
    public final String d;

    public m(p4 screenContent, lv3.a aVar, ax4.b constructorState, String str) {
        Intrinsics.checkNotNullParameter(screenContent, "screenContent");
        Intrinsics.checkNotNullParameter(constructorState, "constructorState");
        this.f4899a = screenContent;
        this.f4900b = aVar;
        this.f4901c = constructorState;
        this.d = str;
    }

    public static m a(m mVar, p4 screenContent, lv3.a aVar, ax4.b constructorState, String str, int i) {
        if ((i & 1) != 0) {
            screenContent = mVar.f4899a;
        }
        if ((i & 2) != 0) {
            aVar = mVar.f4900b;
        }
        if ((i & 4) != 0) {
            constructorState = mVar.f4901c;
        }
        if ((i & 8) != 0) {
            str = mVar.d;
        }
        mVar.getClass();
        Intrinsics.checkNotNullParameter(screenContent, "screenContent");
        Intrinsics.checkNotNullParameter(constructorState, "constructorState");
        return new m(screenContent, aVar, constructorState, str);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f4899a, mVar.f4899a) && Intrinsics.f(this.f4900b, mVar.f4900b) && Intrinsics.f(this.f4901c, mVar.f4901c) && Intrinsics.f(this.d, mVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f4899a.hashCode() * 31;
        lv3.a aVar = this.f4900b;
        int iHashCode2 = (this.f4901c.hashCode() + ((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 31;
        String str = this.d;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
