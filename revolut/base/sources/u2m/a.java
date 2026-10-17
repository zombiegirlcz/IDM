package u2m;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f276710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Drawable f276711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f276712c;
    public final TextView d;

    public a(ConstraintLayout layout, TextView topMessage) {
        Intrinsics.checkNotNullParameter("", "message");
        Intrinsics.checkNotNullParameter(layout, "layout");
        Intrinsics.checkNotNullParameter(topMessage, "topMessage");
        this.f276710a = "";
        this.f276711b = null;
        this.f276712c = layout;
        this.d = topMessage;
        a();
    }

    public final void a() {
        Drawable drawable = this.f276711b;
        if (drawable != null) {
            drawable.setBounds(0, 0, 60, 60);
        }
        Drawable drawable2 = this.f276711b;
        TextView textView = this.d;
        textView.setCompoundDrawables(drawable2, null, null, null);
        textView.setText(this.f276710a);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f276710a, aVar.f276710a) && Intrinsics.f(this.f276711b, aVar.f276711b) && Intrinsics.f(this.f276712c, aVar.f276712c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f276710a.hashCode() * 31;
        Drawable drawable = this.f276711b;
        return this.d.hashCode() + ((this.f276712c.hashCode() + ((iHashCode + (drawable == null ? 0 : drawable.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "Binding(message=" + this.f276710a + ", icon=" + this.f276711b + ", layout=" + this.f276712c + ", topMessage=" + this.d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
