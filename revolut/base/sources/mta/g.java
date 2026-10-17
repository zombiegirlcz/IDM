package mta;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import cli.o;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import ip0.v7;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f208779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResourceImage f208780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UrlImage f208781c;
    public final Drawable d;
    public final Image e;
    public final ResourceImage f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextClause f208782g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextClause f208783h;

    public g(ArrayList actions, ResourceImage cardBackgroundImage, UrlImage cardForegroundImage, GradientDrawable cardBorderDrawable, QrCodeImage qrCodeImage, ResourceImage revolutLogo, TextClause title, TextClause description) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(cardBackgroundImage, "cardBackgroundImage");
        Intrinsics.checkNotNullParameter(cardForegroundImage, "cardForegroundImage");
        Intrinsics.checkNotNullParameter(cardBorderDrawable, "cardBorderDrawable");
        Intrinsics.checkNotNullParameter(revolutLogo, "revolutLogo");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f208779a = actions;
        this.f208780b = cardBackgroundImage;
        this.f208781c = cardForegroundImage;
        this.d = cardBorderDrawable;
        this.e = qrCodeImage;
        this.f = revolutLogo;
        this.f208782g = title;
        this.f208783h = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f208779a.equals(gVar.f208779a) && this.f208780b.equals(gVar.f208780b) && this.f208781c.equals(gVar.f208781c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && this.f.equals(gVar.f) && this.f208782g.equals(gVar.f208782g) && this.f208783h.equals(gVar.f208783h);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + v7.g(this.f208781c, org.bouncycastle.jcajce.provider.digest.a.b(this.f208780b, this.f208779a.hashCode() * 31, 31), 31)) * 31;
        Image image = this.e;
        return this.f208783h.hashCode() + v7.b(org.bouncycastle.jcajce.provider.digest.a.b(this.f, (iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31), 31, this.f208782g);
    }
}
