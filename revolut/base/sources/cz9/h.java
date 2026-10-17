package cz9;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f110168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lw0.a f110169b;

    public h(ArrayList items, lw0.a headerModel) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerModel, "headerModel");
        this.f110168a = items;
        this.f110169b = headerModel;
    }

    @Override // cli.p
    public final List c() {
        return this.f110168a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f110168a.equals(hVar.f110168a) && this.f110169b.equals(hVar.f110169b);
    }

    public final int hashCode() {
        return this.f110169b.hashCode() + (this.f110168a.hashCode() * 31);
    }
}
