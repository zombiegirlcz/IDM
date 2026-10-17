package fij;

import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b0 implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f135436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f135437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f135438c;
    public final s d;
    public final a0 e;
    public final AnimatedBackgroundType.Esim f;

    public b0(List items, Integer num, y yVar, s sVar, a0 footerState, AnimatedBackgroundType.Esim esim) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(footerState, "footerState");
        this.f135436a = items;
        this.f135437b = num;
        this.f135438c = yVar;
        this.d = sVar;
        this.e = footerState;
        this.f = esim;
    }

    @Override // cli.p
    public final List c() {
        return this.f135436a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f135436a, b0Var.f135436a) && Intrinsics.f(this.f135437b, b0Var.f135437b) && Intrinsics.f(this.f135438c, b0Var.f135438c) && Intrinsics.f(this.d, b0Var.d) && Intrinsics.f(this.e, b0Var.e) && Intrinsics.f(this.f, b0Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.f135436a.hashCode() * 31;
        Integer num = this.f135437b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        y yVar = this.f135438c;
        int iHashCode3 = (iHashCode2 + (yVar == null ? 0 : yVar.hashCode())) * 31;
        s sVar = this.d;
        int iHashCode4 = (this.e.hashCode() + ((iHashCode3 + (sVar == null ? 0 : sVar.hashCode())) * 31)) * 31;
        AnimatedBackgroundType.Esim esim = this.f;
        return iHashCode4 + (esim != null ? esim.hashCode() : 0);
    }
}
