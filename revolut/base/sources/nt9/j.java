package nt9;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f219004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f219005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f219006c;

    public j(ArrayList items, Image image, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f219004a = items;
        this.f219005b = image;
        this.f219006c = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f219004a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f219004a.equals(jVar.f219004a) && Intrinsics.f(this.f219005b, jVar.f219005b) && this.f219006c == jVar.f219006c;
    }

    public final int hashCode() {
        int iHashCode = this.f219004a.hashCode() * 31;
        Image image = this.f219005b;
        return Boolean.hashCode(this.f219006c) + ((iHashCode + (image == null ? 0 : image.hashCode())) * 31);
    }
}
