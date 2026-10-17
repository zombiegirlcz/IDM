package rp0;

import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d1 extends e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShotDialogDisplayer$Configuration f256061a;

    public d1(ShotDialogDisplayer$Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f256061a = configuration;
    }

    @Override // rp0.e1
    public final ShotDialogDisplayer$Configuration a() {
        return this.f256061a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d1) && Intrinsics.f(this.f256061a, ((d1) obj2).f256061a);
    }

    public final int hashCode() {
        return this.f256061a.hashCode();
    }
}
