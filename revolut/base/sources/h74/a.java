package h74;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ax4.b f149841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f149842b;

    public a(ax4.b constructorState, Data content) {
        Intrinsics.checkNotNullParameter(constructorState, "constructorState");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f149841a = constructorState;
        this.f149842b = content;
    }

    public static a a(a aVar, ax4.b constructorState, Data content, int i) {
        if ((i & 1) != 0) {
            constructorState = aVar.f149841a;
        }
        if ((i & 2) != 0) {
            content = aVar.f149842b;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(constructorState, "constructorState");
        Intrinsics.checkNotNullParameter(content, "content");
        return new a(constructorState, content);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f149841a, aVar.f149841a) && Intrinsics.f(this.f149842b, aVar.f149842b);
    }

    public final int hashCode() {
        return this.f149842b.hashCode() + (this.f149841a.hashCode() * 31);
    }
}
