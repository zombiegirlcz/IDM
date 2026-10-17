package oe8;

import android.text.InputFilter;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends InputFilter.LengthFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f224562a;

    public a() {
        super(40);
        this.f224562a = 40;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f224562a == ((a) obj2).f224562a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f224562a);
    }
}
