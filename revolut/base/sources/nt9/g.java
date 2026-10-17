package nt9;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f218999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f219000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f219001c;
    public final List d;
    public final xi0.b e;
    public final st9.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f219002g;

    public g(Image image, String name, h hVar, List suggestions, xi0.b bVar, st9.b groupSettingsCalculationType, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        Intrinsics.checkNotNullParameter(groupSettingsCalculationType, "groupSettingsCalculationType");
        this.f218999a = image;
        this.f219000b = name;
        this.f219001c = hVar;
        this.d = suggestions;
        this.e = bVar;
        this.f = groupSettingsCalculationType;
        this.f219002g = z;
    }

    public static g a(g gVar, Image image, String str, h hVar, xi0.b bVar, st9.b bVar2, boolean z, int i) {
        if ((i & 1) != 0) {
            image = gVar.f218999a;
        }
        Image image2 = image;
        if ((i & 2) != 0) {
            str = gVar.f219000b;
        }
        String name = str;
        if ((i & 4) != 0) {
            hVar = gVar.f219001c;
        }
        h hVar2 = hVar;
        List suggestions = gVar.d;
        if ((i & 16) != 0) {
            bVar = gVar.e;
        }
        xi0.b bVar3 = bVar;
        if ((i & 32) != 0) {
            bVar2 = gVar.f;
        }
        st9.b groupSettingsCalculationType = bVar2;
        if ((i & 64) != 0) {
            z = gVar.f219002g;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        Intrinsics.checkNotNullParameter(groupSettingsCalculationType, "groupSettingsCalculationType");
        return new g(image2, name, hVar2, suggestions, bVar3, groupSettingsCalculationType, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f218999a, gVar.f218999a) && Intrinsics.f(this.f219000b, gVar.f219000b) && this.f219001c == gVar.f219001c && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && this.f == gVar.f && this.f219002g == gVar.f219002g;
    }

    public final int hashCode() {
        Image image = this.f218999a;
        int iC = p.a.c((image == null ? 0 : image.hashCode()) * 31, 31, this.f219000b);
        h hVar = this.f219001c;
        int iD = p.a.d((iC + (hVar == null ? 0 : hVar.hashCode())) * 31, 31, this.d);
        xi0.b bVar = this.e;
        return Boolean.hashCode(this.f219002g) + ((this.f.hashCode() + ((iD + (bVar != null ? bVar.hashCode() : 0)) * 31)) * 31);
    }
}
