package aw0;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class l8 {

    @NotNull
    public static final k8 Companion = new k8();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final akm.c f10412b;

    static {
        new l8(Unit.f186387a, new akm.c(true));
    }

    public l8(Object obj2, akm.c stateRef) {
        Intrinsics.checkNotNullParameter(stateRef, "stateRef");
        this.f10411a = obj2;
        this.f10412b = stateRef;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!l8.class.equals(obj2 != null ? obj2.getClass() : null)) {
            return false;
        }
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.models.OneTimeRequest<*>");
        l8 l8Var = (l8) obj2;
        return Intrinsics.f(this.f10411a, l8Var.f10411a) && Intrinsics.f(this.f10412b, l8Var.f10412b);
    }

    public final int hashCode() {
        Object obj2 = this.f10411a;
        return this.f10412b.hashCode() + ((obj2 != null ? obj2.hashCode() : 0) * 31);
    }
}
