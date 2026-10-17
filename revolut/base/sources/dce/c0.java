package dce;

import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c0 extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CellDetailsNoteDelegate.Model f112860a;

    public c0(CellDetailsNoteDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f112860a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c0) && Intrinsics.f(this.f112860a, ((c0) obj2).f112860a);
    }

    public final int hashCode() {
        return this.f112860a.hashCode();
    }
}
