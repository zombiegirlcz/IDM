package zs9;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class p implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f324835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f324836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vq9.i f324837c;
    public final List d;
    public final Data e;
    public final st9.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f324838g;

    public p(Image image, String name, vq9.i iVar, List suggestions, Data baseCurrency, st9.b groupSettingsCalculationType, boolean z) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(groupSettingsCalculationType, "groupSettingsCalculationType");
        this.f324835a = image;
        this.f324836b = name;
        this.f324837c = iVar;
        this.d = suggestions;
        this.e = baseCurrency;
        this.f = groupSettingsCalculationType;
        this.f324838g = z;
    }

    public static p a(p pVar, Image image, String str, vq9.i iVar, Data data, st9.b bVar, boolean z, int i) {
        if ((i & 1) != 0) {
            image = pVar.f324835a;
        }
        Image image2 = image;
        if ((i & 2) != 0) {
            str = pVar.f324836b;
        }
        String name = str;
        if ((i & 4) != 0) {
            iVar = pVar.f324837c;
        }
        vq9.i iVar2 = iVar;
        List suggestions = pVar.d;
        if ((i & 16) != 0) {
            data = pVar.e;
        }
        Data baseCurrency = data;
        if ((i & 32) != 0) {
            bVar = pVar.f;
        }
        st9.b groupSettingsCalculationType = bVar;
        if ((i & 64) != 0) {
            z = pVar.f324838g;
        }
        pVar.getClass();
        Intrinsics.checkNotNullParameter(image2, "image");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(groupSettingsCalculationType, "groupSettingsCalculationType");
        return new p(image2, name, iVar2, suggestions, baseCurrency, groupSettingsCalculationType, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f324835a, pVar.f324835a) && Intrinsics.f(this.f324836b, pVar.f324836b) && Intrinsics.f(this.f324837c, pVar.f324837c) && Intrinsics.f(this.d, pVar.d) && Intrinsics.f(this.e, pVar.e) && this.f == pVar.f && this.f324838g == pVar.f324838g;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f324835a.hashCode() * 31, 31, this.f324836b);
        vq9.i iVar = this.f324837c;
        return Boolean.hashCode(this.f324838g) + ((this.f.hashCode() + kii.e.c(this.e, p.a.d((iC + (iVar == null ? 0 : iVar.hashCode())) * 31, 31, this.d), 31)) * 31);
    }
}
