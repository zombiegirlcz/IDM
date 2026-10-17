package jda;

import aii.e;
import com.revolut.feature.pockets.api.ui.add_new.AddNewPocketContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AddNewPocketContract$InputData f173044a;

    public b(AddNewPocketContract$InputData input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.f173044a = input;
    }

    public final AddNewPocketContract$InputData b() {
        return this.f173044a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f173044a, ((b) obj2).f173044a);
    }

    public final int hashCode() {
        return this.f173044a.hashCode();
    }
}
