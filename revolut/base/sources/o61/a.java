package o61;

import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f222487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f222488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LayeredImage f222489c;

    public a(String billAccountId, String name, LayeredImage layeredImage) {
        Intrinsics.checkNotNullParameter(billAccountId, "billAccountId");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f222487a = billAccountId;
        this.f222488b = name;
        this.f222489c = layeredImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f222487a, aVar.f222487a) && Intrinsics.f(this.f222488b, aVar.f222488b) && this.f222489c.equals(aVar.f222489c);
    }

    public final int hashCode() {
        return this.f222489c.hashCode() + p.a.c(this.f222487a.hashCode() * 31, 31, this.f222488b);
    }
}
