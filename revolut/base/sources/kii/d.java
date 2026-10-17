package kii;

import com.revolut.core.ui_kit.dialogs.AlertDialogDisplayer$Button;
import kotlin.jvm.internal.Intrinsics;
import tji.m;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f184245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f184246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AlertDialogDisplayer$Button f184247c;
    public final boolean d;

    public d(String dialogId, Object obj2, AlertDialogDisplayer$Button button) {
        Intrinsics.checkNotNullParameter(dialogId, "dialogId");
        Intrinsics.checkNotNullParameter(button, "button");
        this.f184245a = dialogId;
        this.f184246b = obj2;
        this.f184247c = button;
        this.d = button == AlertDialogDisplayer$Button.POSITIVE;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f184245a, dVar.f184245a) && Intrinsics.f(this.f184246b, dVar.f184246b) && this.f184247c == dVar.f184247c;
    }

    public final int hashCode() {
        int iHashCode = this.f184245a.hashCode() * 31;
        Object obj2 = this.f184246b;
        return this.f184247c.hashCode() + ((iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31);
    }
}
