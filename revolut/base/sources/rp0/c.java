package rp0;

import com.revolut.core.ui_kit.dialogs.AlertDialogDisplayer$Button;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f256050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f256051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AlertDialogDisplayer$Button f256052c;

    public c(String dialogId, Object obj2, AlertDialogDisplayer$Button button) {
        Intrinsics.checkNotNullParameter(dialogId, "dialogId");
        Intrinsics.checkNotNullParameter(button, "button");
        this.f256050a = dialogId;
        this.f256051b = obj2;
        this.f256052c = button;
    }

    public final AlertDialogDisplayer$Button a() {
        return this.f256052c;
    }

    public final String b() {
        return this.f256050a;
    }

    public final Object c() {
        return this.f256051b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f256050a, cVar.f256050a) && Intrinsics.f(this.f256051b, cVar.f256051b) && this.f256052c == cVar.f256052c;
    }

    public final int hashCode() {
        int iHashCode = this.f256050a.hashCode() * 31;
        Object obj2 = this.f256051b;
        return this.f256052c.hashCode() + ((iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31);
    }
}
