package nu3;

import com.revolut.feature.credit.application.plugins.api.models.action_button.Button;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f219211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f219212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f219213c;
    public final Double d;
    public final String e;
    public final Button f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Button f219214g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f219215h;

    public i(String title, String description, String videoBackgroundUrl, Double d, String str, Button primaryButton, Button secondaryButton, List links) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(videoBackgroundUrl, "videoBackgroundUrl");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        Intrinsics.checkNotNullParameter(secondaryButton, "secondaryButton");
        Intrinsics.checkNotNullParameter(links, "links");
        this.f219211a = title;
        this.f219212b = description;
        this.f219213c = videoBackgroundUrl;
        this.d = d;
        this.e = str;
        this.f = primaryButton;
        this.f219214g = secondaryButton;
        this.f219215h = links;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f219211a, iVar.f219211a) && Intrinsics.f(this.f219212b, iVar.f219212b) && Intrinsics.f(this.f219213c, iVar.f219213c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f) && Intrinsics.f(this.f219214g, iVar.f219214g) && Intrinsics.f(this.f219215h, iVar.f219215h);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f219211a.hashCode() * 31, 31, this.f219212b), 31, this.f219213c);
        Double d = this.d;
        int iHashCode = (iC + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.e;
        return this.f219215h.hashCode() + ((this.f219214g.hashCode() + ((this.f.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31);
    }
}
