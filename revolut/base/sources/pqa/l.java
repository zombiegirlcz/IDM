package pqa;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f238712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f238713b;

    public l(ArrayList items, h buttonState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonState, "buttonState");
        this.f238712a = items;
        this.f238713b = buttonState;
    }

    @Override // cli.p
    public final List c() {
        return this.f238712a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f238712a.equals(lVar.f238712a) && this.f238713b.equals(lVar.f238713b);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f238713b.f238708a) + (this.f238712a.hashCode() * 31);
    }
}
