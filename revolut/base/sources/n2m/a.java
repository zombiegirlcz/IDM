package n2m;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f211595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Button f211596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f211597c;
    public final ImageView d;

    public a(TextView titleTextView, Button cancelScanningButton, TextView descriptionTextView, ImageView iconImageView) {
        Intrinsics.checkNotNullParameter(titleTextView, "titleTextView");
        Intrinsics.checkNotNullParameter(cancelScanningButton, "cancelScanningButton");
        Intrinsics.checkNotNullParameter(descriptionTextView, "descriptionTextView");
        Intrinsics.checkNotNullParameter(iconImageView, "iconImageView");
        this.f211595a = titleTextView;
        this.f211596b = cancelScanningButton;
        this.f211597c = descriptionTextView;
        this.d = iconImageView;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f211595a, aVar.f211595a) && Intrinsics.f(this.f211596b, aVar.f211596b) && Intrinsics.f(this.f211597c, aVar.f211597c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f211597c.hashCode() + ((this.f211596b.hashCode() + (this.f211595a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Binding(titleTextView=" + this.f211595a + ", cancelScanningButton=" + this.f211596b + ", descriptionTextView=" + this.f211597c + ", iconImageView=" + this.d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
