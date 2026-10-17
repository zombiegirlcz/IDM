package cw5;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f109540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f109541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f109542c;

    public f(e eVar, d assetType, ArrayList assets) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(assets, "assets");
        this.f109540a = eVar;
        this.f109541b = assetType;
        this.f109542c = assets;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f109540a == fVar.f109540a && this.f109541b == fVar.f109541b && this.f109542c.equals(fVar.f109542c);
    }

    public final int hashCode() {
        e eVar = this.f109540a;
        return this.f109542c.hashCode() + ((this.f109541b.hashCode() + ((eVar == null ? 0 : eVar.hashCode()) * 31)) * 31);
    }
}
