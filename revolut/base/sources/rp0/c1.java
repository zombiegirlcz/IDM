package rp0;

import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c1 extends e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShotDialogDisplayer$Configuration f256056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0 f256057b;

    public c1(ShotDialogDisplayer$Configuration configuration, y0 reason) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f256056a = configuration;
        this.f256057b = reason;
    }

    @Override // rp0.e1
    public final ShotDialogDisplayer$Configuration a() {
        return this.f256056a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj2;
        return Intrinsics.f(this.f256056a, c1Var.f256056a) && this.f256057b == c1Var.f256057b;
    }

    public final int hashCode() {
        return this.f256057b.hashCode() + (this.f256056a.hashCode() * 31);
    }
}
