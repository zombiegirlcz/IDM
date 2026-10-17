package qg3;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes21.dex */
@g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f245643a;

    public /* synthetic */ c(int i, String str) {
        if (1 == (i & 1)) {
            this.f245643a = str;
        } else {
            j1.f(a.f245642a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f245643a, ((c) obj2).f245643a);
    }

    public final int hashCode() {
        return this.f245643a.hashCode();
    }

    public c(String campaignId) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        this.f245643a = campaignId;
    }
}
