package bw0;

import com.revolut.core.ui.models.Color;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Color f19172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Color f19173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Color.ModifiedColor f19174c;
    public final Color.ModifiedColor d;

    public a(Color mainTextColor) {
        Intrinsics.checkNotNullParameter(mainTextColor, "mainTextColor");
        this.f19172a = mainTextColor;
        this.f19173b = mainTextColor;
        Color.ModifiedColor modifiedColor = new Color.ModifiedColor(mainTextColor, 0.6f);
        this.f19174c = modifiedColor;
        this.d = modifiedColor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f19172a, ((a) obj2).f19172a);
    }

    public final int hashCode() {
        return this.f19172a.hashCode();
    }
}
