package u2m;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f276716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f276717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f276718c;
    public final TextView d;
    public final TextView e;
    public final View f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f276719g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final View f276720h;
    public final TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f276721j;
    public final TextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final View f276722l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f276723m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Button f276724n;

    public e(ImageView imageView, TextView descriptionText, TextView subDescriptionText, TextView remarkText, TextView warningText, View lineView, View unauthorizedPatternView, View ngLeftImage, TextView ngLeftText, View ngCenterImage, TextView ngCenterText, View ngRightImage, TextView ngRightText, Button startRecordingButton) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(descriptionText, "descriptionText");
        Intrinsics.checkNotNullParameter(subDescriptionText, "subDescriptionText");
        Intrinsics.checkNotNullParameter(remarkText, "remarkText");
        Intrinsics.checkNotNullParameter(warningText, "warningText");
        Intrinsics.checkNotNullParameter(lineView, "lineView");
        Intrinsics.checkNotNullParameter(unauthorizedPatternView, "unauthorizedPatternView");
        Intrinsics.checkNotNullParameter(ngLeftImage, "ngLeftImage");
        Intrinsics.checkNotNullParameter(ngLeftText, "ngLeftText");
        Intrinsics.checkNotNullParameter(ngCenterImage, "ngCenterImage");
        Intrinsics.checkNotNullParameter(ngCenterText, "ngCenterText");
        Intrinsics.checkNotNullParameter(ngRightImage, "ngRightImage");
        Intrinsics.checkNotNullParameter(ngRightText, "ngRightText");
        Intrinsics.checkNotNullParameter(startRecordingButton, "startRecordingButton");
        this.f276716a = imageView;
        this.f276717b = descriptionText;
        this.f276718c = subDescriptionText;
        this.d = remarkText;
        this.e = warningText;
        this.f = lineView;
        this.f276719g = unauthorizedPatternView;
        this.f276720h = ngLeftImage;
        this.i = ngLeftText;
        this.f276721j = ngCenterImage;
        this.k = ngCenterText;
        this.f276722l = ngRightImage;
        this.f276723m = ngRightText;
        this.f276724n = startRecordingButton;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f276716a, eVar.f276716a) && Intrinsics.f(this.f276717b, eVar.f276717b) && Intrinsics.f(this.f276718c, eVar.f276718c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f) && Intrinsics.f(this.f276719g, eVar.f276719g) && Intrinsics.f(this.f276720h, eVar.f276720h) && Intrinsics.f(this.i, eVar.i) && Intrinsics.f(this.f276721j, eVar.f276721j) && Intrinsics.f(this.k, eVar.k) && Intrinsics.f(this.f276722l, eVar.f276722l) && Intrinsics.f(this.f276723m, eVar.f276723m) && Intrinsics.f(this.f276724n, eVar.f276724n);
    }

    public final int hashCode() {
        return this.f276724n.hashCode() + ((this.f276723m.hashCode() + ((this.f276722l.hashCode() + ((this.k.hashCode() + ((this.f276721j.hashCode() + ((this.i.hashCode() + ((this.f276720h.hashCode() + ((this.f276719g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.f276718c.hashCode() + ((this.f276717b.hashCode() + (this.f276716a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Binding(imageView=" + this.f276716a + ", descriptionText=" + this.f276717b + ", subDescriptionText=" + this.f276718c + ", remarkText=" + this.d + ", warningText=" + this.e + ", lineView=" + this.f + ", unauthorizedPatternView=" + this.f276719g + ", ngLeftImage=" + this.f276720h + ", ngLeftText=" + this.i + ", ngCenterImage=" + this.f276721j + ", ngCenterText=" + this.k + ", ngRightImage=" + this.f276722l + ", ngRightText=" + this.f276723m + ", startRecordingButton=" + this.f276724n + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
