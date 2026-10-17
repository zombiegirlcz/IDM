package p01;

import android.text.SpannableStringBuilder;
import androidx.glance.BitmapImageProvider;
import androidx.glance.ImageProvider;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f231451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageProvider f231452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SpannableStringBuilder f231453c;
    public final r d;
    public final boolean e;

    public s(CharSequence titleText, BitmapImageProvider bitmapImageProvider, SpannableStringBuilder mainText, r rVar, boolean z) {
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(mainText, "mainText");
        this.f231451a = titleText;
        this.f231452b = bitmapImageProvider;
        this.f231453c = mainText;
        this.d = rVar;
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f231451a, sVar.f231451a) && Intrinsics.f(this.f231452b, sVar.f231452b) && this.f231453c.equals(sVar.f231453c) && Intrinsics.f(this.d, sVar.d) && this.e == sVar.e;
    }

    public final int hashCode() {
        int iHashCode = this.f231451a.hashCode() * 31;
        ImageProvider imageProvider = this.f231452b;
        int iHashCode2 = (this.f231453c.hashCode() + ((iHashCode + (imageProvider == null ? 0 : imageProvider.hashCode())) * 31)) * 31;
        r rVar = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode2 + (rVar != null ? rVar.hashCode() : 0)) * 31);
    }
}
