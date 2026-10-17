package wph;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class s implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f299338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f299339b;

    public s(r buttonState, ArrayList items) {
        Intrinsics.checkNotNullParameter(buttonState, "buttonState");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f299338a = buttonState;
        this.f299339b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f299339b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return this.f299338a.equals(sVar.f299338a) && this.f299339b.equals(sVar.f299339b);
    }

    public final int hashCode() {
        return this.f299339b.hashCode() + (Boolean.hashCode(this.f299338a.f299337a) * 31);
    }
}
