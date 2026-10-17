package j33;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e93.d f170940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f170941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f170942c;
    public final boolean d;
    public final boolean e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f170943g;

    public i(e93.d cardDesign, Image image, Boolean bool, boolean z, boolean z3, Data userConfig, String str) {
        Intrinsics.checkNotNullParameter(cardDesign, "cardDesign");
        Intrinsics.checkNotNullParameter(userConfig, "userConfig");
        this.f170940a = cardDesign;
        this.f170941b = image;
        this.f170942c = bool;
        this.d = z;
        this.e = z3;
        this.f = userConfig;
        this.f170943g = str;
    }

    public static i a(i iVar, Image image, Boolean bool, boolean z, boolean z3, Data userConfig, String str, int i) {
        Image image2 = image;
        e93.d cardDesign = iVar.f170940a;
        if ((i & 2) != 0) {
            image2 = iVar.f170941b;
        }
        if ((i & 4) != 0) {
            bool = iVar.f170942c;
        }
        if ((i & 8) != 0) {
            z = iVar.d;
        }
        if ((i & 16) != 0) {
            z3 = iVar.e;
        }
        if ((i & 32) != 0) {
            userConfig = iVar.f;
        }
        if ((i & 64) != 0) {
            str = iVar.f170943g;
        }
        String str2 = str;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(cardDesign, "cardDesign");
        Intrinsics.checkNotNullParameter(userConfig, "userConfig");
        Data data = userConfig;
        boolean z4 = z3;
        boolean z6 = z;
        return new i(cardDesign, image2, bool, z6, z4, data, str2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f170940a, iVar.f170940a) && Intrinsics.f(this.f170941b, iVar.f170941b) && Intrinsics.f(this.f170942c, iVar.f170942c) && this.d == iVar.d && this.e == iVar.e && Intrinsics.f(this.f, iVar.f) && Intrinsics.f(this.f170943g, iVar.f170943g);
    }

    public final int hashCode() {
        int iHashCode = this.f170940a.hashCode() * 31;
        Image image = this.f170941b;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        Boolean bool = this.f170942c;
        int iC = kii.e.c(this.f, j6.a.c(j6.a.c((iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.d), 31, this.e), 31);
        String str = this.f170943g;
        return iC + (str != null ? str.hashCode() : 0);
    }
}
