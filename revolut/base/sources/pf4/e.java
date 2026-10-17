package pf4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements cli.j {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ax4.b f235435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f235436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f235437c;

    public e(ax4.b constructorState, Data offerContentData, boolean z) {
        Intrinsics.checkNotNullParameter(constructorState, "constructorState");
        Intrinsics.checkNotNullParameter(offerContentData, "offerContentData");
        this.f235435a = constructorState;
        this.f235436b = offerContentData;
        this.f235437c = z;
    }

    public static e a(e eVar, ax4.b constructorState, Data offerContentData, int i) {
        if ((i & 1) != 0) {
            constructorState = eVar.f235435a;
        }
        if ((i & 2) != 0) {
            offerContentData = eVar.f235436b;
        }
        boolean z = (i & 4) != 0 ? eVar.f235437c : true;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(constructorState, "constructorState");
        Intrinsics.checkNotNullParameter(offerContentData, "offerContentData");
        return new e(constructorState, offerContentData, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f235435a, eVar.f235435a) && Intrinsics.f(this.f235436b, eVar.f235436b) && this.f235437c == eVar.f235437c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f235437c) + kii.e.c(this.f235436b, this.f235435a.hashCode() * 31, 31);
    }
}
