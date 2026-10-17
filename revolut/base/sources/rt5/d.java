package rt5;

import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f257190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f257191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f257192c;
    public final boolean d;
    public final ImageTransformations e;

    public d(String id10, dj0.d balance, dj0.d dVar, boolean z, ImageTransformations imageTransformations) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(balance, "balance");
        this.f257190a = id10;
        this.f257191b = balance;
        this.f257192c = dVar;
        this.d = z;
        this.e = imageTransformations;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f257190a, dVar.f257190a) && Intrinsics.f(this.f257191b, dVar.f257191b) && Intrinsics.f(this.f257192c, dVar.f257192c) && this.d == dVar.d && Intrinsics.f(this.e, dVar.e);
    }

    public final int hashCode() {
        int iC = v7.c(this.f257190a.hashCode() * 31, 31, this.f257191b);
        dj0.d dVar = this.f257192c;
        int iC2 = j6.a.c((iC + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.d);
        ImageTransformations imageTransformations = this.e;
        return iC2 + (imageTransformations != null ? imageTransformations.hashCode() : 0);
    }
}
